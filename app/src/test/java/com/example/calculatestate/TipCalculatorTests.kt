package com.example.calculatestate

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat
import java.util.Locale

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance(Locale.US).format(2)
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}