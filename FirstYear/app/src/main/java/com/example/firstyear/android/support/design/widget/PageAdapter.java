package com.example.firstyear.android.support.design.widget;

import androidx.fragment.app.FragmentManager;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public  class PageAdapter extends FragmentPagerAdapter
{
    int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs)
    {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            case 3: return new TabFragment4();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
