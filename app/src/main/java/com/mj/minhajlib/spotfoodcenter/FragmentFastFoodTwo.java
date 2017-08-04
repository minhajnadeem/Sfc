package com.mj.minhajlib.spotfoodcenter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.mj.minhajlib.spotfoodcenter.modal.DealModal;
import com.mj.minhajlib.spotfoodcenter.adapters.ExpandableLv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFastFoodTwo extends Fragment {

    List<String> mStringListHeader;
    HashMap<String,List<DealModal>> mHashMapItem;

    public FragmentFastFoodTwo() {
        // Required empty public constructor
        mHashMapItem = new HashMap<>();
        mStringListHeader = new ArrayList<>();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food_two, container, false);

        ExpandableListView expandableLv = (ExpandableListView) view.findViewById(R.id.exp_list_view);
        setUpMenu();
        ExpandableLv adapter = new ExpandableLv(getContext(),mStringListHeader,mHashMapItem);
        expandableLv.setAdapter(adapter);
        return view;
    }

    private void setUpMenu() {
        mStringListHeader = Arrays.asList(getResources().getStringArray(R.array.list_header));
        //burgerItems.add(new DealModal("","","Rs."));
        List<DealModal> burgerItems = new ArrayList<>();
        burgerItems.add(new DealModal("","Zinger Burger","Rs.190"));
        burgerItems.add(new DealModal("","Chicken Burger","Rs.140"));
        burgerItems.add(new DealModal("","Mighty Burger","Rs.280"));
        burgerItems.add(new DealModal("","Fish Burger","Rs.270"));
        burgerItems.add(new DealModal("","Tikka Burger","Rs.150"));
        burgerItems.add(new DealModal("","Steak Burger","Rs.170"));
        burgerItems.add(new DealModal("","Beef Burger","Rs.160"));

        //chickenPcsItems.add(new DealModal("","","Rs."));
        List<DealModal> chickenPcsItems = new ArrayList<>();
        chickenPcsItems.add(new DealModal("","1-Pc Chicken","Rs.110"));
        chickenPcsItems.add(new DealModal("","2-Pcs Chicken","Rs.210"));
        chickenPcsItems.add(new DealModal("","5-Pcs Chicken","Rs.480"));
        chickenPcsItems.add(new DealModal("","10-Pcs Chicken","Rs.940"));
        chickenPcsItems.add(new DealModal("","5-Pcs Nuggets","Rs.120"));
        chickenPcsItems.add(new DealModal("","10-Pcs Jumbo Wings","Rs.480"));
        chickenPcsItems.add(new DealModal("","5-Pcs Jumbo Wings","Rs.260"));
        chickenPcsItems.add(new DealModal("","10-Pcs Hot Wings","Rs.260"));
        chickenPcsItems.add(new DealModal("","5-Pcs Hot Wings","Rs.140"));
        chickenPcsItems.add(new DealModal("","10-Pcs Nuggets","Rs.210"));
        chickenPcsItems.add(new DealModal("","SPCs Nuggets","Rs.110"));

        //sideOrders.add(new DealModal("","","Rs."));
        List<DealModal> sideOrders = new ArrayList<>();
        sideOrders.add(new DealModal("","Regular Fries","Rs.60"));
        sideOrders.add(new DealModal("","Large Fries","Rs.70"));
        sideOrders.add(new DealModal("","Family Fries","Rs.130"));
        sideOrders.add(new DealModal("","Dinner Roll","Rs.20"));
        sideOrders.add(new DealModal("","1-Pc Fish","Rs.180"));
        sideOrders.add(new DealModal("","Cheese Slice","Rs.25"));

        mHashMapItem.put(mStringListHeader.get(0),burgerItems);
        mHashMapItem.put(mStringListHeader.get(1),chickenPcsItems);
        mHashMapItem.put(mStringListHeader.get(2),sideOrders);
    }


}
