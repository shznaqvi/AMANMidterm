package edu.aku.hassannaqvi.amanmidterm;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by hassan.naqvi on 8/1/2016.
 */
public class FormsAdapter extends RecyclerView.Adapter<FormsAdapter.ViewHolder> {
    Context c;
    private List<FormsContract> fc = Collections.emptyList();

    // Provide a suitable constructor (depends on the kind of dataset)
    public FormsAdapter(List<FormsContract> fc, Context c) {
        this.fc = fc;
        this.c = c;
        Log.d("TAG:count", String.valueOf(getItemCount()));
    }

    // Create new views (invoked by the layout manager)
    @Override
    public FormsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_forms_list, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        holder.date.setText(fc.get(position).getFormDate().toString());
        holder.cluster.setText(fc.get(position).getPrimaryUnit().toString());

        String iStatus = "Status  Unknown";
        int iColor = 0;
        switch (fc.get(position).getiStatus().toString()) {
            case "1":
                iStatus = "Complete";
                iColor = Color.GREEN;
                break;
            case "2":
                iStatus = "Door Locked";
                iColor = Color.RED;
                break;
            case "3":
                iStatus = "Refused";
                iColor = Color.RED;
                break;
            case "4":
                iStatus = "Not Found";
                iColor = Color.RED;
                break;
        }

        holder.household.setText(iStatus);
        holder.household.setTextColor(iColor);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return fc.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView rv;
        public TextView date;
        public TextView cluster;
        public TextView household;
        // each data item is just a string in this case

        public ViewHolder(View v) {
            super(v);
            rv = (RecyclerView) v.findViewById(R.id.FormsList);
            date = (TextView) v.findViewById(R.id.date);
            cluster = (TextView) v.findViewById(R.id.cluster);
            household = (TextView) v.findViewById(R.id.household);

        }


    }
}