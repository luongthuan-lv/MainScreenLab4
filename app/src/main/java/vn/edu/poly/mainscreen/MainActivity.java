package vn.edu.poly.mainscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void Bai2(View view) {
        startActivity(new Intent(MainActivity.this,Bai2Activity.class));
    }

    public void Bai3(View view) {
        startActivity(new Intent(MainActivity.this,Bai3Activity.class));
    }

    public void Bai4(View view) {
        startActivity(new Intent(MainActivity.this,Bai4Activity.class));
    }
}
