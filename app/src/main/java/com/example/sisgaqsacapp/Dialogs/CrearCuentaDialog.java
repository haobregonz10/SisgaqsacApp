package com.example.sisgaqsacapp.Dialogs;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.sisgaqsacapp.MainActivity;
import com.example.sisgaqsacapp.R;


public class CrearCuentaDialog {
    public CrearCuentaDialog(final Context contexto){
        final Dialog dialogo= new Dialog(contexto);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(false);
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogo.setContentView(R.layout.dialog_crear_cuenta);
        Button okey= (Button) dialogo.findViewById(R.id.ImgBtnOk);

        okey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogo.dismiss();
                Intent i = new Intent(contexto, MainActivity.class);
                contexto.startActivity(i);
            }
        });
        dialogo.show();
    }
}
