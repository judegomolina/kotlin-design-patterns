package behavioral.templateMethod

class UploadDocumentsFromLocal: UploadDocumentsTemplate() {

    override fun getDocuments() {
        println("Getting documents from local storage")
    }

    override fun notifyUser() {
        println("Sending Desktop notification")
    }
}
