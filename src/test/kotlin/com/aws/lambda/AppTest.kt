package com.aws.lambda

import com.aws.lambda.input.HandlerInput
import com.aws.lambda.output.HandlerOutput
import junit.framework.TestCase
import org.junit.Assert.assertEquals
import org.junit.Test

class AppTest  {

    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = App()
        val input = HandlerInput()
        input.message = "Hello"
        val expected = HandlerOutput("Hello", "Ahoy!")
        val output = classUnderTest.handleRequest(input, null)
        assertEquals(expected, output)
    }
}