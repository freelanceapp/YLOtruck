package technology.infobite.com.yloproject.avtivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import technology.infobite.com.yloproject.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView imageView;
    private RelativeLayout way;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        way = findViewById(R.id.way);
        imageView = findViewById(R.id.delivery_truck);

        way.scrollTo(0, 150);
        TranslateAnimation animation = new TranslateAnimation(0.0f, 1500.0f,
                0.0f, 0.0f);
        animation.setDuration(9000);
        imageView.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, WelcomeSrceenActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

    }
}
