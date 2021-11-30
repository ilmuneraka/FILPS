package com.example.filps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class KRSActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager viewPager;
//    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krs);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.view_pager);
//        toolbar = findViewById(R.id.tol);
//
//        setSupportActionBar(toolbar);
//        toolbar.setTitle(R.string.app_name);
//        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_back));


        tab.setupWithViewPager(viewPager);
        SetupViewPager();
        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void SetupViewPager() {
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentTerpilih(), "Mata Kuliah");
        adapter.AddFragment(new FragmentTersedia(), "Telah Ditambahkan");
        viewPager.setAdapter(adapter);
    }

    private class MyViewPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> fr = new ArrayList<>();
        private List<String> title = new ArrayList<>();
        public MyViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        public void AddFragment(Fragment fragment, String jd) {
            fr.add(fragment);
            this.title.add(jd);
        }

        @Override
        public Fragment getItem(int position){
            return fr.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position){
            return title.get(position);
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}