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

public  class PageAdapterele extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapterele(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new eleFragment1();
            case 1:
                return new eleFragment2();
            case 2:
                return new eleFragment3();
            case 3:
                return new eleFragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return mNumOfTabs;
    }

    private class eleFragment1 extends Fragment {
        public eleFragment1(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.ele_fragment1, container, false);
        }
    }

    private class eleFragment2 extends Fragment {
        public eleFragment2(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.ele_fragment2, container, false);
        }
    }

    private class eleFragment3 extends Fragment {
        public eleFragment3(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.ele_fragment3, container, false);
        }
    }

    private class eleFragment4 extends Fragment {
        public eleFragment4(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.ele_fragment4, container, false);
        }
    }
}
