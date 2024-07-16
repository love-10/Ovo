package org.example.Kalman

import com.google.gson.Gson

private fun transpose(array: Array<FloatArray>): Array<FloatArray> {
    val row = array.size
    val column = if (row != 0) array[0].size else 0
    val transpose = Array(column) { FloatArray(row) }
    for (i in 0..<row) {
        for (j in 0..<column) {
            transpose[j][i] = array[i][j]
        }
    }
    return transpose
}

private fun transpose(array: Array<IntArray>): Array<IntArray> {
    val row = array.size
    val column = if (row != 0) array[0].size else 0
    val transpose = Array(column) { IntArray(row) }
    for (i in 0..<row) {
        for (j in 0..<column) {
            transpose[j][i] = array[i][j]
        }
    }
    return transpose
}

fun Array<FloatArray>.T(): Array<FloatArray> {
    return transpose(this)
}

fun Array<IntArray>.T(): Array<IntArray> {
    return transpose(this)
}

fun log(msg: Any?) {
    println(Gson().toJson(msg))
}