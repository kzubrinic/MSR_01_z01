package hr.unidu.kz.msr_zadatak_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView pozdrav;
    private EditText ime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pozdrav = findViewById(R.id.poruka);
        ime = findViewById(R.id.ime);
    }

    public void pozdravi(View view) {
        if (ime.getText().toString().length() < 1) {
            Toast.makeText(this, "Morate unijeti ime prijatelja!", Toast.LENGTH_LONG).show();
            return;
        }
        pozdrav.setText("Dobar dan " +ime.getText().toString());

    }
}
