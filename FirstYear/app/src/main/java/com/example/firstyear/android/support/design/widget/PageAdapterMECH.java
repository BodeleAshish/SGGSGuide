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


public  class PageAdapterMECH extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapterMECH(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new meFragment1();
            case 1:
                return new meFragment2();
            case 2:
                return new meFragment3();
            case 3:
                return new meFragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    private class meFragment1 extends Fragment {
        public meFragment1(){}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.me_fragment1, container, false);
        }
    }

    private class meFragment2 extends Fragment {
        public meFragment2(){}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.me_fragment2, container, false);
        }
    }

    private class meFragment3 extends Fragment {
        public meFragment3(){}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.me_fragment3, container, false);
        }
    }

    private class meFragment4 extends Fragment {
        public meFragment4(){}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.me_fragment4, container, false);
        }
    }
}
