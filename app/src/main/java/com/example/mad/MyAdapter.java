package com.example.mad;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

public interface MyAdapter {
    @NonNull
    View getConvertView(int position, @Nullable View convertView, @NonNull ViewGroup parent);
}
