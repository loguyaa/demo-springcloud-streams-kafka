package org.sid.demospringcloudstreamskafka.entities;

import java.util.Date;

public class pageEvent {
    private String name;
    private String user;
    private Date date;
    private Long duration;

    // Constructeur avec paramètres
    public pageEvent(String name, String user, Date date, Long duration) {
        this.name = name;
        this.user = user;
        this.date = date;
        this.duration = duration;
    }

    // Constructeur sans paramètres
    public pageEvent() {
    }

    // Getters et Setters (ou utilisez Lombok @Data si vous préférez)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "pageEvent{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                '}';
    }
}
