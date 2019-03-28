package com.example.receptapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecepieListFragmentActivity extends Fragment {


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecepieListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View v =  inflater.inflate(R.layout.activity_recepie_list, container, false);
            ArrayList<Recept> receptLista;

            receptLista = new ArrayList<Recept>();
            receptLista.add(new Recept("Toast Skagen", "Bröd och skagenröra", R.drawable.beef_liten));
            receptLista.add(new Recept("Pasta carbonara", "Pasta, ost, bacon och grädde", R.drawable.beef_liten));
            receptLista.add(new Recept("Spaghetti och köttfärssås", "Köttfärs, tomatsås, spaghetti", R.drawable.beef_liten));
            receptLista.add(new Recept("Pannkakor", "Mjölk, ägg och mjöl", R.drawable.beef_liten));
            receptLista.add(new Recept("Sallad", "Tomater, Gurka, Paprika och salladsblad", R.drawable.beef_liten));


            recyclerView = (RecyclerView) v.findViewById(R.id.recyclerViewID);
            layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);

            adapter = new RecepieListAdapter(receptLista);
            recyclerView.setAdapter(adapter);


        return v;

    }

}
