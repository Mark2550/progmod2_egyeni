package Controller;

import model.SongRecords;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SongConfig {
    @Bean
    public SongRecords songRecords(){
        return new SongRecords();
    }

}
