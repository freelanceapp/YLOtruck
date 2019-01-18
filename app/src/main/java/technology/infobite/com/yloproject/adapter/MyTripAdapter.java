package technology.infobite.com.yloproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.concurrent.TimeoutException;

import technology.infobite.com.yloproject.R;

public class MyTripAdapter extends RecyclerView.Adapter<MyTripAdapter.ViewHolder> {

    private List<FivVariableModel> mytriparrrayList;
    private Context context;

    public MyTripAdapter(List<FivVariableModel> mytriparrrayList, Context context) {
        this.mytriparrrayList = mytriparrrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.mytrips_adapter_layout,null);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        FivVariableModel mytriparraylist = mytriparrrayList.get(i);
        viewHolder.mytripstruckimage.setImageDrawable(context.getResources().getDrawable(mytriparraylist.getImage()));
        viewHolder.mytripstruckname.setText(mytriparraylist.getTruckname());
        viewHolder.mytripstruckid.setText(mytriparraylist.getTruckid());
        viewHolder.mytripstruckdate.setText(mytriparraylist.getTruckdate());
        viewHolder.mytripstrucktime.setText(mytriparraylist.getTrucktime());

    }

    @Override
    public int getItemCount() {
        return mytriparrrayList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mytripstruckimage;
        private TextView mytripstruckname,mytripstruckid,mytripstruckdate,mytripstrucktime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mytripstruckimage = itemView.findViewById(R.id.mytrip_truck_image);
            mytripstruckname = itemView.findViewById(R.id.mytrip_truck_name);
            mytripstruckid = itemView.findViewById(R.id.mytirps_id_no);
            mytripstruckdate = itemView.findViewById(R.id.date_mytrip);
            mytripstrucktime = itemView.findViewById(R.id.time_mytrip);
        }
    }
}
