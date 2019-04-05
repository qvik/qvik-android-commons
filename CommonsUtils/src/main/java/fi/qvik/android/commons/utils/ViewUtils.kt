package fi.qvik.android.commons.utils

import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
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

fun EditText.showKeyboard() = toggleKeyboard(true)

fun EditText.hideKeyboard() = toggleKeyboard(false)

fun EditText.toggleKeyboard(show: Boolean) {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    if (show) {
        imm.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
    } else {
        imm.hideSoftInputFromWindow(this.windowToken, 0)
    }
}

fun Activity.showKeyboard() = toggleKeyboard(true)

fun Activity.hideKeyboard() = toggleKeyboard(false)

fun Activity.toggleKeyboard(show: Boolean) {
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    if (show) {
        imm.showSoftInput(window.decorView, InputMethodManager.SHOW_IMPLICIT)
    } else {
        imm.hideSoftInputFromWindow(window.decorView.windowToken, 0)
    }
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.isAnimating(): Boolean = animation != null && animation.hasStarted() && !animation.hasEnded()

fun View.isVisible(): Boolean = visibility == View.VISIBLE

fun View.isVisibleAndOpaque(): Boolean = visibility == View.VISIBLE && alpha == 1f