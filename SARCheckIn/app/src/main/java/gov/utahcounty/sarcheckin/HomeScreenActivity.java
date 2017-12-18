package gov.utahcounty.sarcheckin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeScreenActivity extends AppCompatActivity {
    private Button setCPButton;
    private Button startTrackingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        setCPButton = findViewById(R.id.set_cp_button);
        setCPButton.setTransformationMethod(null);
        setCPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeScreenActivity.this, R.string.set_cp, Toast.LENGTH_SHORT).show();
            }
        });
        startTrackingButton = findViewById(R.id.start_tracking_button);
        startTrackingButton.setTransformationMethod(null);
        startTrackingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeScreenActivity.this, R.string.start_tracking, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
