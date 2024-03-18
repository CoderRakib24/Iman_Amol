package com.coderfaysal.iman;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleView);


        hashMap = new HashMap<>();
        hashMap.put("title", "ঈমান কি?");
        hashMap.put("message", "ঈমান শব্দের অর্থ বিশ্বাস।\n" +
                "শরীয়তের পরিভাষায়, হযরত মুহাম্মদ (সা:) আল্লাহর পক্ষ থেকে যা কিছু নিয়ে এসেছেন তা সহ তার প্রতি আস্থাশীল হয়ে মনেপ্রাণে বিশ্বাস করা কে ঈমান বলে।\n" +
                "প্রকৃত অর্থে আল্লাহ তায়ালা, নবী-রাসুল, ফেরেশতা, আখিরাত, তাকদির ইত্যাদি বিষয় মনে প্রানে বিশ্বাস করা ও মেনে চলাই হল ইমান। যে ব্যক্তি এই সকল বিষয়কে আন্তরিকভাবে বিশ্বাস করেন তিনি মুমিন। ইমান ও মুমিন শব্দ দুটি একটি আরেকটির পরিপূরক। যদি কেউ অন্তরে বিশ্বাস না করে সে ইমান আনোয়নে ব্যর্থ এবং যে ব্যক্তি ইমান আনয়নে ব্যর্থ সে মুমিন নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঈমানের তিনটি প্রধান দিকঃ?");
        hashMap.put("message", "১। অন্তরে বিশ্বাস করা,\n" +
                "২। মুখে স্বীকার করা এবং\n" +
                "৩। সে অনুযায়ী আমল করা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঈমানের সাতটিি স্তম্ভ হচ্ছেঃ");
        hashMap.put("message", "১। একক ইলাহ হিসেবে আল্লাহকে বিশ্বাস করা।\n" +
                "২। আল্লাহর ফেরেশতাদের প্রতি বিশ্বাস করা।\n" +
                "৩। সমস্ত আসমানী কিতাব সমূহতে বিশ্বাস। \n" +
                "৪। সকল নবী ও রাসূলগণের প্রতি বিশ্বাস। \n" +
                "৫।তাক্বদীর বা ভালো মন্দের ওপর আল্লাহর ক্ষমতা রয়েছে বলে বিশ্বাস করা। \n" +
                "৬।আখিরাত বা পরকালের প্রতি বিশ্বাস। \n" +
                "৭।মৃত্যুর পর পুনঃজীবিত হওয়ার প্রতি বিশ্বাস।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঈমানের গুরুত্ব");
        hashMap.put("message", "ইসলামের ঈমানের গুরুত্ব অপরিসীম। এর প্রধান কয়েকটি নিম্নে দেওয়া হল-\n" +
                "এটি ব্যতীত মানব জীবন মূল্যহীন। কেননা ঈমান ইসলামের মূল ভিত্তি। \n" +
                "মহান আল্লাহ তা’য়ালা সমগ্র মানবমন্ডলীকে সৃষ্টি করার পর ,তার প্রতি ঈমান আনার নির্দেশ দিয়েছেন এ কারণে ঈমানের গুরুত্ব অপরিসীম। \n" +
                "ইহকালীন কল্যাণ মহান আল্লাহর সন্তুষ্টির জন্য এর গুরুত্ব অনস্বীকার্য।\n" +
                "এটি ব্যতীত কোন আমলই আল্লাহ তাআলার নিকট গ্রহণযোগ্য হবে না। তাই পরকালীন মুক্তির জন্য এর গুরুত্ব অপরিসীম। \n" +
                "ইমান মানবতার সোপান। কেননা এটি ব্যতীত কেউ নিজের অস্তিত্ব কল্পনা করতে পারে না। \n" +
                "আল্লাহর উপর বিশ্বাস স্থাপন ব্যতীত কেউ সফলতা লাভ করতে পারবে না। দৃষ্টিকোণ থেকে এটি হল মনুষ্যত্বের চালিকাশক্তি।");
        arrayList.add(hashMap);



        XAdapter xAdapter = new XAdapter();
        recyclerView.setAdapter(xAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }


    private class XAdapter extends RecyclerView.Adapter<XAdapter.XViewHolder>{


        @NonNull
        @Override
        public XViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.items, parent, false );
            return new XViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull XViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String message = hashMap.get("message");

            holder.textView.setText(title);

            holder.cardView.setOnClickListener(view -> {
                Details.TITLE = title;
                Details.MESSAGE = message;
                startActivity(new Intent(MainActivity.this, Details.class));
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class XViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cardView;

            public XViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.textView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }

    }






}