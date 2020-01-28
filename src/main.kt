/*
Pseudocode
Variables:
operator1, operator2, operator3, operator4, operator5

Process:
Initialize every variable as an integer or boolean

Set operator 1 equal to 5 + 10
Print operator 1

Set operator 2 to equal itself + 1 (using ++)
Print operator 2

Set operator 3 equal to 20 % 3 to find the remainder
Print operator 3

Set operator 4 to be the boolean value of whether 5 is greater than 2
Print operator 4

Set operator 5 equal to 12-10
Print operator 5
*/

fun main(args: Array< String>)
{
    //Comparison Operators (==, !=, >, <, >=, <=)
    //Assignment operators (+=, -=, *=, /=, %=)
    //Increment & Decrement operators (++,--)

    var operator1 = 0
    var operator2 = 0
    var operator3 = 0
    var operator4 = false
    var operator5 = 0

    operator1 = 5 + 10
    println("5 + 10 = " + operator1)

    operator2++
    println("0 + 1 = " + operator2)

    operator3 = 20%3
    println("20 % 3 = " + operator3)

    operator4 = 5 > 2
    println("5 > 2 is " + operator4)

    operator5 = 12 - 10
    println("12 - 10 = " + operator5)
}