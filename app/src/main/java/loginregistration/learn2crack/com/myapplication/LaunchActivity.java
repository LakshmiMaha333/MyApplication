package loginregistration.learn2crack.com.myapplication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

public class LaunchActivity extends AppCompatActivity {

    ImageView imgFlight, imgLogo;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_launch);


        imgFlight = (ImageView) findViewById(R.id.imgFlight);
        imgLogo = (ImageView) findViewById(R.id.imgLogo);

        ObjectAnimator animFlight = ObjectAnimator.ofFloat(imgFlight,"y",1300f, -800f);
        animFlight.setDuration(5200);

        Display display = getWindowManager().getDefaultDisplay();
        float hgt = display.getHeight()/2;

        ObjectAnimator animLogo = ObjectAnimator.ofFloat(imgLogo,"y",1575f, hgt);
        animLogo.setDuration(3000);


        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animLogo,animFlight);
        animatorSet.start();


    }
}
