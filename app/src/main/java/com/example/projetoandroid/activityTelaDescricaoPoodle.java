package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activityTelaDescricaoPoodle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_poodle);

        ImageView imPoodleFemea = (ImageView) findViewById(R.id.imgPoodle_femea);
        imPoodleFemea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoPoodle.this, telaPoodleFemea.class);
                startActivity(intent);
            }
        });

        ImageView imPoodleMacho = (ImageView) findViewById(R.id.imgPoodle_macho);
        imPoodleMacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoPoodle.this, telaPoodleMacho.class);
                startActivity(intent);
            }
        });

        TextView txtLabador_femea = (TextView) findViewById(R.id.txtPoodle_femea);
        txtLabador_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoPoodle.this, telaPoodleFemea.class);
                startActivity(intent);
            }
        });

        TextView txtLabador_macho = (TextView) findViewById(R.id.txtPoodle_macho);
        txtLabador_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoPoodle.this, telaPoodleMacho.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuaction, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.paginaInicial:
                Intent pagInicial = new Intent(activityTelaDescricaoPoodle.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(activityTelaDescricaoPoodle.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(activityTelaDescricaoPoodle.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(activityTelaDescricaoPoodle.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(activityTelaDescricaoPoodle.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(activityTelaDescricaoPoodle.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(activityTelaDescricaoPoodle.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(activityTelaDescricaoPoodle.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

            case R.id.chowchow:
                Intent chowchow = new Intent(activityTelaDescricaoPoodle.this, telaDescricaoChowchow.class);
                startActivity(chowchow);
                break;

            case R.id.samoieda:
                Intent samoieda = new Intent(activityTelaDescricaoPoodle.this, telaDescricaoSamoieda.class);
                startActivity(samoieda);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}