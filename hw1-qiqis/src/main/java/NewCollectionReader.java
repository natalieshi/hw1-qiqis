import java.io.*;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Progress;



public class NewCollectionReader extends CollectionReader_ImplBase {
  
  BufferedReader reader = null;
  String tmp=null;
  
  @Override
  public void getNext(CAS arg0) throws IOException, CollectionException {
    // TODO Auto-generated method stub
    JCas jcas = null;
    
    
    try {
      jcas=arg0.getJCas();
    } catch (CASException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    jcas.setDocumentText(tmp);
    tmp= reader.readLine();
    reader.close();
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub  
    if(tmp==null) return false;
    return true;
    
  }
  
  public void  intialize()  throws ResourceInitializationException{  
    try {
  
        reader = new BufferedReader(new FileReader("/hw1-qiqis/src/main/resources/data/sample.in"));
        tmp=reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
   
  }
   
}
