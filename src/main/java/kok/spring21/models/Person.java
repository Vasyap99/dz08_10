package kok.spring21.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.SequenceGenerator;

@Entity
@Table(name="person")
public class Person{

    @Id
    @Column(name="id",nullable=false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sgp")
    @SequenceGenerator(name="sgp",sequenceName="person_id_seq",allocationSize=1)
    private int id;   //IDENTITY  AUTO

    @Column(name="fio")
    private String fio;

    public Person(String fio){
        this.id=id;
        this.fio=fio;    
    }

    /*public Person(int id, String fio){
        this.id=id;
        this.fio=fio;    
    }*/

    public Person(){}

    public int getId(){
        return id;
    }

    public void setId(int i){
        id=i;
    }

    public String getFio(){
        return fio;
    }

    public void setFio(String f){
        fio=f;
    }
}