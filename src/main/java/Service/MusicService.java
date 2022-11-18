package Service;

import model.SongRecords;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MusicService {

    private Map<Integer, SongRecords> songs = ReadXml.getSongFromXml();       //Eltárolja a zenéket HashMap-be (id + zene adatai)
    private Integer id = songs.size();
        public List<SongRecords> getAllSong(){
           return new ArrayList<>(songs.values());
        }

        public SongRecords addSong(SongRecords song){
            id++;
            song.setId(id);
            songs.put(id,song);
            return song;
        }

    public SongRecords removeSong(Integer id){
        return songs.remove(id);
    }
}
