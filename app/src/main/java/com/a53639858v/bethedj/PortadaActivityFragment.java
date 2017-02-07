package com.a53639858v.bethedj;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class PortadaActivityFragment extends Fragment {

    private View view;
    private Button entrar;
    private EditText nombre;

    public PortadaActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_portada, container, false);

        entrar = (Button) view.findViewById(R.id.selectDisco);
        nombre = (EditText) view.findViewById(R.id.editText);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre.getText().toString().equalsIgnoreCase("ecaib")) {
                    Intent i = new Intent(getContext() , MainActivity.class);
                    startActivity(i);
                }
            }
        });

        return view;
    }
}
