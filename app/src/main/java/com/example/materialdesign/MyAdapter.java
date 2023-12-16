package com.example.materialdesign;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Activity obj;
    ArrayList<User> al=new ArrayList<>();

    public MyAdapter(Activity obj, ArrayList<User> al) {
        this.obj = obj;
        this.al = al;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(obj).inflate(R.layout.item_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
     User user=al.get(position);
     holder.imageView.setImageResource(user.getImage());
     holder.nem.setText(user.getNem());
     holder.address.setText(user.address);
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nem,address;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv1);
            nem=itemView.findViewById(R.id.tvNem);
            address=itemView.findViewById(R.id.tvAdd);
        }
    }
}
