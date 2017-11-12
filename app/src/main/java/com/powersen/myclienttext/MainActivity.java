package com.powersen.myclienttext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.powersen.myclienttext.client.API;
import com.powersen.myclienttext.client.BaseObserver;
import com.powersen.myclienttext.client.MyRetroFitClient;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyRetroFitClient.getInstance(MainActivity.this).createBaseApi().gets(API.BASE_PATH, new BaseObserver<Mybean>(MainActivity.this) {
                    @Override
                    protected void hideDialog() {

                    }

                    @Override
                    protected void showDialog() {

                    }

                    @Override
                    public void onNext(Mybean mybean) {
                        String str = mybean.toString();
                        tv.setText(str);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
            }
        });
    }
}
