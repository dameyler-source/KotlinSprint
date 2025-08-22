package org.example.app.variables

fun main() {
    val year = 1961
    var hour: String = "09"
    var minute: String = "07"

    println(year)
    println("$hour:$minute")

    hour = "10"
    minute = "55"

    println("$hour:$minute")
}