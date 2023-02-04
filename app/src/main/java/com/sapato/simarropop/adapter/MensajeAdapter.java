package com.sapato.simarropop.adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.sapato.simarropop.R;
import com.sapato.simarropop.pojo.Articulo;
import com.sapato.simarropop.pojo.Mensaje;
import com.sapato.simarropop.pojo.MensajeData;
import com.sapato.simarropop.pojo.Usuario;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MensajeAdapter extends RecyclerView.Adapter<MensajeAdapter.MensajeViewHolder> {
    private Context context;
    private Usuario usuario;

    //private List<Mensaje> mensajesEnviados = usuario.getMensajesEmisor();
    //private List<Mensaje> mensajesRecibidos = usuario.getMensajesReceptor();

    private List<Mensaje> mensajesTotal;




    public MensajeAdapter(Context context, List<Mensaje> mensajesTotal) {
        this.context = context;
        this.mensajesTotal = mensajesTotal;
    }

    @NonNull
    @Override
    public MensajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mensaje_item, parent, false);
        return new MensajeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MensajeViewHolder holder, int position) {
        Mensaje mensaje = mensajesTotal.get(position);

        holder.tvContenido.setText(mensaje.getContenido());
        //holder.tvUsuarioEmisor.setText(mensaje.getUsuarioEmisor().getNombre());
        //holder.tvUsuarioReceptor.setText(String.valueOf(mensaje.getUsuarioReceptor().getNombre()));
        holder.tvHora.setText(String.valueOf(mensaje.getHora()));
    }

    @Override
    public int getItemCount() {
        return mensajesTotal.size();
    }



    class MensajeViewHolder extends RecyclerView.ViewHolder {
        TextView tvContenido, tvHora, tvUsuarioEmisor, tvUsuarioReceptor;
        ImageView ivMensaje;

        public MensajeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHora = itemView.findViewById(R.id.tvMensajeHora);
            ivMensaje = itemView.findViewById(R.id.ivMensaje);
            tvContenido = itemView.findViewById(R.id.tvMensajeDescripcion);
            tvUsuarioReceptor = itemView.findViewById(R.id.tvMensajeNombreRemit);
        }
    }
}