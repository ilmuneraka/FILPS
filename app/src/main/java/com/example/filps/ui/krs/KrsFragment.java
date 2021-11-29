package com.example.filps.ui.krs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.filps.databinding.FragmentKrsBinding;

public class KrsFragment extends Fragment {

    private KrsViewModel krsViewModel;
    private FragmentKrsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        krsViewModel =
                new ViewModelProvider(this).get(KrsViewModel.class);

        binding = FragmentKrsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textKrs;
        krsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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