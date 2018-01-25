/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 12:22:49 GMT 2018
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
public class HistoryBox_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.genebuilder.cv.HistoryBox"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HistoryBox_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.RangeVector",
      "htsjdk.variant.variantcontext.GenotypesContext",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "org.gmod.schema.sequence.FeaturePub",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.apache.log4j.Hierarchy",
      "htsjdk.variant.variantcontext.VariantContext$Validation",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "org.apache.log4j.or.ObjectRenderer",
      "htsjdk.variant.variantcontext.CommonInfo",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "org.gmod.schema.sequence.FeatureDbXRef",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "htsjdk.variant.variantcontext.VariantContextBuilder",
      "org.gmod.schema.sequence.Feature",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.gmod.schema.sequence.FeatureProp",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "org.gmod.schema.utils.Rankable",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "htsjdk.samtools.util.Locatable",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "org.gmod.schema.cv.Cv",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "org.apache.log4j.Priority",
      "org.biojava.bio.BioException",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "htsjdk.variant.vcf.VCFHeader",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "htsjdk.samtools.util.StringUtil",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.apache.log4j.CategoryKey",
      "htsjdk.variant.variantcontext.StructuralVariantType",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.components.genebuilder.cv.HistoryBox",
      "htsjdk.variant.variantcontext.Genotype",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.ChangeListener",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.apache.log4j.spi.RootLogger",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LineGroup",
      "htsjdk.variant.variantcontext.Allele",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "htsjdk.tribble.TribbleException",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "htsjdk.variant.variantcontext.VariantContext",
      "uk.ac.sanger.artemis.io.Entry",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "htsjdk.variant.vcf.VCFHeaderLine",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "org.apache.log4j.PropertyConfigurator",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "uk.ac.sanger.artemis.util.Document",
      "org.gmod.schema.organism.Organism",
      "org.gmod.schema.general.Db",
      "uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox",
      "org.apache.log4j.Appender",
      "htsjdk.tribble.Feature",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.components.genebuilder.cv.DatePanel",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.Logger",
      "org.gmod.schema.sequence.FeatureSynonym",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "org.apache.log4j.spi.LoggerRepository",
      "htsjdk.variant.variantcontext.VariantContext$Type",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HistoryBox_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.gmod.schema.cv.CvTerm",
      "org.gmod.schema.cv.Cv",
      "org.gmod.schema.general.Db",
      "org.gmod.schema.general.DbXRef",
      "htsjdk.variant.variantcontext.GenotypesContext",
      "htsjdk.variant.variantcontext.VariantContext$Validation",
      "htsjdk.variant.variantcontext.VariantContext"
    );
  }
}
