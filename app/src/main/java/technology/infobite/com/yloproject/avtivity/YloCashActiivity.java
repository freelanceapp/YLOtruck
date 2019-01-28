package technology.infobite.com.yloproject.avtivity;

import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.adapter.YlocashAdapter;
import technology.infobite.com.yloproject.fragment.CardFragment;

public class YloCashActiivity extends AppCompatActivity {
    private TabLayout ylocashtablayout;
    private ViewPager yloviewpager;
    private  YlocashAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ylo_cash_actiivity);

        ylocashtablayout = findViewById(R.id.tablayout);
        yloviewpager = findViewById(R.id.view_pager) ;

        ylocashtablayout.addTab(ylocashtablayout.newTab().setText("Card"));
        ylocashtablayout.addTab(ylocashtablayout.newTab().setText("Net Banking"));
        ylocashtablayout.addTab(ylocashtablayout.newTab().setText("Mobile"));
        ylocashtablayout.addTab(ylocashtablayout.newTab().setText("Payment"));
       ylocashtablayout.setTabGravity(TabLayout.GRAVITY_FILL);
        ylocashtablayout.setTabTextColors(getResources().getColor(R.color.black),getResources().getColor(R.color.black));

        YlocashAdapter adapter = new YlocashAdapter(getSupportFragmentManager(), ylocashtablayout.getTabCount());
        yloviewpager.setAdapter(adapter);
        ylocashtablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                yloviewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}

