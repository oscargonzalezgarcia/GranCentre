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
            case R.id.web1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.osgalegos.com/"));break;
            case R.id.call1: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938403039")); break;
            case R.id.ubi1: {Uri gmmIntentUri = Uri.parse("geo:41.6175591,2.2925691");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web2: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d1789988-Reviews-Restaurant_La_Piranya-Granollers_Catalonia.html"));break;
            case R.id.call2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795100")); break;
            case R.id.ubi2: {Uri gmmIntentUri = Uri.parse("geo:41.6061927,2.2870889");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web3: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d7375971-Reviews-Can_Pipa-Granollers_Catalonia.html"));break;
            case R.id.call3: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938794769")); break;
            case R.id.ubi3: {Uri gmmIntentUri = Uri.parse("geo:41.6092123,2.2837606");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }
    @Override
    public void onClickItalia(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.web1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.latagliatella.es/ca/restaurants/barcelona/granollers"));break;
            case R.id.call1: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938604899")); break;
            case R.id.ubi1: {Uri gmmIntentUri = Uri.parse("geo:41.6109161,2.2897739");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web2: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lamezzaluna.es/"));break;
            case R.id.call2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795223")); break;
            case R.id.ubi2: {Uri gmmIntentUri = Uri.parse("geo:41.6030396,2.2880504");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web3: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d5884061-Reviews-Pizzeria_Spaghetteria_IL_CENACOLO-Granollers_Catalonia.html"));break;
            case R.id.call3: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938703781")); break;
            case R.id.ubi3: {Uri gmmIntentUri = Uri.parse("geo:41.6050919,2.2898631");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }

    @Override
    public void onClickVegetaria(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.web1: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://elmirallet.cat/"));break;
            case R.id.call1: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938700547")); break;
            case R.id.ubi1: {Uri gmmIntentUri = Uri.parse("geo:41.607881,2.286715");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web2: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://lacookessabio.com/"));break;
            case R.id.call2: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:931352136")); break;
            case R.id.ubi2: {Uri gmmIntentUri = Uri.parse("geo:41.6104197,2.2859485");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;

            case R.id.web3: intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d8779106-Reviews-L_Anima_De_Granollers-Granollers_Catalonia.html"));break;
            case R.id.call3: intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938704291")); break;
            case R.id.ubi3: {Uri gmmIntentUri = Uri.parse("geo:41.60864,2.2906369");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");}break;
        }
        startActivity(intent);
    }
}