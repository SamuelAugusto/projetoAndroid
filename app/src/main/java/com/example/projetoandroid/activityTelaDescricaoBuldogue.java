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

public class activityTelaDescricaoBuldogue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_buldogue);

        ImageView imgBuldogueFemea = (ImageView) findViewById(R.id.imgBuldogue_femea);
        imgBuldogueFemea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoBuldogue.this, telaBuldogueFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgBuldogueMacho = (ImageView) findViewById(R.id.imgBuldogue_macho);
        imgBuldogueMacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoBuldogue.this, telaBuldogueMacho.class);
                startActivity(intent);
            }
        });

        TextView txtBuldogueFemea = (TextView) findViewById(R.id.txtBuldogue_femea);
        txtBuldogueFemea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoBuldogue.this, telaBuldogueFemea.class);
                startActivity(intent);
            }
        });

        TextView txtBuldogueMacho = (TextView) findViewById(R.id.txtBuldogue_macho);
        txtBuldogueMacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activityTelaDescricaoBuldogue.this, telaBuldogueMacho.class);
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
                Intent pagInicial = new Intent(activityTelaDescricaoBuldogue.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(activityTelaDescricaoBuldogue.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(activityTelaDescricaoBuldogue.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(activityTelaDescricaoBuldogue.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(activityTelaDescricaoBuldogue.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(activityTelaDescricaoBuldogue.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(activityTelaDescricaoBuldogue.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(activityTelaDescricaoBuldogue.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

            case R.id.chowchow:
                Intent chowchow = new Intent(activityTelaDescricaoBuldogue.this, telaDescricaoChowchow.class);
                startActivity(chowchow);
                break;

            case R.id.samoieda:
                Intent samoieda = new Intent(activityTelaDescricaoBuldogue.this, telaDescricaoSamoieda.class);
                startActivity(samoieda);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}