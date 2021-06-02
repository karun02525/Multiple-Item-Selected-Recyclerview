package org.chingari.select

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val inputTagArray = mutableListOf<InputTagModel>()
    private lateinit var mTagsAdapter: TagsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        inputTagArray.run {
            add(InputTagModel("Dance" ))
            add(InputTagModel("Funny"))
            add(InputTagModel("Life"))
            add(InputTagModel("Music"))
            add(InputTagModel("Cute"))
            add(InputTagModel("Status"))
            add(InputTagModel("Fail"))
            add(InputTagModel("Motivation challenge"))
            add(InputTagModel("Devotional"))
        }


        val layoutManager = FlexboxLayoutManager(baseContext)
        rv_input_container.layoutManager = layoutManager
        mTagsAdapter = TagsAdapter(inputTagArray)
        rv_input_container.adapter = mTagsAdapter



        btnSubmit.setOnClickListener {
            for (i in inputTagArray) {
                if (i.isSelected) {
                    Log.d("TAGS","===>  "+i.text +"  And => "+i.isSelected)
                }
            }
        }

    }
}