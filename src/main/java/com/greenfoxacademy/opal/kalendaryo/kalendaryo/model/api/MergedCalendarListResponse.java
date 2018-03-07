package com.greenfoxacademy.opal.kalendaryo.kalendaryo.model.api;

import com.greenfoxacademy.opal.kalendaryo.kalendaryo.model.entity.MergedCalendar;
import java.util.ArrayList;
import java.util.List;

public class MergedCalendarListResponse {

    private List<MergedCalendarResponse> mergedCalendars;

    public MergedCalendarListResponse() {
  }

    public List<MergedCalendarResponse> getMergedCalendars() {
    return mergedCalendars;
  }

    public void setMergedCalendars(List<MergedCalendarResponse> mergedCalendars) {
        this.mergedCalendars = mergedCalendars;
  }
}

