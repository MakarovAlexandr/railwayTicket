package com.example.railwayticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // определение полей
    private EditText nameIn; // поле имени
    private EditText startPlaceIn; // поле место отправления
    private EditText startTimeIn; // поле время отправления
    private EditText endPlaceIn; // поле места прибытия
    private Button button; // поле кнопки

    private String name; // поле хранения имени
    private String startPlace; // поле хранения места отправления
    private String startTime; // поле хранения времени отправления
    private String endPlace; // поле хранения места прибытия

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка id к полям
        nameIn = findViewById(R.id.nameIn);
        startPlaceIn = findViewById(R.id.startPlaceIn);
        startTimeIn = findViewById(R.id.startTimeIn);
        endPlaceIn = findViewById(R.id.endPlaceIn);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран и передача данных

            // считывание данных с экрана
            name = nameIn.getText().toString();
            startPlace = startPlaceIn.getText().toString();
            startTime = startTimeIn.getText().toString();
            endPlace = endPlaceIn.getText().toString();

            // создадим объект нашей сущности и через конструктор инициализируем его
            User user = new User(name, startPlace, startTime, endPlace);

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // запаковка данных в контейнер намерения
            intent.putExtra(User.class.getSimpleName(), user); // User.class.getSimpleName() является ключом для запаковки в контейнер

            // старт переключения активити и передачи данных
            startActivity(intent);
        }
    };
}