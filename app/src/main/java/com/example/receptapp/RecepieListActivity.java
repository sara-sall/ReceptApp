package com.example.receptapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecepieListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecepieListAdapter adapter;
    private DividerItemDecoration itemDecoration;
    private ArrayList<Recept> receptLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie_list);


        receptLista = new ArrayList<Recept>();
        receptLista.add(new Recept("Toast Skagen", "Bröd och skagenröra", R.drawable.beef_liten));
        receptLista.add(new Recept("Pasta carbonara", "Pasta, ost, bacon och grädde", R.drawable.beef_liten));
        receptLista.add(new Recept("Spaghetti och köttfärssås", "Köttfärs, tomatsås, spaghetti, vitlök"));
        receptLista.add(new Recept("Pannkakor", "Mjölk, ägg och mjöl", R.drawable.beef_liten));
        receptLista.add(new Recept("Sallad", "Tomater, Gurka, Paprika och salladsblad", R.drawable.beef_liten));
        receptLista.add(new Recept("Muffins", "Mjöl, socker, kakao, ägg"));

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //TODO - Make item decoration work
        itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL );
        recyclerView.addItemDecoration(itemDecoration);


        adapter = new RecepieListAdapter(receptLista);
        recyclerView.setAdapter(adapter);
       // adapter.notifyDataSetChanged();


    }
}
