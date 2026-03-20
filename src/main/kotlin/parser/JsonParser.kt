package parser

import org.json.JSONObject

class JsonParser : Parser {
    override fun parse(text: String): Map<String, Any> {
        val json = JSONObject(text)
        val map = mutableMapOf<String, Any>()

        json.keys().forEach { key ->
            map[key] = json.get(key)
        }

        return map
    }
}