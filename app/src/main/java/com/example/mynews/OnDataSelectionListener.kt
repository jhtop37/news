package com.example.mynews;

import android.view.View
import android.widget.AdapterView

interface OnDataSelectionListener {
    fun onDataSelected(
        parent: AdapterView<*>?,
        v: View?,
        position: Int,
        id: Long
    )
}