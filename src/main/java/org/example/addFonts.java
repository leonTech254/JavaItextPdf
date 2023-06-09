package org.example;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.FileNotFoundException;
import java.io.IOException;

public class addFonts {
    static String path="/home/leon/workspace/k/Font.pdf";
    public  static  void  main(String[] args) throws IOException {
        PdfWriter pdfWriter= new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont boldFont = PdfFontFactory.createFont(FontConstants.COURIER_BOLD);

        Text heading = new Text("LEONTEQSECURITY").setFont(boldFont);
        Text desc = new Text("this is a cyber security company").setFont(font);
        Paragraph paragraph = new Paragraph(heading);
        Paragraph paragraph2 = new Paragraph(desc);

        document.add(paragraph);
        document.add(paragraph2);




        document.close();

    }



}
