class Solution5 {
    fun longestPalindrome(s: String): String {

        var max = ""
        for (i in s.indices) {
            for (j in i until s.length) {
                val subStr = s.substring(i, j + 1)
                if (checkPalindrome(subStr)) {
                    if (subStr.length > max.length) {
                        max = subStr
                    }
                }
            }
        }

        return max
    }

    private fun checkPalindrome(s: String): Boolean {
        for (i in 0 until s.length / 2) {
            val j = s.length - 1 - i
            if (s[i] != s[j]) {
                return false
            }
        }
        return true
    }
}