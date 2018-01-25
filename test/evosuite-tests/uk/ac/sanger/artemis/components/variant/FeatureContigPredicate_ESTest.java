/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:28:21 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.variant.FeatureContigPredicate;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureContigPredicate_ESTest extends FeatureContigPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureContigPredicate featureContigPredicate0 = new FeatureContigPredicate("");
      // Undeclared exception!
      try { 
        featureContigPredicate0.testPredicate((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.FeatureContigPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeatureContigPredicate featureContigPredicate0 = new FeatureContigPredicate("");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("updateFeatureLoc", "");
      Bases bases0 = new Bases(fastaStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureContigPredicate0, (String) null);
      Entry entry0 = filteredEntryGroup0.createEntry();
      Feature feature0 = entry0.createFeature();
      featureContigPredicate0.testPredicate(feature0);
  }
}
