package pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.com.e_kontrolarodzicielska.kontrolarodzicielska.R;

/**
 * Created by GBAR on 24.10.2016.
 */


public class SplashScreen extends Activity implements View.OnClickListener {

    @BindView(R.id.splashScreen)
    ImageView splashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        ButterKnife.bind(this);

        splashScreen.setOnClickListener(this);

    }

    private void showMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View view) {
        showMainActivity();
    }
}
