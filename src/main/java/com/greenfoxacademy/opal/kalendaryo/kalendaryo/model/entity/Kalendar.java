package com.greenfoxacademy.opal.kalendaryo.kalendaryo.model.entity;


import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class Kalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user")
    private UserModel user;
    private String outputAccount;
    private String outputCalendarId;
  
    @OneToMany(mappedBy = "kalendar")
    List<CalendarId> CalendarIds;

    public Kalendar() {
    }

    public Kalendar(UserModel user, String outputAccount, String outputCalendarId) {
        this.user = user;
        this.outputAccount = outputAccount;
        this.outputCalendarId = outputCalendarId;
    }

    public Kalendar(long id, UserModel user, String outputAccount,
                    String outputCalendarId, List<CalendarId> CalendarIds) {
        this.id = id;
        this.user = user;
        this.outputAccount = outputAccount;
        this.outputCalendarId = outputCalendarId;
        this.CalendarIds = CalendarIds;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getOutputAccount() {
        return outputAccount;
    }

    public void setOutputAccount(String outputAccount) {
        this.outputAccount = outputAccount;
    }

    public String getOutputCalendarId() {
        return outputCalendarId;
    }

    public void setOutputCalendarId(String outputCalendarId) {
        this.outputCalendarId = outputCalendarId;
    }

    public List<CalendarId> getCalendarIds() {
        return CalendarIds;
    }

    public void setCalendarIds(List<CalendarId> CalendarIds) {
        this.CalendarIds = CalendarIds;
    }

    public List<CalendarId> getCalendarsIds(String[] arrayOfStrings) {
        List<CalendarId> calendarIds = new ArrayList<>();
        for (int i = 0; i < arrayOfStrings.length; i++) {
            CalendarId calendarId = new CalendarId();
            calendarId.setId(arrayOfStrings[i]);
            calendarId.setAuthModel(null);
            calendarId.setKalendar(null);
            calendarIds.add(calendarId);
        }
        return calendarIds;
    }
}