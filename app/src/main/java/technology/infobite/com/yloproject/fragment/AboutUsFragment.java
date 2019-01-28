package technology.infobite.com.yloproject.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import technology.infobite.com.yloproject.R;

public class AboutUsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView textView1,textView2,textView3,visibletv1,visibletv2,visibletv3;
    private boolean check=false;

    private OnFragmentInteractionListener mListener;

    public AboutUsFragment() {
    }

    public static AboutUsFragment newInstance(String param1, String param2) {
        AboutUsFragment fragment = new AboutUsFragment();
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
       View view  =  inflater.inflate(R.layout.fragment_about_us, container, false);
       textView1 = view.findViewById(R.id.onclicklayout1);
       textView2 = view.findViewById(R.id.onclicklayout2);
       textView3 = view.findViewById(R.id.onclicklayout3);
       visibletv1= view.findViewById(R.id.visible1_tv1);
       visibletv2 = view.findViewById(R.id.visible1_tv2);
       visibletv3 = view.findViewById(R.id.visible1_tv3);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check){
                    check = false;
                    visibletv1.setVisibility(View.GONE);
                    textView1.setCompoundDrawablesWithIntrinsicBounds( 0, 0, R.drawable.ic_expand_more_black,0);

                }else {
                    check = true;
                    visibletv1.setVisibility(View.VISIBLE);
                    textView1.setCompoundDrawablesWithIntrinsicBounds( 0, 0, R.drawable.ic_expand_less_black,0);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check){
                    check = false;
                    visibletv2.setVisibility(View.GONE);
                    textView2.setCompoundDrawablesWithIntrinsicBounds( 0, 0, R.drawable.ic_expand_more_black,0);

                }else {
                    check = true;
                    visibletv2.setVisibility(View.VISIBLE);
                    textView2.setCompoundDrawablesWithIntrinsicBounds( 0, 0, R.drawable.ic_expand_less_black,0);
                }
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check){
                    check = false;
                    visibletv3.setVisibility(View.GONE);
                    textView3.setCompoundDrawablesWithIntrinsicBounds( 0, 0, R.drawable.ic_expand_more_black,0);

                }else {
                    check = true;
                    visibletv3.setVisibility(View.VISIBLE);
                    textView3.setCompoundDrawablesWithIntrinsicBounds( 0, 0, R.drawable.ic_expand_less_black,0);
                }
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
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
