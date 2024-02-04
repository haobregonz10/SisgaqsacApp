package com.example.sisgaqsacapp.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.sisgaqsacapp.BusquedaActivity;
import com.example.sisgaqsacapp.R;

public class FinalizarReporteDialog {
    public FinalizarReporteDialog(final Context contexto){
        final Dialog dialogo= new Dialog(contexto);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(false);
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogo.setContentView(R.layout.dialog_finalizar_reporte);
        Button okey= (Button) dialogo.findViewById(R.id.ImgBtnOk);

        okey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogo.dismiss();
                Intent i = new Intent(contexto, BusquedaActivity.class);
                contexto.startActivity(i);
            }
        });
        dialogo.show();
    }
}
