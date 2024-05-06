package backtracking

lateinit var arr1: Array<Int>

var first1 = 0
var second1= 0
val sb = StringBuilder()

fun main(){
    val input = readln().split(" ")
    first1 = input[0].toInt()
    second1 = input[1].toInt()

    arr1 = Array(first1 + 1) {i -> i}

    dfs1(1,0,"")
    println(sb.toString())
}

fun dfs1(idx: Int, len: Int, str: String) {
    if (len == second1) {
        sb.append(str).append("\n")
        return
    }

    for (i in 1..first1) {
        if (len == 0) {
            dfs1(i, 1, arr1[i].toString())
        }
        else{
            dfs1(i, len+1, "$str ${arr1[i]}" )
        }
    }
}



