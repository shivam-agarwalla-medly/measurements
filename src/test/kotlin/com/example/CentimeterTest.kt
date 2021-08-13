package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CentimeterTest : StringSpec({

    "Convert Meter to Millimeter"{

        Length(2.5, Unit.Meter).convert(Unit.Millimeter) shouldBe Length(2500.0, Unit.Millimeter)
    }

    "Convert Centimeter to Meter"{

        Length(25.0, Unit.Centimeter).convert(Unit.Meter) shouldBe Length(0.25, Unit.Meter)
    }

    "Convert Millimeter to Centimeter"{
        Length(254.0, Unit.Millimeter).convert(Unit.Centimeter) shouldBe Length(25.4, Unit.Centimeter)
    }

    "Add two centimeter values and give their added value"{

        Length(25.0, Unit.Centimeter).add(Length(20.0, Unit.Centimeter)) shouldBe Length(45.0, Unit.Centimeter)
    }

    "Add centimeter and meter and give added value in centimeter"{

        Length(40.0, Unit.Centimeter).add(Length(1.0, Unit.Meter)) shouldBe Length(140.0, Unit.Centimeter)
    }

    "Add meter and millimeter and give added value in meter"{

        Length(2.5, Unit.Meter).add(Length(200.0, Unit.Millimeter)) shouldBe Length(2.7, Unit.Meter)
    }

    "Add millimeter and centimeter and give added value in millimeter"{

        Length(250.0, Unit.Millimeter).add(Length(20.0, Unit.Centimeter)) shouldBe Length(450.0, Unit.Millimeter)
    }
})