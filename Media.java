interface playable{
    void play();
    void stop();
}
class audiofile implements playable{
    public void play(){
        System.out.println("audio playing");
    }
    public void stop(){
        System.out.println("audio stopped");
    }
}
class videofile implements playable{
    public void play(){
        System.out.println("video playing");
    }
    public void stop(){
        System.out.println("video stopped");
    }
}
public class Media{
    public static void main(String[] args){
        playable[] files =new playable[2];

        files[0]=new audiofile();
        files[1]=new videofile();

        for(int i=0; i<files.length; i++){
            files[i].play();
            files[i].stop();
        }
    }
}