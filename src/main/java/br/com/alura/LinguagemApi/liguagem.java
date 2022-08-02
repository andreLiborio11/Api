package br.com.alura.LinguagemApi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PrincipaisLiguangens")
public class liguagem {

   @Id
   private String id;
    private String title;
    private String image;
    private int ranking;


    
    public liguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }
    public String getId() {
        return id;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    
}
