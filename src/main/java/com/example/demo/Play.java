package com.example.demo;


import jakarta.persistence.Entity; // анотация что класс является сущностбю и относиться к ORM JPA
import jakarta.persistence.GeneratedValue; // автозаполнение айди
import jakarta.persistence.GenerationType; // indentitry
import jakarta.persistence.Id;

//«машина»: ID, Вид техники (например, мультиварка), Группа техники (например, бытовые
//приборы), Дата ввоза на склад, Дата вывоза со склада, ФИО водителя, увозящего технику со склада.
//CREATE TABLE Book (
//        ID int (15) NOT NULL AUTO_INCREMENT,
//        name varchar (255) NOT NULL,
//        publish_house varchar (255) NOT NULL,
//        data_input datetime NOT NULL,
//        FIO datetime NOT NULL,
//        data_output varchar (255),
//        PRIMARY KEY (ID)
//        ) ENGINE=InnODB DEFAULT CHARSET=UTF8
// сущность которую нужно сохранять в базе данных

//Параметры объекта «сеанс»: ID, Название фильма, Киностудия, Дата и время сеанса, Количество билетов на сеанс.
@Entity
public class Play {
    private Long ID;
    private String name;
    private String name_group_actors;
    private String data;
    private String all_count_tickets;
    private String remain_count_tickets;

    protected Play(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_group_actors() {
        return name_group_actors;
    }

    public void setName_group_actors(String name_group_actors) {
        this.name_group_actors = name_group_actors;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAll_count_tickets() {
        return all_count_tickets;
    }

    public void setAll_count_tickets(String all_count_tickets) {
        this.all_count_tickets = all_count_tickets;
    }

    public String getRemain_count_tickets() {
        return remain_count_tickets;
    }

    public void setRemain_count_tickets(String remain_count_tickets) {
        this.remain_count_tickets = remain_count_tickets;
    }
}
