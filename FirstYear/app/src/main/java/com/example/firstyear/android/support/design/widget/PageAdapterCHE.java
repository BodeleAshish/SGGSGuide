package com.example.firstyear.android.support.design.widget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.firstyear.R;


public  class PageAdapterCHE extends FragmentPagerAdapter
{
    int mNumOfTabs;

    public PageAdapterCHE(FragmentManager fm, int NumOfTabs)
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
            case 0: return new cheFragment1();
            case 1: return new cheFragment2();
            case 2: return new cheFragment3();
            case 3: return new cheFragment4();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    private class cheFragment1 extends Fragment {
        public cheFragment1(){ }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.che_fragment1, container, false);
        }
    }

    private class cheFragment2 extends Fragment {
        public cheFragment2(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.che_fragment2, container, false);
        }
    }

    private class cheFragment3 extends Fragment {
        public cheFragment3(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.che_fragment3, container, false);
        }
    }

    private class cheFragment4 extends Fragment {
        public cheFragment4(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.che_fragment4, container, false);
        }
    }
}
