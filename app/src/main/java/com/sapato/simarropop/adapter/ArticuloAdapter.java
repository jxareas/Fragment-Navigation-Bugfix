package com.sapato.simarropop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sapato.simarropop.R;
import com.sapato.simarropop.pojo.Articulo;

import java.util.List;

public class ArticuloAdapter extends RecyclerView.Adapter<ArticuloAdapter.ArticuloViewHolder> {
    private Context context;
    private List<Articulo> articuloList;

    public ArticuloAdapter(Context context, List<Articulo> articuloList) {
        this.context = context;
        this.articuloList = articuloList;
    }

    @NonNull
    @Override
    public ArticuloViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.articulo_item, parent, false);
        return new ArticuloViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticuloViewHolder holder, int position) {
        Articulo articulo = articuloList.get(position);

        holder.tvTitulo.setText(articulo.getTitulo());
        holder.tvLikes.setText(String.valueOf(articulo.getLikes()));
        holder.tvDescripcion.setText(articulo.getDescripcion());
        holder.tvPrecio.setText(String.valueOf(articulo.getPrecio()));
        holder.tvEstado.setText(articulo.isEstado() ? "Disponible" : "No disponible");
    }

    @Override
    public int getItemCount() {
        return articuloList.size();
    }

    class ArticuloViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitulo, tvLikes, tvDescripcion, tvPrecio, tvEstado;

        public ArticuloViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvLikes = itemView.findViewById(R.id.tvLikes);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            tvPrecio = itemView.findViewById(R.id.tvPrecio);
            tvEstado = itemView.findViewById(R.id.tvEstado);
        }
    }
}