package pligos.lesson26;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ActivityTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvTime = (TextView) findViewById(R.id.tvTime);
        tvTime.setText(time);
    }
}