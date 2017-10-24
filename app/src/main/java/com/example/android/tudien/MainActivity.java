package com.example.android.tudien;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Đặt nội dung của activity để dùng trong activity_main.xml layout
        setContentView(R.layout.activity_main);

        // Tìm view hiển thị item số
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Đặt một clicklistenr trên TextView numbers
        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Tạo một Intent để mở NumbersActivity
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start NumberActivity
                startActivity(numbersIntent);


                // Tìm view hiển thị item gia đình
                TextView family = (TextView) findViewById(R.id.family);

                // Đặt một clicklistenr trên TextView family
                family.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        // Tạo một Intent để mở FamilyActivity
                        Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                        // Start FamilyActivity
                        startActivity(familyIntent);


                        // Tìm view hiển thị item màu sắc
                        TextView colors = (TextView) findViewById(R.id.colors);

                        // Đặt một clicklistenr trên TextView colors
                        colors.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                // Tạo một Intent để mở ColorsActivity
                                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                                // Start ColorsActivity
                                startActivity(colorsIntent);


                                // Tìm view hiển thị item cụm từ
                                TextView phrase = (TextView) findViewById(R.id.phrase);

                                // Đặt một clicklistenr trên TextView phrase
                                phrase.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View view) {
                                        // Tạo một Intent để mở PhraseActivity
                                        Intent phraseIntent = new Intent(MainActivity.this, PhraseActivity.class);

                                        // Start PhrasesActivity
                                        startActivity(phraseIntent);


                                    }

                                });


                            }

                        });

                    }

                });


            }

        });
    }
}





