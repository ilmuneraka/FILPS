package com.example.filps.ui.bantuan;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.filps.R;
import com.example.filps.databinding.FragmentBantuanBinding;

public class BantuanFragment extends Fragment {

    private BantuanViewModel bantuanViewModel;
    private FragmentBantuanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bantuanViewModel =
                new ViewModelProvider(this).get(BantuanViewModel.class);

        binding = FragmentBantuanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBantuan;
        bantuanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}