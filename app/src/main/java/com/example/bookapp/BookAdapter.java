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
        //View v = layoutInflater.inflate(R.layout.item_book, parent, false);
        View v = convertView;
        ViewHolder viewHolder = null;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            v = layoutInflater.inflate(R.layout.item_book, parent, false);

            viewHolder.txtBookName = v.findViewById(R.id.txt_book_name);
            viewHolder.txtAuthorName = v.findViewById(R.id.txt_book_author);
            viewHolder.ivBookImage = v.findViewById(R.id.iv_book_image);
            v.setTag(viewHolder);
        } else {
            // reuse of views
            viewHolder = (ViewHolder) v.getTag();
        }

        Book book = getItem(position);
        viewHolder.txtBookName.setText(book.getBookName());
        viewHolder.txtAuthorName.setText(book.getAuthorName());
        viewHolder.ivBookImage.setImageDrawable(getContext().getResources().getDrawable(book.getBookImage()));

        return v;
    }

    private static class ViewHolder {
        TextView txtBookName, txtAuthorName;
        ImageView ivBookImage;
    }
}
