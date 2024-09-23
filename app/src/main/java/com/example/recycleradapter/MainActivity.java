package com.example.recycleradapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       Model[] models=new Model[]{
               new Model(R.drawable.baseline_wallpaper_24,"Gallery"),
               new Model(R.drawable.baseline_wallpaper_24,"Gallery"),
               new Model(R.drawable.baseline_wallpaper_24,"Gallery"),
               new Model(R.drawable.baseline_wallpaper_24,"Gallery")
       };
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        Adapter adapter=new Adapter(models);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);

    }
}