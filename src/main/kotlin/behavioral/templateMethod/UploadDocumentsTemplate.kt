package behavioral.templateMethod

abstract class UploadDocumentsTemplate {

    private fun checkIfDocumentsAreRequired() = true

    abstract fun getDocuments()

    private val uploadDocumentsToSystem = { println("Uploading Documents") }

    abstract fun notifyUser()

    fun uploadDocuments() {
        if (!checkIfDocumentsAreRequired()) {
            println("Documents not required")
        }

        getDocuments()
        uploadDocumentsToSystem()
        notifyUser()
    }
}
