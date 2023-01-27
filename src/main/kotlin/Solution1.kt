//Exercise 1
class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val resultArray: IntArray = IntArray(2)
        for (i in nums.indices) {
            for (j in (i + 1) until nums.size) {
                if (nums[i] + nums[j] == target) {
                    resultArray[0] = i
                    resultArray[1] = j
                    return resultArray
                }
            }
        }
        return resultArray
    }
}