package com.example.notifications.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "datetime_start")
    private Date datetimeStart;

    @Column(name = "datetime_end")
    private Date datetimeEnd;

//    @ManyToOne
//    @JoinColumn(name = "waiter_id")
//    private Waiter waiter;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private Table table;

    // Constructors, getters, and setters

    public User() {
    }

    public User(Date datetimeStart, Date datetimeEnd, Table table) {
        this.datetimeStart = datetimeStart;
        this.datetimeEnd = datetimeEnd;
        this.table = table;
    }

    // Getters and setters

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDatetimeStart() {
        return datetimeStart;
    }

    public void setDatetimeStart(Date datetimeStart) {
        this.datetimeStart = datetimeStart;
    }

    public Date getDatetimeEnd() {
        return datetimeEnd;
    }

    public void setDatetimeEnd(Date datetimeEnd) {
        this.datetimeEnd = datetimeEnd;
    }

//    public Waiter getWaiter() {
//        return waiter;
//    }
//
//    public void setWaiter(Waiter waiter) {
//        this.waiter = waiter;
//    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}