package concertoapp.sttnf.model;

/**
 * Created by Haya Rasikhah on 1/16/2019.
 */

public class ModelYoutube {
    String videoUrl;

    public ModelYoutube(){

    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public ModelYoutube(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
