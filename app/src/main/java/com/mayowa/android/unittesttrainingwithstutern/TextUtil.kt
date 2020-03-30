package com.mayowa.android.unittesttrainingwithstutern

import android.content.Context

class TextUtil(private val context: Context) {

    fun getString(resId: Int) = context.getString(resId)

    fun getCharAtIndex(index: Int): Char {
        val text = context.getString(R.string.stutern_training)
        return text[index]
    }
}
