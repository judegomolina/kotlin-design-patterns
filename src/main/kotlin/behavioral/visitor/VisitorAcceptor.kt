package behavioral.visitor

import behavioral.visitor.LinkCrawler

interface VisitorAcceptor {
    fun accept(crawlerVisitor: LinkCrawler)
}
