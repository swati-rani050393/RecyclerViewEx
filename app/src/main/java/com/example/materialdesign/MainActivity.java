package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
RecyclerView recyclerView;
ArrayList<User> arrayList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton=findViewById(R.id.fab);
        /*Matrial desisn is Advanced concept in AAd which comes from Android ^.0 Mardhmallow.
        It is User friendely and best performer widgets in our AAD.
        it takes less memory as Compared to core widgets.Some material Designing widgets is,Snackbar,
        Floating action Button,
        RecyclerView,
        CardView,
        Fragment,
        Tab View,
        Navigation Drawer,
        Collapsing ToolBar,
        Co-ordinator Layout,
        Constraint Layout,

        Recycler view and List view
        List View_>
        static and view Holder not mendetory, object create depend on the data maeans if we have 100 datathen 100 object
        is created and if we have 200 then 200 object is created.and the default properties of list view is scrollable.
        data show on list view is verticle and if we want to show data on gRID(ROW,COLUMN ) then we create grid view.

        Recycler
        it is dynamic and for more then one data it has limited object and recycler object from previous object.
        View holder is mendatory.
        for show data on list and grid just we use layout manager for this requirement.
        */
        arrayList=new ArrayList<>();
        User user=new User();
        user.setImage(R.drawable.ic_launcher_foreground);
        user.setNem("raja");
        user.setAddress("gurgaon");
        arrayList.add(user);
        User user1=new User();
        user1.setImage(R.drawable.ic_launcher_foreground);
        user1.setNem("rajan");
        user1.setAddress("gurgaon");
        arrayList.add(user1);



        recyclerView=findViewById(R.id.rv);
        MyAdapter adapter=new MyAdapter(this,arrayList);

  recyclerView.setLayoutManager(new LinearLayoutManager(this));
  recyclerView.setAdapter(adapter);

  floatingActionButton.setOnClickListener(new View.OnClickListener() {
      @SuppressLint("ShowToast")
      @Override
      public void onClick(View v) {
          Snackbar.make(v,"add new Data",Snackbar.LENGTH_LONG).setAction("yes", new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(MainActivity.this, "Data added Successfully", Toast.LENGTH_SHORT).show();
              }
          });
      }
  });
    }




}