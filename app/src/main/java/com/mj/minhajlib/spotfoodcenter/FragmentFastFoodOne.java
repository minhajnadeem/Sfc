package com.mj.minhajlib.spotfoodcenter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.mj.minhajlib.spotfoodcenter.adapters.GridViewAdapter;
import com.mj.minhajlib.spotfoodcenter.modal.DealModal;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFastFoodOne extends Fragment {

    private List<DealModal> mDealModalList;
    private AdView mAdView;

    public FragmentFastFoodOne() {
        // Required empty public constructor
        mDealModalList = new ArrayList<>();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food_one, container, false);

        GridView gridView = (GridView) view.findViewById(R.id.grid_view);
        mAdView = (AdView) view.findViewById(R.id.adViewMain);
        adRequest();
        setUpDealModal();
        GridViewAdapter adapter = new GridViewAdapter(getContext(),mDealModalList);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }

    private void adRequest() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void setUpDealModal() {
        //mDealModalList.add(new DealModal("","","Rs."));

        mDealModalList.add(new DealModal("1","1-Hot Shot","Rs.200"));
        mDealModalList.add(new DealModal("2","10-Pcs Nuggets","Rs.230"));
        mDealModalList.add(new DealModal("3","Chicken Burger \n1-Fries + 1-Drink\n","Rs.210"));
        mDealModalList.add(new DealModal("4","Zinger Burger \n1-Fries + 1-Drink\n","Rs.280"));
        mDealModalList.add(new DealModal("5","Mighty Zinger Burger + 1-Drink\n","Rs.300"));
        mDealModalList.add(new DealModal("6","Zinger Burger 1-Pc Chicken 1-Fries +1-Drink\n","Rs.360"));
        mDealModalList.add(new DealModal("7","Chicken Burger 1-Pcs Chicken + 1-Drink\n","Rs.270"));
        mDealModalList.add(new DealModal("8","5-pcs Hot Wings 5-pcs Nuggets + 1-Drink\n","Rs.250"));
        mDealModalList.add(new DealModal("9","3-pcs Chicken + 1 Drink\n1- Dinner Roll\n","Rs.300"));
        mDealModalList.add(new DealModal("10","5-Pcs Jumbo Wings + 1-Drink\n","Rs.290"));
        mDealModalList.add(new DealModal("11","Tikka Burger 1-Drink","Rs.170"));
        mDealModalList.add(new DealModal("12","Beef Burger 1-Drink","Rs.230"));
        mDealModalList.add(new DealModal("13","1-Tikka Roll","Rs.160"));
        mDealModalList.add(new DealModal("14","5 Pcs Hot Wings\n1 Reg.Fries\n1 Reg.Drink\n","Rs.240"));
        mDealModalList.add(new DealModal("15","10-Pcs Hot Wings + 1-Drink","Rs.250"));
        mDealModalList.add(new DealModal("16","Zinger Burger + 1-Pcs Chicken + 1-Drink","Rs.300"));
        mDealModalList.add(new DealModal("17","2-Pcs Chicken\n1-Fires + 1-Drink","Rs.270"));
        mDealModalList.add(new DealModal("18","3-pcs Chicken Combination + 1-Drink 1 Dinner Roll","Rs.280"));
        mDealModalList.add(new DealModal("19","1 Chicken Burger\n1 Reg Fries\n1 Drink","Rs.240"));
        mDealModalList.add(new DealModal("20","1 Pc Chicken\n1 Reg.Fries\n1Drink","Rs.180"));
        mDealModalList.add(new DealModal("21","5 pcs Nuggests\n1Reg.Fries\n1Reg.Drink","Rs.240"));
        mDealModalList.add(new DealModal("22","1.Spicy Rice Rs.170\n2.Tikka Rice Rs.160\n3.Fish Rice Rs.190",""));
        mDealModalList.add(new DealModal("22","4.Shawarma Rice Rs.160\n5.Chicken Kabab Rice Rs.160\n6.Special Rice Rs.200",""));
        mDealModalList.add(new DealModal("23","1.Shawarma Rs.140\n2.Fried Shawarma Rs.140\n3.Fish Shawarma Rs.160\n4.Plater Shawarma Rs.210",""));
        mDealModalList.add(new DealModal("24","10-Pcs Chicken + 5 Dinner Roll 1-Family Fries + 5 Drink","Rs.1150"));
        mDealModalList.add(new DealModal("25","3-Pcs Chicken + 4 Zinger Burger 1-Family Fries + 5 Drink","Rs.1250"));

    }
}
