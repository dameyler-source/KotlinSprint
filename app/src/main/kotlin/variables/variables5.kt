package org.example.app.variables

fun main() {

    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    println("$hours:$minutes:$seconds")

}