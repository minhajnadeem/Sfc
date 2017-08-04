package com.mj.minhajlib.spotfoodcenter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mj.minhajlib.spotfoodcenter.R;
import com.mj.minhajlib.spotfoodcenter.modal.PizzaModal;

import java.util.List;

/**
 * Created by Minhaj lib on 7/18/2017.
 */

public class ListViewPizzas extends BaseAdapter {

    private Context mContext;
    private List<PizzaModal> mPizzaModals;

    public ListViewPizzas(Context context, List<PizzaModal> modals) {
        mContext = context;
        mPizzaModals = modals;
    }

    @Override
    public int getCount() {
        return mPizzaModals.size();
    }

    @Override
    public Object getItem(int i) {
        return mPizzaModals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        MyViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.custome_lv_pizza,viewGroup,false);
            viewHolder = new MyViewHolder();
            viewHolder.tvPizzaName = (TextView) convertView.findViewById(R.id.tv_pizza_name);
            viewHolder.tvPizzaDesc = (TextView) convertView.findViewById(R.id.tv_pizza_desc);
            viewHolder.tvPriceS = (TextView) convertView.findViewById(R.id.tv_price_small);
            viewHolder.tvPriceM = (TextView) convertView.findViewById(R.id.tv_price_medium);
            viewHolder.tvPriceL = (TextView) convertView.findViewById(R.id.tv_price_large);

            convertView.setTag(viewHolder);
        }

        viewHolder = (MyViewHolder) convertView.getTag();
        PizzaModal pizzaModal = mPizzaModals.get(position);
        viewHolder.tvPizzaName.setText(pizzaModal.getPizzaName());
        viewHolder.tvPizzaDesc.setText(pizzaModal.getPizzaDesc());
        viewHolder.tvPriceS.setText(pizzaModal.getPizzaPriceS());
        viewHolder.tvPriceM.setText(pizzaModal.getPizzaPriceM());
        viewHolder.tvPriceL.setText(pizzaModal.getPizzaPriceL());

        return convertView;
    }
}

class MyViewHolder {
      TextView tvPizzaName,tvPizzaDesc,tvPriceS,tvPriceM,tvPriceL;
}