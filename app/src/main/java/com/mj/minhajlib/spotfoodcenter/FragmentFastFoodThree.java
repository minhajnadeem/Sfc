package com.mj.minhajlib.spotfoodcenter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mj.minhajlib.spotfoodcenter.adapters.ListViewPizzas;
import com.mj.minhajlib.spotfoodcenter.modal.PizzaModal;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFastFoodThree extends Fragment {

    List<PizzaModal> mPizzaModals;

    public FragmentFastFoodThree() {
        // Required empty public constructor
        mPizzaModals = new ArrayList<>();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food_three, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_view);
        setUpMenu();
        ListViewPizzas adapter = new ListViewPizzas(getContext(),mPizzaModals);
        listView.setAdapter(adapter);
        return view;
    }

    private void setUpMenu() {

        //mPizzaModals.add(new PizzaModal("","","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("1. SFC Special Pizza","A specially designed recipe topped with chicken onion, green papper mushrooms jalapin, tomato olive mozealla chese","270/-","550/-","700/-"));
        mPizzaModals.add(new PizzaModal("2. Chicken Tikka Pizza","A specially topped with chicken tikka onion a lots of chese","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("3. Chicken Fajita Pizza","A specially topped with chicken fajita, onion, bell pepper with special herbs a lots of cheese","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("4. Chicken supreme pizza","Enjoy a delightful blind of chicken tikka, fajita, onion green pepper, mushrooms, tomoto, olives","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("5. Bar B.Q Pizza","Our traditional developed a Bar B.Q chicken, onion, green, mushrooms, tomato, olives","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("6. SFC 2 in 1 Pizza","All two falvors on your choise","280/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("7. Fish Pizza","A specially marrinated fish, onion, topped mozzarella cheese","300/-","550/-","700/-"));
        mPizzaModals.add(new PizzaModal("8. Chicken Mince With Green Chilli Pizza","Our special chicken mince with special sauce, jalapeno onion, a lots of cheese","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("9. Achari Pizza","Achari chicken, onion, green pepper, achari sauce and cheese","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("10. SFC 4 Season Pizza","A hot and tangy pizza smeared with hot mayo sauce loaded with spicy chicken, green pepper, jalapeno, tomato and cheese","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("11. Cheese Live Pizza","Lots of mozarella cheese and special herbs","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("12. Vegi Pizza","A heavy bunches of vegetables who prefered to eat tomatous onions, mushrooms, black olives and green pepper ","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("13. SFC Classic Pizza","A delicous comibnation of onions, cheese, tomatoes","260/-","530/-","680/-"));
        mPizzaModals.add(new PizzaModal("14. SFC Stuff Crust Pizza","Most favourite recipe with extra cheese speciality of Sfc","375/-","700/-","990/-"));
    }

}