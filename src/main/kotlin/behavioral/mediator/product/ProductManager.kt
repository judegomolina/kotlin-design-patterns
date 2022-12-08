package behavioral.mediator.product

import behavioral.mediator.design.Designer
import behavioral.mediator.engineering.Engineer
import behavioral.mediator.qa.QA

// The mediator
class ProductManager(
    private val designer: Designer = Designer(),
    private val engineer: Engineer = Engineer(),
    private val qa: QA = QA()
) {

    fun buildCoolFeature() {
        val design = designer.doACoolDesign()
        val code = engineer.writeCode(design)
        qa.testCode(code)
        engineer.deploy(code)
        println("Is feature deployed? ${code.isDeployed}")
    }
}
