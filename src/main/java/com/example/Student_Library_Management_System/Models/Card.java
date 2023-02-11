package com.example.Student_Library_Management_System.Models;

import com.example.Student_Library_Management_System.Enums.CardStatus;
import jakarta.persistence.*;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="card")
public class Card {

    //plan is to save card in the DB
    //before saving we have to set its attribute
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;   //its Auto generated

    @CreationTimestamp //auto timestamp the time when an entry is created
     private Date createdOn;    //its Auto generated

    @UpdateTimestamp //set time when an  entry is update
    private Date updatedOn;       //its Auto generated

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;     //we set it in studentService


    @OneToOne
    @JoinColumn
    private Student studentVariableName ;  //this variable used in parent class while doing the bi directional mapping

    public Card() {
    }





}
