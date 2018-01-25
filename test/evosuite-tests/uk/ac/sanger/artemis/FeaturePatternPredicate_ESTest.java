/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:18:46 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeaturePatternPredicate;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.sequence.AminoAcidSequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeaturePatternPredicate_ESTest extends FeaturePatternPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AminoAcidSequence aminoAcidSequence0 = AminoAcidSequence.getTranslation("owe", false);
      FeaturePatternPredicate featurePatternPredicate0 = new FeaturePatternPredicate(aminoAcidSequence0);
      // Undeclared exception!
      try { 
        featurePatternPredicate0.testPredicate((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.FeaturePatternPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[6];
      AminoAcidSequence aminoAcidSequence0 = AminoAcidSequence.getTranslation(charArray0, false);
      FeaturePatternPredicate featurePatternPredicate0 = new FeaturePatternPredicate(aminoAcidSequence0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("Asp");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry();
      Feature feature0 = entry0.createFeature();
      featurePatternPredicate0.testPredicate(feature0);
  }
}
