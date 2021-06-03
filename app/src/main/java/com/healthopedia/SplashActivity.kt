package com.healthopedia

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class SplashActivity (var layouts: IntArray, var context:Context): PagerAdapter() {

    private lateinit var inflater:LayoutInflater
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }
    override fun getCount(): Int {
        return layouts.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        inflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var v= inflater.inflate(layouts[position], container,false)
        container.addView(v)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        var v= `object` as View
        container.removeView(v)
    }

}
