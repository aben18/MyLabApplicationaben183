package edu.uw.tcss450.mylabapplicationaben183.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.mylabapplicationaben183.R;
import edu.uw.tcss450.mylabapplicationaben183.databinding.FragmentSignInBinding;

/**
 * A simple {@link Fragment} subclass.

 */
public class SignInFragment extends Fragment implements View.OnClickListener{

    FragmentSignInBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        binding.signIn.setOnClickListener(this);
        binding.register.setOnClickListener(this);
    }
}