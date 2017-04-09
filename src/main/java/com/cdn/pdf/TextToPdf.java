package com.cdn.pdf;

import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPage;

/**
 * Created by Chandan on 08-04-2017.
 */
public class TextToPdf {
    private String inputFileName;
    private String outputFileName;

    public TextToPdf(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public boolean toPdf() {
        boolean pdfGenerated = false;

        try {
            PdfDocument pdfDocument = new PdfDocument();
            PdfPage pdfPage = new PdfPage();
            pdfDocument.add(pdfPage);

            pdfGenerated = true;
        } catch (Exception e) {
            e.printStackTrace();
            pdfGenerated = false;
        }

        return pdfGenerated;
    }
}
