package com.example.sisgaqsacapp.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.sisgaqsacapp.R;


public class ErrorIngresarDialog {
    public ErrorIngresarDialog(final Context contexto){
        final Dialog dialogo= new Dialog(contexto);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(false);
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogo.setContentView(R.layout.dialog_error_inicio);
        Button okey= (Button) dialogo.findViewById(R.id.ImgBtnOkError);

        okey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogo.dismiss();

            }
        });
        dialogo.show();
    }
}
