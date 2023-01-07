package behavioral.templateMethod

fun main() {
    println("Local Document Upload")
    UploadDocumentsFromLocal().uploadDocuments()
    println("\n")
    println("Cloud Document Upload")
    UploadDocumentsFromCloud().uploadDocuments()
}
