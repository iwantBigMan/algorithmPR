package backtracking

lateinit var visited : Array<Boolean>
lateinit var arr: Array<Int>

var first = 0
var second= 0

fun main(){
    val input = readln().split(" ")
    first = input[0].toInt()
    second = input[1].toInt()

    arr = Array(first + 1) {i -> i}
    visited = Array(first + 1){ false }

    dfs(1,0,"")



}

fun dfs(idx: Int, len: Int, str: String){

    if (len == second){
        println(str)
        return
    }

    for (i in 1..first){
        if (!visited[i]){
            visited[i] = true
            if (len == 0){
                dfs(i,1,arr[i].toString())
            }
            else{
                dfs(i, len + 1, "$str ${arr[i]}")
            }
            visited[i] = false
        }
    }
}