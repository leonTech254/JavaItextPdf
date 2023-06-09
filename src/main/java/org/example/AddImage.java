package org.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class AddImage {
    public  static  void main (String[] args) throws FileNotFoundException, MalformedURLException {
        String path="/home/leon/workspace/k/addimage.pdf";
        String imagepath="/home/leon/workspace/2023/LEARN_JAVA/ItextLearn1/src/main/java/org/example/images/leonteqsecuritylogo.jpg";
        ImageData imageData = ImageDataFactory.create(imagepath);
        Image image =new Image(imageData);
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument =new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        document.add(image);
        document.close();


    }
}
