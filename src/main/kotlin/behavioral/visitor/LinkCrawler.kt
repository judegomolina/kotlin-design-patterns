package behavioral.visitor

import behavioral.visitor.htmlelements.HtmlElement
import behavioral.visitor.htmlelements.Image
import behavioral.visitor.htmlelements.Link

class LinkCrawler {
    private var _links: MutableList<String> = mutableListOf<String>()

    val links
        get() = _links.toList()

    fun visit(element: HtmlElement) {
        when(element) {
            is VisitorAcceptor -> element.accept(this)
            is Link -> _links.add(element.src)
            is Image -> _links.add(element.href)
            else -> {}
        }
    }
}
