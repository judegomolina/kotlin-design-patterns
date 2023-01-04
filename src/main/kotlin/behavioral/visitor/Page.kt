package behavioral.visitor

import behavioral.visitor.htmlelements.HtmlElement

class Page(private val elements: List<HtmlElement>): VisitorAcceptor {

    override fun accept(crawlerVisitor: LinkCrawler) {
        for (element in elements) {
            crawlerVisitor.visit(element)
        }
    }
}
