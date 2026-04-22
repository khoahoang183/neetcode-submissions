class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val prevMap = mutableMapOf<Int, Int>() // value - index
        for (i in 0 until nums.size) {
            val missValue = target - nums[i]
            if (prevMap.contains(missValue)){
                return intArrayOf(prevMap[missValue]!!, i)
            }
            prevMap[nums[i]] = i
        }
        return intArrayOf(0, 0)
    }
}
