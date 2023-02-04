package com.sapato.simarropop.pojo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MensajeData {
    public static ArrayList<Mensaje> MENSAJES = new ArrayList<>();

    static{
        Usuario u1 = new Usuario("Paco");
        Usuario u2 = new Usuario("Carles");
        MENSAJES.add(new Mensaje("holauqetla",new Timestamp(20), u1, u2));
        MENSAJES.add(new Mensaje("caca",new Timestamp(220), u2, u1));

    }
}
