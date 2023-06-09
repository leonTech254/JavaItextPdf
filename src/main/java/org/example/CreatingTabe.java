package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;

public class CreatingTabe {
    public  static void main(String[] args) throws FileNotFoundException {
        String path="/home/leon/workspace/k/table.pdf";
        PdfWriter pdfWriter =new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        float columnWidth[]={200f ,200f};
        Table table = new Table(columnWidth);
        table.addCell(new Cell().add("Movies"));
        table.addCell(new Cell().add("Rating"));

        table.addCell(new Cell().add("Blindspot"));
        table.addCell(new Cell().add("9"));

        table.addCell(new Cell().add("BlackList"));
        table.addCell(new Cell().add("8"));
        document.add(table);
        document.close();


    }
}
