/*If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/

fun main() {
    // last element of list multiple 3 and 5
    val lastElement = (1..999).toList().asSequence().filter { it % 3 == 0 || it % 5 == 0 }.last()
    // make a list
    val res = (1..lastElement).toList().asSequence().filter { it % 3 == 0 || it % 5 == 0 }.sum()
    // print res
    print(res)
}

