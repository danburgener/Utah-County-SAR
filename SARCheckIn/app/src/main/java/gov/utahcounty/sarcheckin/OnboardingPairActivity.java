package gov.utahcounty.sarcheckin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnboardingPairActivity extends AppCompatActivity {
    private Button pairGotennaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_pair);

        pairGotennaButton = (Button) findViewById(R.id.pair_gotenna_button);
        pairGotennaButton.setTransformationMethod(null);
        pairGotennaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent gotennaSetupIntent = new Intent(OnboardingPairActivity.this, OnboardingSetupActivity.class);
                startActivity(gotennaSetupIntent);
            }
        });
    }
}
