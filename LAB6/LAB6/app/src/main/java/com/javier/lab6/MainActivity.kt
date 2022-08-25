package com.javier.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomBar: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar = findViewById(R.id.fragmentContainer_mainActivity)
        replaceFragment(HomeFragment())
        setListeners()
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainer_mainActivity, fragment)
        }
    }

    private fun setListeners() {
        bottomBar.setOnItemSelectedListener {
            when(it.itemId) {
            R.id.menu_home-> replaceFragment(HomeFragment())
            R.id.menu_search -> replaceFragment(SearchFragment())
            R.id.menu_library -> replaceFragment(LibraryFragment())

            }
            true
        }
    }


}