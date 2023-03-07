package codewars

/* given an integer n, the output shold represent [n,n-1,n-2,..1]*/

fun reverseSeq(n: Int): List<Int> {
    return (n downTo 1).toList()
}

fun main(){
    println(reverseSeq(10))
}