package com.mounacheikhna.keyboardapp

import android.content.Context
import android.inputmethodservice.KeyboardView
import android.util.AttributeSet
import android.view.LayoutInflater

class CodeKeyboardView : KeyboardView {

  constructor(context: Context): super(context) {
    init(context)
  }

  constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
    init(context, attrs)
  }

  constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle) {
    init(context, attrs, defStyle)
  }

  private fun init(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) {
    val view = LayoutInflater.from(context).inflate(R.layout.code_keyboard, this, false)
  }

  //LayoutInflater.from(context).inflate(R.layout.code_keyboard, this)

}