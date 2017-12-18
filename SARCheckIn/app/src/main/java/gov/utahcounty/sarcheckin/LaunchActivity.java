package gov.utahcounty.sarcheckin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchActivity extends AppCompatActivity {
    private Button check_on_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Boolean isGotennaSet = Boolean.valueOf(Utilities.readSharedSetting(LaunchActivity.this, Utilities.Preference.GOTENNA_SET, "false"));
        if (!isGotennaSet){
            Intent pairIntent = new Intent(LaunchActivity.this, OnboardingPairActivity.class);
            startActivity(pairIntent);
            finish();
        }else{
            setContentView(R.layout.activity_launch);

            check_on_button = findViewById(R.id.check_on_button);
            check_on_button.setTransformationMethod(null);
            check_on_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent homeScreenIntent = new Intent(LaunchActivity.this, HomeScreenActivity.class);
                    startActivity(homeScreenIntent);
                    finish();
                }
            });
        }
    }
}
