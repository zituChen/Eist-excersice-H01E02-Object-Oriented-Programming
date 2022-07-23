package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {
	// TODO: implement according to problem statement
    private String matriculationNumber;
    private int semester;
    private Set<String> knowledge;
    private StudyLevel studyLevel;
    private Set<Skill> skills;

    public Student(String name, int age, String tumId, String matriculationNumber, StudyLevel studyLevel, int semester) {
        super(name, age, tumId);
        this.matriculationNumber = matriculationNumber;
        this.studyLevel = studyLevel;
        this.semester = semester;
        this.knowledge = new HashSet<>();
        this.skills = new HashSet<>();

    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public int getSemester() {
        return semester;
    }

    public Set<String> getKnowledge() {
        return knowledge;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void acquireKnowledge(String string) {
        this.knowledge.add(string);
    }

    public void learnSkill(Skill skill) {
        this.skills.add(skill);
    }

}
