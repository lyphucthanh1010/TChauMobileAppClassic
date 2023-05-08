package com.example.projectnt109;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BoardPagerAdapter extends FragmentStatePagerAdapter {
    public BoardPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new OnboardingFragment1();
            case 1:
                return new OnboardingFragment2();
            case 2:
                return new OnboardingFragment3();
            case 3:
                return new OnboardingFragment4();
            case 4:
                return new OnboardingFragment5();
            case 5:
                return new OnboardingFragment6();
            default:
                return new OnboardingFragment1();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
}
