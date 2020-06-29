package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class telaDescricaoLabrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_labrador);

        ImageView imgLabrador_femea = (ImageView) findViewById(R.id.imgLabrador_femea);
        imgLabrador_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoLabrador.this, telaLabradorFemea.class);
                startActivity(intent);
            }
        });

        TextView txtLabador_femea = (TextView) findViewById(R.id.txtLabrador_femea);
        txtLabador_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoLabrador.this, telaLabradorFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgLabrador_macho = (ImageView) findViewById(R.id.imgLabrador_macho);
        imgLabrador_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoLabrador.this, telaLabradorMacho.class);
                startActivity(intent);
            }
        });

        TextView txtLabrador_macho = (TextView) findViewById(R.id.txtLabrador_macho);
        txtLabrador_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoLabrador.this, telaLabradorMacho.class);
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
                Intent pagInicial = new Intent(telaDescricaoLabrador.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(telaDescricaoLabrador.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(telaDescricaoLabrador.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(telaDescricaoLabrador.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(telaDescricaoLabrador.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(telaDescricaoLabrador.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(telaDescricaoLabrador.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(telaDescricaoLabrador.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

            case R.id.chowchow:
                Intent chowchow = new Intent(telaDescricaoLabrador.this, telaDescricaoChowchow.class);
                startActivity(chowchow);
                break;

            case R.id.samoieda:
                Intent samoieda = new Intent(telaDescricaoLabrador.this, telaDescricaoSamoieda.class);
                startActivity(samoieda);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}