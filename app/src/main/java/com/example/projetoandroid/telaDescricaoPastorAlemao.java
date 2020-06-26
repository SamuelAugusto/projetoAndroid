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

public class telaDescricaoPastorAlemao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_pastor_alemao);

        ImageView imgPastorAlemao_femea = (ImageView) findViewById(R.id.imgPastorAlemao_femea);
        imgPastorAlemao_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaPastoralemaoFemea.class);
                startActivity(intent);
            }
        });

        TextView txtPastorAlemao_femea = (TextView) findViewById(R.id.txtLabrador_femea);
        txtPastorAlemao_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaLabradorFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgPastorAlemao_macho = (ImageView) findViewById(R.id.imgPastorAlemao_macho);
        imgPastorAlemao_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaPastoralemaoFemea.class);
                startActivity(intent);
            }
        });

        TextView txtPastorAlemao_macho = (TextView) findViewById(R.id.txtLabrador_macho);
        txtPastorAlemao_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaLabradorFemea.class);
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
                Intent pagInicial = new Intent(telaDescricaoPastorAlemao.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(telaDescricaoPastorAlemao.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(telaDescricaoPastorAlemao.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(telaDescricaoPastorAlemao.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(telaDescricaoPastorAlemao.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(telaDescricaoPastorAlemao.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            //case R.id.sair:
            //Intent tela = new Intent(MainActivity.this, TelaMenu.class);
            //startActivity(tela);
        }
        return (super.onOptionsItemSelected(item));
    }
}