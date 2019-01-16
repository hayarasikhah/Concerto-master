package concertoapp.sttnf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


/**
 * Created by Haya Rasikhah on 1/7/2019.
 */

public class DetailActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    TextView txtDetailJudul, txtDetailAyat, txtDetailArti;
    ImageView imgSantuy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singers);


        setContentView(R.layout.activity_detail);

        txtDetailJudul = (TextView) findViewById(R.id.txt_detail_judul);
        txtDetailAyat = (TextView) findViewById(R.id.txt_detail_ayat);
        txtDetailArti = (TextView) findViewById(R.id.txt_detail_arti);
        imgSantuy = (ImageView) findViewById(R.id.img_view);

        getData();

      //  youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
       // youTubeView.initialize(Config.YOUTUBE_API_KEY, this);

    }

    private void getData() {
        txtDetailJudul.setText(getIntent().getStringExtra("id_nama"));
        txtDetailAyat.setText(getIntent().getStringExtra("id_surah"));
        txtDetailArti.setText(getIntent().getStringExtra("id_arti"));
        imgSantuy.setImageResource(getIntent().getIntExtra("id_img", 0));
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }


    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return youTubeView;
    }



}

