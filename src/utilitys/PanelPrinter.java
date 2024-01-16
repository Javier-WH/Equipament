package utilitys;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JPanel;

public class PanelPrinter implements Printable {
    private JPanel panelToPrint;
    private double scaleFactor; // Factor de escala

    public PanelPrinter(JPanel panelToPrint) {
        this.panelToPrint = panelToPrint;
        this.scaleFactor = 1.0; // Escala inicial
    }
    public PanelPrinter(JPanel panelToPrint, double scaleFactor) {
        this.panelToPrint = panelToPrint;
        this.scaleFactor = scaleFactor; // Escala inicial
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Aplicar escala
        g2d.scale(scaleFactor, scaleFactor);

        panelToPrint.printAll(graphics);

        return PAGE_EXISTS;
    }

    public void printPanel() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);

        boolean userClickedPrint = job.printDialog();
        if (userClickedPrint) {
            try {
                job.print();
            } catch (PrinterException ex) {
            	ex.printStackTrace();
            }
        }
    }
}