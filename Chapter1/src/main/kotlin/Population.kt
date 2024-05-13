package org.example

fun main() {
    //Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
    val born = 31536000 / 7
    val death = 31536000 / 13
    val immigrant = 31536000 / 45

    var currentPopulation = 312032486

    val nextPopulation = immigrant + born - death
    for (i in 1..5) {
        currentPopulation += nextPopulation
        println("Current Population: $currentPopulation of year $i")
    }
    println(currentPopulation)

}