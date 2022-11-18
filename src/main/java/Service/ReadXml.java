package Service;

import Controller.Genres;
import model.SongRecords;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ReadXml {


    public static Map<Integer, SongRecords> getSongFromXml(){

        Map<Integer, SongRecords> songs = new HashMap<>();

        try{

            File f = new File("src/resources/songs.xml");

            Document xml = DocumentBuilderFactory
                    .newInstance()
                    .newDocumentBuilder()
                    .parse(f);

            xml.normalize();
            NodeList nodes = xml.getElementsByTagName("song");

            for(int i = 0; i < nodes.getLength(); i++){

                Node node = nodes.item(i);
                Element ex = (Element)node;

                Integer id = Integer.parseInt(ex.getElementsByTagName("id").item(0).getTextContent());
                String title = ex.getElementsByTagName("title").item(0).getTextContent();
                String author = ex.getElementsByTagName("author").item(0).getTextContent();
                String publisher = ex.getElementsByTagName("publisher").item(0).getTextContent();
                Integer durationInSec = Integer.parseInt(ex.getElementsByTagName("durationInSec").item(0).getTextContent());
                LocalDate releaseDate = LocalDate.parse(ex.getElementsByTagName("releaseDate").item(0).getTextContent());
                Genres genre = Genres.valueOf(Genres.class, ex.getElementsByTagName("genre").item(0).getTextContent());

                songs.put(id,new SongRecords(title,author,publisher,durationInSec,releaseDate,genre));
            }


        }catch(Exception e){
            e.printStackTrace();
        }

        return songs;
    }


}
