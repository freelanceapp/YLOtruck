package technology.infobite.com.yloproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.modal.SixVariableModel;
import technology.infobite.com.yloproject.modal.TwoVariableModel;

public class TruckDetailsScheduleAdapter extends RecyclerView.Adapter<TruckDetailsScheduleAdapter.ViewHolder> {
    private List<SixVariableModel> truckdetailsList;
    private Context context1;

    public TruckDetailsScheduleAdapter(List<SixVariableModel> truckdetailsList, Context context1) {
        this.truckdetailsList = truckdetailsList;
        this.context1 = context1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(context1);
        View view  = li.inflate(R.layout.yorates_fragment_rclv_layout,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        SixVariableModel truckdetailslist = truckdetailsList.get(i);
        viewHolder.textView1.setText(truckdetailslist.getString1());
        viewHolder.textView2.setText(truckdetailslist.getString2());
        viewHolder.textView3.setText(truckdetailslist.getString3());
        viewHolder.textView4.setText(truckdetailslist.getString4());
        viewHolder.textView5.setText(truckdetailslist.getString5());
        viewHolder.textView6.setText(truckdetailslist.getString6());
    }
    @Override
    public int getItemCount() {
        return truckdetailsList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView1,textView2,textView3,textView4,textView5,textView6;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 =  itemView.findViewById(R.id.text1);
            textView2 =  itemView.findViewById(R.id.text2);
            textView3 =  itemView.findViewById(R.id.text3);
            textView4 =  itemView.findViewById(R.id.text4);
            textView5 =  itemView.findViewById(R.id.text5);
            textView6 =  itemView.findViewById(R.id.text6);
        }
    }
}
