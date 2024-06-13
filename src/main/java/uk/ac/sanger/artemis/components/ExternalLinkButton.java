package uk.ac.sanger.artemis.components;

import uk.ac.sanger.artemis.*;
import uk.ac.sanger.artemis.sequence.*;

import uk.ac.sanger.artemis.io.StreamQualifier;
import uk.ac.sanger.artemis.io.QualifierInfo;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.util.OutOfRangeException;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import java.net.URI;

public class ExternalLinkButton extends CanvasPanel
implements SelectionChangeListener, MouseListener, MouseMotionListener {
  private Rectangle linkBounds; // To hold the clickable area for the link
  private String currentGeneName; // To hold the gene name associated with the link

  public ExternalLinkButton(final EntryGroup entry_group,
                            final Selection selection) {
    super();
    this.entry_group = entry_group;
    this.selection = selection;

    getSelection().addSelectionChangeListener(this);
    addComponentListener(new ComponentAdapter() 
    {
      public void componentResized(ComponentEvent e) 
      {
        setSize(getSize().width,
                getFontHeight()+1);
        repaint();
      }
      public void componentShown(ComponentEvent e) 
      {
        setSize(getSize().width,
                getFontHeight()+1);
        repaint();
      }
    });
    addMouseListener(this);
    addMouseMotionListener(this);

    setBackground(new Color(242,247,216));
    setSize(80, getFontHeight() + 25);
    setBorder(BorderFactory.createLineBorder(Color.black));
  }

  @Override
  public void paintComponent(final Graphics g) {
    super.paintComponent(g);
    if (!isVisible()) return;

    currentGeneName = getGeneNames(); // Fetch the gene names
    String preText = "ECOCYC: ";
    
    g.setColor(Color.black);

    // Set the font to bold for the gene name
    Font originalFont = g.getFont(); // Preserve the original font
    Font boldFont = originalFont.deriveFont(Font.BOLD); // Create a bold font based on the original
    g.setFont(boldFont);
    
    FontMetrics metrics = g.getFontMetrics();
    
    int totalTextHeight = metrics.getAscent() + metrics.getDescent();
    int panelHeight = getHeight();

    // Vertical centering: adjust to baseline of text
    int y = (panelHeight - totalTextHeight) / 2 + metrics.getAscent(); 

    int x = 2;

    // Draw the static text part "GENES: "
    int preTextWidth = metrics.stringWidth(preText);
    g.drawString(preText, x, y);

    // Set text color for gene name, make it clickable
    g.setColor(Color.BLUE);

    int linkX = x + preTextWidth; // Starting position of the clickable gene name
    g.drawString(currentGeneName, linkX, y);

    // Underline the gene name
    int geneNameWidth = metrics.stringWidth(currentGeneName);
    g.drawLine(linkX, y + 1, linkX + geneNameWidth, y + 1);

    // Define the clickable area for the gene name
    linkBounds = new Rectangle(linkX, y - metrics.getAscent(), geneNameWidth, metrics.getHeight());

    // Reset to the original font if further text follows
    g.setFont(originalFont);
  }

  private String getGeneNames() {
    final FeatureVector features = getSelection().getAllFeatures();
    StringBuilder geneNames = new StringBuilder();
    if (features.size() > 0 && features.size() < 100) {
      for (int i = 0; i < Math.min(10, features.size()); ++i) {
        if (i != 0) geneNames.append(' ');
        geneNames.append(features.elementAt(i).getGeneName());
      }
    }
    return geneNames.toString();
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    if (linkBounds != null && linkBounds.contains(e.getPoint())) {
      String url = "https://ecocyc.org/ECOLI/substring-search?type=NIL&object=" + currentGeneName;
      openWebpage(url);
    }
  }

  private void openWebpage(String url) {
    try {
      Desktop.getDesktop().browse(new URI(url));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
// MouseMotionListener implementation
  @Override
  public void mouseMoved(MouseEvent e) {
    if (linkBounds != null && linkBounds.contains(e.getPoint())) {
      setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Set cursor to hand when over the link
    } else {
      setCursor(Cursor.getDefaultCursor()); // Reset cursor
    }
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    // This method can remain empty if drag functionality is not needed
  }
  // Required implementations for unused mouse events
  @Override public void mousePressed(MouseEvent e) {}
  @Override public void mouseReleased(MouseEvent e) {}
  @Override public void mouseEntered(MouseEvent e) {}
  @Override public void mouseExited(MouseEvent e) {}

    /**
   *  Return the Selection reference that was passed to the constructor.
   **/
  private Selection getSelection () 
  {
    return selection;
  }

  /**
   *  Return the Selection object that was passed to the constructor.
   **/
  private EntryGroup getEntryGroup () 
  {
    return entry_group;
  }

  /**
   *  The reference of the EntryGroup object that was passed to the
   *  constructor.
   **/
  private EntryGroup entry_group;

  /**
   *  This is a reference to the Selection object that created this
   *  component.
   **/
  private final Selection selection;

  /**
   *  Implementation of the SelectionChangeListener interface.  We listen to
   *  SelectionChange events so that we can update the list to reflect the
   *  current selection.
   **/
  public void selectionChanged(SelectionChangeEvent event) 
  {
    repaint();
  }

  
  /**
   *
   **/
  public Dimension getPreferredSize() 
  {
    return new Dimension(10, getFontHeight());
  }

  /**
   *
   **/
  public Dimension getMinimumSize() 
  {
    return new Dimension(10, getFontHeight());
  }

}
