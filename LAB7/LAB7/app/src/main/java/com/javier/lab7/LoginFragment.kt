package com.javier.lab7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var buttonNewAcount :Button
    private lateinit var buttonLogin :Button
    private lateinit var textCorreo: EditText
    private lateinit var correo: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonNewAcount = view.findViewById(R.id.button_fragment_login_nuevo_usuario)
        buttonLogin = view.findViewById(R.id.button_fragment_login_inisiar_sesion)
        textCorreo = view.findViewById(R.id.textInput_loginFragment_editText)
        setlistener()
    }

    private fun setlistener() {

        buttonLogin.setOnClickListener{

            correo = textCorreo.text.toString()

            if(correo == getString(R.string.correoCorrecto)){
                val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(
                    email = correo
                )
                requireView().findNavController().navigate(action)
            }

            else{
                Toast.makeText(activity, getString(R.string.correoNoExiste), Toast.LENGTH_LONG).show()
            }
        }

        buttonNewAcount.setOnClickListener{

            requireView().findNavController().navigate(R.id.action_loginFragment2_to_newAcountFragment22)

        }


    }


}