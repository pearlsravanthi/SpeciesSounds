package app.com.pearlsravanthi.speciessounds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get all genres (textviews)
        ViewGroup group = (ViewGroup)findViewById(R.id.activity_main);
        View v;
        for(int i = 0; i < group.getChildCount(); i++) {
            v = group.getChildAt(i);
            if(v instanceof TextView) {
                v.setOnClickListener(new View.OnClickListener(){
                    @Override
                    // Set onClick listener on all textviews and send name/id info to called view
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, SGroupActivity.class);
                        intent.putExtra("id", view.getId());
                        intent.putExtra("name", ((TextView) findViewById(view.getId())).getText());
                        startActivity(intent);
                    }
                });
            }
        }

    }
}
