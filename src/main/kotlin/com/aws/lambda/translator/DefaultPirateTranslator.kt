package com.aws.lambda.translator

import java.util.concurrent.atomic.AtomicReference

class DefaultPirateTranslator : PirateTranslator {
    private val replacements = mapOf("Hello" to "Ahoy", "Yes" to "Aye!", "Yes Captain!" to "Aye Aye!")

    override fun translate(arg: String): String {
        val atomicString = AtomicReference(arg)
        replacements.forEach{ (k, v) -> atomicString.compareAndSet(arg, arg.replace(k, v)) }

        return atomicString.get()
    }


}