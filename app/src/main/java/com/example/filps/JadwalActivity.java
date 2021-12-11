package com.example.filps;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.filps.jadwal.FragmentJumat;
import com.example.filps.jadwal.FragmentKamis;
import com.example.filps.jadwal.FragmentRabu;
import com.example.filps.jadwal.FragmentSelasa;
import com.example.filps.jadwal.FragmentSenin;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class JadwalActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jadwal);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.view_pager);


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
        JadwalActivity.MyViewPagerAdapter adapter = new JadwalActivity.MyViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentSenin(), "Sen");
        adapter.AddFragment(new FragmentSelasa(), "Sel");
        adapter.AddFragment(new FragmentRabu(), "Rab");
        adapter.AddFragment(new FragmentKamis(), "Kam");
        adapter.AddFragment(new FragmentJumat(), "Jum");
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
            return 5;
        }
    }
}
