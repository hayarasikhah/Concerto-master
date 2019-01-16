package concertoapp.sttnf.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Vector;

import concertoapp.sttnf.R;
import concertoapp.sttnf.model.ModelYoutube;

/**
 * Created by Haya Rasikhah on 1/16/2019.
 */

public class FragmentVideo extends Fragment {

    RecyclerView recyclerView;
    Vector<ModelYoutube> youtubeVideos = new Vector<ModelYoutube>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_singers,container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        recyclerView.setHasFixedSize(true);

        recyclerView = view.findViewById(R.id.recyclerSing);


        recyclerView.setLayoutManager( new LinearLayoutManager(getActivity()));

    }
}
