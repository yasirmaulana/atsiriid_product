package id.atsiri.essential;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvCategory;
    private ArrayList<Product> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(ProductData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewProductAdapter cardViewProductAdapter = new CardViewProductAdapter(this);
        cardViewProductAdapter.setLisProduct(list);
        rvCategory.setAdapter(cardViewProductAdapter);
    }

    @Override
    public void onClick(View v) {

    }
}
