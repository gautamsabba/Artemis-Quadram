/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:19:43 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.Reader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.PublicDBStreamFeature;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PublicDBStreamFeature_ESTest extends PublicDBStreamFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      // Undeclared exception!
      try { 
        PublicDBStreamFeature.readQualifiers((Reader) null, simpleEntryInformation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmblStreamFeature.readFromStream((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.PublicDBStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(charArrayReader0);
      GenbankStreamFeature genbankStreamFeature0 = GenbankStreamFeature.readFromStream(linePushBackReader0);
      assertNull(genbankStreamFeature0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      genbankStreamFeature0.writeToStream(charArrayWriter0);
      assertEquals(62, charArrayWriter0.size());
  }
}
