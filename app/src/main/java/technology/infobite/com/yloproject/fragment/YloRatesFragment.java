package technology.infobite.com.yloproject.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
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
import technology.infobite.com.yloproject.adapter.TruckDetailsScheduleAdapter;
import technology.infobite.com.yloproject.modal.SixVariableModel;
import technology.infobite.com.yloproject.modal.TwoVariableModel;


public class YloRatesFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    private RecyclerView yloratesrclv1, yloratesrclv2;
    private List<TwoVariableModel> truckhorizontalList = new ArrayList<>();
    private List<SixVariableModel> truckdetailsList = new ArrayList<>();

    public YloRatesFragment() {
    }

    public static YloRatesFragment newInstance(String param1, String param2) {
        YloRatesFragment fragment = new YloRatesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ylo_rates, container, false);
        yloratesrclv1 = view.findViewById(R.id.ylo_rates_rclv1);
        yloratesrclv2 = view.findViewById(R.id.ylo_rates_rclv2);
        // Horizontal Truck list here.
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow1, "3 w ape"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow2, "4 w bolero"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow3, "4 w 407"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow4, "4 wheeler"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow5, "6 wheeler"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow6, "10 wheeler"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow7, "12 wheeler"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow8, "14 wheeler"));
        truckhorizontalList.add(new TwoVariableModel(R.drawable.openyellow9, "18 wheeler"));
        TruckAdapter truckAdapter1 = new TruckAdapter(truckhorizontalList, getActivity());
        LinearLayoutManager lm1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        yloratesrclv1.setLayoutManager(lm1);
        yloratesrclv1.setItemAnimator(new DefaultItemAnimator());
        yloratesrclv1.setAdapter(truckAdapter1);
        //Vertical TruckDetails list here
        truckdetailsList.add(new SixVariableModel("ylo standart rates", "Base Fare", "Base Time", "per hours", "150.00", "120.00"));
        truckdetailsList.add(new SixVariableModel("ylo standart rates", "Base Fare", "Base Time", "per hours", "150.00", "120.00"));
        truckdetailsList.add(new SixVariableModel("ylo standart rates", "Base Fare", "Base Time", "per hours", "150.00", "120.00"));
        truckdetailsList.add(new SixVariableModel("ylo standart rates", "Base Fare", "Base Time", "per hours", "150.00", "120.00"));
        truckdetailsList.add(new SixVariableModel("ylo standart rates", "Base Fare", "Base Time", "per hours", "150.00", "120.00"));
        TruckDetailsScheduleAdapter truckDetailsSchedule = new TruckDetailsScheduleAdapter(truckdetailsList, getActivity());
        LinearLayoutManager lm2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        yloratesrclv2.setLayoutManager(lm2);
        yloratesrclv2.setItemAnimator(new DefaultItemAnimator());
        yloratesrclv2.setAdapter(truckDetailsSchedule);

        return view;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
