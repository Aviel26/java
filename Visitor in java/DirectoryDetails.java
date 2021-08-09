// TODO: Implement Composite (change this file).


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDetails extends FileDetails {
    private List<FileDetails> liste = new LinkedList<>();
    public DirectoryDetails(String path, String name){
        super(path,name);
    }
    public void addFile(final FileDetails fileDetails){ liste.add(fileDetails); }



    @Override
    public void accept(FilesDetailsVisitor filesDetailsVisitor) {
        for (int i = 0; i < liste.size(); i++) {
            liste.get(i).accept(filesDetailsVisitor);
        }

        filesDetailsVisitor.visit(this);
    }

}


