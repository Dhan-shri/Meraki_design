package com.example.meraki

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val skip: TextView = view.findViewById(R.id.tvSkip)
        skip.setOnClickListener {

            val bundle = Bundle()
            val secondFragment = SecondFragment()
            secondFragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container, secondFragment)
                ?.commit()


        }
        val button: Button = view.findViewById(R.id.button)
        button.setOnClickListener {
            activity?.let {
                val intent = Intent(it, SecondActivity::class.java)
                it.startActivity(intent)
            }
        }




        return view
    }
}
