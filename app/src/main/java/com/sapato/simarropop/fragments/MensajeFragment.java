package com.sapato.simarropop.fragments;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sapato.simarropop.R;
import com.sapato.simarropop.adapter.ArticuloAdapter;
import com.sapato.simarropop.adapter.MensajeAdapter;
import com.sapato.simarropop.pojo.Articulo;
import com.sapato.simarropop.pojo.Mensaje;
import com.sapato.simarropop.pojo.MensajeData;
import com.sapato.simarropop.pojo.Usuario;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MensajeFragment extends Fragment {
    private RecyclerView recyclerView;
    private MensajeAdapter adapter;
    private List<Mensaje> mensajeList;

    public MensajeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mensaje, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewMensajes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mensajeList = MensajeData.MENSAJES;
        //mensajeList = new ArrayList<>();

        adapter = new MensajeAdapter(getContext(), mensajeList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}