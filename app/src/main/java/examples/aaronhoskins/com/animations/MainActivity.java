package examples.aaronhoskins.com.animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvBlinking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBlinking = findViewById(R.id.tvBlinking);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
        tvBlinking.startAnimation(animation1);

        //startActivity(new Intent());
        //overridePendingTransition(R.anim.slideUp, R.anim.slideDown);



    }
}
