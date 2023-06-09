package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class AddParagraph {
    public static void main(String[] args) throws FileNotFoundException {
        String path="/home/leon/workspace/k/paragraph.pdf";
        String myPar="In the modern age, cybersecurity is undergoing significant changes in technology and operations, and data science is driving these changes. Therefore, extracting security incident patterns or insights from cybersecurity data and building corresponding data-driven models is crucial for making a security system automated and intelligent ";
        PdfWriter pdfWriter = new PdfWriter(path);


        Paragraph paragraph= new Paragraph(myPar);
        PdfDocument pdfDocument= new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        document.add(paragraph);
        document.close();

    }
}
