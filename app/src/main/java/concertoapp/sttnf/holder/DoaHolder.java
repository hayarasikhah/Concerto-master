package concertoapp.sttnf;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import concertoapp.sttnf.model.ModelDoa;

public class DoaHolder extends RecyclerView.ViewHolder{

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;
    public View cardItemDoa;
    public TextView txtTanggal;
    public ImageView imgX;

    public DoaHolder(View itemView) {
        super(itemView);
        cardItemDoa = itemView.findViewById(R.id.carditem_doa);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_Nama_Doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_Arti_Doa);
        txtTanggal = (TextView) itemView.findViewById(R.id.txt_Tanggal);
        imgX = (ImageView) itemView.findViewById(R.id.img_view);
    }




}
