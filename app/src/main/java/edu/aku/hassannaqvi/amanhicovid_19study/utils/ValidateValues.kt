package edu.aku.hassannaqvi.amanhicovid_19study.utils

import android.text.Editable
import android.text.TextWatcher
import com.edittextpicker.aliazaz.EditTextPicker

public fun chkValues(edx: EditTextPicker, val1: Array<Double>) {
    edx.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            if (edx.text.toString().isNotEmpty()) {

                if (edx.text.toString().indexOf(".") != -1) {

                    for (item in val1) {
                        if (edx.text.toString().toDouble() == item)
                            edx.rangedefaultvalue = item.toFloat()
                    }

                } else {

                }

            }
        }

        override fun afterTextChanged(s: Editable) {}
    })
}