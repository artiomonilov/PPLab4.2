package crawler

import parser.Parser
import java.net.URL

class Crawler(
    private val url: String,
    private val parser: Parser
) {

    fun getResource(): String {
        return URL(url).readText()
    }

    fun processContent(): Map<String, Any> {
        val content = getResource()
        return parser.parse(content)
    }
}