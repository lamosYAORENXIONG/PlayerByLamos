package com.lamos.project.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.lamos.project.R
import com.lamos.project.util.ToolbarManager
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

abstract class BaseActivity:AppCompatActivity(),AnkoLogger,ToolbarManager {


   abstract fun getLayoutId():Int
   open protected fun initListener(){}
   open protected fun inttDate(){}

    override val toolbar: Toolbar by lazy{
        find<Toolbar>(R.id.toolbar)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        inttDate()
    }


    protected fun myToast(msg:String){
       runOnUiThread { toast(msg) }
    }

    inline fun <reified T:BaseActivity> startActivityAndFinish(){
        startActivity<T>()
        finish()
    }


}