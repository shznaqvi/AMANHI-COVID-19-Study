package edu.aku.hassannaqvi.amanhicovid_19study.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import edu.aku.hassannaqvi.amanhicovid_19study.R;

public class ViewHolder_Child21cm extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtViewTitle;
    public IMyViewHolderClicks mListener;

    public ViewHolder_Child21cm(View itemLayoutView, IMyViewHolderClicks listener) {
        super(itemLayoutView);
        mListener = listener;
        txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.txtStudyid);
        itemLayoutView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mListener.onPotato(v);
    }

    public static interface IMyViewHolderClicks {
        public void onPotato(View caller);
    }
}
