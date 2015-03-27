package com.example.tabsswipe.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class TabsPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
			case 0:
				// Top Rated fragment activity
				return new ActiefFragment();
			case 1:
				// Games fragment activity
				return new AfgeslotenFragment();
			case 2:
				// Movies fragment activity
				return new ToekomstigFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;


	}
}