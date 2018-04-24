package com.anirudhmergu.jumble;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<CategoryModel> list;

    MainListAdapter(Context context, ArrayList<CategoryModel> array) {
        mContext = context;
        list = array;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.recycler_menu_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    public void clickedButton(View v, int position) {
        /*
        if(position == 0)
        {

        }
        else if(position == 1)
        {

        }
        else if(position == 2)
        {

        }
        else if(position == 3)
        {

        }
        else
        */
        Snackbar.make(v, "Clicked " + position, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        ImageView image = holder.image;
        TextView category = holder.category;
        TextView description = holder.description;

        image.setImageResource(list.get(position).getImage());
        category.setText(list.get(position).getCategory());
        description.setText(list.get(position).getDescription());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedButton(v, position);
            }
        });

        holder.category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedButton(v, position);
            }
        });

        holder.description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedButton(v, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView category;
        TextView description;
        CardView mainCard;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.main_category_image);
            category = itemView.findViewById(R.id.main_category_title);
            description = itemView.findViewById(R.id.main_category_info);
            mainCard = itemView.findViewById(R.id.main_card_view);
        }


    }


}
