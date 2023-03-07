package codewars

/*
Given a set of numbers, return the additive inverse of each.
Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
*/

fun invert(arr: IntArray): IntArray {
    return arr.map { -it }.toIntArray()

}



fun main(){
    val numbers = intArrayOf(1, 2, -3, 4, 5)
    val invertedNumbers = invert(numbers)
    println(invertedNumbers.contentToString())
}


