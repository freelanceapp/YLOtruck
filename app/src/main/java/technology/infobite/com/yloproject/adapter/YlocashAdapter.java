package technology.infobite.com.yloproject.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import technology.infobite.com.yloproject.fragment.CardFragment;

public class YlocashAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;

    public YlocashAdapter(FragmentManager fm, int totalTabs) {
        super(fm);
        context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                CardFragment cardFragment = new CardFragment();
                return cardFragment;

            default:
                return null;
        }
    }

    public  int getCount(){
        return totalTabs;
    }
}