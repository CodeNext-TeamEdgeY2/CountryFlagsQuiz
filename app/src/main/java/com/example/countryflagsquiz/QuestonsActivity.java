package com.example.countryflagsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.TreeMap;

import static com.example.countryflagsquiz.randomCountryCode.CountryCodes;
import static com.example.countryflagsquiz.randomCountryCode.getRandomCountryCode;
import static com.example.countryflagsquiz.randomCountryCode.getRandomCountryName;

public class QuestonsActivity extends AppCompatActivity {

    ImageView picture;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questons);

        picture = findViewById(R.id.countryFlag);
        Picasso.get().load("https://www.countryflags.io/" + "AU/flat/64.png").into(picture);

        answer1 = findViewById(R.id.answer1);
        getRandomCountryName().equals(String.valueOf(answer1));

        answer2 = findViewById(R.id.answer2);
        getRandomCountryName().equals(String.valueOf(answer2));

        answer3 = findViewById(R.id.answer3);
        getRandomCountryName().equals(String.valueOf(answer3));

        answer4 = findViewById(R.id.answer4);
        getRandomCountryName().equals(String.valueOf(answer4));
    }


}