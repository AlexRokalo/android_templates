package com.example.mytemplates.ui.view.widget.bottom_navigation

import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewTreeObserver
import android.widget.TextView
import com.example.mytemplates.R
import com.example.mytemplates.ui.view.dp


fun BottomNavigationView.removePaddingFromNavigationItem() {
    val menuView = this.getChildAt(0) as BottomNavigationMenuView
    for (i in 0 until menuView.childCount) {
        val item = menuView.getChildAt(i) as BottomNavigationItemView
        val activeLabel = item.findViewById<View>(R.id.largeLabel)
        if (activeLabel is TextView) {
            activeLabel.setPadding(0, 0, 0, 0)
        }
    }
}


fun BottomNavigationView.setBadge(@IdRes itemId: Int, value: Boolean, @LayoutRes badgeId: Int) {
    removeBadge(itemId)
    if (value) addBadge(itemId, badgeId)
}


fun BottomNavigationView.removeBadge(@IdRes itemId: Int) {
    val itemView = this.findViewById<BottomNavigationItemView>(itemId)
    if (itemView.childCount == 3) {
        itemView.removeViewAt(2)
    }
}

fun BottomNavigationView.addBadge(@IdRes itemId: Int, @LayoutRes badgeId: Int) {
    val itemView = this.findViewById<BottomNavigationItemView>(itemId)
    var onGlobalLayoutListener: ViewTreeObserver.OnGlobalLayoutListener? = null
    val badge = LayoutInflater.from(this@addBadge.context).inflate(badgeId, itemView, false)
    onGlobalLayoutListener = ViewTreeObserver.OnGlobalLayoutListener {
        itemView.viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener)
        badge.x += itemView.width / 2f + 4.dp
        badge.y += itemView.height / 2f - 8.dp
    }
    itemView.addView(badge)
    itemView.viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener)
}


