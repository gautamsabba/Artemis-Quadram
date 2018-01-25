/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 12:22:53 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.cv;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DatePanel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.genebuilder.cv.DatePanel"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DatePanel_ESTest_scaffolding.class.getClassLoader() ,
      "htsjdk.variant.vcf.VCFHeaderLine",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.variant.vcf.VCFHeader",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "htsjdk.samtools.util.Log$LogLevel",
      "htsjdk.tribble.TribbleException",
      "org.emboss.jemboss.gui.Browser$3",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "uk.ac.sanger.artemis.components.genebuilder.cv.DatePanel",
      "org.emboss.jemboss.gui.Browser$6",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "org.emboss.jemboss.gui.Browser",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "uk.ac.sanger.artemis.components.genebuilder.cv.DatePanel$1",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "htsjdk.samtools.SAMException",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "htsjdk.samtools.SAMSequenceDictionary",
      "htsjdk.variant.variantcontext.VariantContextComparator",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "htsjdk.samtools.util.Log",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "htsjdk.samtools.SAMSequenceRecord",
      "org.emboss.jemboss.JembossParams"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DatePanel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.genebuilder.cv.DatePanel",
      "org.emboss.jemboss.JembossParams",
      "org.emboss.jemboss.gui.Browser",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.samtools.SAMSequenceRecord",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "htsjdk.variant.vcf.VCFHeader"
    );
  }
}
