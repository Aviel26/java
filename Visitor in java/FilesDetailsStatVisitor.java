import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FilesDetailsStatVisitor implements FilesDetailsVisitor{
    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println("The file "+ txtFileDetails.getName() + " contains " + txtFileDetails.getWords() +" words.");
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        double averageSlides = (double)pptxFileDetails.getSize() / pptxFileDetails.getSlides();
        System.out.println("The average slide size in Presentation "+ pptxFileDetails.getName()+" is "+ String.format("%.6f",averageSlides) +".");
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        double average = (double)mp3FileDetails.getSize() / mp3FileDetails.getLengthSec();
        System.out.println("The bitrate of " + mp3FileDetails.getName() +" is " + String.format("%.6f",average) + " bytes per second.");
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        double average = (double)jpgFileDetails.getSize() / (jpgFileDetails.getHeight() * jpgFileDetails.getWidth());
        System.out.println("The picture "+ jpgFileDetails.getName() + " has an average of " + String.format("%.6f",average) + " bits per pixel.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file "+ htmlFileDetails.getName()+ " contains " + htmlFileDetails.getLines() + " lines.");
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        double average = (double)docxFileDetails.getWords() / docxFileDetails.getPages();
        System.out.println("The file " + docxFileDetails.getName() + " has an average of " + String.format("%.6f",average) + " words per page.");
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        directoryDetails.accept(new FilesDetailsCountVisitor());
        FilesDetailsCountVisitor count = new FilesDetailsCountVisitor();
        directoryDetails.accept(count);
        System.out.println("Directory "+ directoryDetails.getName() + " has " + count.getCount() + " files.");
    }
}
