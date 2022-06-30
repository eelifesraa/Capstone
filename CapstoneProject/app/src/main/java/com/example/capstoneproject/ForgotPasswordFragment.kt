package com.example.capstoneproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.capstoneproject.databinding.FragmentForgotPasswordBinding
import com.example.capstoneproject.databinding.FragmentLoginBinding

class ForgotPasswordFragment : Fragment() {

    private lateinit var forgotPasswordBinding: FragmentForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        forgotPasswordBinding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        forgotPasswordBinding.btnSend.setOnClickListener {
            findNavController()
                .navigate(R.id.action_forgotPasswordFragment_to_loginFragment)
        }
        return forgotPasswordBinding.root
    }


}