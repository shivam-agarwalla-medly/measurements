package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LengthTest : StringSpec({

    "Convert Meter to Millimeter"{

        Length(2.5, LengthUnit.Meter).convert(LengthUnit.Millimeter) shouldBe Length(2500.0, LengthUnit.Millimeter)
    }

    "Convert Centimeter to Meter"{

        Length(25.0, LengthUnit.Centimeter).convert(LengthUnit.Meter) shouldBe Length(0.25, LengthUnit.Meter)
    }

    "Convert Millimeter to Centimeter"{
        Length(254.0, LengthUnit.Millimeter).convert(LengthUnit.Centimeter) shouldBe Length(25.4, LengthUnit.Centimeter)
    }

    "Add two centimeter values and give their added value"{

        Length(25.0, LengthUnit.Centimeter).add(Length(20.0, LengthUnit.Centimeter)) shouldBe Length(
            45.0,
            LengthUnit.Centimeter
        )
    }

    "Add centimeter and meter and give added value in centimeter"{

        Length(40.0, LengthUnit.Centimeter).add(Length(1.0, LengthUnit.Meter)) shouldBe Length(
            140.0,
            LengthUnit.Centimeter
        )
    }

    "Add meter and millimeter and give added value in meter"{

        Length(2.5, LengthUnit.Meter).add(Length(200.0, LengthUnit.Millimeter)) shouldBe Length(2.7, LengthUnit.Meter)
    }

    "Add millimeter and centimeter and give added value in millimeter"{

        Length(250.0, LengthUnit.Millimeter).add(Length(20.0, LengthUnit.Centimeter)) shouldBe Length(
            450.0,
            LengthUnit.Millimeter
        )
    }
})