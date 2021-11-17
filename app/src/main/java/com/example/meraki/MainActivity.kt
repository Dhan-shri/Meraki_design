package com.example.meraki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var currentFragment:Fragment
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        replaceFragment(FirstFragment(),null)



//        val button:Button = findViewById(R.id.button)
//        button.setOnClickListener {
//
//            val intent= Intent(this,SecondActivity::class.java)
//            startActivity(intent)
//        }


//        val button:Button = findViewById(R.id.button)
//        button.setOnClickListener{
//            replaceFragment(SecondFragment(),null)
//        }

//        Intent intent = new Intent(view.getContext(), Activity2.class);
//        intent.putExtra("key", "button1");
//        startActivity(intent);

//        drawerLayout = findViewById(R.id.drawer_layout)
//        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout,R.string.nav_open,R.string.nav_close)
//        drawerLayout.addDrawerListener(actionBarDrawerToggle)
//        actionBarDrawerToggle.syncState()
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//
//        navigationView= findViewById(R.id.navigationView)
//        navigationView.setNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId){
//                R.id.nav_first -> {
//                    replaceFragment(FirstFragment(), null)
//                }
//                R.id.nav_second ->{
//                    replaceFragment(SecondFragment(), null)
//                }
//            }
//
//            drawerLayout.closeDrawer(GravityCompat.START)
//            true
//        }


    }

    private fun replaceFragment(setFragment: Fragment, bundle: Bundle?) {
        currentFragment = setFragment
        val fragmentManager = supportFragmentManager
        if (bundle != null) {
            setFragment.arguments = bundle
        }
        val fragmentTra = fragmentManager.beginTransaction().addToBackStack(null)
        fragmentTra.replace(R.id.fragment_container, setFragment)
        fragmentTra.commit()

    }
}