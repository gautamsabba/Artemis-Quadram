/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:43:42 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.InputStreamProgressDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InputStreamProgressDialog_ESTest extends InputStreamProgressDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InputStreamProgressDialog inputStreamProgressDialog0 = null;
      try {
        inputStreamProgressDialog0 = new InputStreamProgressDialog((JFrame) null, "-m.wy(X1zP<", "-m.wy(X1zP<", true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamProgressDialog inputStreamProgressDialog0 = null;
      try {
        inputStreamProgressDialog0 = new InputStreamProgressDialog((JFrame) null, "#Dh6@BPo");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
