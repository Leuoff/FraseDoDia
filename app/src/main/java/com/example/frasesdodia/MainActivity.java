package com.example.frasesdodia;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Acredite em si mesmo", "Não desista",
                "O sucesso é a soma de pequenos esforços",
                "Seja mais forte que suas desculpas",
                "O impossível apenas demora mais",
                "O fracasso é apenas a oportunidade de recomeçar com mais inteligência",
                "A persistência é o caminho do êxito",
                "A mudança que você quer está na decisão que você toma."

        };
        //Gera numeros: 0 1 2 3... (de acordo, com sua posição no array)
        // = ou seja 7 numeros
        int numero = new Random().nextInt(7);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );

    }

}