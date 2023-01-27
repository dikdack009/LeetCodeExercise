
class Solution4 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val nums = IntArray(nums1.size + nums2.size)

        var index1 = 0
        var index2 = 0
        for (i in nums.indices) {
            if (index1 < nums1.size && index2 < nums2.size) {
                if (nums1[index1] < nums2[index2]) {
                    nums[i] = nums1[index1]
                    index1++
                } else {
                    nums[i] = nums2[index2]
                    index2++
                }
            }
            else {
                if (index1 >= nums1.size) {
                    nums[i] = nums2[index2]
                    index2++
                }
                else {
                    nums[i] = nums1[index1]
                    index1++
                }
            }
        }

        val n = (nums.size - 1) / 2
        return if (nums.size % 2 == 1) nums[n].toDouble()
        else (nums[n].toDouble() + nums[n + 1].toDouble()) / 2
    }
}