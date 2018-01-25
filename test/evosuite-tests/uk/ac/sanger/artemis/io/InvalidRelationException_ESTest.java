/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:05:17 GMT 2018
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidRelationException_ESTest extends InvalidRelationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Key key0 = Key.CDS;
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("", key0);
      Qualifier qualifier0 = invalidRelationException0.getQualifier();
      assertNull(qualifier0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Key key0 = new Key("");
      Qualifier qualifier0 = new Qualifier("");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("T]IrKl!-`~y='E", key0, qualifier0);
      Key key1 = invalidRelationException0.getKey();
      assertSame(key1, key0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Key key0 = new Key("oJxc3x2?iuw>Ip\"");
      Qualifier qualifier0 = new Qualifier("oJxc3x2?iuw>Ip\"");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("oJxc3x2?iuw>Ip\"", key0, qualifier0);
      Key key1 = invalidRelationException0.getKey();
      assertSame(key1, key0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Key key0 = new Key("oJxc3x2?iuw>Ip\"");
      Qualifier qualifier0 = new Qualifier("oJxc3x2?iuw>Ip\"");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("oJxc3x2?iuw>Ip\"", key0, qualifier0);
      Qualifier qualifier1 = invalidRelationException0.getQualifier();
      assertSame(qualifier0, qualifier1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("", (Key) null);
      Key key0 = invalidRelationException0.getKey();
      assertNull(key0);
  }
}
