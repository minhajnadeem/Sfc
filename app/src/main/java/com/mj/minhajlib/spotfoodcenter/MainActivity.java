package com.mj.minhajlib.spotfoodcenter;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] phoneNumbers;

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    //private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,getString(R.string.appId));

        phoneNumbers = getResources().getStringArray(R.array.phone_numbers);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        //mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        setSupportActionBar(mToolbar);

        setupViewPager();
        mTabLayout.setupWithViewPager(mViewPager);

        /*mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCallDialog();
            }
        });*/
    }//end onCreate

    private void showCallDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Call Any Number");
        builder.setIcon(R.drawable.ic_phone_black_24dp);
        builder.setItems(R.array.phone_numbers, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                makeACall(phoneNumbers[i]);
            }
        });
        builder.create().show();
    }

    private void makeACall(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
        startActivity(intent);
    }

    private void setupViewPager() {

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new FragmentFastFood(),getString(R.string.fast_food));
        viewPagerAdapter.addFragments(new FragmentAfghanFood(),getString(R.string.afghan_food));
        mViewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_call){
            showCallDialog();
        }
        return true;
    }
}


class ViewPagerAdapter extends FragmentPagerAdapter{

    private List<Fragment> mFragmentList;
    private List<String> mStringListTitle;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

        mFragmentList = new ArrayList<>();
        mStringListTitle = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mStringListTitle.get(position);
    }

    public void addFragments(Fragment fragment, String title){

        mFragmentList.add(fragment);
        mStringListTitle.add(title);
    }
}
