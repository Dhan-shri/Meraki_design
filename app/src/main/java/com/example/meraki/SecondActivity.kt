package com.example.meraki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class SecondActivity : AppCompatActivity() {


    lateinit var justFragment : Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        replaceFragment2(ThirdFragment(),null)

    }



     private fun replaceFragment2(set:Fragment, bundle: Bundle?){
    justFragment = set
    val fragmentManager = supportFragmentManager
    if (bundle!= null){
        set.arguments = bundle
    }
    val fragmentTrial = fragmentManager.beginTransaction().addToBackStack(null)
    fragmentTrial.replace(R.id.second_container, set)
    fragmentTrial.commit()
}

}