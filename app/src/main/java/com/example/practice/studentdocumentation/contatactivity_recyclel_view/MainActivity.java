package com.example.practice.studentdocumentation.contatactivity_recyclel_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public  ArrayList<Contacts> listcontacts;
    public  ContactsAdapter conA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listcontacts = new ArrayList<Contacts>();

        Contacts firstPerson1 = new Contacts(R.drawable.house,"Fres Hamel","neu Michatroniker in Deutschlan",3.5f,true);
        Contacts firstPerson2 = new Contacts(R.drawable.house2,"Fres Hamel Gasba","neu Michatroniker in Deutschlan",2f,true);
        Contacts firstPerson3 = new Contacts(R.drawable.house3,"Fres Hamel machen","neu Michatroniker in Deutschlan",2.5f,true);
        Contacts firstPerson4 = new Contacts(R.drawable.imageback,"Fres Hamel lachen","neu Michatroniker in Deutschlan",3,true);
        Contacts firstPerson5 = new Contacts(R.drawable.maconnerie,"Fres Hamel denken","neu Michatroniker in Deutschlan",3.5f,true);
        Contacts firstPerson6 = new Contacts(R.drawable.mannperfekt,"Fres Hamel können","neu Michatroniker in Deutschlan",4f,true);
        Contacts firstPerson7 = new Contacts(R.drawable.macon1,"Fres Hamel laufen","neu Michatroniker in Deutschlan",4.5f,true);
        Contacts firstPerson8 = new Contacts(R.drawable.house,"Fres Hamel rennen","neu Michatroniker in Deutschlan",5f,true);
        Contacts firstPerson9 = new Contacts(R.drawable.house,"Fres Hamel traurig","neu Michatroniker in Deutschlan",3f,true);
        Contacts firstPerson10 = new Contacts(R.drawable.house,"Fres Hamel lustig","neu Michatroniker in Deutschlan",3f,true);
        Contacts firstPerson11 = new Contacts(R.drawable.house,"Fres Hamel wichtig","neu Michatroniker in Deutschlan",3f,true);
        Contacts firstPerson12 = new Contacts(R.drawable.house,"Fres Hamel richtig","neu Michatroniker in Deutschlan",3f,true);
        Contacts firstPerson13 = new Contacts(R.drawable.house,"Fres Hamel","neu Michatroniker in Deutschlan",3.5f,true);
        Contacts firstPerson14 = new Contacts(R.drawable.house,"Fres Hamel","neu Michatroniker in Deutschlan",5f,true);
        Contacts firstPerson15 = new Contacts(R.drawable.house,"Fres Hamel","neu Michatroniker in Deutschlan",5f,true);




        listcontacts.add(firstPerson1);
        listcontacts.add(firstPerson2);
        listcontacts.add(firstPerson3);
        listcontacts.add(firstPerson4);
        listcontacts.add(firstPerson5);
        listcontacts.add(firstPerson5);
        listcontacts.add(firstPerson6);
        listcontacts.add(firstPerson7);
        listcontacts.add(firstPerson8);
        listcontacts.add(firstPerson9);
        listcontacts.add(firstPerson10);
        listcontacts.add(firstPerson11);
        listcontacts.add(firstPerson12);
        listcontacts.add(firstPerson13);
        listcontacts.add(firstPerson14);
        listcontacts.add(firstPerson15);


        RecyclerView myRecycleView = (RecyclerView) findViewById(R.id.my_recycle_view);

        StaggeredGridLayoutManager ln = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(ln);

        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL);
        myRecycleView.addItemDecoration(itemDecoration);


        conA = new ContactsAdapter(listcontacts);

        myRecycleView.setAdapter(conA);






//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

//        Contacts contacts =new Contacts("fares",true);
//        Contacts contactsd =new Contacts("Hamel",true);
//        Contacts contactsv =new Contacts("jjj",true);
//        Contacts contactsf =new Contacts("ddddd",true);
//
//        listcontacts = new ArrayList<Contacts>();
//
//        listcontacts.add(contacts);
//        listcontacts.add(contactsd);
//        listcontacts.add(contactsv);
//        listcontacts.add(contactsf);
//
//
//
//        conA = new ContactsAdapter(listcontacts);
//
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycle_view);
//
//        recyclerView.setAdapter(conA);
//        recyclerView.setLayoutManager(layoutManager);

    }
}




//                   BOTTON
//
//        Button aded = (Button) findViewById(R.id.add_new_contact);
//        aded.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                int id = conA.getItemCount();
//
//                contacts.add(0,new Contacts("fares hamel",true));
//
//                conA.notifyItemRangeInserted(id,contacts.size());
//
//            }
//        });
//
//        Button deleted = (Button) findViewById(R.id.deleted_contact);
//        deleted.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//               int id = conA.getItemCount();
//               conA.notifyItemRangeRemoved(id,contacts.size()-1);
//            }
//        });