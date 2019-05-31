package com.conan.firebaseloginapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class countryAdapter extends RecyclerView.Adapter<countryAdapter.MyViewHolder> {

    private List<Country> mCountry;

    public countryAdapter(List<Country> mCountry) {
        this.mCountry = mCountry;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.country_row_item, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Country c = mCountry.get(i);
        myViewHolder.name.setText(c.getName());
    }

    @Override
    public int getItemCount() {
        return mCountry.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
