package main.main

import crawler.Crawler
import parser.JsonParser
import parser.XmlParser
import parser.YamlParser

// import parser.XmlParser
// import parser.YamlParser

fun main() {
    //val parser = XmlParser()
    //val parser = YamlParser()
    val parser = JsonParser()


    val crawler = Crawler(
        "https://jsonplaceholder.typicode.com/todos/1",
        parser
    )

    val result = crawler.processContent()

    result.forEach { (k, v) ->
        println("$k -> $v")
    }
}