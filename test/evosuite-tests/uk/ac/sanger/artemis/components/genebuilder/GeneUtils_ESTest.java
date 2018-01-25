/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:28:42 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.datatransfer.Clipboard;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import org.biojava.bio.symbol.DoubleAlphabet;
import org.biojava.ontology.Ontology;
import org.biojava.ontology.Term;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.FeaturePredicate;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.SimpleGotoEventSource;
import uk.ac.sanger.artemis.chado.FeatureForUpdatingResidues;
import uk.ac.sanger.artemis.components.genebuilder.GeneUtils;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.ChadoCanonicalGene;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeneUtils_ESTest extends GeneUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        GeneUtils.promptForUniquename((EntryGroup) simpleEntryGroup0, false, (Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = GeneUtils.isHiddenFeature("pseudogenic_transcript");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = GeneUtils.isFeatureToUpdateResidues("^< ^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.showHideGeneFeatures((FeatureVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashSet<List> hashSet0 = new HashSet<List>();
      // Undeclared exception!
      try { 
        GeneUtils.propagateId((GFFStreamFeature) null, "GO", hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        GeneUtils.promptForUniquename((EntryGroup) simpleEntryGroup0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.isStrandOK(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isObsolete((GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isNonCodingTranscripts((Key) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isGFFEntry((EntryGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isDatabaseEntry((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isDatabaseEntry((EntryGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.isBoundaryOK(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.getFeatureForUpdatingResidues((GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashSet<MSPcrunchDocumentEntry> hashSet0 = new HashSet<MSPcrunchDocumentEntry>(28);
      hashSet0.add((MSPcrunchDocumentEntry) null);
      // Undeclared exception!
      try { 
        GeneUtils.fixParentQualifier("", "", hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0, false);
      // Undeclared exception!
      try { 
        GeneUtils.deriveResidues(gFFStreamFeature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.deleteAllFeature((uk.ac.sanger.artemis.Feature) null, chadoCanonicalGene0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.defineShowHideGeneFeatures((FeatureVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("B`,hixP-sjxMSG'Ag");
      Selection selection0 = new Selection(clipboard0);
      FeatureVector featureVector0 = selection0.getAllFeatures();
      // Undeclared exception!
      try { 
        GeneUtils.defineShowHideGeneFeatures(featureVector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard((String) null);
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      // Undeclared exception!
      try { 
        GeneUtils.createGeneModel((JFrame) null, selection0, (EntryGroup) null, simpleGotoEventSource0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.convertPseudo(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.checkTranscriptBoundary((uk.ac.sanger.artemis.Feature) null, chadoCanonicalGene0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.checkGeneBoundary((ChadoCanonicalGene) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.addLazyQualifiers((GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = GeneUtils.isFeatureToUpdateResidues("snRNA");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GeneUtils.checkGeneBoundary(chadoCanonicalGene0, true);
      assertEquals(0, chadoCanonicalGene0.getSeqlen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0, false);
      FeatureForUpdatingResidues featureForUpdatingResidues0 = GeneUtils.getFeatureForUpdatingResidues(gFFStreamFeature0);
      assertNull(featureForUpdatingResidues0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Key key0 = new Key("rRNA");
      boolean boolean0 = GeneUtils.isNonCodingTranscripts(key0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      boolean boolean0 = GeneUtils.isNonCodingTranscripts(key0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleAlphabet.SubDoubleAlphabet doubleAlphabet_SubDoubleAlphabet0 = DoubleAlphabet.getSubAlphabet((-3098.8628421022263), (-3098.8628421022263));
      DoubleAlphabet.DoubleSymbol doubleAlphabet_DoubleSymbol0 = doubleAlphabet_SubDoubleAlphabet0.getSymbol((-3098.8628421022263));
      Set set0 = doubleAlphabet_DoubleSymbol0.getBases();
      // Undeclared exception!
      try { 
        GeneUtils.fixParentQualifier("\"dD", "  \"4P2", set0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.biojava.bio.symbol.DoubleAlphabet$DoubleSymbol cannot be cast to uk.ac.sanger.artemis.io.Feature
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ontology.Impl ontology_Impl0 = new Ontology.Impl("pseudogenic_transcript", "pseudogenic_transcript");
      Set set0 = ontology_Impl0.getTriples((Term) null, (Term) null, (Term) null);
      GeneUtils.fixParentQualifier("pseudogenic_transcript", "pseudogenic_transcript", set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      uk.ac.sanger.artemis.Feature feature0 = new uk.ac.sanger.artemis.Feature(emblStreamFeature0);
      // Undeclared exception!
      try { 
        GeneUtils.checkTranscriptBoundary(feature0, chadoCanonicalGene0, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      boolean boolean0 = GeneUtils.isDatabaseEntry((Feature) emblStreamFeature0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "pseudogenic_exon");
      filteredEntryGroup0.createEntry("pseudogenic_exon");
      boolean boolean0 = GeneUtils.isGFFEntry(simpleEntryGroup0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "pseudogenic_exon");
      filteredEntryGroup0.createEntry("pseudogenic_exon");
      boolean boolean0 = GeneUtils.isDatabaseEntry((EntryGroup) simpleEntryGroup0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeatureVector) null, ")~GP_nC!");
      Bases bases0 = new Bases((Sequence) null);
      Entry entry0 = Entry.newEntry(bases0);
      filteredEntryGroup0.add(entry0);
      String string0 = GeneUtils.promptForUniquename((EntryGroup) simpleEntryGroup0, false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("}8ZH.E,]W/");
      Bases bases0 = new Bases(rawStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FeatureVector featureVector0 = new FeatureVector();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureVector0, "hm q<b%?4iS6=7\"a");
      Entry entry0 = filteredEntryGroup0.createEntry();
      uk.ac.sanger.artemis.Feature feature0 = filteredEntryGroup0.createFeature();
      Range range0 = feature0.getMaxRawRange();
      FeatureVector featureVector1 = entry0.getFeaturesInRange(range0);
      GeneUtils.showHideGeneFeatures(featureVector1);
      assertNotSame(featureVector1, featureVector0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0);
      Clipboard clipboard0 = new Clipboard((String) null);
      Selection selection0 = new Selection(clipboard0);
      RangeVector rangeVector0 = selection0.getSelectionRanges();
      Range range0 = new Range(1265, 1265);
      rangeVector0.add(range0);
      GeneUtils.addSegment(gFFStreamFeature0, rangeVector0, "Y\"Z*kug)qJ");
      assertFalse(rangeVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GeneUtils.complementGeneModel((ChadoCanonicalGene) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.complementGeneModel(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0, false);
      GeneUtils.addLazyQualifiers(gFFStreamFeature0);
      assertTrue(gFFStreamFeature0.isVisible());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0, false);
      gFFStreamFeature0.setLazyLoaded(true);
      GeneUtils.addLazyQualifiers(gFFStreamFeature0);
      assertFalse(gFFStreamFeature0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = GeneUtils.isHiddenFeature("17~8S8Q,x$FDm5\"zx7&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.deleteAllFeature((uk.ac.sanger.artemis.Feature) null, chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GeneUtils.checkGeneBoundary(chadoCanonicalGene0);
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = GeneUtils.getNonCodingTranscripts();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.checkTranscriptBoundary((uk.ac.sanger.artemis.Feature) null, chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.getUniqueName((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GeneUtils geneUtils0 = new GeneUtils();
  }
}
