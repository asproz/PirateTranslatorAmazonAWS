package com.aws.lambda.translator

import org.junit.Assert.assertEquals
import org.junit.Test

class DefaultPirateTranslatorTest  {

    @Test
    fun testTranslate() {
        val pirateTranslator : PirateTranslator = DefaultPirateTranslator()

        assertEquals("Ahoy, I am Captain Jack Sparrow!",
            pirateTranslator.translate("Hello, I am Captain Jack Sparrow!"))
        assertEquals("Aye!", pirateTranslator.translate("Yes"))
    }
}