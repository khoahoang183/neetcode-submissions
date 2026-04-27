class Solution {
     fun topKFrequent(nums: IntArray, k: Int): IntArray {
           val hashMap = mutableMapOf<Int,Int>()
           for (num in nums){
               if (!hashMap.contains(num)){
                   hashMap[num] = 1
               }else{
                   hashMap[num] = (hashMap[num] ?:0) + 1
               }
           }
           //hashMap.forEach {  Log.d("Steve","${it.key} - ${it.value}") }
           var result = intArrayOf()
           val sortedList = hashMap.toList().sortedByDescending { it.second }
           //sortedList.forEach {  Log.d("Steve", "sortedMap - ${it.toString()}") }
           for (i in 0 until k){
               result += sortedList[i].first
           }
           //result.forEach {  Log.d("Steve", "result - ${result.map {  it.toString()}}}") }
           return result
       }
}
