package com.example.scheduleapp;

public interface ReminderInterface {

    void hideActionBar();
    void showActionBar();
    void addReminder(final String reminderTitle, final String reminderDTS, final long reminderTIM);
    void updateReminder(final String reminderTitle, final String reminderDTS, final long reminderTIM, final int reminderId, final int reminderPosition);

}
