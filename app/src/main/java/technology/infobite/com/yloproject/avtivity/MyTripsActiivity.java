package technology.infobite.com.yloproject.avtivity;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import technology.infobite.com.yloproject.R;

import static technology.infobite.com.yloproject.R.id.bottom_sheet;

public class MyTripsActiivity extends AppCompatActivity {

    private Button viewreceipt,close_bottomsheet;
    private LinearLayout bottsheet;
    private BottomSheetBehavior bottomSheetBehavior;
    private Boolean check = false;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trips_actiivity);

        viewreceipt = findViewById(R.id.view_reciept);
        bottsheet = findViewById(R.id.bottom_sheet);
        close_bottomsheet = findViewById(R.id.close_bottomsheet);

      //  bottomSheetBehavior = BottomSheetBehavior.from(bottsheet);
        viewreceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check){
                    check = false;
                    bottsheet.setVisibility(View.GONE);
                }else{
                    check = true;
                    bottsheet.setVisibility(View.VISIBLE);
                }
            }
        });
        close_bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check){
                    check = false;
                    bottsheet.setVisibility(View.GONE);
                }else{
                    check = true;
                    bottsheet.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
