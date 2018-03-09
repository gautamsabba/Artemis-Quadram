/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:28:43 GMT 2018
 */

package uk.ac.sanger.artemis.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.sequence.BasePattern;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Marker;
import uk.ac.sanger.artemis.sequence.MarkerRange;
import uk.ac.sanger.artemis.sequence.MarkerRangeVector;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePattern_ESTest extends BasePattern_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("K");
      boolean boolean0 = basePattern0.matches("K");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("&");
      Bases bases0 = new Bases(fastaStreamSequence0);
      MarkerRange markerRange0 = basePattern0.findMatch(bases0, (Marker) null, 862, true, true, false);
      assertNull(markerRange0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("hr");
      boolean boolean0 = basePattern0.matches("&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      Marker marker0 = strand0.makeMarker(7);
      MarkerRangeVector markerRangeVector0 = basePattern0.findMatches(bases0, marker0, 1);
      assertEquals(0, markerRangeVector0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        BasePattern.patternType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("R");
      // Undeclared exception!
      try { 
        basePattern0.findMatches((Bases) null, (Marker) null, 3203);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("g");
      // Undeclared exception!
      try { 
        basePattern0.findMatch((Bases) null, (Marker) null, 1063, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = BasePattern.patternType("k5Km%#+;#fc%zx@#");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = BasePattern.patternType("mG6h~");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = BasePattern.patternType("f*lS\"T>bE(UnMlK");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = BasePattern.patternType("q/GC[E.[{h~bFb,%56");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = BasePattern.patternType("s1?");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = BasePattern.patternType("o0_LP,fLk4oO7");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = BasePattern.patternType("uk.ac.sanger.artemis.sequence.BasePattern");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = BasePattern.patternType("rna");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = BasePattern.patternType("pattern too short");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = BasePattern.patternType("ixj2UGlP8G0d=Z`8");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = BasePattern.patternType("hr");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = BasePattern.patternType("g");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      fastaStreamSequence0.setFromChar(bases0.letter_index);
      MarkerRange markerRange0 = basePattern0.findMatch(bases0, (Marker) null, 255, false, true, false);
      assertTrue(markerRange0.isForwardMarker());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      fastaStreamSequence0.setFromChar(bases0.letter_index);
      MarkerRange markerRange0 = basePattern0.findMatch(bases0, (Marker) null, (-2154), false, true, true);
      assertNull(markerRange0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("K");
      String string0 = basePattern0.toString();
      assertEquals("k", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("yFW`j?WCz]g");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("RwqM4c)_udAnilv");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("The targetted ontology may not be null");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("j#I.lO_B");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("VI#_-kT/");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = BasePattern.patternType("enO}");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("do^I#_X");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = BasePattern.patternType("c[:");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("Bl/;]<^UU&N!");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("NKax7G");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // illegal characters in pattern
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("g");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      MarkerRangeVector markerRangeVector0 = basePattern0.findMatches(bases0, (Marker) null, 1011);
      assertEquals(1, markerRangeVector0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("g");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      MarkerRange markerRange0 = basePattern0.findMatch(bases0, (Marker) null, 255, true, true, true);
      assertNotNull(markerRange0);
      assertFalse(markerRange0.isForwardMarker());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      MarkerRange markerRange0 = basePattern0.findMatch(bases0, (Marker) null, (-2154), false, true, true);
      assertNull(markerRange0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("hr");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      fastaStreamSequence0.setFromChar(bases0.letter_index);
      MarkerRangeVector markerRangeVector0 = basePattern0.findMatches(bases0, (Marker) null, 968);
      assertEquals(3, markerRangeVector0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      fastaStreamSequence0.setFromChar(bases0.letter_index);
      MarkerRange markerRange0 = basePattern0.findMatch(bases0, (Marker) null, 255, true, true, true);
      assertTrue(markerRange0.isForwardMarker());
      assertNotNull(markerRange0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("G~8c[YFB6lQ)E");
      Bases bases0 = new Bases(fastaStreamSequence0);
      MarkerRange markerRange0 = basePattern0.findMatch(bases0, (Marker) null, (-2154), false, false, false);
      assertNull(markerRange0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("N");
      boolean boolean0 = basePattern0.matches("N");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BasePattern basePattern0 = new BasePattern("r");
      boolean boolean0 = basePattern0.matches("uk.ac.sanger.artemis.sequence.BasePattern");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BasePattern basePattern0 = null;
      try {
        basePattern0 = new BasePattern("");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // pattern too short
         //
         verifyException("uk.ac.sanger.artemis.sequence.BasePattern", e);
      }
  }
}