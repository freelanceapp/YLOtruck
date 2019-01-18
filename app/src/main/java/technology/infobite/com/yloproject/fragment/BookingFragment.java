package technology.infobite.com.yloproject.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.adapter.TruckAdapter;
import technology.infobite.com.yloproject.modal.TwoVariableModel;

public class BookingFragment extends Fragment{

    private RecyclerView truck_rclv;
    private List<TwoVariableModel> truckArrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_booking, container, false);
        truck_rclv = view.findViewById(R.id.horizontal_rclv);

        truckArrayList.add(new TwoVariableModel(R.drawable.openyellow1,"Tata ace"));
        TruckAdapter truckAdapter = new TruckAdapter(truckArrayList, getActivity());
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        truck_rclv.setLayoutManager(lm);
        truck_rclv.setItemAnimator(new DefaultItemAnimator());
        truck_rclv.setAdapter(truckAdapter);
        return view;
    }
}