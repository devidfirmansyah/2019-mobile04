package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            String value1;
            String value2;
            int value3;
            Bundle bundle = getIntent().getExtras();
            value1 = bundle.getString("username") ;
            value2 = bundle.getString("name") ;
            value3 = bundle.getInt("age") ;

            usernameText.setText(value1);
            nameText.setText(value2);
            ageText.setText(String.valueOf(value3));
        }
    }
}
