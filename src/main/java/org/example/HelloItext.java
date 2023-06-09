package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import java.io.FileNotFoundException;

public class HelloItext {

    public  static  void main(String[] arg) throws FileNotFoundException {
        String path = "/home/leon/workspace/k/hello.pdf"; //the path where you want the document to be saved
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        document.close();




    }
}
