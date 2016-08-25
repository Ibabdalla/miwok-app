/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "lutti", R.raw.phrase_are_you_coming));
        words.add(new Word("two", "otiiko", R.raw.phrase_come_here));
        words.add(new Word("three", "tolookosu", R.raw.phrase_lets_go));
        words.add(new Word("one", "lutti", R.raw.phrase_are_you_coming));
        words.add(new Word("two", "otiiko", R.raw.phrase_come_here));
        words.add(new Word("three", "tolookosu", R.raw.phrase_lets_go));
        words.add(new Word("one", "lutti", R.raw.phrase_are_you_coming));
        words.add(new Word("two", "otiiko", R.raw.phrase_come_here));
        words.add(new Word("three", "tolookosu", R.raw.phrase_lets_go));
        Log.v("MAIN WORDS", words.toString());

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getMaudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}
