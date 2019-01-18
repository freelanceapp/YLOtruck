package technology.infobite.com.yloproject.avtivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.Arrays;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.fragment.AboutUsFragment;
import technology.infobite.com.yloproject.fragment.BookingFragment;
import technology.infobite.com.yloproject.fragment.CouponFragment;
import technology.infobite.com.yloproject.fragment.HomeFragment;
import technology.infobite.com.yloproject.fragment.MyTrips;
import technology.infobite.com.yloproject.fragment.ReferandEarnFragment;
import technology.infobite.com.yloproject.fragment.SettingFragment;
import technology.infobite.com.yloproject.fragment.SupportFragment;
import technology.infobite.com.yloproject.fragment.YloCashFragment;
import technology.infobite.com.yloproject.fragment.YloRatesFragment;
import technology.infobite.com.yloproject.menu.DrawerAdapter;
import technology.infobite.com.yloproject.menu.DrawerItem;
import technology.infobite.com.yloproject.menu.SimpleItem;
import technology.infobite.com.yloproject.utilities.ConstantData;
import technology.infobite.com.yloproject.utilities.Utility;

public class SlidingNavigation extends AppCompatActivity implements DrawerAdapter.OnItemSelectedListener,
        HomeFragment.OnFragmentInteractionListener,
        MyTrips.OnFragmentInteractionListener,YloCashFragment.OnFragmentInteractionListener
        ,YloRatesFragment.OnFragmentInteractionListener,SettingFragment.OnFragmentInteractionListener ,AboutUsFragment.OnFragmentInteractionListener
        ,SupportFragment.OnFragmentInteractionListener,ReferandEarnFragment.OnFragmentInteractionListener{

    private SlidingRootNav slidingRootNav;
    private static final int NAVall = 0;
    private static final int NAVbooktrip = 1;
    private static final int NAVmytirp = 2;
    private static final int NAVylocash = 3;
    private static final int NAVylorates = 4;
    private static final int NAVreferandearn = 5;
    private static final int NAVcoupon = 6;
    private static final int NAVaboutus = 7;
    private static final int NAVsupport = 8;
    private static final int NAVsetting = 9;
    private static final int EXIT = 10;

    private HomeFragment.OnFragmentInteractionListener listener1;
    private MyTrips.OnFragmentInteractionListener mListener;
    private YloRatesFragment.OnFragmentInteractionListener mListener0;
    private YloCashFragment.OnFragmentInteractionListener mListener1;
    private SettingFragment.OnFragmentInteractionListener mListener2;
    private AboutUsFragment.OnFragmentInteractionListener mListener3;
    private AboutUsFragment.OnFragmentInteractionListener mListener4;
    private SupportFragment.OnFragmentInteractionListener mListener5;

    private Context context;

    /* ={"Book a Trip","My Trips","YLO Cash","YLO Rates",
            "Refer and Earn","Coupon","About Us","Support","Setting"};*/

    private String[] screenTitles;
    private Drawable[] screenIcons;

    /*= {R.drawable.trip_travel,R.drawable.my_trip
            ,R.drawable.ylo_cash,R.drawable.ylo_rates,R.drawable.refer_and_earn,
            R.drawable.coupon,R.drawable.about_us,R.drawable.support,R.drawable.setting};*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_navigation);

        initXmal(savedInstanceState);
    }

    private void initXmal(Bundle savedInstanceState) {
        context = this;

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        screenIcons = loadScreenIcons();
        screenTitles = loadScreenTitles();

        slidingRootNav = (SlidingRootNav) new SlidingRootNavBuilder(this)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(true)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.menu_left_layout)
                .inject();

        DrawerAdapter drawadapter = new DrawerAdapter(Arrays.asList(
                createItemFor(NAVall).setChecked(true),
                createItemFor(NAVbooktrip),
                createItemFor(NAVmytirp),
                createItemFor(NAVylocash),
                createItemFor(NAVylorates),
                createItemFor(NAVreferandearn),
                createItemFor(NAVcoupon),
                createItemFor(NAVaboutus),
                createItemFor(NAVsupport),
                createItemFor(NAVsetting),
                createItemFor(EXIT)));
        drawadapter.setListener(this);

        RecyclerView list = findViewById(R.id.menu_list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(drawadapter);
        drawadapter.setSelected(NAVbooktrip);
    }

    private DrawerItem createItemFor(int position) {
        return new SimpleItem(screenIcons[position], screenTitles[position])
                .withIconTint(color(R.color.white))
                .withTextTint(color(R.color.white))
                .withSelectedIconTint(color(R.color.textColorSecondary))
                .withSelectedTextTint(color(R.color.textColorSecondary));
    }

    @ColorInt
    private int color(@ColorRes int res) {
        return ContextCompat.getColor(this, res);
    }

    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.icontitles);
    }

    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.icons);
        Drawable[] icons = new Drawable[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if (id != 0) {
                icons[i] = ContextCompat.getDrawable(this, id);
            }
        }
        ta.recycle();
        return icons;
    }
    @Override
    public void onBackPressed() {
        if (slidingRootNav.isMenuOpened()) {
            slidingRootNav.closeMenu();
        } else {
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragment_byID = fm.findFragmentById(R.id.home_content);
            String tag = fragment_byID.getTag();
            if (!tag.equals(ConstantData.HOME)) {
                HomeFragment homeFragment = new HomeFragment();
                Utility.setFragment(homeFragment, context, ConstantData.HOME);
            } else {
                finish();
            }
        }
    }

    @Override
    public void onItemSelected(int position) {
        if (position == NAVall) {
            HomeFragment fragment = new HomeFragment();
            Utility.setFragment(fragment, context, ConstantData.BOOKTRIP);
            slidingRootNav.closeMenu();
        } else if (position == NAVbooktrip) {
            BookingFragment fragment = new BookingFragment();
            Utility.setFragment(fragment, context, ConstantData.BOOKTRIP);
            slidingRootNav.closeMenu();

        } else if (position == NAVmytirp) {
            MyTrips fragment = new MyTrips();
            Utility.setFragment(fragment, context, ConstantData.YLOMYTRIP);
            slidingRootNav.closeMenu();
        } else if (position == NAVylocash) {
                YloCashFragment fragment = new YloCashFragment();
                Utility.setFragment(fragment, context, ConstantData.YLOCASH);
                slidingRootNav.closeMenu();
            } else if (position == NAVylorates) {
            YloRatesFragment fragment = new YloRatesFragment();
            Utility.setFragment(fragment, context, ConstantData.YLORATES);
            slidingRootNav.closeMenu();

        } else if (position == NAVreferandearn) {
           ReferandEarnFragment fragment = new ReferandEarnFragment();
            Utility.setFragment(fragment, context, ConstantData.REFERANDEARN);
            slidingRootNav.closeMenu();

        } else if (position == NAVcoupon) {
            CouponFragment fragment = new CouponFragment();
            Utility.setFragment(fragment,context,ConstantData.COUPON);
            slidingRootNav.closeMenu();
        }else if (position == NAVaboutus) {
            AboutUsFragment fragment = new AboutUsFragment();
            Utility.setFragment(fragment,context,ConstantData.ABOUTUS);
            slidingRootNav.closeMenu();
        }else if (position == NAVsupport) {
            SupportFragment fragment = new SupportFragment();
            Utility.setFragment(fragment,context,ConstantData.SUPPORT);
            slidingRootNav.closeMenu();
        }else if (position == NAVsetting) {
            SettingFragment fragment = new SettingFragment();
            Utility.setFragment(fragment,context,ConstantData.SETTING);
            slidingRootNav.closeMenu();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
