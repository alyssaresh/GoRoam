package com.goRoam.model;
import jakarta.persistence.*;

@Entity
@Table(name = "user_interests")
public class UserInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int userId;

    @Column
    private String interest;

    public UserInterest(){}

    public UserInterest(int id, int userId, String interest) {
        this.id = id;
        this.userId = userId;
        this.interest = interest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

}
