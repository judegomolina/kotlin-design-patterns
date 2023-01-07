package behavioral.templateMethod

class UploadDocumentsFromCloud: UploadDocumentsTemplate() {

    override fun getDocuments() {
        println("Getting documents from cloud")
    }

    override fun notifyUser() {
        println("Sending browser notification")
    }
}
