package com.a53639858v.bethedj;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class OneFragment extends Fragment{

    View view;
    private ListView lvSongs;
    private ArrayAdapter<String> adapter;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_one, container, false);


        lvSongs = (ListView) view.findViewById(R.id.lvSongs);

        String[] canciones = {
                "Stressed Out - Twenty One Pilots",
                "Entre Dos Tierras - Heroes del Silencio",
                "Radio Clandestina - La Raiz",
                "Adentro - Calle 13",
                "John el Esquizofrenico - Calle 13",
                "Y se fue - La Pegatina",
                "La Dansa del Vestit - Txarango",
                "International Love - Pitbull",
                "The Less I Know The Better - Tame Impala",
                "Chop suey - System of a down",
                "Y se fue - La pegatina",
                "Nova - Ahrix",
                "La gozadera - Gente de zona ft. Enrique Igleias",
                "Faded - Alan Walker",
                "Tu calorro - Estopa",
                "Puta - Extremoduro",
                "So payaso -  Extremoduro",
                "Marea - Marea",
                "El perro verde - Marea",
                "Picky - Joey Montana",
                "Maquillate - Mecano",
                "A river flows in you - Yiruma",
                "Imagina - La pegatina",
                "No dudaria - Antonio Flores",
                "Unity - The fat rat",
                "Divenire - Ludovico einaudi",
                "Sin noticias de Holanda - Melendi",
                "Dying in your arms - Trivium",
                "The scatman - Scatman John",
                "Rayando el Sol - Mana",
                "Flying free - Pont aeri",
                "El aire de la calle - Los delincuentes"
        };

        adapter = new ArrayAdapter<>(
                getContext(),
                R.layout.view_song_row,
                R.id.tvSong,
                canciones
        );

        lvSongs.setAdapter(adapter);



        return view;
    }

}