package com.bgt.passingdatainterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    FragmentCommunicator fragmentCommunicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.bt_submit);

        FragmentClass fragment= new FragmentClass();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main ,fragment).commit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentCommunicator.passData("Hello");
            }
        });

    }

    public void passVal(FragmentCommunicator fragmentCommunicator) {
        this.fragmentCommunicator = fragmentCommunicator;

    }
}
