package edu.aku.hassannaqvi.amanhicovid_19study.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp21cm;

public class FormsAdapter extends RecyclerView.Adapter<FormsAdapter.ViewHolder> {
    Context c;
    DatabaseHelper db;
    private List<FollowUp21cm> fc = Collections.emptyList();

    // Provide a suitable constructor (depends on the kind of dataset)
    public FormsAdapter(List<FollowUp21cm> fc, Context c) {
        this.fc = fc;
        this.c = c;
        Log.d("TAG:count", String.valueOf(getItemCount()));
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pendingform_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        db = new DatabaseHelper(c);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        int childCount = 0;
        childCount = db.getChildrenByStudyID(fc.get(position).getSTUDYID());


        /*String iStatus = "Status  Unknown";
        int iColor = 0;
        switch (fc.get(position).get()) {
            case "1":
                iStatus = "Complete";
                iColor = Color.GREEN;
                break;
            case "2":
                iStatus = "No Respondent";
                iColor = Color.RED;
                break;
            case "3":
                iStatus = "Memebers Absent";
                iColor = Color.RED;
                break;
            case "4":
                iStatus = "Refused";
                iColor = Color.RED;
                break;
            case "5":
                iStatus = "Empty";
                iColor = Color.RED;
                break;
            case "6":
                iStatus = "Not Found";
                iColor = Color.RED;
                break;
            case "96":
                iStatus = "Other Reason";
                iColor = Color.RED;
                break;
            default:
                iStatus = "Open Form";
                iColor = Color.RED;
                break;

        }*/

        holder.dssid.setText(fc.get(position).getDSSID());
        holder.duedate.setText("Due Date: " + fc.get(position).getFUPDT());
        holder.fupwk.setText("Follow Up Week: " + fc.get(position).getFUPWEEK());
        //holder.istatus.setText(iStatus);
        //holder.sysdate.setText("  Child Count: " + childCount + " \t\t\t Card Seen: " + cardChild + " \t\t\t Photo Child: " + photoChild);
        //holder.istatus.setTextColor(iColor);

    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return fc.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public RecyclerView rv;
        public TextView dssid;
        public TextView duedate;
        public TextView fupwk;
        //public TextView istatus;
        // each data item is just a string in this case

        public ViewHolder(View v) {
            super(v);
//            rv = v.findViewById(R.id.FormsList);
            dssid = v.findViewById(R.id.dssid);
            duedate = v.findViewById(R.id.duedate);
            fupwk = v.findViewById(R.id.fupwk);
            //istatus = v.findViewById(R.id.istatus);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "I m here", Toast.LENGTH_SHORT).show();
        }

    }
}