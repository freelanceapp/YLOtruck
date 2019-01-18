package technology.infobite.com.yloproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.modal.TwoVariableModel;

public class TruckAdapter extends RecyclerView.Adapter<TruckAdapter.ViewHolder> {
    private List<TwoVariableModel> truckArrayList;
    private Context context;

    public TruckAdapter(List<TwoVariableModel> truckArrayList, Context context) {
        this.truckArrayList = truckArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(context);
        View view  = li.inflate(R.layout.truck_fragment_rclv,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        TwoVariableModel truckarraylist = truckArrayList.get(i);
        viewHolder.truck_image.setImageDrawable(context.getResources().getDrawable(truckarraylist.getImage()));
        viewHolder.truck_name.setText(truckarraylist.getName());

    }

    @Override
    public int getItemCount() {
        return truckArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout truck_layout;
        private ImageView truck_image;
        private TextView truck_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            truck_image = itemView.findViewById(R.id.truck_image);
            truck_name = itemView.findViewById(R.id.truck_name);
            truck_layout = itemView.findViewById(R.id.truck_layout);
        }
    }
}
