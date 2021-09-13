package com.example.android_nivelbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Auto  auto= new Auto( "Nissan",  "Chevy", "rojo", "2ERF4534ED",
                              25000.00,  10.0);
        TextView Textmarca  = (TextView)  findViewById(R.id.texto1);
        Textmarca.setText(auto.getMarca());

        TextView Textmodelo  = (TextView)  findViewById(R.id.texto2);
        Textmodelo.setText(auto.getModelo());

        TextView Textcolor  = (TextView)  findViewById(R.id.texto3);
        Textcolor.setText(auto.getColor());

        TextView Textmatricula  = (TextView)  findViewById(R.id.texto4);
        Textmatricula.setText(auto.getMatricula());

        TextView Textprecio  = (TextView)  findViewById(R.id.texto5);
        Textprecio.setText(String.valueOf(auto.getPrecio()));

        TextView Textdescuento  = (TextView)  findViewById(R.id.texto6);
        Textdescuento.setText(String.valueOf(auto.getDescuento()));

        // Mandar llamar  Metodo mostrar mensaje
        TextView Textmensaje  = (TextView)  findViewById(R.id.texto7);
        Textmensaje.setText(auto.mensaje());

    }


}
