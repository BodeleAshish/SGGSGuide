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


public  class PageAdapterIN extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapterIN(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new inFragment1();
            case 1:
                return new inFragment2();
            case 2:
                return new inFragment3();
            case 3:
                return new inFragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    private class inFragment1 extends Fragment {
        public inFragment1(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.in_fragment1, container, false);
        }
    }

    private class inFragment2 extends Fragment {
        public inFragment2(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.in_fragment2, container, false);
        }
    }

    private class inFragment3 extends Fragment {
        public inFragment3(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.in_fragment3, container, false);
        }
    }

    private class inFragment4 extends Fragment {
        public inFragment4(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.in_fragment4, container, false);
        }
    }
}
