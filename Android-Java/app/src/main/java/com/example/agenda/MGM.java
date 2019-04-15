package com.example.agenda;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MGM extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
          setContentView(R.layout.layout_mgm);

        Intent intent = getIntent();
        if(intent!=null && intent.getData()!=null){
            ((TextView)findViewById(R.id.txtteste)).setText(intent.getData().toString());
        }

          super.onCreate(savedInstanceState);
      }
}
