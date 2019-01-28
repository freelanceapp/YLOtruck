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
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import technology.infobite.com.yloproject.R;
import technology.infobite.com.yloproject.adapter.TruckAdapter;
import technology.infobite.com.yloproject.modal.TwoVariableModel;

public class BookingFragment extends Fragment implements View.OnClickListener{
    private Button opentrucks,containertrucks,anytruck;
    private RecyclerView truck_rclv1,truck_rclv2,truck_rclv3;
    private List<TwoVariableModel> truckArrayList1 = new ArrayList<>();
    private List<TwoVariableModel> truckArrayList2 = new ArrayList<>();
    private List<TwoVariableModel> truckArrayList3 = new ArrayList<>();
    private Boolean check = false;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_booking, container, false);
        truck_rclv1 = view.findViewById(R.id.horizontal_rclv1);
        truck_rclv2 = view.findViewById(R.id.horizontal_rclv2);
        truck_rclv3 = view.findViewById(R.id.horizontal_rclv3);
        opentrucks = view.findViewById(R.id.btn_open_truck);
        containertrucks = view.findViewById(R.id.btn_container_truck);
        anytruck = view.findViewById(R.id.btn_any_truck);


        opentrucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) { check = false;
                 truck_rclv1.setVisibility(View.GONE);
                } else { check = true;
                    truck_rclv1.setVisibility(View.VISIBLE); }
            }
        });
        containertrucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) { check = false;
                    truck_rclv2.setVisibility(View.GONE);
                } else { check = true;
                    truck_rclv1.setVisibility(View.VISIBLE); }
            }
        });
        anytruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) { check = false;
                    truck_rclv3.setVisibility(View.GONE);
                } else { check = true;
                    truck_rclv2.setVisibility(View.VISIBLE); }
            }
        });

        /*Truck list 1*/
        //open white truck
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite1,"3 w ape bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite2,"4 w bolero  bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite3,"4 wheeler 407 bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite4,"4 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite5,"6 wheeler big bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite6,"10 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite7,"12 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite8,"14 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite9,"18 wheeler bw"));
        //open yellow truck
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow1,"3 w ape co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow2,"4 w bolero  co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow3,"4 wheeler 407 color"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow4,"4 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow5,"6 wheeler big co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow6,"10 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow7,"12 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow8,"14 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow9,"18 wheeler co"));

        TruckAdapter truckAdapter = new TruckAdapter(truckArrayList1, getActivity().getApplicationContext());
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        truck_rclv1.setLayoutManager(lm);
        truck_rclv1.setItemAnimator(new DefaultItemAnimator());
        truck_rclv1.setAdapter(truckAdapter);
        /*Tkuck List 2*/
        //container white truck
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white1,"3 w ape bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white2,"4 w bolero  bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white3,"4 wheeler 407 bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white4,"4 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white5,"6 wheeler big bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white6,"10 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white7,"12 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white8,"14 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white9,"18 wheeler bw"));
        //container yellow truck
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck1,"3 w ape co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck2,"4 w bolero  co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck3,"4 wheeler 407 color"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck4,"4 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck5,"6 wheeler big co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck6,"10 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck7,"12 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck8,"14 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck9,"18 wheeler co"));
        TruckAdapter truckAdapter1 = new TruckAdapter(truckArrayList2, getActivity().getApplicationContext());
        LinearLayoutManager lm1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        truck_rclv2.setLayoutManager(lm1);
        truck_rclv2.setItemAnimator(new DefaultItemAnimator());
        truck_rclv2.setAdapter(truckAdapter1);
        /*Tkuck List 3*/
        //open white truck
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite1,"3 w ape bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite2,"4 w bolero  bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite3,"4 wheeler 407 bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite4,"4 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite5,"6 wheeler big bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite6,"10 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite7,"12 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite8,"14 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite9,"18 wheeler bw"));
        //open yellow truck
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow1,"3 w ape co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow2,"4 w bolero  co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow3,"4 wheeler 407 color"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow4,"4 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow5,"6 wheeler big co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow6,"10 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow7,"12 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow8,"14 wheeler co"));
        //container white trukc
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white1,"3 w ape bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white2,"4 w bolero  bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white3,"4 wheeler 407 bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white4,"4 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white5,"6 wheeler big bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white6,"10 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white7,"12 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white8,"14 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white9,"18 wheeler bw"));
        //container yellow truck
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck1,"3 w ape co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck2,"4 w bolero  co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck3,"4 wheeler 407 color"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck4,"4 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck5,"6 wheeler big co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck6,"10 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck7,"12 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck8,"14 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck9,"18 wheeler co"));
        TruckAdapter truckAdapter2 = new TruckAdapter(truckArrayList3, getActivity().getApplicationContext());
        LinearLayoutManager lm2 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        truck_rclv2.setLayoutManager(lm2);
        truck_rclv2.setItemAnimator(new DefaultItemAnimator());
        truck_rclv2.setAdapter(truckAdapter2);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.horizontal_rclv1:
                break;
            case R.id.horizontal_rclv2:
                break;
            case R.id.horizontal_rclv3:
                break;
        }
    }
}