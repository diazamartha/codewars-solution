package codewars
/*
Your function takes two arguments:

current father's age (years)
current age of his son (years)
Сalculate how many years ago the father was twice as old as his son
(or in how many years he will be twice as old).
The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.

*/

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    val calculate = dadYearsOld - (2*sonYearsOld)   // define the formula to calculate
    return Math.abs(calculate)      // use Math.abs to get absolute value from our calculation

}

fun main(){
    println(twiceAsOld(29, 1))      // pass the value of our parameter in here
}