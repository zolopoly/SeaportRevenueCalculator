package ru.kuzinatra.seaportrevenuecalculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.kuzinatra.seaportrevenuecalculator.entity.Income;
import ru.kuzinatra.seaportrevenuecalculator.entity.SeaPortRentAreasIncome;
import ru.kuzinatra.seaportrevenuecalculator.entity.SeaPortShipsMaintenanceIncome;

public class MainActivity extends AppCompatActivity {
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Income income1 = new SeaPortShipsMaintenanceIncome("Обслуживание морских судов",
                125, 3500);
        Income income2 = new SeaPortRentAreasIncome("Аренда площадей порта",
                170_000);

        output = findViewById(R.id.output);
        output.setText("- Всего: ");
        output.append(String.valueOf(income1.compute() + income2.compute()));
        output.append(" монет.\n\n- ");
        output.append(income1.getIncomeName());
        output.append(": ");
        output.append(String.valueOf(income1.compute()));
        output.append(" монет.\n\n- ");
        output.append(income2.getIncomeName());
        output.append(": ");
        output.append(String.valueOf(income2.compute()));
        output.append(" монет.");
    }
}