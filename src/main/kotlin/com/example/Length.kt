package com.example

import java.text.DecimalFormat


class Length(private val value: Double, private val unit: Unit) {

    fun add(length: Length) =
        Length(this.value + length.convert(this.unit).value, this.unit)

    fun convert(targetUnit: Unit) =
        Length(this.value * this.unit.scale / targetUnit.scale, targetUnit)

    override fun equals(other: Any?): Boolean {
        return (this.hashCode() == other.hashCode())
    }

    override fun hashCode(): Int {
        val df = DecimalFormat("#.####")
        return df.format(this.value).hashCode() + this.unit.hashCode()
    }
}

enum class Unit(val scale: Double) {
    Millimeter(0.1),
    Centimeter(1.0),
    Meter(100.0)
}