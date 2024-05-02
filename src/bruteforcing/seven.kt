package bruteforcing

fun main() {
    val height = mutableListOf<Int>()

    repeat(9){
            height.add(readln().toIntOrNull()!!)
        }
    height.sort()

    val sum = height.sum()
    var ptr1 = -1
    var ptr2 = -1
    var isfinish = false


    for (i in 0..<9){
        for (j in 0..<9){
            if (i == j) continue

            val seven = sum - height[i] - height[j]
            if (seven == 100){
                ptr1 = i
                ptr2 = j
            isfinish = true
            break
        }
    }
    if (isfinish) break
    }
    repeat(9) { if (it != ptr1 && it != ptr2) println(height[it]) }
}

