package org.example.SingleKalman

// 将左上右下表示的框转换为中心点坐标和宽高表示的框
fun xyxy_to_xywh(xyxy: IntArray): IntArray {
    val center_x = (xyxy[0] + xyxy[2]) / 2
    val center_y = (xyxy[1] + xyxy[3]) / 2
    val w = xyxy[2] - xyxy[0]
    val h = xyxy[3] - xyxy[1]
    return intArrayOf(center_x, center_y, w, h)
}

// 将中心点坐标和宽高表示的框转换为左上右下表示的框
fun xywh_to_xyxy(xywh: IntArray): IntArray {
    val x1 = xywh[0] - xywh[2] // 2
    val y1 = xywh[1] - xywh[3] // 2
    val x2 = xywh[0] + xywh[2] // 2
    val y2 = xywh[1] + xywh[3] // 2
    return intArrayOf(x1, y1, x2, y2)
}

fun makeXMatrix(value: Int): Array<IntArray> {
    val matrix = Array(6) {
        when (it) {
            0 -> intArrayOf(value, 0, 0, 0, 0, 0)
            1 -> intArrayOf(0, value, 0, 0, 0, 0)
            2 -> intArrayOf(0, 0, value, 0, 0, 0)
            3 -> intArrayOf(0, 0, 0, value, 0, 0)
            4 -> intArrayOf(0, 0, 0, 0, value, 0)
            5 -> intArrayOf(0, 0, 0, 0, 0, value)
            else -> intArrayOf(0, 0, 0, 0, 0, 0)
        }
    }
    return matrix
}

fun makeXMatrix(value: Float): Array<FloatArray> {
    val matrix = Array(6) {
        when (it) {
            0 -> floatArrayOf(value, 0f, 0f, 0f, 0f, 0f)
            1 -> floatArrayOf(0f, value, 0f, 0f, 0f, 0f)
            2 -> floatArrayOf(0f, 0f, value, 0f, 0f, 0f)
            3 -> floatArrayOf(0f, 0f, 0f, value, 0f, 0f)
            4 -> floatArrayOf(0f, 0f, 0f, 0f, value, 0f)
            5 -> floatArrayOf(0f, 0f, 0f, 0f, 0f, value)
            else -> floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f)
        }
    }
    return matrix
}