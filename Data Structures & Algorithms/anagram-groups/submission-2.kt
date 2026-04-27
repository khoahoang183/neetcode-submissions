class Solution {
 fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resultHash = mutableMapOf<String, MutableList<String>>()
        for (string in strs) {
          val sortedString = string.toCharArray().sorted().joinToString()
            if (!resultHash.contains(sortedString)) {
                resultHash[sortedString] = mutableListOf(string)
            } else {
                resultHash[sortedString]?.apply { add(string) }
            }
        }
        return resultHash.map { item -> item.value }
    }
}
