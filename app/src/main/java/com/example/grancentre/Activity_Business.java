package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Activity_Business extends AppCompatActivity implements PerruqueriaFragment.OnClickPerruqueriaListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__business);

        setUpView();
        setUpViewPagerAdapter();
    }

    private void setUpViewPagerAdapter() {
        viewPagerAdapter.addFragment(new PerruqueriaFragment(), "Perruqueries");
        viewPagerAdapter.addFragment(new TallerFragment(), "Tallers");
        viewPagerAdapter.addFragment(new BotigaFragment(), "Botigues");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpView() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    }

    @Override
    public void onClickPerruqueria(View v) {
        if(v.getId()==R.id.iv1)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bellesaessencial.com/"));
            startActivity(intent);
        }
        else if(v.getId()==R.id.iv2){
            //truquem per telefon
            Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938708807"));
            startActivity(intent2);}
        else
        {
            Uri gmmIntentUri = Uri.parse("geo:41.609627, 2.287949");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }
}