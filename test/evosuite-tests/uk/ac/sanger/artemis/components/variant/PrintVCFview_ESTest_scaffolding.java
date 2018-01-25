/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 13:32:00 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class PrintVCFview_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.variant.PrintVCFview"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PrintVCFview_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.components.EntryEdit$CommitButton",
      "uk.ac.sanger.artemis.components.variant.VCFview$27",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "org.apache.batik.svggen.SVGRenderingHints",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "org.apache.batik.svggen.CachedImageHandlerPNGEncoder",
      "uk.ac.sanger.artemis.components.variant.VCFview",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "org.apache.batik.dom.xbl.XBLManagerData",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "org.apache.batik.svggen.AbstractSVGConverter",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.emboss.jemboss.JembossParams",
      "org.apache.batik.dom.events.DOMUIEvent",
      "htsjdk.samtools.util.CloseableIterator",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "org.apache.batik.util.CleanerThread",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "org.apache.batik.dom.AbstractElementNS",
      "uk.ac.sanger.artemis.components.genebuilder.gff.RemoveButton",
      "uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel",
      "org.apache.batik.dom.AbstractParentNode$ElementsByTagName",
      "org.apache.log4j.Hierarchy",
      "htsjdk.samtools.seekablestream.SeekableFileStream",
      "org.emboss.jemboss.gui.Browser$3",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.apache.batik.svggen.SVGCompositeDescriptor",
      "org.emboss.jemboss.gui.Browser$4",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "org.emboss.jemboss.gui.Browser$6",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.log4j.spi.OptionHandler",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "org.apache.batik.svggen.SVGFontDescriptor",
      "org.apache.batik.svggen.SVGAlphaComposite",
      "uk.ac.sanger.artemis.components.variant.VCFRecord",
      "org.apache.batik.svggen.SVGTransform$1",
      "htsjdk.samtools.seekablestream.SeekableStream",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.apache.batik.svggen.SVGCustomComposite",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.circular.TextFieldInt",
      "uk.ac.sanger.artemis.editor.MultiLineToolTipUI",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "uk.ac.sanger.artemis.components.variant.VCFFilter",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "org.apache.batik.svggen.SVGGraphicObjectConverter",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.genebuilder.cv.CVPanel",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "htsjdk.samtools.SAMException",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.apache.batik.svggen.SVGDescriptor",
      "org.apache.batik.dom.xbl.XBLManager",
      "org.gmod.schema.sequence.FeatureDbXRef",
      "uk.ac.sanger.artemis.components.variant.AbstractVCFReader",
      "uk.ac.sanger.artemis.util.URLDocument",
      "org.gmod.schema.pub.Pub",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "uk.ac.sanger.artemis.components.alignment.BamView$41",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.EntrySource",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "org.apache.batik.svggen.SVGComposite",
      "uk.ac.sanger.artemis.components.alignment.BamView$47",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "org.apache.batik.svggen.SVGPolygon",
      "htsjdk.samtools.util.RuntimeIOException",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.util.XMLConstants",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "htsjdk.samtools.SAMSequenceDictionary",
      "org.apache.log4j.spi.AppenderAttachable",
      "uk.ac.sanger.artemis.editor.ScrollPanel",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.util.PushBackException",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.plot.CodonUsageFormatException",
      "org.apache.batik.svggen.DOMTreeManager",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "org.apache.batik.dom.ExtendedNode",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "htsjdk.samtools.reference.ReferenceSequenceFile",
      "uk.ac.sanger.artemis.components.EditMenu",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.AbstractAttrNS",
      "org.apache.batik.svggen.SVGColor",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "org.apache.batik.util.SVGConstants",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "org.apache.batik.dom.AbstractDocument$IdSoftRef",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "org.apache.batik.svggen.SVGGeneratorContext$GraphicContextDefaults",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.MarkerRangeRequesterListener",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "org.apache.batik.dom.AbstractCharacterData",
      "uk.ac.sanger.artemis.components.alignment.BamFrame",
      "org.apache.log4j.helpers.Loader",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.components.genebuilder.GeneEditorPanel",
      "uk.ac.sanger.artemis.components.SelectionMenu",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "uk.ac.sanger.artemis.components.variant.FilteredPanel",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "org.apache.batik.svggen.SVGHintsDescriptor",
      "uk.ac.sanger.artemis.components.alignment.SAMRecordPredicate",
      "org.apache.batik.svggen.SVGLine",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.apache.batik.dom.GenericCDATASection",
      "org.apache.batik.dom.events.EventSupport",
      "org.apache.batik.svggen.SVGPath",
      "org.apache.batik.dom.xbl.NodeXBL",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.util.CSSConstants",
      "org.apache.batik.svggen.GenericImageHandler",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "uk.ac.sanger.artemis.components.alignment.CoveragePanel",
      "uk.ac.sanger.artemis.components.genebuilder.gff.AddButton",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.GenericAttrNS",
      "org.apache.batik.svggen.ExtensionHandler",
      "uk.ac.sanger.artemis.components.alignment.LookSeqPanel$13",
      "org.apache.batik.svggen.SVGFont",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "org.gmod.schema.dao.CvDaoI",
      "org.apache.batik.dom.GenericElementNS",
      "uk.ac.sanger.artemis.util.FTPSeekableStream",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.circular.TextFieldSink",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "org.apache.batik.svggen.SVGGraphics2DIOException",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "org.apache.batik.dom.AbstractElement$ElementTypeInfo",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.circular.TextFieldFloat",
      "uk.ac.sanger.artemis.util.Document",
      "org.apache.batik.svggen.SVGLinearGradient",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "uk.ac.sanger.artemis.components.FileViewer",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "uk.ac.sanger.artemis.Selection",
      "org.apache.batik.dom.util.DOMUtilities",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "org.apache.batik.svggen.DefaultErrorHandler",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "org.apache.log4j.spi.LoggerRepository",
      "htsjdk.samtools.SAMSequenceRecord",
      "uk.ac.sanger.artemis.components.Splash",
      "org.apache.batik.svggen.SVGTransform",
      "uk.ac.sanger.artemis.components.TextRequesterListener",
      "org.apache.batik.dom.GenericDocument",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton",
      "uk.ac.sanger.artemis.components.AddMenu",
      "htsjdk.samtools.util.Log$LogLevel",
      "htsjdk.samtools.FileTruncatedException",
      "org.apache.batik.dom.AbstractChildNode",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "org.apache.batik.i18n.LocalizableSupport",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.components.RunMenu",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "uk.ac.sanger.artemis.components.EntryGroupDisplay$3",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "org.apache.batik.dom.xbl.OriginalEvent",
      "org.apache.batik.svggen.SVGTexturePaint",
      "htsjdk.samtools.util.BlockCompressedInputStream",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "org.apache.batik.dom.util.SAXDocumentFactory",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "uk.ac.sanger.artemis.components.BasePlot",
      "org.apache.batik.util.CleanerThread$ReferenceCleared",
      "org.gmod.schema.sequence.FeaturePub",
      "org.apache.batik.svggen.SVGCustomPaint",
      "org.apache.batik.dom.GenericAttr",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "org.apache.batik.svggen.CachedImageHandler",
      "org.apache.batik.dom.AbstractNode$1",
      "uk.ac.sanger.artemis.components.ViewMenu",
      "org.apache.batik.svggen.ImageCacher$External",
      "uk.ac.sanger.artemis.components.StickyFileChooser",
      "org.apache.batik.dom.AbstractAttr",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.apache.batik.xml.XMLUtilities",
      "org.apache.batik.ext.awt.g2d.TransformStackElement",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.batik.dom.AbstractNode",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "org.apache.batik.svggen.SVGIDGenerator",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.ErrorHandler",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.components.GotoMenu",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.svggen.SVGConvolveOp",
      "org.apache.batik.dom.AbstractDocument",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$5",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$3",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$4",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$1",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$2",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "org.apache.batik.svggen.SVGEllipse",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "uk.ac.sanger.artemis.components.EntryGroupDisplay",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.batik.util.CleanerThread$SoftReferenceCleared",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.components.GraphMenu",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "org.apache.batik.dom.events.AbstractEvent",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.components.SelectMenu",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.plot.UserDataAlgorithm",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.batik.dom.events.DocumentEventSupport",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "org.apache.batik.svggen.SVGRescaleOp",
      "org.apache.batik.svggen.StyleHandler",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.components.SelectionSubMenu",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.gmod.schema.sequence.FeatureProp",
      "org.apache.batik.svggen.ImageHandler",
      "org.gmod.schema.utils.Rankable",
      "uk.ac.sanger.artemis.components.EntryGroupMenu",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.gmod.schema.dao.OrganismDaoI",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "htsjdk.samtools.util.LocationAware",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "org.apache.batik.svggen.ImageHandlerBase64Encoder",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.components.WriteMenu",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.svggen.SVGFilterDescriptor",
      "uk.ac.sanger.artemis.components.IndexReferenceListener",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "org.apache.batik.svggen.AbstractSVGFilterConverter",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "uk.ac.sanger.artemis.components.alignment.SnpPanel",
      "org.apache.batik.dom.util.SAXIOException",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.or.RendererMap",
      "htsjdk.samtools.cram.ref.CRAMReferenceSource",
      "org.apache.batik.i18n.Localizable",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "org.apache.batik.svggen.DefaultImageHandler",
      "uk.ac.sanger.artemis.ExternalProgram",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.DocumentFactory",
      "org.apache.batik.svggen.SVGRectangle",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "uk.ac.sanger.artemis.Entry",
      "org.apache.batik.dom.GenericDOMImplementation",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "org.apache.batik.dom.GenericDocumentType",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "htsjdk.samtools.seekablestream.SeekableBufferedStream",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "htsjdk.samtools.seekablestream.SeekableHTTPStream",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "org.apache.batik.svggen.SVGBasicStroke",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.apache.batik.svggen.SVGConverter",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.spi.RootLogger",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.apache.batik.svggen.ErrorConstants",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.components.alignment.BamView$Ruler",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.batik.dom.events.NodeEventTarget",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.util.FileDocument",
      "org.apache.batik.dom.xbl.GenericXBLManager",
      "org.apache.batik.svggen.SVGPaint",
      "htsjdk.samtools.util.Log",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "uk.ac.sanger.artemis.io.LineGroup",
      "org.apache.batik.svggen.SVGGraphicContext",
      "uk.ac.sanger.artemis.GotoEventSource",
      "org.apache.commons.net.ftp.FTPConnectionClosedException",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.batik.svggen.SVGBufferedImageOp",
      "uk.ac.sanger.artemis.components.SequenceComboBox",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "org.apache.batik.svggen.SVGFilterConverter",
      "uk.ac.sanger.artemis.EntryGroup",
      "org.apache.batik.util.Base64EncoderStream",
      "uk.ac.sanger.artemis.io.Feature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.components.EntryEdit$8",
      "uk.ac.sanger.artemis.components.EntryEdit$7",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "uk.ac.sanger.artemis.components.alignment.LookSeqPanel",
      "org.apache.batik.svggen.SVGPaintDescriptor",
      "uk.ac.sanger.artemis.components.variant.GraphPanel",
      "org.apache.batik.svggen.ImageCacher",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.apache.batik.svggen.SVGStrokeDescriptor",
      "org.apache.batik.svggen.SVGArc",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "uk.ac.sanger.artemis.components.alignment.BamView",
      "org.gmod.schema.organism.Organism",
      "org.apache.batik.dom.AbstractParentNode$ElementsByTagNameNS",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "org.apache.batik.dom.AbstractElement$Entry",
      "uk.ac.sanger.artemis.components.variant.PrintVCFview",
      "uk.ac.sanger.artemis.Logger",
      "org.gmod.schema.sequence.FeatureSynonym",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.components.EntryEdit",
      "org.apache.batik.dom.GenericElement",
      "uk.ac.sanger.artemis.components.FeatureList",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "org.apache.batik.svggen.SVGClipDescriptor",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "org.apache.batik.svggen.SVGShape",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.apache.batik.svggen.SVGSyntax",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PrintVCFview_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.editor.ScrollPanel",
      "uk.ac.sanger.artemis.components.variant.PrintVCFview",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.components.variant.VCFview",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.components.EntryEdit",
      "org.apache.batik.dom.AbstractNode",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.dom.GenericDocument",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.AbstractElementNS",
      "org.apache.batik.dom.GenericElementNS",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.dom.util.DOMUtilities",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "org.apache.batik.dom.AbstractAttr",
      "org.apache.batik.dom.GenericAttr",
      "org.apache.batik.dom.AbstractCharacterData",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.dom.AbstractElement$Entry",
      "org.apache.batik.util.CleanerThread",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.dom.GenericDOMImplementation",
      "org.emboss.jemboss.JembossParams",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "org.apache.batik.dom.GenericElement",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "org.apache.batik.svggen.CachedImageHandlerPNGEncoder",
      "org.apache.batik.dom.GenericCDATASection",
      "htsjdk.samtools.util.Log$LogLevel",
      "htsjdk.samtools.util.Log",
      "htsjdk.samtools.SAMSequenceDictionary",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.Packing",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "org.apache.batik.dom.AbstractAttrNS",
      "org.apache.batik.dom.GenericAttrNS"
    );
  }
}
