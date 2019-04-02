package fi.qvik.android.commons.utils

import android.graphics.Paint
import android.widget.TextView

/**
 * Set text bolding on or off
 */
fun TextView.bold(isBold: Boolean = true) {
    paintFlags = if (isBold) {
        paintFlags or Paint.FAKE_BOLD_TEXT_FLAG
    } else {
        paintFlags and Paint.FAKE_BOLD_TEXT_FLAG.inv()
    }
}

/**
 * Set the text underlining on or off
 */
fun TextView.underline(isUnderline: Boolean = true) {
    paintFlags = if (isUnderline) {
        paintFlags or Paint.UNDERLINE_TEXT_FLAG
    } else {
        paintFlags and Paint.UNDERLINE_TEXT_FLAG.inv()
    }
}