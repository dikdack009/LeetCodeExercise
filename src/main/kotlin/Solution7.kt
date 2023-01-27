import kotlin.math.abs
import kotlin.math.pow

class Solution7 {
    fun reverse(x: Int): Int {
        val numberList = ArrayList<Int>()
        var part = x
        var size = 0
        while (part != 0) {
            numberList.add(part % 10)
            part /= 10
            size++
        }
        println(numberList)
        var result = 0
        var checkIntOut = true
        for (power in size - 1 downTo 0) {
            val check = checkMaxNumber(abs(numberList[size - power - 1]), power)
            if (checkIntOut && check == 1 && size >= 10) {
                checkIntOut = false
            }
            else if (checkIntOut && check == 0 && size >= 10) {
                checkIntOut = true
            }
            else if (checkIntOut && size >= 10) {
                return 0
            }
            result += 10.0.pow(power.toDouble()).toInt() * numberList[size - power - 1]
            println(result)
        }
        return result
    }

    private fun checkMaxNumber(x: Int, power: Int): Int {
        println("$x ${Int.MAX_VALUE / 10.0.pow(power.toDouble()).toInt() % 10} ${Int.MAX_VALUE} ")
        if (x > Int.MAX_VALUE / 10.0.pow(power.toDouble()).toInt() % 10) {
            return -1
        }
        if (x == Int.MAX_VALUE / 10.0.pow(power.toDouble()).toInt() % 10) {
            return 0
        }
        return 1
    }
}