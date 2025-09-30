package week2.week2_3;

import java.util.Iterator;
import java.util.LinkedList;

public class Cart {
    private LinkedList<Song> songlist = new LinkedList<Song>();
    private double total; //전체 총 금액

    public void addSong(Song song){
        System.out.println(song.getName()+"이 추가됩니다.");
        this.songlist.add(song);
    }

    public LinkedList<Song> deleteSong(Song song){
        System.out.println(song.getName()+"이 삭제됩니다.");
        this.songlist.remove(song);
        return this.songlist;
    }

    public double calculate(){
        Iterator<Song> iter = songlist.iterator();
        while (iter.hasNext()){
            Song s = iter.next();
            total+=s.getPrice();
        }
        System.out.println("총 금액은 "+ total+"입니다.");
        return total;
    }
}
