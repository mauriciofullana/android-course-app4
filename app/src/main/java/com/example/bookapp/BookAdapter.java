package com.example.bookapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(@NonNull Context context, int resource, ArrayList<Book> books) {
        super(context, resource, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View v = layoutInflater.inflate(R.layout.item_book, parent, false);

        TextView txtBookName = v.findViewById(R.id.txt_book_name);
        TextView txtAuthorName = v.findViewById(R.id.txt_book_author);
        ImageView ivBookImage = v.findViewById(R.id.iv_book_image);

        Book book = getItem(position);
        txtBookName.setText(book.getBookName());
        txtAuthorName.setText(book.getAuthorName());
        ivBookImage.setImageDrawable(getContext().getResources().getDrawable(book.getBookImage()));

        return v;
    }
}
