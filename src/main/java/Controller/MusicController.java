package Controller;
import Service.MusicService;
import model.SongRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("show/songs")
public class MusicController {


    private final MusicService musicService;

    @Autowired
    public MusicController(MusicService musicService){
        this.musicService = musicService;
    }

    @GetMapping()
    public List<SongRecords> getAllSong(){
        return musicService.getAllSong();
    }

    @PostMapping()
    public SongRecords putSongData(@RequestBody SongRecords song){
        return musicService.addSong(song);
    }

    //TODO: UpdateSong függvény létrehozása

//    @PostMapping()
//    public SongRecords removeSong(@RequestBody Integer id){
//        return  musicService.removeSong(id);
//    }

}
