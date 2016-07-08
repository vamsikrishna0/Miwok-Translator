package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Vamsi on 7/3/2016.
 */
public class miwokFragmentAdapter extends FragmentPagerAdapter {

    private String tabTitles[];

    private Context mContext;

    public miwokFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        tabTitles = new String[]{mContext.getString(R.string.category_numbers),
                mContext.getString(R.string.category_family),
                mContext.getString(R.string.category_colors),
                mContext.getString(R.string.category_phrases)};
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
