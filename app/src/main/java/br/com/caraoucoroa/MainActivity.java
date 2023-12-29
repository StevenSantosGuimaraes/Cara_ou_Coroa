package br.com.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgJogar = findViewById(R.id.buttonJogar);
        imgJogar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
            int numero = new Random().nextInt(2);
            intent.putExtra("numero", numero);
            startActivity(intent);
        });
    }

}