package droidmentor.tabwithviewpager.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import droidmentor.tabwithviewpager.DoaAdapter;
import droidmentor.tabwithviewpager.R;
import droidmentor.tabwithviewpager.model.ModelDoa;

/**
 * Created by Haya Rasikhah on 1/7/2019.
 */

public class Doa extends Fragment {
    private List<ModelDoa> doas = new ArrayList<>();

    RecyclerView lstDoa;
    LinearLayoutManager linear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_doa,container,false);
        lstDoa = (RecyclerView) view.findViewById(R.id.rvDoa);

        linear = new LinearLayoutManager(getActivity());
        lstDoa.setLayoutManager(linear);

      /**  doasCollection(); **/

        return view;
    }

    /*
    private void doasCollection(){
        doas.add(new ModelDoa("Doa Belajar", "طَلَبُ الْعِلْمِ فَرِيْضَةٌ عَلَى كُلِّ مُسْلِمٍ وَمُسْلِمَةٍ", "Mencari ilmu itu wajib bagi setiap muslim laki-laki maupun perempuan."));
        doas.add(new ModelDoa( "Doa Makan", "الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ", "Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam"));
        doas.add(new ModelDoa( "Doa Tidur", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "Dengan menyebut Nama-Mu Ya Allah Aku Hidup dan dengan menyebut Nama-Mu Aku Mati"));
        doas.add(new ModelDoa( "Doa Ketika Makan Lupa Membaca Doa", "بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ", "Dengan menyebut nama Allah pada awal dan akhirnya"));
        doas.add(new ModelDoa( "Doa Ketika Mimpi Buruk", "اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ", "Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk"));
        doas.add(new ModelDoa( "Doa Ketika Mendapat Mimpi Baik", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "Segala puji bagi Allah yang telah memberi hajatku"));
        doas.add(new ModelDoa( "Doa Masuk Kamar Mandi", "باَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ", "Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan syetan perempuan"));
        doas.add(new ModelDoa( "Doa Istinja", "اَللّٰهُمَّ طَهِّرُ قَلْبِىْ مِنَ النِّفَاقِ وَحَصِّنْ فَرْخِىْ مِنَ الْفَوَاحِشِ", "Wahai Tuhanku, sucikanlah hatiku dari sifat kepura-puraan (munafiq) serta peliharalah kemaluanku dari perbuatan keji"));
        doas.add(new ModelDoa("Doa Menjelang Sholat Subuh", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "Ya Allah! Sesungguhnya aku berlindung kepada-Mu dari kesempitan dunia dan kesempitan hari kiamat"));
        doas.add(new ModelDoa("Doa Menyambut Pagi hari", "اَللّٰهُمَّ بِكَ اَصْبَحْنَا وَبِكَ اَمْسَيْنَا وَبِكَ نَحْيَا وَبِكَ نَمُوْتُ وَاِلَيْكَ النُّشُوْرُ", "Ya Allah, karena Engkau kami mengalami waktu pagi dan waktu petang, dan karena Engkau kami hidup dan mati dan kepada-Mu juga kami akan kembali."));
        doas.add(new ModelDoa("Doa Ketika Bercermin", "اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ", "Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku"));

        DoaAdapter adapter = new DoaAdapter(doas);

        lstDoa.setAdapter(adapter);

    } */
}