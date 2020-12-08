package com.example.grancentre;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TallerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TallerFragment extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    OnClickTallerListener listener ;

    public TallerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof PerruqueriaFragment.OnClickPerruqueriaListener){
            listener= (TallerFragment.OnClickTallerListener) context;
        } else {
            throw new RuntimeException(context.toString() + "ha d'implementar OnClickTallerListener");
        }

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TallerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TallerFragment newInstance(String param1, String param2) {
        TallerFragment fragment = new TallerFragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_taller, container, false);

        ImageView imageView1 = (ImageView) v.findViewById(R.id.iv1);
        imageView1.setOnClickListener(this);
        ImageView imageView2 = (ImageView) v.findViewById(R.id.iv2);
        imageView2.setOnClickListener(this);
        ImageView imageView3 = (ImageView) v.findViewById(R.id.iv3);
        imageView3.setOnClickListener(this);

        ImageView imageView21 = (ImageView) v.findViewById(R.id.iv21);
        imageView21.setOnClickListener(this);
        ImageView imageView22 = (ImageView) v.findViewById(R.id.iv22);
        imageView22.setOnClickListener(this);
        ImageView imageView23 = (ImageView) v.findViewById(R.id.iv23);
        imageView23.setOnClickListener(this);

        ImageView imageView31 = (ImageView) v.findViewById(R.id.iv31);
        imageView31.setOnClickListener(this);
        ImageView imageView32 = (ImageView) v.findViewById(R.id.iv32);
        imageView32.setOnClickListener(this);
        ImageView imageView33 = (ImageView) v.findViewById(R.id.iv33);
        imageView33.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        listener.onClickTaller(v);
    }

    public interface OnClickTallerListener {
        public void onClickTaller (View v);
    }
}