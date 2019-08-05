package vn.edu.poly.mainscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Bai3Activity extends AppCompatActivity {
private Button btnPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        Toolbar toolbar=findViewById(R.id.tbToolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnPop=findViewById(R.id.btnPop);


        btnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 createPopUpMenu();
            }
        });
    }

    public void createPopUpMenu(){
        PopupMenu popupMenu=new PopupMenu(this,btnPop);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuone:
                        Toast.makeText(Bai3Activity.this,"One",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menutwo:
                        Toast.makeText(Bai3Activity.this,"Two",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menuthree:
                        Toast.makeText(Bai3Activity.this,"Three",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menufor:
                        Toast.makeText(Bai3Activity.this,"For",Toast.LENGTH_SHORT).show();
                        break;

                }


                return false;
            }
        });
        popupMenu.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return true;
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
    }

    public void Bai1(View view) {
        startActivity(new Intent(Bai3Activity.this,Bai1Activity.class));
    }


}
