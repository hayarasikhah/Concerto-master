package droidmentor.tabwithviewpager;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Haya Rasikhah on 1/7/2019.
 */

public class DetailActivity extends Activity {


    TextView txtDetailJudul, txtDetailAyat, txtDetailArti;
    ImageView imgSantuy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetailJudul = (TextView) findViewById(R.id.txt_detail_judul);
        txtDetailAyat = (TextView) findViewById(R.id.txt_detail_ayat);
        txtDetailArti = (TextView) findViewById(R.id.txt_detail_arti);
        imgSantuy = (ImageView) findViewById(R.id.img_view);

        getData();
    }

    private void getData() {
        txtDetailJudul.setText(getIntent().getStringExtra("id_nama"));
        txtDetailAyat.setText(getIntent().getStringExtra("id_surah"));
        txtDetailArti.setText(getIntent().getStringExtra("id_arti"));
        imgSantuy.setImageResource(getIntent().getIntExtra("id_img", 0));
    }
}
