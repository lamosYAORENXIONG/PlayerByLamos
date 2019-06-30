package com.lamos.project.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.preference.PreferenceManager
import android.support.v7.widget.Toolbar
import com.lamos.project.R
import com.lamos.project.base.BaseActivity
import com.lamos.project.util.ToolbarManager

class SettingActivity : BaseActivity() {

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initListener() {
        super.initListener()
    }

    override fun inttDate() {
        initSettingToolBar()

        val sp = PreferenceManager.getDefaultSharedPreferences(this);

    }

//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//        setContentView(R.layout.activity_setting)
//    }


}
