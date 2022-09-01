package com.javier.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs


class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var textNuevoCorreo : EditText
    private lateinit var buttonActualizar : Button
    private val args: ProfileFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textNuevoCorreo = view.findViewById(R.id.textInput_actualizar_perfilFragment_editText)
        buttonActualizar = view.findViewById(R.id.button_fragment_porfile_actualizar)
        setListeners()
        setNuevoCorreo()
    }
    private fun setNuevoCorreo() {
        textNuevoCorreo.setText(args.email)
    }


    private fun setListeners() {
        buttonActualizar.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }
    }

}