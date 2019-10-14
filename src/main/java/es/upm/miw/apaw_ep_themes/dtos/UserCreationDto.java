package es.upm.miw.apaw_ep_themes.dtos;

public class UserCreationDto {
    private int id;

    private int chanelId;

    public UserCreationDto(){}

    public UserCreationDto(int chanelId, int id){
        this.id = id;
        this.chanelId = chanelId;
    }

    public int getChanelId(){
        return this.chanelId;
    }

    public void setChanelId(int chanelId){
        this.chanelId = chanelId;
    }

    @Override
    public String toString() {
        return "UserCreationDto{" +
                "id='" + this.id + '\'' +
                ", chanelId='" + this.chanelId + '\'' +
                '}';
    }
}
