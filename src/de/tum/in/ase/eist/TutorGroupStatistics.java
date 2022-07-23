package de.tum.in.ase.eist;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class TutorGroupStatistics {

	private TutorGroupStatistics() {

	}

	public static double averageDuration(Stream<TutorGroupMeeting> meetingStream) {
		return meetingStream.mapToLong(s -> s.getTimeSlot().getDuration().toSeconds()).average().orElse(0);

	}

	public static Set<Skill> repeatedSkills(Stream<TutorGroupMeeting> meetings) {
		List<Skill> listOfSkills = meetings.map(s -> s.getSkillToPractise()).collect(Collectors.toList());
		return listOfSkills.stream().filter(skill -> Collections.frequency(listOfSkills, skill) > 1).collect(Collectors.toSet());
	}
}
