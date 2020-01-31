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

public  class PageAdapterCIV extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapterCIV(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new civFragment1();
            case 1:
                return new civFragment2();
            case 2:
                return new civFragment3();
            case 3:
                return new civFragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return mNumOfTabs;
    }

    private class civFragment1 extends Fragment {
        public civFragment1(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.civ_fragment1, container, false);
        }
    }

    private class civFragment2 extends Fragment {
        public civFragment2(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.civ_fragment2, container, false);
        }
    }

    private class civFragment3 extends Fragment {
        public civFragment3(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.civ_fragment3, container, false);
        }
    }

    private class civFragment4 extends Fragment {
        public civFragment4(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.civ_fragment4, container, false);
        }
    }
}
