package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Book> books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        books = new ArrayList<>();
        books.add(new Book("Cosmic connection", "Carl Sagan", R.drawable.cosmis_connection));
        books.add(new Book("Hamlet", "William Shakespeare", R.drawable.hamlet));
        books.add(new Book("The intelligent investor", "Benjamin Graham", R.drawable.intelligent_investor));
        books.add(new Book("The Power of Habit", "Charles Duhigg", R.drawable.power_of_habbit));
        books.add(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", R.drawable.rich_dad_poor_dad));


    }
}