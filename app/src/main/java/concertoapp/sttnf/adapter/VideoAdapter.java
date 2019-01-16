package concertoapp.sttnf.adapter;

/**
 * Created by Haya Rasikhah on 1/16/2019.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

import concertoapp.YouTubeVideos;
import concertoapp.sttnf.R;
import concertoapp.sttnf.holder.HolderYoutube;

public class VideoAdapter extends RecyclerView.Adapter<HolderYoutube> {

    List<YouTubeVideos> youtubeVideoList;

    public VideoAdapter() {
    }

    public VideoAdapter(List<YouTubeVideos> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    @Override
    public HolderYoutube onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.fragment_singer, parent, false);

        return new HolderYoutube(view);

    }

    @Override
    public void onBindViewHolder(HolderYoutube holder, int position) {

        holder.videoWeb.loadData( youtubeVideoList.get(position).getVideoUrl(), "text/html" , "utf-8" );

    }



    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }
}
