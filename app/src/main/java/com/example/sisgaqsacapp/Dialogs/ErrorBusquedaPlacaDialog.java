package com.example.sisgaqsacapp.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.example.sisgaqsacapp.R;
import com.example.sisgaqsacapp.ReporteVacioActivity;


public class ErrorBusquedaPlacaDialog {
    public ErrorBusquedaPlacaDialog(final Context contexto){
        final Dialog dialogo= new Dialog(contexto);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(false);
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogo.setContentView(R.layout.dialog_error_busqueda_placa);
        Button okey= (Button) dialogo.findViewById(R.id.ImgBtnOkErrorBusquedaPlac);
        Button reportar= (Button) dialogo.findViewById(R.id.ImgBtnReporteErrorBusquedaPlac);

        okey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogo.dismiss();

            }
        });
        reportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(contexto,"REPORTAR...",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(contexto, ReporteVacioActivity.class);
                contexto.startActivity(i);
            }
        });
        dialogo.show();
    }
}
