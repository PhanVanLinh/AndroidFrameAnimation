package toong.vn.androidframeanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
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
        ((AnimationDrawable) imageWalker.getDrawable()).stop();

        findViewById(R.id.button_start_frame_animation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final AnimationDrawable animationDrawable =
                                (AnimationDrawable) imageWalker.getDrawable();
                        animationDrawable.stop();
                        animationDrawable.start();
                    }
                });

        findViewById(R.id.button_stop_frame_animation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final AnimationDrawable animationDrawable =
                                (AnimationDrawable) imageWalker.getDrawable();
                        animationDrawable.stop();
                    }
                });
    }
}
