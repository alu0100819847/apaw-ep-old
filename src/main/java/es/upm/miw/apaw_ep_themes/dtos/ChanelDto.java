package es.upm.miw.apaw_ep_themes.dtos;

import es.upm.miw.apaw_ep_themes.entities.Chanel;


public class ChanelDto {

    private int id;

    private String name;

    private String description;

    private String topic;

    public ChanelDto(){}

    public ChanelDto(String name, String description, String topic){
        this.name = name;
        this.description = description;
        this.topic = topic;
    }

    public ChanelDto(Chanel chanel){
        this.name = chanel.getName();
        this.description = chanel.getDescription();
        this.topic = chanel.getTopic();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getTopic(){
        return this.topic;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "ChanelBasicDto{" +
                "id='" + id + '\'' +
                ", name='" + this.name + '\'' +
                ", description='" + this.description + '\'' +
                ", topic='" + this.topic + '\'' +
                '}';
    }
}
