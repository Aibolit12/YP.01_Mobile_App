package com.example.yp_01.boottomNav.MenuFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.yp_01.databinding.FragmentFoodsBinding;
import com.example.yp_01.databinding.FragmentSauceBinding;

public class SauceFragment extends Fragment {
    private FragmentSauceBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSauceBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}
