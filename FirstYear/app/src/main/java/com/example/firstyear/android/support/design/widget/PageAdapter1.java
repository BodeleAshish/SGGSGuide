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


public  class PageAdapter1 extends FragmentPagerAdapter
{
    int mNumOfTabs;

    public PageAdapter1(FragmentManager fm, int NumOfTabs)
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
            case 0: return new extcFragment1();
            case 1: return new extcFragment2();
            case 2: return new extcFragment3();
            case 3: return new extcFragment4();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    private class extcFragment1 extends Fragment {
        public extcFragment1() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.extc_fragment1, container, false);
        }
    }

    private class extcFragment2 extends Fragment {
        public extcFragment2(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.extc_fragment2, container, false);
        }
    }

    private class extcFragment3 extends Fragment {
        public extcFragment3(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.extc_fragment3, container, false);
        }
    }

    private class extcFragment4 extends Fragment {
        public extcFragment4(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.extc_fragment4, container, false);
        }
    }
}
