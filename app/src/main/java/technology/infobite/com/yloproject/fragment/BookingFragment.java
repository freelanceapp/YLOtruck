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

public class BookingFragment extends Fragment implements View.OnClickListener {

    private Button opentrucks, containertrucks, anytruck;
    private RecyclerView truck_rclv1;
    private List<TwoVariableModel> truckArrayList1 = new ArrayList<>();
    private List<TwoVariableModel> truckArrayList2 = new ArrayList<>();
    private List<TwoVariableModel> truckArrayList3 = new ArrayList<>();
    private TruckAdapter truckAdapter1, truckAdapter2, truckAdapter3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_booking, container, false);

        truck_rclv1 = view.findViewById(R.id.horizontal_rclv1);
        opentrucks = view.findViewById(R.id.btn_open_truck);
        containertrucks = view.findViewById(R.id.btn_container_truck);
        anytruck = view.findViewById(R.id.btn_any_truck);

        addItems();
        return view;
    }

    private void addItems() {
        /*Truck list 1*/
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite1, "3 w ape bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite2, "4 w bolero  bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite3, "4 wheeler 407 bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite4, "4 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite5, "6 wheeler big bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite6, "10 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite7, "12 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite8, "14 wheeler bw"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.operwhite9, "18 wheeler bw"));
        /*truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow1, "3 w ape co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow2, "4 w bolero  co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow3, "4 wheeler 407 color"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow4, "4 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow5, "6 wheeler big co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow6, "10 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow7, "12 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow8, "14 wheeler co"));
        truckArrayList1.add(new TwoVariableModel(R.drawable.openyellow9, "18 wheeler co"));*/

        /*Tkuck List 2*/
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white1, "3 w ape bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white2, "4 w bolero  bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white3, "4 wheeler 407 bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white4, "4 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white5, "6 wheeler big bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white6, "10 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white7, "12 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white8, "14 wheeler bw"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.truck_container_white9, "18 wheeler bw"));
        /*truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck1, "3 w ape co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck2, "4 w bolero  co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck3, "4 wheeler 407 color"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck4, "4 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck5, "6 wheeler big co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck6, "10 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck7, "12 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck8, "14 wheeler co"));
        truckArrayList2.add(new TwoVariableModel(R.drawable.container_yellow_truck9, "18 wheeler co"));*/

        /*Tkuck List 3*/
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite1, "3 w ape bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite2, "4 w bolero  bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite3, "4 wheeler 407 bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite4, "4 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite5, "6 wheeler big bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite6, "10 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite7, "12 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite8, "14 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.operwhite9, "18 wheeler bw"));
        /*truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow1, "3 w ape co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow2, "4 w bolero  co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow3, "4 wheeler 407 color"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow4, "4 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow5, "6 wheeler big co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow6, "10 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow7, "12 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.openyellow8, "14 wheeler co"));*/
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white1, "3 w ape bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white2, "4 w bolero  bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white3, "4 wheeler 407 bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white4, "4 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white5, "6 wheeler big bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white6, "10 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white7, "12 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white8, "14 wheeler bw"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.truck_container_white9, "18 wheeler bw"));
        /*truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck1, "3 w ape co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck2, "4 w bolero  co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck3, "4 wheeler 407 color"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck4, "4 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck5, "6 wheeler big co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck6, "10 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck7, "12 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck8, "14 wheeler co"));
        truckArrayList3.add(new TwoVariableModel(R.drawable.container_yellow_truck9, "18 wheeler co"));*/

        truckAdapter1 = new TruckAdapter(truckArrayList1, getActivity().getApplicationContext());
        LinearLayoutManager lm1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        truck_rclv1.setLayoutManager(lm1);
        truck_rclv1.setItemAnimator(new DefaultItemAnimator());
        truck_rclv1.setAdapter(truckAdapter1);
        truckAdapter1.notifyDataSetChanged();

        truckAdapter2 = new TruckAdapter(truckArrayList2, getActivity().getApplicationContext());
        truckAdapter3 = new TruckAdapter(truckArrayList3, getActivity().getApplicationContext());

        init();
    }

    private void init() {
        opentrucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentrucks.setBackgroundColor(getResources().getColor(R.color.yellow));
                containertrucks.setBackground(getResources().getDrawable(R.drawable.button_yellow_border));
                anytruck.setBackground(getResources().getDrawable(R.drawable.button_yellow_border));

                truck_rclv1.setAdapter(truckAdapter1);
                truckAdapter1.notifyDataSetChanged();
            }
        });
        containertrucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                containertrucks.setBackgroundColor(getResources().getColor(R.color.yellow));
                opentrucks.setBackground(getResources().getDrawable(R.drawable.button_yellow_border));
                anytruck.setBackground(getResources().getDrawable(R.drawable.button_yellow_border));

                truck_rclv1.setAdapter(truckAdapter2);
                truckAdapter2.notifyDataSetChanged();
            }
        });
        anytruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anytruck.setBackgroundColor(getResources().getColor(R.color.yellow));
                containertrucks.setBackground(getResources().getDrawable(R.drawable.button_yellow_border));
                opentrucks.setBackground(getResources().getDrawable(R.drawable.button_yellow_border));

                truck_rclv1.setAdapter(truckAdapter3);
                truckAdapter3.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.horizontal_rclv1:
                break;
        }
    }
}