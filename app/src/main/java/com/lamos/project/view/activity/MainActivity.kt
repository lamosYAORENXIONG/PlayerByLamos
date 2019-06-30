package com.lamos.project.view.activity


import android.content.Context
import com.lamos.project.base.BaseActivity
import com.lamos.project.R

class MainActivity : BaseActivity() {


    override fun getLayoutId(): Int {
       return R.layout.activity_main
    }

    override fun initListener() {
        super.initListener()
    }

    override fun inttDate() {
        initMainToolBar()

    }
}
