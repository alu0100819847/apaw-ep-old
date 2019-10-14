package es.upm.miw.apaw_ep_themes.dtos;

import es.upm.miw.apaw_ep_themes.entities.Video;
import es.upm.miw.apaw_ep_themes.exceptions.BadRequestException;

public class VideoDto {

    String reference;

    String name;

    int reaction;

    Boolean publicVideo;

    public VideoDto(){ }

    public VideoDto(String name, Boolean publicVideo, int reaction){
        this.name = name;
        this.publicVideo = publicVideo;
        this.reaction = reaction;
    }

    public VideoDto(Video video){
        this.name = video.getName();
        this.publicVideo = video.getPublicVideo();
        this.reaction = video.getReaction();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Boolean getPublicVideo(){
        return this.publicVideo;
    }

    public void setPublicVideo(Boolean publicVideo){
        this.publicVideo = publicVideo;
    }

    public int getReaction(){
        return this.getReaction();
    }

    public void setReaction(int reaction){
        this.reaction = reaction;
    }

    public void validate() {
        if (this.name.length() == 0) {
            throw new BadRequestException("Incomplete ContactDto. ");
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + this.reference + '\'' +
                ", name=" + this.name +
                ", reaction='" + this.reaction + '\'' +
                '}';
    }
}
