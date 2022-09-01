package com.javier.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var textCentral : TextView
    private lateinit var buttonActualizarPerfil : Button
    private val args: HomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textCentral = view.findViewById(R.id.textView_fragment_home_nuevo_usuario)
        buttonActualizarPerfil = view.findViewById(R.id.button_fragment_home_actualizar_perfil)

        setListeners()
        setCenterText()

    }
    private fun setListeners() {
        buttonActualizarPerfil.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(
                email = args.email
            )
            requireView().findNavController().navigate(action)

        }
    }

    private fun setCenterText() {
        textCentral.text = getString(R.string.mensage_central_homeFragment).format(args.email)
    }


}