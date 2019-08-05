package vn.edu.poly.mainscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai4Activity extends AppCompatActivity {
    private ListView lvList;
   ArrayList<String> arrayList=new ArrayList<>();
   ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        lvList = findViewById(R.id.lvList);

        for (int i = 0; i <20 ; i++) {
            String Item="Row"+i;
            arrayList.add(Item);
        }
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        lvList.setAdapter(adapter);

        registerForContextMenu(lvList);


    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_menu2,menu);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        int index=info.position;


        switch (item.getItemId()){
            case R.id.mone:
                Toast.makeText(Bai4Activity.this,"Bạn chọn View",Toast.LENGTH_SHORT).show();
                break;

            case R.id.mtwo:
                Toast.makeText(Bai4Activity.this,"Bạn chọn Save",Toast.LENGTH_SHORT).show();
                break;

            case R.id.mthree:
                Toast.makeText(Bai4Activity.this,"Bạn chọn Edit",Toast.LENGTH_SHORT).show();
                break;

            case R.id.mfor:
                arrayList.remove(index);
                adapter.notifyDataSetChanged();
                Toast.makeText(Bai4Activity.this,"Xóa thành công",Toast.LENGTH_SHORT).show();
                break;
        }




        return super.onContextItemSelected(item);
    }
}
