package com.lamos.project.util

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.Toolbar
import com.lamos.project.R
import com.lamos.project.view.activity.SettingActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

interface ToolbarManager {
    val toolbar:Toolbar



    fun initMainToolBar(){
        toolbar.setTitle(toolbar.context.getString(R.string.toolbar_mainactivity_name))
        toolbar.inflateMenu(R.menu.toolbar_menu)
        toolbar.setOnMenuItemClickListener {
            when(it?.itemId){
                R.id.setting -> toolbar.context.startActivity<SettingActivity>()
            }
            true
        }
    }


    fun initSettingToolBar(){
        toolbar.setTitle(toolbar.context.getString(R.string.toolbar_settingactivity_name))
    }
}

