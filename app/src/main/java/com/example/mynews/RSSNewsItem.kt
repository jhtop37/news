package com.example.mynews

import android.graphics.drawable.Drawable

class RSSNewsItem {
    var title: String? = null
    var link: String? = null
    var description: String? = null
    /**
     * Get icon
     *
     * @return
     */
    /**
     * Set icon
     *
     * @param icon
     */
    var icon: Drawable? = null

    /**
     * Initialize with icon and data array
     */
    constructor() {}

    /**
     * Initialize with icon and strings
     */
    constructor(
        title: String?,
        link: String?,
        description: String?

    ) {
        this.title = title
        this.link = link
        this.description = description

    }

    /**
     * Compare with the input object
     *
     * @param other
     * @return
     */
    operator fun compareTo(other: RSSNewsItem): Int {
        if (title == other.title) {
            return -1
        } else if (link == other.link) {
            return -1
        } else if (description == other.description) {
            return -1
        }
        return 0
    }
}