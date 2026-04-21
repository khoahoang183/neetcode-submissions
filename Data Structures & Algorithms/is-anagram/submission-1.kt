class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hashS = mutableMapOf<Char, Int>()
        val hashT = mutableMapOf<Char, Int>()

        for (i in 0 until s.length) {
            hashS[s[i]] = (hashS[s[i]] ?: 0) + 1
            hashT[t[i]] = (hashT[t[i]] ?: 0) + 1
        }
        return hashS == hashT
    }
}
