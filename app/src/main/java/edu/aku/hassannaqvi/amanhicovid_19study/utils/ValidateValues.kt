package edu.aku.hassannaqvi.amanhicovid_19study.utils

import android.text.Editable
import android.text.TextWatcher
import com.edittextpicker.aliazaz.EditTextPicker

public fun chkValues(edx: EditTextPicker) {
    edx.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            if (edx.text.toString().isNotEmpty()) {
                if (edx.text.toString().toDouble() == 888.8)
                    edx.rangedefaultvalue = 888.8f
                if (edx.text.toString().toDouble() == 999.9)
                    edx.rangedefaultvalue = 999.9f
            }
        }

        override fun afterTextChanged(s: Editable) {}
    })
}