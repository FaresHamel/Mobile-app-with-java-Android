package com.example.practice.studentdocumentation.contatactivity_recyclel_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolderContacts> {
//
//    public ArrayList<Contacts> contactsList;
//    Context context;

    private List<Contacts> contactsList;

    public ContactsAdapter(ArrayList<Contacts> contactsList1){
        contactsList  = contactsList1;
//        this.context = context1;
    }


    @NonNull
    @Override
    public ContactsAdapter.ViewHolderContacts onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        Context context = parent.getContext();
//
//        LayoutInflater layoutInflater = LayoutInflater.from(context);
//        View viewContacts = layoutInflater.inflate(R.layout.item_contacts,parent,false);


        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);



        View contactView = inflater.inflate(R.layout.item_contacts, parent, false);

        ViewHolderContacts viewHolder = new ViewHolderContacts(contactView);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderContacts holder, int position) {

        Contacts contactseins = contactsList.get(position);

        holder.imageView.setImageResource(contactseins.getImagerespource());
        holder.nameTextView.setText(contactseins.getName());
        holder.textDescription.setText(contactseins.getDescriptionTravel());
        holder.prosontagBar.setRating(contactseins.getProsontage());
        holder.messageButton.setText(contactseins.getOnline()? "Line" : "ofline");


//        Contacts contact = contactsList.get(position);
//
//        // Set item views based on your views and data model
//        TextView textView = holder.textView;
//        textView.setText(contact.getName());
//        Button button = viewHolder.messageButton;
//        button.setText(contact.isOnline() ? "Message" : "Offline");
//        button.setEnabled(contact.isOnline());


    }


    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ViewHolderContacts extends RecyclerView.ViewHolder {

        public ImageView imageView ;
        public TextView nameTextView;
        public Button messageButton;
        public TextView textDescription;
        public RatingBar prosontagBar;


//        public TextView textView;
//        public Button button;

        public ViewHolderContacts(View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.image_content_view);
            nameTextView = itemView.findViewById(R.id.name_travel);
            textDescription = itemView.findViewById(R.id.text_description);
            messageButton = itemView.findViewById(R.id.botton_contact);
           prosontagBar = itemView.findViewById(R.id.rating_Bar_prosontag);

//            textView = itemView.findViewById(R.id.text);
//            button = itemView.findViewById(R.id.bttn);
        }

    }
}
