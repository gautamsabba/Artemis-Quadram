/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:31:37 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.InvalidRelationException;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Qualifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InvalidRelationException_ESTest extends InvalidRelationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Key key0 = new Key("", false);
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("", key0);
      Key key1 = invalidRelationException0.getKey();
      assertSame(key1, key0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Key key0 = Key.CDS;
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("", key0);
      Key key1 = invalidRelationException0.getKey();
      assertEquals("CDS", key1.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Key key0 = new Key("Bl6", true);
      Qualifier qualifier0 = new Qualifier("Bl6", "uk.ac.sanger.artemis.io.InvalidRelationException");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("Bl6", key0, qualifier0);
      Qualifier qualifier1 = invalidRelationException0.getQualifier();
      assertSame(qualifier1, qualifier0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("nJ{eZHK_DM)fG$", (Key) null);
      Qualifier qualifier0 = invalidRelationException0.getQualifier();
      assertNull(qualifier0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("nJ{eZHK_DM)fG$", (Key) null);
      Key key0 = invalidRelationException0.getKey();
      assertNull(key0);
  }
}