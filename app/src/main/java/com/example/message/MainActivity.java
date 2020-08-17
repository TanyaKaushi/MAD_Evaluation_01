package com.example.message;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle [] = {"chat1","chat2","chat 3"};
    String mDiscription[] = {"chat 1 discription","chat 2 discription","chat 3 discription",};
    int images[] = {R.drawable.bookcon,R.drawable.bookcon,R.drawable.bookcon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter( this,mTitle, mDiscription, images );
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            private int Position;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (Position == 0){
                    Toast.makeText(MainActivity.this,"chat 1 description",Toast.LENGTH_SHORT).show();
                }
                if (Position == 0){
                    Toast.makeText(MainActivity.this,"chat 2 description",Toast.LENGTH_SHORT).show();
                }
                if (Position == 0){
                    Toast.makeText(MainActivity.this,"chat 3 description",Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rdescription[];
        int rImgs[];

        MyAdapter (Context c, String title[],String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView, title);
            this.context = c;
            this.rTitle = title;
            this.rdescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rdescription[position]);



            return row;
        }
    }


}