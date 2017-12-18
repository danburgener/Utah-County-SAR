package gov.utahcounty.sarcheckin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OnboardingSetupActivity extends AppCompatActivity {
    private EditText nameText;
    private EditText phoneNumberText;
    private Button setGotennaIDButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_setup);

        nameText = findViewById(R.id.name_text);
        phoneNumberText = findViewById(R.id.phone_number_text);
        setGotennaIDButton = findViewById(R.id.set_gotenna_id_button);
        setGotennaIDButton.setTransformationMethod(null);
        setGotennaIDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean fieldsFilledOut = true;
                String name = nameText.getText().toString();
                String phone = phoneNumberText.getText().toString();
                if (name.trim().equals("")){
                    fieldsFilledOut = false;
                    Toast.makeText(OnboardingSetupActivity.this, R.string.name_missing, Toast.LENGTH_SHORT).show();
                }
                if (phone.trim().equals("")){
                    fieldsFilledOut = false;
                    Toast.makeText(OnboardingSetupActivity.this, R.string.phone_missing, Toast.LENGTH_SHORT).show();
                }
                if (fieldsFilledOut){
                    //TODO: Actually connect gotenna
                    Utilities.saveSharedSetting(OnboardingSetupActivity.this, Utilities.Preference.GOTENNA_SET, "true");
                    Intent launchIntent = new Intent(OnboardingSetupActivity.this, LaunchActivity.class);
                    startActivity(launchIntent);
                    finish();
                }
            }
        });
    }
}
