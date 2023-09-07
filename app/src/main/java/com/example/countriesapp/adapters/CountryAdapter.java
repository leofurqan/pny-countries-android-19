package com.example.countriesapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.countriesapp.R;
import com.example.countriesapp.data.CountriesData;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder>{
    private ArrayList<CountriesData> localDataSet;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgFlag;
        private final TextView txtName, txtArea, txtPopulation;

        public ViewHolder(View view) {
            super(view);

            imgFlag = view.findViewById(R.id.img_flag);
            txtName = (TextView) view.findViewById(R.id.txt_name);
            txtArea = (TextView) view.findViewById(R.id.txt_area);
            txtPopulation = (TextView) view.findViewById(R.id.txt_population);
        }

        public ImageView getImgFlag() {
            return imgFlag;
        }

        public TextView getTxtName() {
            return txtName;
        }

        public TextView getTxtArea() {
            return txtArea;
        }

        public TextView getTxtPopulation() {
            return txtPopulation;
        }
    }

    public CountryAdapter(ArrayList<CountriesData> dataSet) {
        localDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item_country, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
