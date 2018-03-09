/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:06:19 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.UserGraph;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserGraph_ESTest extends UserGraph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(java.lang.System.getProperty("user.dir") + "/too many values in input file");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "wA");
      DNADraw dNADraw0 = new DNADraw();
      UserGraph userGraph0 = null;
      try {
        userGraph0 = new UserGraph(dNADraw0, "too many values in input file");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(java.lang.System.getProperty("user.dir") + "/too many values in input file");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      DNADraw dNADraw0 = new DNADraw();
      UserGraph userGraph0 = null;
      try {
        userGraph0 = new UserGraph(dNADraw0, "too many values in input file");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // unknown file type
         //
         verifyException("uk.ac.sanger.artemis.circular.UserGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(java.lang.System.getProperty("user.dir") + "/too many values in input file");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "wA");
      DNADraw dNADraw0 = new DNADraw();
      UserGraph userGraph0 = null;
      try {
        userGraph0 = new UserGraph(dNADraw0, "too many values in input file");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.UserGraph", e);
      }
  }
}