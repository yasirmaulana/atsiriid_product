package id.atsiri.essential;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewProductAdapter extends RecyclerView.Adapter<CardViewProductAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Product> lisProduct;
    private ArrayList<Product> getLisProduct() {
        return lisProduct;
    }
    public void setLisProduct(ArrayList<Product> lisProduct) {
        this.lisProduct = lisProduct;
    }
    public CardViewProductAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewProductAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_product, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewProductAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        Product p = getLisProduct().get(i);
        final String photoUrl = p.getPhoto();
        final String productTitle = p.getName();
        final String productPrice = p.getPrice();
        final String manfaatUtama = p.getManfaatutama();
        final String manfaatLain = p.getManfaatlain();

        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvRemarks.setText(p.getRemark());
        cardViewViewHolder.btnAddToCart.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Add to Cart "+getLisProduct().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewViewHolder.btnBuy.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Buy "+getLisProduct().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewViewHolder.cardView.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
//                Toast.makeText(context, "on click carview coy ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image_url", photoUrl);
                intent.putExtra("product_title", productTitle);
                intent.putExtra("product_price", productPrice);
                intent.putExtra("manfaat_utama", manfaatUtama);
                intent.putExtra("manfaat_lain", manfaatLain);
                context.startActivity(intent);
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getLisProduct().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnAddToCart, btnBuy;
        CardView cardView;

        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnAddToCart = itemView.findViewById(R.id.btn_addto_cart);
            btnBuy = itemView.findViewById(R.id.btn_buy);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
