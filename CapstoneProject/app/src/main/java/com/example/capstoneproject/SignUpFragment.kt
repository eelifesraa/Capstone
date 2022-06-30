package com.example.capstoneproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.capstoneproject.databinding.FragmentForgotPasswordBinding
import com.example.capstoneproject.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var signUpBinding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        signUpBinding = FragmentSignUpBinding.inflate(inflater, container, false)
        signUpBinding.btnSignUp.setOnClickListener{
            findNavController()
                .navigate(R.id.action_signUpFragment_to_loginFragment)
        }

        signUpBinding.haveAccount.setOnClickListener{
            findNavController()
                .navigate(R.id.action_signUpFragment_to_loginFragment)
        }

        return signUpBinding.root
    }


}