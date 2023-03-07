package codewars

fun dutyFree(normPrice: Int, discount:Int, hol:Int) : Int {
    val saving = hol * 100 / (normPrice * discount)
    return saving.toInt()
}

fun main(){
    println(dutyFree(17, 10, 500))
}

