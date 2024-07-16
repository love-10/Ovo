package org.example.Kalman

fun main() {
    val A = Array(6) {
        when (it) {
            0 -> intArrayOf(1, 0, 0, 0, 1, 0)
            1 -> intArrayOf(0, 1, 0, 0, 0, 1)
            2 -> intArrayOf(0, 0, 1, 0, 0, 0)
            3 -> intArrayOf(0, 0, 0, 1, 0, 0)
            4 -> intArrayOf(0, 0, 0, 0, 1, 0)
            5 -> intArrayOf(0, 0, 0, 0, 0, 1)
            else -> {}
        }
    }

    val Q = A.copyOf().mapIndexed { index, any ->
        val ins = any as IntArray
        ins.mapIndexed { i, _ ->
            if (i == index) {
                1
            } else {
                0
            }
        }
        ins
    }
    log(Q)
}