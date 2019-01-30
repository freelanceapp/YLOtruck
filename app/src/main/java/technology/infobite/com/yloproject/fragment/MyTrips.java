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
import technology.infobite.com.yloproject.adapter.MyTripAdapter;
import technology.infobite.com.yloproject.adapter.TruckAdapter;
import technology.infobite.com.yloproject.modal.FivVariableModel;


public class MyTrips extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private RecyclerView mytripsrclv;
    private List<FivVariableModel> mytriparrrayList = new ArrayList<>();

    public MyTrips() {
        // Required empty public constructor
    }

    public static MyTrips newInstance(String param1, String param2) {
        MyTrips fragment = new MyTrips();
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
        View view = inflater.inflate(R.layout.fragment_my_trips, container, false);
        mytripsrclv = view.findViewById(R.id.rclv_mytrips);

        mytriparrrayList.add(new FivVariableModel(R.drawable.openyellow1,"truck 1","6434636",
                "250","12 jan 2019","12:40"));
        mytriparrrayList.add(new FivVariableModel(R.drawable.openyellow2,"truck 2","6434636",
                "250","12 jan 2019","12:40"));
        mytriparrrayList.add(new FivVariableModel(R.drawable.openyellow3,"truck 3","6434636",
                "250","12 jan 2019","12:40"));

        MyTripAdapter myTripAdapter = new MyTripAdapter(mytriparrrayList, getActivity());
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        mytripsrclv.setLayoutManager(lm);
        mytripsrclv.setItemAnimator(new DefaultItemAnimator());
        mytripsrclv.setAdapter(myTripAdapter);
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
