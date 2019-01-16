package concertoapp.sttnf.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import concertoapp.sttnf.adapter.DoaAdapter;
import concertoapp.sttnf.R;
import concertoapp.sttnf.model.ModelDoa;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment {

    private List<ModelDoa> doas = new ArrayList<>();

    RecyclerView lstDoa;
    LinearLayoutManager linear;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_doa,container,false);
        lstDoa = (RecyclerView) view.findViewById(R.id.rvDoa);

        linear = new LinearLayoutManager(getActivity());
        lstDoa.setLayoutManager(linear);

        doasCollection();

        return view;


    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        //inflater.inflate(R.menu.menu_calls_, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }


    private void doasCollection(){
        doas.add(new ModelDoa(R.drawable.logo, "Tour Four Indonesia", "Paramore", "25 Agustus 2018", "ICE Tanggerang"));
        doas.add(new ModelDoa(R.drawable.logo, "Witness The Tour", "Katy Perry", "14 April 2018", "ICE Tanggerang"));
        doas.add(new ModelDoa(R.drawable.logo, "Not In This LifeTime Tour", "Guns N Roses", "08 November 2018", "GBK Jakarta"));
        doas.add(new ModelDoa(R.drawable.logo, "Liam Gallaghner of OASIS", "Liam Gallaghner", "08 Agustus 2018", "Ecovention Ancol"));
        doas.add(new ModelDoa(R.drawable.logo, "PSA Tour", "Fifth Harmony", "12 Maret 2018", "The Kasablanka Jakarta"));
        doas.add(new ModelDoa(R.drawable.logo, "The Chainsmokers Live in Concert", "The Chainsmokers", "30 Maret 2018", "JIEXPO Kemayoran Jakarta"));
        doas.add(new ModelDoa(R.drawable.logo, "Freedom Child Tour", "The Script", "10 April 2018", "The Kasablanka Jakarta"));
        doas.add(new ModelDoa(R.drawable.logo, "Australia & Asia Tour", "John Mayer", "23 September 2018", "ICE BSD Tanggerang"));
        doas.add(new ModelDoa(R.drawable.logo, "Voicenotes Tour", "Charlie Puth", "16 November 2018", "ICE BSD Tanggerang"));
        doas.add(new ModelDoa(R.drawable.logo, "Eyes On You Tour", "GOT7", "30 Juni 2018", "ICE BSD Tanggerang"));
        doas.add(new ModelDoa(R.drawable.logo, "In Your Area Tour", "BlackPink", "07 Desember 2018", "ICE BSD Tanggerang"));

        DoaAdapter adapter = new DoaAdapter(doas);

        lstDoa.setAdapter(adapter);

    }


}
