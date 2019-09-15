package com.luttu.tvatter.application_logic

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import com.luttu.tvatter.R
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        var textView: TextView = findViewById(R.id.username)

        //textView.setText
        return super.onCreateView(name, context, attrs)
    }

}
