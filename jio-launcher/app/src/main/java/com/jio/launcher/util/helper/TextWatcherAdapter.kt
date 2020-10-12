package com.jio.launcher.util.helper

import android.text.Editable
import android.text.TextWatcher

/**
 * Helper object for TextWatcher when you do not need to implement every function.
 *
 * Akin to Java's Adapters, hence the name.
 */
open class TextWatcherAdapter : TextWatcher {
    override fun afterTextChanged(s: Editable?) {}

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
}
