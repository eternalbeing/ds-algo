package arrays

class SquaredSortedArray {

    fun squaredSortedArray(arrIn : IntArray) : IntArray{

        var low = 0
        var high = arrIn.size - 1
        var arrOut = IntArray(arrIn.size)

        for(i in arrIn.size-1 downTo  0) {
            if(Math.abs(arrIn[low]) > arrIn[high]){
                arrOut[i] = arrIn[low] * arrIn[low]
                low++
            }
            else{
                arrOut[i] = arrIn[high] * arrIn[high]
                high--
            }
        }
        return arrOut

    }

}

fun main() {
    var arrIn = intArrayOf(-6,-4,1,3,6,7)
    var res = SquaredSortedArray().squaredSortedArray(arrIn)
    for (i in 0 until res.size){
        println(res[i] )
    }
}