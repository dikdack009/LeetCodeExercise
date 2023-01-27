import kotlin.math.max

class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        val tmpSet = HashSet<Char>()
        var result = 0
        var i = 0
        var j = 0
        while (i < s.length && j < s.length) {
            if (!tmpSet.contains(s[j])) {
                tmpSet.add(s[j++])
                result = max(result, j - i)
            } else {
                tmpSet.remove(s[i++])
            }
        }
        return result
    }
}