import java.lang.StringBuilder
import kotlin.math.max
import kotlin.math.min

class Solution6 {
    fun convert(s: String, numRows: Int): String {
        val stringRows = ArrayList<String>(numRows)
        for (i in 0 until numRows) {
            stringRows.add(i, "")
        }
        var index = 0
        var down = true
        for (i in s.withIndex()) {
            println(index)
            println(i)
            stringRows[index] = stringRows[index].plus(i.value)
            if (down) {
                ++index
                if (index == numRows) {
                    index = max(numRows - 2, 0)
                    down = false
                }
            }
            else {
                --index
                if (index == -1) {
                    index = min(1, numRows - 1)
                    down = true
                }
            }
        }
        val result = StringBuilder()
        for (stringRow in stringRows) {
            result.append(stringRow)
        }

        return result.toString()
    }
}