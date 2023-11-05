package com.tshahakurov.noteapplication.view.fragment.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.tshahakurov.noteapplication.R
import com.tshahakurov.noteapplication.databinding.FragmentLoginBinding
import com.tshahakurov.noteapplication.util.replaceFragment
import com.tshahakurov.noteapplication.view.fragment.book.list.NoteListFragment

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            signInButtonText.setOnClickListener {
                parentFragmentManager.replaceFragment(
                    R.id.fragmentContainer, SignInFragment()
                )
            }
            loginButton.setOnClickListener {
                parentFragmentManager.replaceFragment(
                    R.id.fragmentContainer, NoteListFragment()
                )
                Toast.makeText(requireContext(), R.string.login_successful, Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}