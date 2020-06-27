package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class telaRaca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_raca);

        ImageView noticia1 = (ImageView) findViewById(R.id.noticia1);

        noticia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://exame.com/estilo-de-vida/cao-de-20-anos-e-o-golden-retriever-mais-velho-da-historia/")));
            }
        });

        ImageView noticia2 = (ImageView) findViewById(R.id.noticia2);

        noticia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://exame.com/ciencia/caes-e-gatos-devem-praticar-distanciamento-social/")));
            }
        });

        ImageView noticia3 = (ImageView) findViewById(R.id.noticia3);

        noticia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://exame.com/ciencia/virus-zika-pode-combater-tumores-no-sistema-nervoso-de-cachorros/")));
            }
        });

        ImageView noticia4 = (ImageView) findViewById(R.id.noticia4);

        noticia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://exame.com/mundo/feira-com-carne-de-caes-abre-na-china-e-ativistas-pedem-que-seja-ultima/")));
            }
        });

        ImageView noticia5 = (ImageView) findViewById(R.id.noticia5);

        noticia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://exame.com/ciencia/cachorros-e-gatos-podem-pegar-coronavirus/")));
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
                Intent pagInicial = new Intent(telaRaca.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(telaRaca.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(telaRaca.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(telaRaca.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(telaRaca.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(telaRaca.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

                case R.id.sair:
                    finish();
        }
        return (super.onOptionsItemSelected(item));
    }
}