package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Activity_Restaurant extends AppCompatActivity implements MariscFragment.OnClickMariscListener, ItaliaFragment.onClickItaliaListener, VegetariaFragment.onClickVegetariaListener{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__restaurant);

        setUpView();
        setUpViewPagerAdapter();
    }

    private void setUpViewPagerAdapter() {
        viewPagerAdapter.addFragment(new MariscFragment(), "Marisc");
        viewPagerAdapter.addFragment(new ItaliaFragment(), "Italia");
        viewPagerAdapter.addFragment(new VegetariaFragment(), "Vegetaria");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpView() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    }


    @Override
    public void onClickMarisc(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.web1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eurorepar.es/"));break;
            case R.id.call1: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795561")); break;
            case R.id.ubi1: {Uri gmmIntentUri = Uri.parse("geo:41.638487, 2.396016");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web2: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.difisa-fcagroup.es/es"));break;
            case R.id.call2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938400388")); break;
            case R.id.ubi2: {Uri gmmIntentUri = Uri.parse("geo:41.599621, 2.274409");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web3: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gasp.com/"));break;
            case R.id.call3: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938490300")); break;
            case R.id.ubi3: {Uri gmmIntentUri = Uri.parse("geo:41.598691, 2.262719");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }
    @Override
    public void onClickItalia(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.web1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eurorepar.es/"));break;
            case R.id.call1: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795561")); break;
            case R.id.ubi1: {Uri gmmIntentUri = Uri.parse("geo:41.638487, 2.396016");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web2: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.difisa-fcagroup.es/es"));break;
            case R.id.call2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938400388")); break;
            case R.id.ubi2: {Uri gmmIntentUri = Uri.parse("geo:41.599621, 2.274409");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web3: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gasp.com/"));break;
            case R.id.call3: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938490300")); break;
            case R.id.ubi3: {Uri gmmIntentUri = Uri.parse("geo:41.598691, 2.262719");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }

    @Override
    public void onClickVegetaria(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.web1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eurorepar.es/"));break;
            case R.id.call1: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795561")); break;
            case R.id.ubi1: {Uri gmmIntentUri = Uri.parse("geo:41.638487, 2.396016");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web2: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.difisa-fcagroup.es/es"));break;
            case R.id.call2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938400388")); break;
            case R.id.ubi2: {Uri gmmIntentUri = Uri.parse("geo:41.599621, 2.274409");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web3: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gasp.com/"));break;
            case R.id.call3: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938490300")); break;
            case R.id.ubi3: {Uri gmmIntentUri = Uri.parse("geo:41.598691, 2.262719");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }
}