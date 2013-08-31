package xixi.weddingspot.bestwish;

import xixi.weddingspot.R;
import xixi.weddingspot.WLog;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainFragment extends Fragment implements FirstFragment.Callbacks {
	/**
	 * Whether or not the activity is in two-pane mode, i.e. running on a tablet
	 * device.
	 */
	private boolean mTwoPane;

	private ViewPager mPager;
	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public MainFragment() {}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_wish, container, false);
		if (rootView.findViewById(R.id.wish_checkin_list) != null) {
			mTwoPane = true;
		} else {
			mPager = (ViewPager) rootView.findViewById(R.id.wish_pager);
			mPager.setAdapter(new BestWishPagerAdapter(getFragmentManager()));
		}
		return rootView;
	}
	
	public static class BestWishPagerAdapter extends FragmentPagerAdapter  {
		static final int NUM_ITEMS = 2;
		
		public BestWishPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			if (position == 2)
				return new SecondFragment();
			else
				return new FirstFragment();
		}

		@Override
		public int getCount() {
			return 2;
		}
	}
		
	/**
	 * Callback method from {@link SpotListFragment.Callbacks} indicating that
	 * the item with the given ID was selected.
	 */
	@Override
	public void onItemSelected(String id) {
		if (mTwoPane) {
//			// In two-pane mode, show the detail view in this activity by
//			// adding or replacing the detail fragment using a
//			// fragment transaction.
//			Bundle arguments = new Bundle();
//			arguments.putString(SpotDetailFragment.ARG_ITEM_ID, id);
//			SpotDetailFragment fragment = new SpotDetailFragment();
//			fragment.setArguments(arguments);
//			getFragmentManager().beginTransaction().replace(R.id.spot_detail_container, fragment).commit();

		} else {
//			// In single-pane mode, simply start the detail activity
//			// for the selected item ID.
//			Intent detailIntent = new Intent(this, SpotDetailActivity.class);
//			detailIntent.putExtra(SpotDetailFragment.ARG_ITEM_ID, id);
//			startActivity(detailIntent);
		}
	}
}

