package com.example.latihan3prauts.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.latihan3prauts.fragment.BiodataFragment;
import com.example.latihan3prauts.fragment.DailyActivityFragment;
import com.example.latihan3prauts.fragment.GalleryFragment;

public class HomeAdapter extends FragmentPagerAdapter {
    private static int ITEM_COUNT = 3;

    public HomeAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BiodataFragment();
            case 1:
                return new GalleryFragment();
            case 2:
                return new DailyActivityFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Biodata";
            case 1:
                return "Friend List";
            default:
                return "Contact Us";
        }
    }
}