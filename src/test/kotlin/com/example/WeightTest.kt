package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class WeightTest : StringSpec({

    "Convert Gram to Kg"{

        Weight(450.0, WeightUnit.Gram).convert(WeightUnit.KG) shouldBe Weight(0.450, WeightUnit.KG)
    }

    "Convert Kg to Pound"{
        Weight(1.0, WeightUnit.KG).convert(WeightUnit.Pound) shouldBe Weight(2.2046244201837775, WeightUnit.Pound)
    }

    "Add Kg and Gram"{
        Weight(2.2, WeightUnit.KG).add(Weight(2000.0, WeightUnit.Gram)) shouldBe Weight(4.2, WeightUnit.KG)
    }
})