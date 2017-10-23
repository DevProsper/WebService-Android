package cg.hackaton.dev.webservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView NumberOfSong, NameOfSong;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView)findViewById(R.id.image_header);
        NameOfSong = (TextView)findViewById(R.id.nameofsong);
        NumberOfSong = (TextView)findViewById(R.id.number_song);

        String songname = getIntent().getExtras().getString("name");
        String numofsong = getIntent().getExtras().getString("numOfSongs");
        String thumbnail = getIntent().getExtras().getString("thumbnail");

        NameOfSong.setText(songname);
        NumberOfSong.setText(numofsong);
        Glide.with(this)
                .load(thumbnail)
                .placeholder(R.drawable.album1)
                .into(imageView);

        getSupportActionBar().setTitle("Detail Activity");
    }
}
