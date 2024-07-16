package org.example.Kalman


fun box2state(box: IntArray): Array<IntArray> {
    val center_x = (box[0] + box[2]) / 2
    val center_y = (box[1] + box[3]) / 2
    val w = box[2] - box[0]
    val h = box[3] - box[1]
    return arrayOf(intArrayOf(center_x, center_y, w, h, 0, 0)).T()
}

fun state2box(state: Array<IntArray>): IntArray {
    val center_x = state[0][0]
    val center_y = state[1][0]
    val w = state[2][0]
    val h = state[3][0]
    return intArrayOf(center_x - w / 2, center_y - h / 2, center_x + w / 2, center_y + h / 2)
}

fun box2meas(box: IntArray): Array<IntArray> {
    val center_x = (box[0] + box[2]) / 2
    val center_y = (box[1] + box[3]) / 2
    val w = box[2] - box[0]
    val h = box[3] - box[1]
    return arrayOf(intArrayOf(center_x, center_y, w, h)).T()
}

fun mea2box(mea: Array<IntArray>): IntArray {
    val center_x = mea[0][0]
    val center_y = mea[1][0]
    val w = mea[2][0]
    val h = mea[3][0]
    return intArrayOf(center_x - w / 2, center_y - h / 2, center_x + w / 2, center_y + h / 2)
}

fun mea2state(mea: Array<IntArray>): Array<IntArray> {
    return mea.plus(intArrayOf(0)).plus(intArrayOf(0))
}

