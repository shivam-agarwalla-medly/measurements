package com.example

import java.text.DecimalFormat

class Weight(private val value: Double, private val weightUnit: WeightUnit) {

    fun convert(targetWeightUnit: WeightUnit): Weight {
        return Weight(this.value * this.weightUnit.scale / targetWeightUnit.scale, targetWeightUnit)
    }

    fun add(weight: Weight): Weight {
        return Weight(this.value + weight.convert(this.weightUnit).value, this.weightUnit)
    }

    override fun equals(other: Any?): Boolean {
        return (this.hashCode() == other.hashCode())
    }

    override fun hashCode(): Int {
        val df = DecimalFormat("#.####")
        return df.format(this.value).toDouble().hashCode() + this.weightUnit.hashCode()
    }
}

enum class WeightUnit(val scale: Double) {
    Gram(1.0),
    KG(1000.0),
    Pound(453.592)
}