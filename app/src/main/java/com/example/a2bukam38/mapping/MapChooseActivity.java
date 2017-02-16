package com.example.a2bukam38.mapping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 2bukam38 on 09/02/2017.
 */


public class MapChooseActivity extends Activity implements View.OnClickListener {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mca);

        Button regular = (Button)findViewById(R.id.btnRegular);
        regular.setOnClickListener(this);
        Button cyclemap = (Button)findViewById(R.id.btnCyclemap);
        cyclemap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        public void onClick(View v)
        {
            Intent intent = new Intent();
            Bundle bundle=new Bundle();
            boolean cyclemap=false;
            if (v.getId()==R.id.btnCyclemap)
            {
                cyclemap=true;
            }
            bundle.putBoolean("com.example.cyclemap",cyclemap);
            intent.putExtras(bundle);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}

