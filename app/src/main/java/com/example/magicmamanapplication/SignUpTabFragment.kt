package com.example.magicmamanapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class SignUpTabFragment : Fragment() {

    private lateinit var btnRegister: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.signup_tab_fragment, container, false)
        btnRegister.findViewById<ImageView>(R.id.btnRegister)
            btnRegister.setOnClickListener{
                requireActivity().run{
                    startActivity(Intent(this, Identify::class.java))
                    finish()
                }
            }
        }

}
