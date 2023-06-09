package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;

import java.io.FileNotFoundException;

public class AddingList {
    public  static  void  main(String[] args) throws FileNotFoundException {
        String path="/home/leon/workspace/k/list.pdf";
        List list = new List();
        list.add("java");
        list.add("python");
        list.add("php");
        list.add("ruby");
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);
        document.add(list);
        document.close();

    }
}
