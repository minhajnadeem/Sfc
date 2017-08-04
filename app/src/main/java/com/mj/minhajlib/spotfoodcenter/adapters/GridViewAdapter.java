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
 * Created by Minhaj lib on 7/15/2017.
 */

public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<DealModal> mDealModalList;

    public GridViewAdapter(Context context,List<DealModal> dealModalList){
        mDealModalList = dealModalList;
        mContext = context;
    }
    @Override
    public int getCount() {
        return mDealModalList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        MyViewHolder myViewHolder;

        if (convertView == null){

            myViewHolder = new MyViewHolder();

            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custome_deal_layout,viewGroup,false);

            myViewHolder.tvDealNo = (TextView) convertView.findViewById(R.id.tv_deal_no);
            myViewHolder.tvDealName = (TextView) convertView.findViewById(R.id.tv_deal_name);
            myViewHolder.TvDealPrice = (TextView) convertView.findViewById(R.id.tv_deal_price);

            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        DealModal dealModal = mDealModalList.get(position);
        myViewHolder.tvDealNo.setText(dealModal.getDealNo());
        myViewHolder.tvDealName.setText(dealModal.getDealName());
        myViewHolder.TvDealPrice.setText(dealModal.getDealPrice());

        return convertView;
    }

    private class MyViewHolder {
        private TextView tvDealNo,tvDealName,TvDealPrice;
    }
}
