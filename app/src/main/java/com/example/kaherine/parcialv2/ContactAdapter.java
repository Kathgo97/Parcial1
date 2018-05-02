package com.example.kaherine.parcialv2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    Context mContext;

    private LayoutInflater inflater;
    private List<Contacto> mListContact;


    public  ContactAdapter(Context context, List<Contacto> listContact){
        mListContact = listContact;
        mContext = context;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.card_view_contact,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        TextView contact_name, contact_number;
        contact_name = holder.contact_name;
        contact_number = holder.contact_number;

        contact_name.setText(mListContact.get(position).getNombre());
        contact_number.setText(mListContact.get(position).getTelefono());

    }

    @Override
    public int getItemCount() {
        return mListContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView contact_name, contact_number;

        public ViewHolder(View itemView) {
            super(itemView);

            contact_name = itemView.findViewById(R.id.nombre);
            contact_number = itemView.findViewById(R.id.telefono);
        }
    }
}
