package com.example.gmail_interface;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

   List<ItemModel> items;

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public int getRandomColor(){
        Random rnd = new Random();
        return  rnd.nextInt(9);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Faker faker = new Faker();

        items = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            items.add(new ItemModel(faker.name().firstName(), faker.book().title(), faker.lorem().sentence(), "11:22 PM", getRandomColor()));
        }

        ItemAdapter adapter = new ItemAdapter(items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:
                displayToast(getString(R.string.action_search_massage));
                return true;
            default:
                //Do nothing
        }
        return super.onOptionsItemSelected(item);
    }
}