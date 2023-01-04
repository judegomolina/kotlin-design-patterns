package behavioral.visitor.htmlelements

import behavioral.visitor.LinkCrawler
import behavioral.visitor.VisitorAcceptor

class Container(private val elements: List<HtmlElement>): HtmlElement, VisitorAcceptor {

    override fun accept(crawlerVisitor: LinkCrawler) {
        for (element in elements) {
            crawlerVisitor.visit(element)
        }
    }
}
