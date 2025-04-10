package com.example.recycleview10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<ItemModel> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Menambahkan data menu makanan
        itemList = new ArrayList<>();
        itemList.add(new ItemModel("Nasi Goreng", "Rp 15.000", R.drawable.nasgor));
        itemList.add(new ItemModel("Nasi Goreng", "Rp 15.000", R.drawable.nasgor));
        itemList.add(new ItemModel("Mie Goreng", "Rp 10.000", R.drawable.mi));
        itemList.add(new ItemModel("Mie Goreng", "Rp 10.000", R.drawable.mi));
        itemList.add(new ItemModel("Mie Goreng", "Rp 10.000", R.drawable.mi));
        itemList.add(new ItemModel("Mie Goreng", "Rp 10.000", R.drawable.mi));
        itemList.add(new ItemModel("Seblak", "Rp 8.000", R.drawable.ceblak));
        itemList.add(new ItemModel("Seblak", "Rp 8.000", R.drawable.ceblak));
        itemList.add(new ItemModel("Bakso", "Rp 12.000", R.drawable.ravatar));
        itemList.add(new ItemModel("Bakso", "Rp 12.000", R.drawable.ravatar));

        // Inisialisasi adapter dengan event klik yang mengarah ke DetailActivity
        adapter = new ItemAdapter(this, itemList, item -> {
            // Menampilkan Toast
            Toast.makeText(MainActivity.this, "Kamu memilih " + item.getJudul(), Toast.LENGTH_SHORT).show();

            // Berpindah ke DetailActivity dengan mengirim data
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("TITLE_KEY", item.getJudul());
            intent.putExtra("DESCRIPTION_KEY", item.getDeskripsi());
            intent.putExtra("IMAGE_KEY", item.getImageResId());
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);
    }
}
