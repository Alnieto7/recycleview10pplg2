package com.example.recycleview10pplg2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleView = findViewById(R.id.titleView);
        TextView descriptionView = findViewById(R.id.descriptionView);
        ImageView imageView = findViewById(R.id.imageView);
        Button btnBack = findViewById(R.id.btnBack);

        // Ambil data dari Intent
        String title = getIntent().getStringExtra("TITLE_KEY");
        String description = getIntent().getStringExtra("DESCRIPTION_KEY");
        int imageResId = getIntent().getIntExtra("IMAGE_KEY", 0); // Default 0 jika tidak ada gambar

        // Tampilkan data di UI
        titleView.setText(title);
        descriptionView.setText(description);
        imageView.setImageResource(imageResId);

        // Event klik tombol kembali
        btnBack.setOnClickListener(view -> finish());
    }
}
