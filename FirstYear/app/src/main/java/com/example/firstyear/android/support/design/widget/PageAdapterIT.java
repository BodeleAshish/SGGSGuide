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


public  class PageAdapterIT extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapterIT(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new itFragment1();
            case 1:
                return new itFragment2();
            case 2:
                return new itFragment3();
            case 3:
                return new itFragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return mNumOfTabs;
    }

    private class itFragment1 extends Fragment {
        public itFragment1(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.it_fragment1, container, false);
        }
    }

    private class itFragment2 extends Fragment {

        public itFragment2(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.it_fragment2, container, false);
        }
    }

    private class itFragment3 extends Fragment {
        public itFragment3(){

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.it_fragment3, container, false);
        }
    }

    private class itFragment4 extends Fragment {
        public itFragment4(){

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.it_fragment4, container, false);
        }
    }
}
