package com.example.yp_01.boottomNav;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.yp_01.boottomNav.MenuFragment.DrinksFragment;
import com.example.yp_01.boottomNav.MenuFragment.FoodsFragment;
import com.example.yp_01.boottomNav.MenuFragment.SauceFragment;
import com.example.yp_01.boottomNav.MenuFragment.SnacksFragment;

public class HomeAdapter extends FragmentStateAdapter {
    public HomeAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position)
        {
            case 0: return new FoodsFragment();
            case 1: return new DrinksFragment();
            case 2: return new SnacksFragment();
            case 3: return new SauceFragment();
            default: return new FoodsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}