/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 07 15:06:33 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics;
import javax.swing.DebugGraphics;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.apache.batik.svggen.SVGGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.LineStyleListRenderer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LineStyleListRenderer_ESTest extends LineStyleListRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LineStyleListRenderer lineStyleListRenderer0 = new LineStyleListRenderer();
      DefaultComboBoxModel<DefaultTableModel> defaultComboBoxModel0 = new DefaultComboBoxModel<DefaultTableModel>();
      JList<DefaultTableModel> jList0 = new JList<DefaultTableModel>(defaultComboBoxModel0);
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.SMALL_CAPS;
      LineStyleListRenderer lineStyleListRenderer1 = (LineStyleListRenderer)lineStyleListRenderer0.getListCellRendererComponent(jList0, integer0, 5004, true, false);
      assertFalse(lineStyleListRenderer1.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LineStyleListRenderer lineStyleListRenderer0 = new LineStyleListRenderer();
      // Undeclared exception!
      try { 
        lineStyleListRenderer0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.LineStyleListRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LineStyleListRenderer lineStyleListRenderer0 = new LineStyleListRenderer();
      // Undeclared exception!
      try { 
        lineStyleListRenderer0.getListCellRendererComponent((JList) null, (Object) null, 367, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.LineStyleListRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LineStyleListRenderer lineStyleListRenderer0 = new LineStyleListRenderer();
      JList<SVGGraphics2D> jList0 = (JList<SVGGraphics2D>) mock(JList.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        lineStyleListRenderer0.getListCellRendererComponent(jList0, jList0, 1048576, true, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.javax.swing.JList$MockitoMock$64441529 cannot be cast to java.lang.Integer
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.LineStyleListRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LineStyleListRenderer lineStyleListRenderer0 = new LineStyleListRenderer();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        lineStyleListRenderer0.paintComponent(debugGraphics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.LineStyleListRenderer", e);
      }
  }
}