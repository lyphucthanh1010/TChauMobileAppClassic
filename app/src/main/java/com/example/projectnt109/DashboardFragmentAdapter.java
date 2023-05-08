package com.example.projectnt109;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DashboardFragmentAdapter extends FragmentStatePagerAdapter {
    public DashboardFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new fragment_home();
            case 1:
                return new fragment_search();
            case 2:
                return new fragment_group();
            case 3:
                return new fragment_chat2();
            case 4:
                return new fragment_profile();
            default:
                return new fragment_home();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
