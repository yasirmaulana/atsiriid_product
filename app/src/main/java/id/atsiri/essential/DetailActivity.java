package id.atsiri.essential;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

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
        String productTitle = getIntent().getStringExtra("product_title");
        String productPrice = getIntent().getStringExtra("product_price");
        String manfaatUtama = getIntent().getStringExtra("manfaat_utama");
        String manfaatLain = getIntent().getStringExtra("manfaat_lain");
        setImage(imageUrl, productTitle, productPrice, manfaatUtama, manfaatLain);
    }

    private void setImage(String imageUrl, String productTitle, String productPrice, String manfaatUtama, String manfaatLain) {
        ImageView image = findViewById(R.id.image_product);
        Glide.with(this)
                .load(imageUrl)
                .into(image);

        TextView title = findViewById(R.id.image_description);
        title.setText(productTitle);

        TextView price = findViewById(R.id.product_price);
        price.setText(productPrice);

        TextView manfUtama = findViewById(R.id.manfaat_utama);
        manfUtama.setText(manfaatUtama);

        TextView manfLain = findViewById(R.id.manfaat_lain);
        manfLain.setText(manfaatLain);
    }
}
