package com.example.shoesapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        rv= findViewById(R.id.recyclerview_cart);
        List<Cart> cart = new ArrayList<>();
        cart.add(new Cart("Nike Air Jordan 1 Low GS ‘White Gym Red’ 553560-118 Like Auth Shoes", "đ 900.000","đ 880.000",R.drawable.nike_1));
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        CartAdapter adapter_cart = new CartAdapter(this, cart);
        rv.setAdapter(adapter_cart);
    }
}
