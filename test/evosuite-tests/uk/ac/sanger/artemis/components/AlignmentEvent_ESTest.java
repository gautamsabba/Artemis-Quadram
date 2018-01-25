/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:33:26 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.AlignMatch;
import uk.ac.sanger.artemis.components.AlignmentEvent;
import uk.ac.sanger.artemis.io.Range;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlignmentEvent_ESTest extends AlignmentEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlignmentEvent alignmentEvent0 = new AlignmentEvent((AlignMatch) null);
      AlignMatch alignMatch0 = alignmentEvent0.getMatch();
      assertNull(alignMatch0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 0);
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertTrue(alignMatch1.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Range range0 = new Range((-10));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-10), (-10));
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertEquals((-10), alignMatch1.getSubjectSequenceStart());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Range range0 = new Range(1);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1);
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertEquals(1, alignMatch1.getQuerySequenceEnd());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Range range0 = new Range(1447, 1515);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 4602, 4602);
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertEquals(1515, alignMatch1.getQuerySequenceStart());
  }
}
