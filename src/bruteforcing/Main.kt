package bruteforcing

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val input = readln().split(" ")
    val a = input[0].toIntOrNull() ?: return
    val b = input[1].toIntOrNull() ?: return





    for( i in -1000..1001){
        val formula = (i * i) + (2 * i * a) + b
        if (formula == 0){
            print(i)
        }
    }
}



