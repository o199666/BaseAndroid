package cwj.com.baseandroid;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import cwj.com.baseandroid.adapter.ViewPagerAdapter;
import cwj.com.baseandroid.base.BaseActivity;
import cwj.com.baseandroid.fragment.OneFragment;
import cwj.com.baseandroid.fragment.TwoFragment;

public class MainActivity extends BaseActivity {
    private BottomNavigationView navigationView;
    private ViewPager viewPager;
    private MenuItem menuItem;
    @Override
    public void initView() {
        viewPager = findViewById(R.id.viewpager);
        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //避免图片被系统渲染
        navigationView.setItemIconTintList(null);
        //禁止ViewPager滑动
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }
            @Override
            public void onPageSelected(int i) {
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    navigationView.getMenu().getItem(0).setChecked(false);
                }
                menuItem = navigationView.getMenu().getItem(i);
                menuItem.setChecked(true);
            }
            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(OneFragment.newInstance("新闻"));
        adapter.addFragment(TwoFragment.newInstance("图书"));
        adapter.addFragment(OneFragment.newInstance("发现"));
        adapter.addFragment(OneFragment.newInstance("更多"));
        adapter.addFragment(OneFragment.newInstance("更多a"));
        viewPager.setAdapter(adapter);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.item_one:
                    viewPager.setCurrentItem(0);
                    break;
                case R.id.item_two:
                    viewPager.setCurrentItem(1);
                    break;
                case R.id.item_three:
                    viewPager.setCurrentItem(2);
                    break;
                case R.id.item_four:
                    viewPager.setCurrentItem(3);
                    break;
                case R.id.item_fours:
                    viewPager.setCurrentItem(4);
                    break;
            }
            return false;
        }
    };

    @Override
    public int setLyoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initDate() {

    }



}
