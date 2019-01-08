package droidmentor.tabwithviewpager;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import droidmentor.tabwithviewpager.model.ModelDoa;

/**
 * Created by Haya Rasikhah on 1/7/2019.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<ModelDoa> doas;

    public DoaAdapter (List<ModelDoa>doas) {this.doas=doas;}

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_calls,null));
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNama());
        holder.txtArtiDoa.setText(doas.get(position).getArti());
        holder.txtTanggal.setText(doas.get(position).getTanggal());
       // holder.imgX.setImageResource(doas.get(position).getImg());



        holder.cardItemDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("id_nama", doas.get(position).getNama());
                i.putExtra("id_surah", doas.get(position).getSurah());
                i.putExtra("id_arti", doas.get(position).getArti());
                i.putExtra("id_img", doas.get(position).getImg());



                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}

class DoaHolder extends RecyclerView.ViewHolder{

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

