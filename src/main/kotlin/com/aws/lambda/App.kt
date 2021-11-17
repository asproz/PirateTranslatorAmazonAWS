package com.aws.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.aws.lambda.input.HandlerInput
import com.aws.lambda.output.HandlerOutput
import com.aws.lambda.translator.DefaultPirateTranslator

class App : RequestHandler<HandlerInput, HandlerOutput> {

    private val translator = DefaultPirateTranslator()

    override fun handleRequest(input: HandlerInput?, context: Context?): HandlerOutput {
        input?.let {
            // 4
            return HandlerOutput(it.message, translator.translate(it.message))
        }
        return HandlerOutput("", "")
    }

}