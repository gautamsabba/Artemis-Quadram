/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:53:22 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.OSXAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OSXAdapter_ESTest extends OSXAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OSXAdapter oSXAdapter0 = new OSXAdapter("No annotation was provided", "No annotation was provided", (Method) null);
      OSXAdapter.setAboutHandler(oSXAdapter0, (Method) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OSXAdapter oSXAdapter0 = new OSXAdapter("& $HAT`<\"@J", "& $HAT`<\"@J", (Method) null);
      // Undeclared exception!
      try { 
        OSXAdapter.setQuitHandler(oSXAdapter0, (Method) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.apple.eawt.Application
         //
         verifyException("java.lang.Class", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      OSXAdapter.macOSXApplication = object0;
      OSXAdapter.setPreferencesHandler(object0, (Method) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OSXAdapter oSXAdapter0 = new OSXAdapter("'X3", "'X3", (Method) null);
      Object[] objectArray0 = new Object[4];
      boolean boolean0 = oSXAdapter0.isCorrectMethod((Method) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OSXAdapter oSXAdapter0 = new OSXAdapter("No annotation was provided", "No annotation was provided", (Method) null);
      // Undeclared exception!
      try { 
        OSXAdapter.setHandler(oSXAdapter0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.apple.eawt.Application
         //
         verifyException("java.lang.Class", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OSXAdapter oSXAdapter0 = new OSXAdapter("'X3", "'X3", (Method) null);
      // Undeclared exception!
      try { 
        oSXAdapter0.callTarget(OSXAdapter.macOSXApplication);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.OSXAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OSXAdapter oSXAdapter0 = new OSXAdapter("Mac OS X Adapter could not talk to EAWT:", "Mac OS X Adapter could not talk to EAWT:", (Method) null);
      oSXAdapter0.setApplicationEventHandled("", true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OSXAdapter oSXAdapter0 = new OSXAdapter("No annotation was provided", "No annotation was provided", (Method) null);
      oSXAdapter0.setApplicationEventHandled((Object) null, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      OSXAdapter oSXAdapter0 = new OSXAdapter("YJukC", object0, (Method) null);
      Object[] objectArray0 = new Object[4];
      Object object1 = oSXAdapter0.invoke(oSXAdapter0, (Method) null, objectArray0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      OSXAdapter oSXAdapter0 = new OSXAdapter("YJukC", object0, (Method) null);
      OSXAdapter.setPreferencesHandler(oSXAdapter0, (Method) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      OSXAdapter.setPreferencesHandler(objectArray0[0], (Method) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      OSXAdapter.macOSXApplication = object0;
      OSXAdapter.setAboutHandler(OSXAdapter.macOSXApplication, (Method) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OSXAdapter.setAboutHandler((Object) null, (Method) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        OSXAdapter.setFileHandler(object0, (Method) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.apple.eawt.Application
         //
         verifyException("java.lang.Class", e);
      }
  }
}
