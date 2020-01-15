package com.bmsrental.recyclerviewselecteditemcolorchange;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<Item> itemList;
    private Context context;
    int index = -1;


    public CustomAdapter(List<Item> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Item item = itemList.get(position);
        holder.title.setText(item.getTitle());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = position;
                notifyDataSetChanged();
            }
        });
        if(index==position){
            holder.layout.setBackgroundColor(Color.parseColor("#FF4081"));
            holder.title.setTextColor(Color.parseColor("#FFFFFF"));
            Toast.makeText(context, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
        }else{
            holder.layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
            holder.title.setTextColor(Color.parseColor("#000000"));
        }

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView layout;
        private TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.layout);
            title = itemView.findViewById(R.id.title);
        }
    }
}
