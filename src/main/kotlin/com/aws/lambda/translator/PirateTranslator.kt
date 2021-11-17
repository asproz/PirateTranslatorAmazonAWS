package com.aws.lambda.translator

interface PirateTranslator {

    fun translate(arg: String): String
}