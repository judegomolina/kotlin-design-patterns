package behavioral.visitor

import behavioral.visitor.htmlelements.Container
import behavioral.visitor.htmlelements.Image
import behavioral.visitor.htmlelements.Link

fun main() {
    val samplePage = Page(
        listOf(
            Container(
                listOf(
                    Link("link 1"),
                    Image("link 2")
                )
            ),
            Link("link 3"),
            Image("link 4")
        )
    )

    val crawler = LinkCrawler()
    samplePage.accept(crawler)

    println(crawler.links)
}
