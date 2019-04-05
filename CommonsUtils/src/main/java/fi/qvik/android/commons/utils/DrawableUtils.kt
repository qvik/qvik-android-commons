package fi.qvik.android.commons.utils

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.VectorDrawable

/**
 * Return the bitmap from a vector drawable that's size is determined by the vectors intrinsic size
 */
fun VectorDrawable.toBitmap(): Bitmap {
    return Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888).apply {
        val canvas = Canvas(this)
        setBounds(0, 0, canvas.width, canvas.height)
        draw(canvas)
    }
}