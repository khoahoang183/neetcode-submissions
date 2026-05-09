class Solution {

   fun encode(strs: List<String>): String {
        var result = ""
        strs.forEach { item ->
            result += "${item.length}#${item}"
        }
        return result
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while (i < str.length){
            var j = i
            while (str[j] != '#'){
                j++
            }
            val length = str.substring(i,j).toInt()
            val word = str.substring(j+1, j+1+length)
            result.add(word)
            i = j + 1 + length
        }
        return result
    }
}
