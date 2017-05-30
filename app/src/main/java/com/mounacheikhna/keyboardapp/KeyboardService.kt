package com.mounacheikhna.keyboardapp

import android.content.Context
import android.inputmethodservice.InputMethodService
import android.view.View

class KeyboardService: InputMethodService() {

  override fun onCreateInputView(): View {
    val view = layoutInflater.inflate(R.layout.keyboard, null)
    var inputMethodManager = this.getSystemService(Context.INPUT_METHOD_SERVICE)
    return view
  }



}
