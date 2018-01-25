/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:44:28 GMT 2018
 */

package uk.ac.sanger.artemis.j2ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.j2ssh.SshFileManager;
import uk.ac.sanger.artemis.j2ssh.SshLogin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SshFileManager_ESTest extends SshFileManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SshLogin sshLogin0 = new SshLogin();
      SshFileManager sshFileManager0 = null;
      try {
        sshFileManager0 = new SshFileManager(sshLogin0);
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
      SshFileManager sshFileManager0 = null;
      try {
        sshFileManager0 = new SshFileManager((SshLogin) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.j2ssh.SshFileManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SshFileManager sshFileManager0 = null;
      try {
        sshFileManager0 = new SshFileManager();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
