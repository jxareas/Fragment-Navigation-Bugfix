package com.sapato.simarropop.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.sapato.simarropop.R;
import com.sapato.simarropop.adapter.ArticuloAdapter;
import com.sapato.simarropop.pojo.Articulo;
import com.sapato.simarropop.pojo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ArticuloFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArticuloAdapter adapter;
    private List<Articulo> articuloList;



    public ArticuloFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_articulo, container, false);





        recyclerView = view.findViewById(R.id.recyclerViewArticulos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        articuloList = new ArrayList<>();

        // Aquí puedes agregar artículos de ejemplo a la lista
        articuloList.add(new Articulo(1, "Articulo 1", 10, "Descripción 1", 10.0f, true, new Usuario()));
        articuloList.add(new Articulo(2, "Articulo 2", 20, "Descripción 2", 20.0f, false, new Usuario()));
        articuloList.add(new Articulo(3, "Articulo 3", 30, "Descripción 3", 30.0f, true, new Usuario()));

        adapter = new ArticuloAdapter(getContext(), articuloList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}