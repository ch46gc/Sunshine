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
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED(1) Create a field to store the weather display TextView
    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
       mWeatherTextView = findViewById(R.id.tv_weather_data);
        // COMPLETED (3) Create an array of Strings that contain fake weather data
       String[] dummyWeatherData = {
               "Today, July 8 - Clear -17°C / 15°C",
               "Tomorrow - Cloudy - 19°C / 15°C",
               "Wednesday - Rainy- 30°C / 11°C",
               "Thursday - Thunderstorms - 21°C / 9°C",
               "Friday - Thunderstorms - 16°C / 7°C",
               "Saturday - Rainy - 16°C / 8°C",
               "Sunday -Partly Cloudy - 15°C / 10°C",
               "Monday - Clear - 16°C / 18°C",
               "Tue, July 16 - Meatballs - 16°C / 18°C",
               "Wed, July 17 - Cloudy - 19°C / 15°C",
               "Thu, July 18 - Stormy - 30°C / 11°C",
               "Fri, July 19 - Hurricane - 21°C / 9°C",
               "Sat, July 20 - Meteors - 16°C / 7°C",
               "Sun, July 21 - Apocalypse - 16°C / 8°C",
               "Mon, July 22 - Post Apocalypse - 15°C / 10°C",
       };
        // COMPLETED(4) Append each String from the fake weather data array to the TextView
        for (String dummyWeatherDay : dummyWeatherData) {
            mWeatherTextView.append(dummyWeatherDay + "\n\n\n");
        }
    }
}