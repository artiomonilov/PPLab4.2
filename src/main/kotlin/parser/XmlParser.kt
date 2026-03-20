package parser

import org.jsoup.Jsoup
import org.jsoup.parser.Parser as JsoupParser

class XmlParser : Parser {
    override fun parse(text: String): Map<String, Any> {
        val doc = Jsoup.parse(text, "", JsoupParser.xmlParser())
        val map = mutableMapOf<String, Any>()

        doc.getAllElements().forEach {
            map[it.tagName()] = it.text()
        }

        return map
    }
}