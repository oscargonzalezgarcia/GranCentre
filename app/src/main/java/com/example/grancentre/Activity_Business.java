package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Activity_Business extends AppCompatActivity implements PerruqueriaFragment.OnClickPerruqueriaListener,TallerFragment.OnClickTallerListener,BotigaFragment.OnClickBotigaListener{

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

        Intent intent = new Intent();

        switch (v.getId()){
            case R.id.iv1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bellesaessencial.com/"));break;
            case R.id.iv2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938708807")); break;
            case R.id.iv3: {Uri gmmIntentUri = Uri.parse("geo:41.609627, 2.287949");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.iv21: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/carmeestilistes.granollers"));break;
            case R.id.iv22: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938706497")); break;
            case R.id.iv23: {Uri gmmIntentUri = Uri.parse("geo:41.6104982, 2.2846364");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.iv31: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://carolbruguera.com/"));break;
            case R.id.iv32: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938794016")); break;
            case R.id.iv33: {Uri gmmIntentUri = Uri.parse("geo:41.6077638, 2.2854357");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }

    @Override
    public void onClickTaller(View v) {

        Intent intent = new Intent();

        switch (v.getId()){
            case R.id.iv1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eurorepar.es/"));break;
            case R.id.iv2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795561")); break;
            case R.id.iv3: {Uri gmmIntentUri = Uri.parse("geo:41.638487, 2.396016");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.iv21: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.difisa-fcagroup.es/es"));break;
            case R.id.iv22: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938400388")); break;
            case R.id.iv23: {Uri gmmIntentUri = Uri.parse("geo:41.599621, 2.274409");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.iv31: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gasp.com/"));break;
            case R.id.iv32: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938490300")); break;
            case R.id.iv33: {Uri gmmIntentUri = Uri.parse("geo:41.598691, 2.262719");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }

    @Override
    public void onClickBotiga(View v) {

        Intent intent = new Intent();

        switch (v.getId()){
            case R.id.iv1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://agudostores.com/es/"));break;
            case R.id.iv2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938708977")); break;
            case R.id.iv3: {Uri gmmIntentUri = Uri.parse("geo:41.608675, 2.286342");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.iv21: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.barbanygranollers.com/"));break;
            case R.id.iv22: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938792816")); break;
            case R.id.iv23: {Uri gmmIntentUri = Uri.parse("geo:41.606698, 2.288589");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.iv31: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.insitushop.com/"));break;
            case R.id.iv32: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938708672")); break;
            case R.id.iv33: {Uri gmmIntentUri = Uri.parse("geo:41.605884, 2.289231");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }
}