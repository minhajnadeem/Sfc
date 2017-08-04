package com.mj.minhajlib.spotfoodcenter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.mj.minhajlib.spotfoodcenter.adapters.GridViewAfghan;
import com.mj.minhajlib.spotfoodcenter.modal.DealModal;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAfghanFood extends Fragment {

    private List<DealModal> mDealModalList;
    private AdView mAdView;

    public FragmentAfghanFood() {
        // Required empty public constructor
        mDealModalList = new ArrayList<>();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_afghan_food, container, false);
        mAdView = (AdView) view.findViewById(R.id.adViewTwo);
        adRequest();
        GridView gridView = (GridView) view.findViewById(R.id.grid_view);
        setUpMenu();
        GridViewAfghan adapter = new GridViewAfghan(getContext(),mDealModalList);
        gridView.setAdapter(adapter);

        return view;
    }

    private void adRequest() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void setUpMenu() {

        //mDealModalList.add(new DealModal("","","Rs."));
        mDealModalList.add(new DealModal("1","Kabli Pulao (Beef)","Rs.140"));
        mDealModalList.add(new DealModal("2","Kabli Pulao (Chicken)","Rs.130"));
        mDealModalList.add(new DealModal("3","Bombay Biryani","Rs.130"));
        mDealModalList.add(new DealModal("4","Kabli Beef Kabab","Rs.40"));
        mDealModalList.add(new DealModal("5","Kabli Chicken Kabab","Rs.60"));
        mDealModalList.add(new DealModal("6","Kabli Mutton Kabab","Rs.70"));
        mDealModalList.add(new DealModal("7","Tikka Boti (Pishawari)","Rs.80"));
        mDealModalList.add(new DealModal("8","Leg Piece (Multani) Koilay Wala","Rs.120"));
        mDealModalList.add(new DealModal("9","Chest Piece (Multani) Koilay Wala","Rs.130"));
        mDealModalList.add(new DealModal("10","Chicken Broast(Leg) Multani","Rs.120"));
        mDealModalList.add(new DealModal("11","Chicken Broast(Chest) Multani","Rs.130"));
        mDealModalList.add(new DealModal("12","Half Chicken Karahi(Bahawalpuri)","Rs.350"));
        mDealModalList.add(new DealModal("13","Full Chicken Karahi(Bahawalpuri)","Rs.700"));
        mDealModalList.add(new DealModal("14","Half Chicken Karahi Namkeen(Peshawari)","Rs.375"));
        mDealModalList.add(new DealModal("15","Full Chicken Karahi Namkeen(Peshawari)","Rs.750"));
        mDealModalList.add(new DealModal("16","Chicken White Karahi(half) Bahawalpuri","Rs.400"));
        mDealModalList.add(new DealModal("17","Chicken White Karahi(Full) Bahawalpuri","Rs.800"));
        mDealModalList.add(new DealModal("18","Half Karahi(Mutton) Bahawalpuri","Rs.650"));
        mDealModalList.add(new DealModal("19","Full Karahi(Mutton) Bahawalpur","Rs.1300"));
        mDealModalList.add(new DealModal("20","Half Peshawari Namkeen Karahi(Mutton)","Rs."));
        mDealModalList.add(new DealModal("21","Full Peshawari Namkeen Karahi","Rs.1400"));
        mDealModalList.add(new DealModal("22","Mutton White Karahi(Half)","Rs.700"));
        mDealModalList.add(new DealModal("23","Mutton White Karahi(Full)","Rs.1400"));
        mDealModalList.add(new DealModal("24","Desi Murgha Desi Ghee Special 1KG","Rs.1400"));
        mDealModalList.add(new DealModal("25","Desi Murgha Desi Ghee Special Half Kg","Rs.700"));
        mDealModalList.add(new DealModal("26","Peshawari Chapli Kabab","Rs.120"));
        mDealModalList.add(new DealModal("27","Koila Fish Aluminium Foil Kali Mirch(Multani)","Rs.750 Per Kg"));
        mDealModalList.add(new DealModal("28","Koila Fish Aluminium Foil lal Mirch(Multani)","Rs.700 Per Kg"));
        mDealModalList.add(new DealModal("29","Fry Fish (Multani) lal Mirch","Rs.600 Per Kg"));
        mDealModalList.add(new DealModal("30","Fry Fish(Multani) Kali Mirch","Rs.700 Per Kg"));
        mDealModalList.add(new DealModal("31","Shami Tikki Multani","Rs.25"));
        mDealModalList.add(new DealModal("32","Shami Burger(Multani)","Rs.70"));
        mDealModalList.add(new DealModal("33","Cheese Nan French","Rs.150"));
        mDealModalList.add(new DealModal("34","Garlic Nan French","Rs.50"));
        mDealModalList.add(new DealModal("35","Qeema Nan French","Rs.150"));
        mDealModalList.add(new DealModal("36","Chicken Nan French","Rs.150"));
        mDealModalList.add(new DealModal("37","Roti Sada","Rs.5"));
        mDealModalList.add(new DealModal("38","Fresh Salad Mix","Rs.50"));
        mDealModalList.add(new DealModal("39","Raaita","Rs.40"));
        mDealModalList.add(new DealModal("40","Coke","Rs.25"));
        mDealModalList.add(new DealModal("41","Coffee","Rs.40"));
        mDealModalList.add(new DealModal("42","Tea","Rs.25"));
        mDealModalList.add(new DealModal("43","Mineral Water","Rs.55"));
        mDealModalList.add(new DealModal("44","Mineral Water(small)","Rs.30"));
    }

}
