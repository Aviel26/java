public class FilesDetailsCountVisitor implements FilesDetailsVisitor{
    int count = 0;
    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        count += 1;
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) { count += 1;}

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) { count += 1;}

    @Override
    public void visit(JpgFileDetails jpgFileDetails) { count += 1; }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) { count += 1; }

    @Override
    public void visit(DocxFileDetails docxFileDetails) { count += 1; }

    @Override
    public void visit(DirectoryDetails directoryDetails) { ; }

    public int getCount() { return count;}
}
