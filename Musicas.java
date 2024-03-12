public class Musicas {
    String title;
    String album;
    String date;
    int time;
    
    //Metodos
    
    //Primera forma
    /*public void Musicas(String _title, String _album, String _date, int _time){
        title=_title;
        album=_album;
        date=_date;
        time=_time;
    }*/
    
    //Segunda forma
    public Musicas(String title, String album, String date, int time){
    
        this.title=title;
        this.album=album;
        this.date=date;
        this.time=time;
    }
    
    public void ShowPlaylist(){
        System.out.println("Title: " + title);
        System.out.println("Album: " + album);
        System.out.println("Date: " + date);
        System.out.println("Time: " +time);
    } 
}
