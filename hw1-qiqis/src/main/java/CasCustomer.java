import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceProcessException;


public class CasCustomer extends CasConsumer_ImplBase {

  @Override
  public void processCas(CAS arg0) throws ResourceProcessException {
    // TODO Auto-generated method stub
    File f= new File("/hw1-qiqis/src/main/resources/data/Newsample.out");
    BufferedWriter bw = null;
    try {
      bw = new BufferedWriter(new FileWriter(f));
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    FSIterator<AnnotationFS> it = arg0.getAnnotationIndex().iterator();
    if(it.hasNext())
    {
      geneTag gt=(geneTag) it.next();
      
      try {
        bw.write(gt.getId()+"|"+gt.getBegin()+" "+gt.getEnd()+" "+gt.getGeneName());
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    try {
      bw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
