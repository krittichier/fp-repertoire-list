package edu.bsu.cs222.fp.repertoireList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.bsu.cs222.fp.repertoireList.datatypes.Composition;

public class CompositionTest {
	private String composer = "Antoine Foqueray";
	private String title = "Jupiter";
	private Composition current = Composition.byComposer(composer).withTitle(title);
	private Composition current2 = Composition.byComposer(composer).withTitle(title);
	private boolean wasPerformed = true;
	private String ensemble = "Ball State University Orchestra";
	private String year = "2014";
	private boolean wasMemorized = false;
	private String ensembleType = "solo";
	
	@Before
	public void setup() {
		current.setEnsemble(ensemble);
		current.setYearLearned(year);
		current.setEnsembleType(ensembleType);
		current.setWasPerformed();
		current.setWasNotMemorized();
	}
	
	@Test 
	public void testFindDuplicate() {
		assertTrue(current.equals(current2));
	}
	
	@Test
	public void testSameHashCode() {
		assertTrue(current.hashCode() == current.hashCode());
	}
	
	@Test
	public void testRetrieveEnsembleType() {
		assertEquals(current.getEnsembleType(), ensembleType);
	}
	
	@Test 
	public void testRetrieveYear() {
		assertEquals(current.getYearLearned(), year);
	}
	
	@Test 
	public void testRetrieveWasMemorized() {
		assertEquals(current.getWasMemorized(), wasMemorized);
	}
	
	@Test 
	public void testRetrieveWasPerformed() {
		assertEquals(current.getWasPerformed(), wasPerformed);
	}
	
	@Test
	public void testRetrieveEnsemble() {
		assertEquals(current.getEnsemble(), ensemble);
	}

	@Test
	public void testRetrieveComposer() {
		assertEquals(composer, current.getComposer());
	}
	
	@Test
	public void testRetrieveTitle() {
		assertEquals(title, current.getTitle());		
	}
}