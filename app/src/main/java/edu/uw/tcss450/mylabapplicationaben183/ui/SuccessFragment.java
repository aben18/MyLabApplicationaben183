package edu.uw.tcss450.mylabapplicationaben183.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.mylabapplicationaben183.R;
import edu.uw.tcss450.mylabapplicationaben183.databinding.FragmentSuccessBinding;

public class SuccessFragment extends Fragment {

    FragmentSuccessBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSuccessBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        //Get a reference to the SafeArgs object
        SuccessFragmentArgs args = SuccessFragmentArgs.fromBundle(getArguments());

        //Set the text color of the label. NOTE no need to cast
        binding.displayEmail.setText(args.getJwt());
    }
}