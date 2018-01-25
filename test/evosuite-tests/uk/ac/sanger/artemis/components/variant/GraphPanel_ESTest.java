/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:29:01 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.IllegalComponentStateException;
import java.awt.event.MouseWheelEvent;
import javax.swing.DebugGraphics;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.GenericDocument;
import org.apache.batik.dom.GenericDocumentType;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementation;
import uk.ac.sanger.artemis.components.alignment.LineAttributes;
import uk.ac.sanger.artemis.components.variant.GraphPanel;
import uk.ac.sanger.artemis.components.variant.VCFview;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraphPanel_ESTest extends GraphPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = GraphPanel.getLineAttributes(3);
      LineAttributes[] lineAttributesArray1 = GraphPanel.getLineAttributes(0);
      assertSame(lineAttributesArray1, lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraphPanel graphPanel0 = new GraphPanel((VCFview) null);
      GraphPanel.PopupListener graphPanel_PopupListener0 = graphPanel0.new PopupListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(graphPanel0, 0, 0, 0, 0, (-55), 0, (-55), 0, false, 0, 0, 79);
      graphPanel_PopupListener0.mousePressed(mouseWheelEvent0);
      assertEquals((-55), mouseWheelEvent0.getY());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = GraphPanel.getLineAttributes(0);
      assertNotNull(lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraphPanel graphPanel0 = new GraphPanel((VCFview) null);
      GenericDocumentType genericDocumentType0 = new GenericDocumentType("unknown type,(0,300),absolute(300,300),button=0,clickCount=0,scrollType=WHEEL_UNIT_SCROLL,scrollAmount=217,wheelRotation=-1512,preciseWheelRotation=-1512.0", "unknown type,(0,300),absolute(300,300),button=0,clickCount=0,scrollType=WHEEL_UNIT_SCROLL,scrollAmount=217,wheelRotation=-1512,preciseWheelRotation=-1512.0", "unknown type,(0,300),absolute(300,300),button=0,clickCount=0,scrollType=WHEEL_UNIT_SCROLL,scrollAmount=217,wheelRotation=-1512,preciseWheelRotation=-1512.0");
      DOMImplementation dOMImplementation0 = GenericDOMImplementation.getDOMImplementation();
      GenericDocument genericDocument0 = new GenericDocument(genericDocumentType0, dOMImplementation0);
      SVGGeneratorContext sVGGeneratorContext0 = SVGGeneratorContext.createDefault(genericDocument0);
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(sVGGeneratorContext0, false);
      // Undeclared exception!
      try { 
        graphPanel0.paintComponent(sVGGraphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.GraphPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraphPanel graphPanel0 = new GraphPanel((VCFview) null);
      GenericDocumentType genericDocumentType0 = new GenericDocumentType((String) null, "", (String) null);
      GenericDOMImplementation genericDOMImplementation0 = new GenericDOMImplementation();
      GenericDocument genericDocument0 = new GenericDocument(genericDocumentType0, genericDOMImplementation0);
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(genericDocument0);
      DebugGraphics debugGraphics0 = new DebugGraphics(sVGGraphics2D0);
      // Undeclared exception!
      try { 
        graphPanel0.paintComponent(debugGraphics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         verifyException("uk.ac.sanger.artemis.components.variant.GraphPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      GraphPanel.getLineAttributes(40960);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        GraphPanel.getLineAttributes((-1873));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraphPanel graphPanel0 = new GraphPanel((VCFview) null);
      GraphPanel.PopupListener graphPanel_PopupListener0 = graphPanel0.new PopupListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(graphPanel0, 300, 425L, 1160, 1160, 50000, (-1066), (-1066), 259, true, 2221, 0, 2221, 0.0);
      // Undeclared exception!
      try { 
        graphPanel_PopupListener0.mouseReleased(mouseWheelEvent0);
        fail("Expecting exception: IllegalComponentStateException");
      
      } catch(IllegalComponentStateException e) {
         //
         // component must be showing on the screen to determine its location
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = GraphPanel.getLineAttributes(3);
      LineAttributes[] lineAttributesArray1 = GraphPanel.getLineAttributes(1953);
      assertNotSame(lineAttributesArray1, lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = GraphPanel.getLineAttributes(3);
      LineAttributes[] lineAttributesArray1 = GraphPanel.getLineAttributes(3);
      assertSame(lineAttributesArray1, lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraphPanel graphPanel0 = new GraphPanel((VCFview) null);
      GraphPanel.PopupListener graphPanel_PopupListener0 = graphPanel0.new PopupListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(graphPanel0, 2251, 1L, 0, 0, 300, 300, 300, 0, false, 0, 217, (-1512), (-1512));
      graphPanel_PopupListener0.mouseReleased(mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getButton());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraphPanel graphPanel0 = new GraphPanel((VCFview) null);
      GraphPanel.PopupListener graphPanel_PopupListener0 = graphPanel0.new PopupListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(graphPanel0, 1379, 1379, 2009, 1379, 0, 0, 0, 419, false, (-1540), 1991, 1112, 2009);
      graphPanel_PopupListener0.mouseClicked(mouseWheelEvent0);
      assertEquals(419, mouseWheelEvent0.getClickCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraphPanel graphPanel0 = new GraphPanel((VCFview) null);
      graphPanel0.setType(2);
      assertFalse(graphPanel0.getIgnoreRepaint());
  }
}
