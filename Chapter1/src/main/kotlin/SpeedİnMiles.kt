package org.example

fun main() {
    //Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
    val miles = 14 / 1.6
    val hour = 60 / 45.3

    val average = miles / hour

    print("Average speed is: $average")
}