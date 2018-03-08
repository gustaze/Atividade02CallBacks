package com.example.arqdsis.atividade02callbacks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import br.usjt.ads.desmob.atividades.R;


public class DialogActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_a);
    }

    /**
     * Callback method defined by the View
     * @param v
     */
    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}
