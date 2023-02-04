package com.sapato.simarropop.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sapato.simarropop.R;
import com.sapato.simarropop.adapter.MensajeAdapter;
import com.sapato.simarropop.pojo.Mensaje;
import com.sapato.simarropop.pojo.MensajeData;

import java.util.List;

public class ProfileFragment extends Fragment {

    private FloatingActionButton fabMain,fabSub1,fabSub2;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        fabMain = (FloatingActionButton) view.findViewById(R.id.fab_main);
        fabSub1 = view.findViewById(R.id.fab_sub_1);
        fabSub2 = view.findViewById(R.id.fab_sub_2);

        fabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (fabSub1.getVisibility() == View.GONE) {
                    fabSub1.show();
                    fabSub2.show();
                } else {
                    fabSub1.hide();
                    fabSub2.hide();
                }
            }
        });



        return view;
    }
}