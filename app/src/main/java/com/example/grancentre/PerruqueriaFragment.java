package com.example.grancentre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerruqueriaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerruqueriaFragment extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PerruqueriaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerruqueriaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerruqueriaFragment newInstance(String param1, String param2) {
        PerruqueriaFragment fragment = new PerruqueriaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        ImageView imageView1 = (ImageView) getView().findViewById(R.id.iv1);
        imageView1.setOnClickListener(this);
        ImageView imageView2 = (ImageView) getView().findViewById(R.id.iv2);
        imageView2.setOnClickListener(this);
        ImageView imageView3 = (ImageView) getView().findViewById(R.id.iv3);
        imageView3.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perruqueria, container, false);
    }

    @Override
    public void onClick(View v) {
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