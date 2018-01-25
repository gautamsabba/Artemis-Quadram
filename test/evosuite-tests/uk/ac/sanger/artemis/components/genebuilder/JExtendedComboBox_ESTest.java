/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:34:33 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.ChronoLocalDate;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.event.PopupMenuEvent;
import javax.swing.table.DefaultTableModel;
import org.emboss.jemboss.JembossParams;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JExtendedComboBox_ESTest extends JExtendedComboBox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(true);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
      
      jExtendedComboBox0.setHighLightCurrent(true);
      JExtendedComboBox.ComboBoxRenderer jExtendedComboBox_ComboBoxRenderer0 = jExtendedComboBox0.new ComboBoxRenderer();
      JList<DefaultTableModel> jList0 = new JList<DefaultTableModel>();
      jExtendedComboBox_ComboBoxRenderer0.getListCellRendererComponent(jList0, (Object) null, (-2035931535), true, false);
      assertTrue(jExtendedComboBox0.isHighLightCurrent());
      assertEquals(0, jExtendedComboBox0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JembossParams jembossParams0 = new JembossParams();
      Vector vector0 = jembossParams0.getPrivateServers();
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(vector0);
      jExtendedComboBox0.setCurrent(2508);
      int int0 = jExtendedComboBox0.getCurrent();
      assertEquals(2508, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = null;
      try {
        jExtendedComboBox0 = new JExtendedComboBox((String[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DefaultComboBoxModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = null;
      try {
        jExtendedComboBox0 = new JExtendedComboBox((Vector<?>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DefaultComboBoxModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[][] objectArray0 = new Object[9][3];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[3]);
      Vector vector0 = defaultTableModel0.getDataVector();
      JExtendedComboBox jExtendedComboBox0 = null;
      try {
        jExtendedComboBox0 = new JExtendedComboBox(vector0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to org.gmod.schema.cv.CvTerm
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.AutoCompleteComboDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = null;
      try {
        jExtendedComboBox0 = new JExtendedComboBox((Vector<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DefaultComboBoxModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[7];
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(stringArray0);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JembossParams jembossParams0 = new JembossParams();
      Vector vector0 = jembossParams0.getPrivateServers();
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(vector0, true);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
      
      jExtendedComboBox0.setHighLightCurrent(true);
      boolean boolean0 = jExtendedComboBox0.isHighLightCurrent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JembossParams jembossParams0 = new JembossParams();
      Vector vector0 = jembossParams0.getPrivateServers();
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(vector0);
      boolean boolean0 = jExtendedComboBox0.isHighLightCurrent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<ChronoLocalDate> vector0 = new Vector<ChronoLocalDate>();
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(vector0);
      int int0 = jExtendedComboBox0.getCurrent();
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(true);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
      
      jExtendedComboBox0.setHighLightCurrent(true);
      JExtendedComboBox.ComboBoxRenderer jExtendedComboBox_ComboBoxRenderer0 = jExtendedComboBox0.new ComboBoxRenderer();
      JList<DefaultTableModel> jList0 = new JList<DefaultTableModel>();
      jExtendedComboBox_ComboBoxRenderer0.getListCellRendererComponent(jList0, "/<\";SI]dn3P/", 0, false, false);
      assertTrue(jExtendedComboBox0.isHighLightCurrent());
      assertEquals(0, jExtendedComboBox0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(true);
      JExtendedComboBox.ComboBoxRenderer jExtendedComboBox_ComboBoxRenderer0 = jExtendedComboBox0.new ComboBoxRenderer();
      JList<DefaultTableModel> jList0 = new JList<DefaultTableModel>();
      jExtendedComboBox_ComboBoxRenderer0.getListCellRendererComponent(jList0, (Object) null, (-2035931535), true, false);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<ChronoLocalDate> vector0 = new Vector<ChronoLocalDate>();
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(vector0);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      JExtendedComboBox.ComboBoxRenderer jExtendedComboBox_ComboBoxRenderer0 = jExtendedComboBox0.new ComboBoxRenderer();
      DefaultComboBoxModel<JTextArea> defaultComboBoxModel0 = new DefaultComboBoxModel<JTextArea>();
      JList<JTextArea> jList0 = new JList<JTextArea>(defaultComboBoxModel0);
      // Undeclared exception!
      try { 
        jExtendedComboBox_ComboBoxRenderer0.getListCellRendererComponent(jList0, mockThaiBuddhistDate0, (-727), true, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate cannot be cast to org.gmod.schema.cv.CvTerm
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox$ComboBoxRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(true);
      JExtendedComboBox.ComboPopupMenuLister jExtendedComboBox_ComboPopupMenuLister0 = jExtendedComboBox0.new ComboPopupMenuLister();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(mockThaiBuddhistDate0);
      jExtendedComboBox_ComboPopupMenuLister0.popupMenuWillBecomeVisible(popupMenuEvent0);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(true);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
      
      jExtendedComboBox0.setHighLightCurrent(true);
      JExtendedComboBox.ComboBoxRenderer jExtendedComboBox_ComboBoxRenderer0 = jExtendedComboBox0.new ComboBoxRenderer();
      JList<DefaultTableModel> jList0 = new JList<DefaultTableModel>();
      jExtendedComboBox_ComboBoxRenderer0.getListCellRendererComponent(jList0, (Object) null, 58, false, false);
      assertTrue(jExtendedComboBox0.isHighLightCurrent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = null;
      try {
        jExtendedComboBox0 = new JExtendedComboBox((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DefaultComboBoxModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[9];
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(stringArray0, false);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<ChronoLocalDate> vector0 = new Vector<ChronoLocalDate>();
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(vector0);
      jExtendedComboBox0.setCurrent((-727));
      int int0 = jExtendedComboBox0.getCurrent();
      assertEquals((-727), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(true);
      JExtendedComboBox.ComboPopupMenuLister jExtendedComboBox_ComboPopupMenuLister0 = jExtendedComboBox0.new ComboPopupMenuLister();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(mockThaiBuddhistDate0);
      jExtendedComboBox_ComboPopupMenuLister0.popupMenuWillBecomeInvisible(popupMenuEvent0);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JExtendedComboBox jExtendedComboBox0 = new JExtendedComboBox(true);
      JExtendedComboBox.ComboPopupMenuLister jExtendedComboBox_ComboPopupMenuLister0 = jExtendedComboBox0.new ComboPopupMenuLister();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(mockThaiBuddhistDate0);
      jExtendedComboBox_ComboPopupMenuLister0.popupMenuCanceled(popupMenuEvent0);
      assertFalse(jExtendedComboBox0.isHighLightCurrent());
  }
}
