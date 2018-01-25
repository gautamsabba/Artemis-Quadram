/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:47:43 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.BlastStreamFeature;
import uk.ac.sanger.artemis.io.FeatureComparator;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.QualifierVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureComparator_ESTest extends FeatureComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureComparator featureComparator0 = new FeatureComparator();
      FlowLayout flowLayout0 = new FlowLayout();
      Panel panel0 = new Panel(flowLayout0);
      // Undeclared exception!
      try { 
        featureComparator0.compare(panel0, flowLayout0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.Panel cannot be cast to uk.ac.sanger.artemis.io.ComparableFeature
         //
         verifyException("uk.ac.sanger.artemis.io.FeatureComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeatureComparator featureComparator0 = new FeatureComparator();
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      int int0 = featureComparator0.compare(genbankStreamFeature0, genbankStreamFeature0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FeatureComparator featureComparator0 = new FeatureComparator();
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(genbankStreamFeature0);
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(gFFStreamFeature0);
      featureComparator0.compare(blastStreamFeature0, gFFStreamFeature0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FeatureComparator featureComparator0 = new FeatureComparator();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Key key0 = Key.CDS;
      QualifierVector qualifierVector0 = new QualifierVector();
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(key0, (Location) null, qualifierVector0);
      // Undeclared exception!
      try { 
        featureComparator0.compare(integer0, blastStreamFeature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleDocumentFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FeatureComparator featureComparator0 = new FeatureComparator();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      int int0 = featureComparator0.compare(integer0, integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FeatureComparator featureComparator0 = new FeatureComparator();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      // Undeclared exception!
      try { 
        featureComparator0.compare((Object) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.FeatureComparator", e);
      }
  }
}
