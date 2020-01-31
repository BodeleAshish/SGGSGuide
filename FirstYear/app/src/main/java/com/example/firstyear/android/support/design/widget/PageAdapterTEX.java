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


public  class PageAdapterTEX extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapterTEX(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new texFragment1();
            case 1:
                return new texFragment2();
            case 2:
                return new texFragment3();
            case 3:
                return new texFragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    private class texFragment1 extends Fragment {
        public texFragment1(){}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.tex_fragment1, container, false);
        }
    }

    private class texFragment2 extends Fragment {
        public texFragment2(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.tex_fragment2, container, false);
        }
    }

    private class texFragment3 extends Fragment {

        public texFragment3(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.tex_fragment3, container, false);
        }
    }

    private class texFragment4 extends Fragment {
        public texFragment4(){}
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment.
            return inflater.inflate(R.layout.tex_fragment4, container, false);
        }
    }
}
