package com.mj.minhajlib.spotfoodcenter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.mj.minhajlib.spotfoodcenter.R;
import com.mj.minhajlib.spotfoodcenter.modal.DealModal;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Minhaj lib on 7/17/2017.
 */

public class ExpandableLv extends BaseExpandableListAdapter {

    private Context mContext;
    private List<String> mStringListHeader;
    private HashMap<String,List<DealModal>> mHashMapListItems;

    public ExpandableLv(Context context,List<String> mStringList,HashMap<String,List<DealModal>> listHashMap){

        mContext = context;
        mStringListHeader = mStringList;
        mHashMapListItems = listHashMap;
    }
    @Override
    public int getGroupCount() {
        return mStringListHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return mHashMapListItems.get(mStringListHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return mStringListHeader.get(i);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mHashMapListItems.get(mStringListHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        TextView tvDealName;

        if (convertView == null){
            convertView = inflater.inflate(R.layout.custome_lv_header,viewGroup,false);
        }
        tvDealName = (TextView) convertView.findViewById(R.id.tv_lv_header);
        tvDealName.setText(mStringListHeader.get(i));

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        TextView tvDealName = null,tvDealPrice;

        if (convertView == null){
            convertView = inflater.inflate(R.layout.custome_lv_item,viewGroup,false);
        }
        tvDealName = (TextView) convertView.findViewById(R.id.tv_deal_name);
        tvDealPrice = (TextView) convertView.findViewById(R.id.tv_deal_price);
        DealModal dealModal = mHashMapListItems.get(mStringListHeader.get(groupPosition)).get(childPosition);
        tvDealName.setText(dealModal.getDealName());
        tvDealPrice.setText(dealModal.getDealPrice());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}