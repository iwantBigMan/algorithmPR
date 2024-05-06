package backtracking

lateinit var visitor : Array<Boolean>
lateinit var arrS :Array<Int>

var inputOne = 0
var inputTwo = 0


fun main(){
    val ot = readln().split(" ")

    inputOne = ot[0].toInt()
    inputTwo = ot[1].toInt()

    arrS = Array(inputOne + 1) { i -> i}
    visitor = Array(inputOne + 1){false}

    dfsS(1,0,"")

}

    fun dfsS(idx: Int, len: Int, str: String){
    if (len == inputTwo){
        println(str)
        return
    }

    for (i in idx..inputOne){
        if (!visitor[i]){
            visitor[i] = true
            if (len == 0){
                dfsS(i, 1, arrS[i].toString())
            }
            else{
                dfsS(i, len + 1, "$str ${arrS[i]}")
            }
            visitor[i] = false
        }
    }
}