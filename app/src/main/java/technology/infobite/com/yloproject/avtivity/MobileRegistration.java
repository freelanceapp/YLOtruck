package technology.infobite.com.yloproject.avtivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import technology.infobite.com.yloproject.R;

public class MobileRegistration extends AppCompatActivity {

    private Button submitno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_registration);

        submitno = findViewById(R.id.submit_no);
        submitno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileRegistration.this, SlidingNavigation.class);
                startActivity(intent);
            }
        });
    }
}
