public class FilesDetailsSizeVisitor implements FilesDetailsVisitor {

    int totalSize = 0;

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        totalSize += txtFileDetails.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        totalSize += pptxFileDetails.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        totalSize += mp3FileDetails.getSize();
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) { totalSize += jpgFileDetails.getSize(); }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) { totalSize += htmlFileDetails.getSize(); }

    @Override
    public void visit(DocxFileDetails docxFileDetails) { totalSize += docxFileDetails.getSize(); }

    @Override
    public void visit(DirectoryDetails directoryDetails) {  ;  }

    public int getSize()
    {
        return totalSize;
    }
}
