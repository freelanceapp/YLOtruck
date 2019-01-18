package technology.infobite.com.yloproject.avtivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.fragment.AboutUsFragment;
import technology.infobite.com.yloproject.fragment.BookingFragment;
import technology.infobite.com.yloproject.fragment.CouponFragment;
import technology.infobite.com.yloproject.fragment.MyTrips;
import technology.infobite.com.yloproject.fragment.ReferandEarnFragment;
import technology.infobite.com.yloproject.fragment.SettingFragment;
import technology.infobite.com.yloproject.fragment.SupportFragment;
import technology.infobite.com.yloproject.fragment.YloCashFragment;
import technology.infobite.com.yloproject.fragment.YloRatesFragment;

public class NavigationMainActivity extends AppCompatActivity
      /*  implements NavigationView.OnNavigationItemSelectedListener*/ {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

  /*      DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

    *//*    Fragment fragment = null;

        int id = item.getItemId();
        if (id == R.id.book_a_trip) {
            BookingFragment bookFragment = new BookingFragment();
        } else if (id == R.id.my_trip) {
            MyTrips myTrips = new MyTrips();

        } else if (id == R.id.ylo_cash) {
            YloCashFragment yloCashFragment = new YloCashFragment();
        } else if (id == R.id.ylo_rates) {
            YloRatesFragment yloRatesFragment = new YloRatesFragment();
        } else if (id == R.id.refer_and_earn) {
            ReferandEarnFragment referandEarnFragment = new ReferandEarnFragment();

        } else if (id == R.id.coupon) {
            CouponFragment couponFragment = new CouponFragment();

        }else if (id == R.id.about_us){
            AboutUsFragment aboutUsFragment = new AboutUsFragment();

        }else if (id == R.id.support){
            SupportFragment supportFragment= new SupportFragment();

        }else if (id == R.id.setting){
            SettingFragment settingFragment = new SettingFragment();

        }else{
            BookFragment bookFragment = new BookFragment();
        }
        if (fragment != null) {
            *//**//*FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();*//**//*
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;*/
    }
}
