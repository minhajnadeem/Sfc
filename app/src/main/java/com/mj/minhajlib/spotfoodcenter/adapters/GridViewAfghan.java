package com.mj.minhajlib.spotfoodcenter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mj.minhajlib.spotfoodcenter.R;
import com.mj.minhajlib.spotfoodcenter.modal.DealModal;

import java.util.List;

/**
 * Created by Minhaj lib on 7/18/2017.
 */

public class GridViewAfghan extends BaseAdapter {

    private Context mContext;
    private List<DealModal> mDealModalList;

    public GridViewAfghan(Context context, List<DealModal> list) {
        mContext = context;
        mDealModalList = list;
    }

    @Override
    public int getCount() {
        return mDealModalList.size();
    }

    @Override
    public Object getItem(int i) {
        return mDealModalList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        MyViewHolder myViewHolder;

        if (convertView == null) {

            myViewHolder = new MyViewHolder();

            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_afghan_layout, viewGroup, false);

            myViewHolder.tvDealNo = (TextView) convertView.findViewById(R.id.tv_deal_no);
            myViewHolder.tvDealName = (TextView) convertView.findViewById(R.id.tv_deal_name);
            myViewHolder.TvDealPrice = (TextView) convertView.findViewById(R.id.tv_deal_price);

            convertView.setTag(myViewHolder);
        }
        myViewHolder = (MyViewHolder) convertView.getTag();

        DealModal dealModal = mDealModalList.get(position);
        myViewHolder.tvDealNo.setText(dealModal.getDealNo());
        myViewHolder.tvDealName.setText(dealModal.getDealName());
        myViewHolder.tvDealName.setSelected(true);
        myViewHolder.TvDealPrice.setText(dealModal.getDealPrice());

        return convertView;
    }

    private class MyViewHolder {
        private TextView tvDealNo, tvDealName, TvDealPrice;
    }
}