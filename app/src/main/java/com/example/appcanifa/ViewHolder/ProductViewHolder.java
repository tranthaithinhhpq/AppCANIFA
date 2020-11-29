package com.example.appcanifa.ViewHolder;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appcanifa.Interface.ItemClickListener;

public class ProductViewHolder<ItemClickListener> extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtProductName, txtProductDescription , txtProductPrice;
    public ImageView imageView;
    public ItemClickListener listner ;

    public ProductViewHolder(View itemView) {
        {
            super(itemView);


            imageView = (ImageView) itemView.findViewById(R.id.product_image);
            txtProductName = (TextView) itemView.findViewById(R.id.product_name);
            txtProductDescription = (TextView) itemView.findViewById(R.id.product_description);
            txtProductPrice = (TextView) itemView.findViewById(R.id.product_price);

        }
        public void setItemClickListener(ItemClickListener listner)
        {
            this.listner = listener;
        }
        @Override
        public void onClick(View view)
        {
            listner.onClick(view , getAdapterPosition (),false );
        }

    }

