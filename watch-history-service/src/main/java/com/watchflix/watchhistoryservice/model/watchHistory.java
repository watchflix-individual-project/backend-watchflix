package com.watchflix.watchhistoryservice.model;
import javax.persistence.*;

@Entity
@Table(name = "watch_history")
public class watchHistory {
    private int id;
    private String movie;
    private String time;

    public watchHistory() {
    }

    public watchHistory(int id, String movie, String time) {
        this.id = id;
        this.movie = movie;
        this.time = time;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
//other setters and getters
    public void setId(Integer id){
        this.id=id;
    }
}