package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TutorGroup {
	// TODO: implement according to problem statement
    private String id;
    private WeeklyTimeSlot timeSlot;
    private Person tutor;
    private Set<Student> students;
    private List<TutorGroupMeeting> meetings;

    public TutorGroup(String id, WeeklyTimeSlot timeSlot, Person tutor) {
        this.id = id;
        this.timeSlot = timeSlot;
        this.tutor = tutor;
        this.students = new HashSet<>();
        this.meetings = new ArrayList<>();

    }

    void addMeeting(TutorGroupMeeting tutorGroupMeeting) {

    }
    public void register(Student student) {
        this.students.add(student);
    }

    public String getId() {
        return id;
    }

    public WeeklyTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Person getTutor() {
        return tutor;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public List<TutorGroupMeeting> getMeetings() {
        return meetings;
    }
}
