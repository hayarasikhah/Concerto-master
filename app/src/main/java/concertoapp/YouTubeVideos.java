package concertoapp;

/**
 * Created by Haya Rasikhah on 1/16/2019.
 */

public class YouTubeVideos {
    String videoUrl;

    public YouTubeVideos() {
    }

    public YouTubeVideos(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}