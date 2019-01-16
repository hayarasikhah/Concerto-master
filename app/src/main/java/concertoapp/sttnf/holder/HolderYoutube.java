package concertoapp.sttnf.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import concertoapp.sttnf.R;

/**
 * Created by Haya Rasikhah on 1/16/2019.
 */

public class HolderYoutube extends RecyclerView.ViewHolder {
    public WebView videoWeb;

    public HolderYoutube(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videoWebView);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {

            } );
        }
    }
