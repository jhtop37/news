package com.example.mynews


import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class RSSNewsItemView(context: Context, aItem: RSSNewsItem) :
    LinearLayout(context) {
    /**
     * Icon
     */
    private val mIcon: ImageView

    /**
     * TextView 01
     */
    private val mText01: TextView

    /**
     * TextView 02
     */
    private val mText02: TextView

    /**
     * TextView 03
     */

    /**
     * WebView 04
     */

    /**
     * set Text
     *
     * @param index
     * @param data
     */
    fun setText(index: Int, data: String) {
        if (index == 0) {
            mText01.text = data
        } else if (index == 1) {
            mText02.text = data
        }  else {
            throw IllegalArgumentException()
        }
    }

    /**
     * set Icon
     *
     * @param icon
     */
    fun setIcon(icon: Drawable?) {
        mIcon.setImageDrawable(icon)
    }

    init {

        // Layout Inflation
        val inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.listitem, this, true)

        // Set Icon
        mIcon = findViewById<View>(R.id.iconItem) as ImageView
        mIcon.setImageDrawable(aItem.icon)

        // Set Text 01
        mText01 = findViewById<View>(R.id.dataItem01) as TextView
        mText01.setText(aItem.title)

        // Set Text 02
        mText02 = findViewById<View>(R.id.dataItem02) as TextView
        mText02.setText(aItem.description)

    }
}