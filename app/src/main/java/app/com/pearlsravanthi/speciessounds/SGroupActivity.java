package app.com.pearlsravanthi.speciessounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgroup);

        //Get calling intent and set title
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        this.setTitle(name);

        //Set "Play Song" button to show detailed view
        Button play_sound_button = (Button) findViewById(R.id.play_sound_button);
        play_sound_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGroupActivity.this, PlaySoundActivity.class);
                startActivity(intent);
            }
        });


    }

}
