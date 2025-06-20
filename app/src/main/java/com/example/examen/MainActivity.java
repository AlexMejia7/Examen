package com.example.examen;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout contenedor = findViewById(R.id.contenedorContactos);

        String[] contactos = {
                "Alex Nain Mejía Castro - 99887766\nalex@gmail.com",
                "Ana López - 98007234\nana@correo.com",
                "Carlos Méndez - 12345676\ncarlos@dominio.com",
                "Diana Rivera - 87654321\ndiana@correo.com",
                "Erick Castillo - 44556677\nerick@ejemplo.com",
                "Francis Gómez - 77889900\nfrancis@correo.com",
                "Leticia Castro - 97125179\nfrancis@correo.com",
                "Rois Rodriguez - 32819000\nfrancis@correo.com",
        };

        // Agregar los contactos de todos
        for (int i = 0; i < contactos.length; i++) {
            TextView contacto = new TextView(this);
            contacto.setText(contactos[i]);
            contacto.setPadding(20, 30, 20, 30);
            contacto.setTextSize(16);
            contacto.setTextColor(Color.BLACK);
            contacto.setBackgroundColor(i % 2 == 0 ?
                    Color.parseColor("#FFFFFF") :  // Blanco
                    Color.parseColor("#E3F2FD"));  // Azul

            contenedor.addView(contacto);
        }
    }
}