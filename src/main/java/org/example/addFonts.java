package org.example;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;

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
//basics adding of fonts
        Text heading = new Text("LEONTEQSECURITY").setFont(boldFont);
        Text desc = new Text("this is a cyber security company").setFont(font);
        Paragraph paragraph = new Paragraph(heading);
        Paragraph paragraph2 = new Paragraph(desc);

        document.add(paragraph);
        document.add(paragraph2);

//bod itallic coloring
        PdfFont itallic= PdfFontFactory.createFont(FontConstants.COURIER_BOLD);
        Text qust = new Text("oOOOOOOOOCH!!! i am hacked!!!!").setFont(font)
                .setBackgroundColor(Color.CYAN).
                setUnderline().
                setFontColor(Color.RED);
        Paragraph par3 = new Paragraph(qust);
        document.add(par3);
//using Style oject
        Style author = new Style();
        author.setFontColor(Color.BLUE)
                .setFontSize(30f)
                .setItalic()
                .setTextAlignment(TextAlignment.CENTER)
                .setUnderline()
        ;

Text sqlInjection = new Text("TOPIC:SQL INJECTION").addStyle(author);
Paragraph paragraph4 = new Paragraph(sqlInjection);
document.add(paragraph4);







        document.close();

    }



}
