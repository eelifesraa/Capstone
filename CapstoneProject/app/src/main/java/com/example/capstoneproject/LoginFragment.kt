package com.example.capstoneproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.capstoneproject.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginFragment : Fragment() {

    private lateinit var loginBinding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loginBinding = FragmentLoginBinding.inflate(inflater, container, false)
        loginBinding.btnForgot.setOnClickListener {
            findNavController()
                .navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
        return loginBinding.root
    }

    override fun onStart() {
        super.onStart()
        loginBinding.apply {
            btnLogin.setOnClickListener {
               /*
                loginValidation(
                    etEmailAddress.text.toString(),
                    etLoginPassword.text.toString()
                )

                */
                findNavController()
                    .navigate(R.id.action_loginFragment_to_shoppingActivity)
            }
        }
    }
/*
    private fun loginValidation(email: String, password: String) {
        val emailControl = email.trim { it <= ' ' }
        val passwordControl = password.trim { it <= ' ' }

        FirebaseAuth.getInstance()
            .signInWithEmailAndPassword(emailControl, passwordControl)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(activity, "Login successful!", Toast.LENGTH_LONG).show()
                    findNavController()
                        .navigate(R.id.action_loginFragment_to_shoppingActivity)
                } else
                    Toast.makeText(activity, "Try again!", Toast.LENGTH_LONG).show()
            }
    }

*/



}