package behavioral.mediator.engineering

import behavioral.mediator.design.Design

class Engineer {

    fun writeCode(design: Design): Code {
        design.developed = true
        return Code()
    }

    fun deploy(code: Code) {
        if (code.isTested) {
            code.isDeployed = true
        }
    }
}
