package builder

import java.io.File

data class Email(
    private val message: String,
    private var title: String? = null,
    private var sendList: MutableList<String> = mutableListOf(),
    private var cc: MutableList<String> = mutableListOf(),
    private var bcc: MutableList<String> = mutableListOf(),
    private var attachments: MutableList<File> = mutableListOf()
) {

    fun setTitle(title: String?): Email {
        this.title = title
        return this
    }

    fun addReceiver(receiver: String): Email {
        this.sendList.add(receiver)
        return this
    }

    fun addReceivers(receivers: List<String>): Email {
        this.sendList.addAll(receivers)
        return this
    }

    fun addCcAddress(ccAddress: String): Email {
        this.cc.add(ccAddress)
        return this
    }

    fun addCcAddresses(ccAddresses: List<String>): Email {
        this.cc.addAll(ccAddresses)
        return this
    }

    fun addBccAddress(bccAddress: String): Email {
        this.bcc.add(bccAddress)
        return this
    }

    fun addBccAddresses(bccAddresses: List<String>): Email {
        this.bcc.addAll(bccAddresses)
        return this
    }

    fun addAttachment(attachment: File): Email {
        this.attachments.add(attachment)
        return this
    }

    fun addAttachments(attachments: MutableList<File>): Email {
        this.attachments.addAll(attachments)
        return this
    }
}
