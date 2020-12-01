package com.example.grancentre;
        import androidx.viewpager.widget.ViewPager;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.FragmentManager;


        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;

        import com.google.android.material.appbar.AppBarLayout;
        import com.google.android.material.tabs.TabLayout;

public class Activity_Restaurant extends AppCompatActivity{

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

/*
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
    }*/
}