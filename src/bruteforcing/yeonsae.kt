package bruteforcing

fun main(){
   val candy = readln().toIntOrNull()!!
    var result = 0

    for (i in 1..<candy + 1){
        for (j in 1..<candy + 1){
            for (k in 1..<candy + 1){
                if (i + j + k == candy && i >= j + 2 && k % 2 == 0 ){
                    result++
                }
            }
        }
    }
    println(result)
}