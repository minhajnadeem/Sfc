package com.mj.minhajlib.spotfoodcenter;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFastFood extends Fragment {

    private TabLayout mTabLayout;
    TabLayout.OnTabSelectedListener mOnTabSelectedListener;

    public FragmentFastFood() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        mTabLayout.addOnTabSelectedListener(mOnTabSelectedListener);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mTabLayout.removeOnTabSelectedListener(mOnTabSelectedListener);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food, container, false);

        mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout);

        setUpTab();
        setUpFragment(mTabLayout.getSelectedTabPosition());
        mOnTabSelectedListener = new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                setUpFragment(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        };
        return view;
    }

    private void setUpFragment(int position) {

        Fragment fragment;
        switch (position){
            case 0:
                fragment = new FragmentFastFoodOne();
                break;
            case 1:
                fragment = new FragmentFastFoodTwo();
                break;
            case 2:
                fragment = new FragmentFastFoodThree();
                break;
            default:
                fragment = null;
        }
        if (fragment!=null){
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fast_food_tab,fragment);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.commit();
        }
    }

    private void setUpTab() {

        TabLayout.Tab tab1 = mTabLayout.newTab().setText("Page 1");
        mTabLayout.addTab(tab1,true);

        TabLayout.Tab tab2 = mTabLayout.newTab().setText("Page 2");
        mTabLayout.addTab(tab2);

        TabLayout.Tab tab3 = mTabLayout.newTab().setText("Page 3");
        mTabLayout.addTab(tab3);
    }
}