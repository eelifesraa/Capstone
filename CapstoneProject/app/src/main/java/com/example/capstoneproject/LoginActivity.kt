package com.example.capstoneproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.capstoneproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var LoginActivity:ActivityLoginBinding
    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginActivity= ActivityLoginBinding.inflate(layoutInflater)
        LoginActivity.toolbar.title=""
        setContentView(LoginActivity.root)
        //setSupportActionBar(LoginActivity.toolbar)

        val navHostFragment=supportFragmentManager.findFragmentById(LoginActivity.fragmentContainerView.id) as NavHostFragment

        val navController= navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.mainPageFragment,R.id.signUpFragment))

        LoginActivity.toolbar.setupWithNavController(
            navController,
            appBarConfiguration
        )

    }

    override fun onSupportNavigateUp(): Boolean {
        applicationContext
        findNavController(R.id.fragmentContainerView).popBackStack()
        return true
    }
}