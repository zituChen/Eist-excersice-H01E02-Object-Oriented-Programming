package de.tum.in.ase.eist;

public class VirtualTutorGroupMeeting extends  TutorGroupMeeting {
	// TODO: implement according to problem statement

    private String url;

    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise, String url) {
        super(timeSlot, tutorGroup, skillToPractise);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public void practise() {

        this.getTutorGroup().getTutor().say("Thank you for joining using " + url + " today.");
        for (Student s: this.getTutorGroup().getStudents()) {
            s.getSkills().add(this.getSkillToPractise());
        }
        getTutorGroup().getTutor().say("See you next time!");
    }
}
