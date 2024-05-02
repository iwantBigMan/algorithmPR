package bruteforcing

fun main(){
    val input = readln().split(" ")

    val sheep = input[0].toIntOrNull() ?: return
    val goat = input[1].toIntOrNull() ?: return
    val ani = input[2].toIntOrNull() ?: return
    val feed = input[3].toIntOrNull() ?: return

    var result = false

   for (i in 1..<ani){
        for (j in 1..<ani){
            if (i + j == ani){
                if ((sheep * i) + (j * goat) == feed ){
                    print("$i $j")
                    result = true
                    break
                }
            }
                if (result) break

            }
        }
    if (!result) println(-1)
    }
