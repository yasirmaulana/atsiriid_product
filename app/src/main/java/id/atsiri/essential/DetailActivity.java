package id.atsiri.essential;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        String imageUrl = getIntent().getStringExtra("image_url");

        setImage(imageUrl);
    }

    private void setImage(String imageUrl) {
        ImageView image = findViewById(R.id.image_product);
        Glide.with(this)
                .load(imageUrl)
                .into(image);
    }
}
