package de.tum.in.ase.eist;

public class LocalTutorGroupMeeting extends  TutorGroupMeeting {
	// TODO: implement according to problem statement
    private String room;

    public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise, String room) {
        super(timeSlot, tutorGroup, skillToPractise);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void practise() {
        this.getTutorGroup().getTutor().say("Thank you for coming to " + room + " today.");
        for (Student s: this.getTutorGroup().getStudents()) {
            s.getSkills().add(this.getSkillToPractise());
        }
        getTutorGroup().getTutor().say("See you next time!");
    }
}
