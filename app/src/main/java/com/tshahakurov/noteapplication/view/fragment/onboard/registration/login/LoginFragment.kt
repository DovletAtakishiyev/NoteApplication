package com.tshahakurov.noteapplication.view.fragment.onboard.registration.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import com.tshahakurov.noteapplication.R
import com.tshahakurov.noteapplication.databinding.FragmentLoginBinding
import com.tshahakurov.noteapplication.util.replaceFragment
import com.tshahakurov.noteapplication.util.replaceFragmentWithStack
import com.tshahakurov.noteapplication.view.fragment.main.MainFragment
import com.tshahakurov.noteapplication.view.fragment.main.note.list.NoteListFragment
import com.tshahakurov.noteapplication.view.fragment.onboard.registration.signin.SignInFragment
import dagger.hilt.android.AndroidEntryPoint


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Util.isLogin = true

        with(binding) {

            emailInputMain.addTextChangedListener {
                viewModel.email.value = it.toString()
            }
            passwordInputMain.addTextChangedListener {
                viewModel.password.value = it.toString()
            }

            loginButton.setOnClickListener {
//                if (viewModel.validateUser()){
//                    Toast.makeText(requireContext(), R.string.login_successful, Toast.LENGTH_SHORT)
//                        .show()
//
//                    parentFragmentManager.replaceFragment(
//                        R.id.fragmentContainer, MainFragment()
//                    )
//                } else {
//                    passwordInputMain.setText("")
//                    Toast.makeText(requireContext(), R.string.registration_error, Toast.LENGTH_SHORT)
//                        .show()
//                }
                parentFragmentManager.replaceFragmentWithStack(
                    R.id.fragmentContainer, SignInFragment()
                )

            }

            signInButtonText.setOnClickListener {
                parentFragmentManager.replaceFragmentWithStack(
                    R.id.fragmentContainer, SignInFragment()
                )
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}