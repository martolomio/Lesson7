package com.homework7.solid;

public interface SpecialOpportunities {
	
	
	default void turboAcceleration() {
		System.out.println("Досягнуто ");
	}
	default void technologyStealth() {
		System.out.println("Літак не в зоні видимості ");
	}
	default void nuclearstrike() {
		System.out.println("Скинуто ");
	}
}