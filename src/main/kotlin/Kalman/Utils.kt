package org.example.Kalman

object Utils {
    fun box2stage(box: IntArray): Array<IntArray> {
        val center_x = (box[0] + box[2]) / 2
        val center_y = (box[1] + box[3]) / 2
        val w = box[2] - box[0]
        val h = box[3] - box[1]
        return arrayOf(intArrayOf(center_x, center_y, w, h, 0, 0)).T()
    }


}