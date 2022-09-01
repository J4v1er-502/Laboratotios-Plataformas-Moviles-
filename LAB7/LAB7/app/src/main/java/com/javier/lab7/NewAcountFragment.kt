package com.javier.lab7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class NewAcountFragment : Fragment(R.layout.fragment_new_acount) {

    private lateinit var buttonCrearCuenta: Button
    private lateinit var textCorreo: EditText


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCrearCuenta = view.findViewById(R.id.button_fragment_new_acount_crear_cuenta)
        textCorreo = view.findViewById(R.id.textInput_ingresaCorreo_nuevaCuentaFragment_editText)
        setlistener()

    }

    private fun setlistener() {
        buttonCrearCuenta.setOnClickListener {

            val action = NewAcountFragmentDirections.actionNewAcountFragmentToHomeFragment(
                email =textCorreo.text.toString()
            )
            requireView().findNavController().navigate(action)
        }

    }

}