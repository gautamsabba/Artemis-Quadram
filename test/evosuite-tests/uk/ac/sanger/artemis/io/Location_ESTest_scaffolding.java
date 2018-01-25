/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 15:08:20 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Location_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.io.Location"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Location_ESTest_scaffolding.class.getClassLoader() ,
      "htsjdk.variant.vcf.VCFHeaderLine",
      "uk.ac.sanger.artemis.io.Location",
      "htsjdk.variant.variantcontext.Allele",
      "htsjdk.samtools.util.RuntimeEOFException",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.variant.vcf.VCFHeader",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "htsjdk.samtools.util.Log$LogLevel",
      "htsjdk.tribble.TribbleException",
      "uk.ac.sanger.artemis.io.UpperInteger",
      "htsjdk.samtools.util.StringUtil",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "htsjdk.samtools.util.RuntimeIOException",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.LocationLexer",
      "uk.ac.sanger.artemis.io.FuzzyRange",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "htsjdk.samtools.util.BinaryCodec",
      "htsjdk.samtools.SAMException",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "htsjdk.samtools.SAMSequenceDictionary",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "htsjdk.variant.variantcontext.VariantContextComparator",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.RangeVector",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "htsjdk.samtools.util.Log",
      "uk.ac.sanger.artemis.io.LowerInteger",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "htsjdk.samtools.SAMSequenceRecord",
      "uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Location_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "htsjdk.samtools.util.StringUtil",
      "htsjdk.variant.variantcontext.Allele",
      "htsjdk.variant.vcf.VCFHeader",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.samtools.SAMSequenceRecord"
    );
  }
}
