package com.example

import java.text.DecimalFormat


class Length(private val value: Double, private val lengthUnit: LengthUnit) {

    fun add(length: Length) =
        Length(this.value + length.convert(this.lengthUnit).value, this.lengthUnit)

    fun convert(targetLengthUnit: LengthUnit) =
        Length(this.value * this.lengthUnit.scale / targetLengthUnit.scale, targetLengthUnit)

    override fun equals(other: Any?): Boolean {
        return (this.hashCode() == other.hashCode())
    }

    override fun hashCode(): Int {
        val df = DecimalFormat("#.####")
        return df.format(this.value).toDouble().hashCode() + this.lengthUnit.hashCode()
    }
}

enum class LengthUnit(val scale: Double) {
    Millimeter(0.1),
    Centimeter(1.0),
    Meter(100.0)
}