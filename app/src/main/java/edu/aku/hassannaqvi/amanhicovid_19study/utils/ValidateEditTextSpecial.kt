package edu.aku.hassannaqvi.amanhicovid_19study.utils

import android.text.Editable
import android.text.TextWatcher
import com.edittextpicker.aliazaz.EditTextPicker

public fun txtWatch1(edx: EditTextPicker) {
    edx.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            if (edx.text.toString().isNotEmpty()) {
                if (Integer.parseInt(edx.text.toString()) == 888)
                    edx.rangedefaultvalue = 888f
                if (Integer.parseInt(edx.text.toString()) == 999)
                    edx.rangedefaultvalue = 999f
            }
        }

        override fun afterTextChanged(s: Editable) {}
    })
}