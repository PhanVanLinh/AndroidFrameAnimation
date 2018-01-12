package toong.vn.androidframeanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageWalker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageWalker = findViewById(R.id.image_walker);

        findViewById(R.id.button_start_frame_animation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final AnimationDrawable animationDrawable =
                                (AnimationDrawable) imageWalker.getDrawable();
                        if(!animationDrawable.isRunning()) {
                            int duration = 0;
                            for(int i = 0; i < animationDrawable.getNumberOfFrames(); i++){
                                duration += animationDrawable.getDuration(i);
                            }
                            animationDrawable.start();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    animationDrawable.stop();
                                }
                            }, duration);
                        }
                    }
                });
    }
}
