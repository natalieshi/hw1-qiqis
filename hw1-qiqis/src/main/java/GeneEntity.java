import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import edu.stanford.nlp.pipeline.POSTaggerAnnotator;
public class GeneEntity extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIterator<Annotation> it = arg0.getAnnotationIndex(sentencesTag.type).iterator();
    while(it.hasNext())
    {
      sentencesTag sTag = (sentencesTag)it.next();
      try {
        PosTagNamedEntityRecognizer recognizer=new PosTagNamedEntityRecognizer();
        Map<Integer, Integer> result;
        result=recognizer.getGeneSpans(sTag.getText());
        String text=sTag.getText();
        for(int start:result.keySet())
        {
          int idlenghth=sTag.getId().length();
          int end=result.get(start);
          int genestart=idlenghth+start;
          int geneend=idlenghth+end;
         // System.out.println(geneend+"  "+genestart);
          geneTag geneannotation= new geneTag(arg0);
          geneannotation.setBegin(genestart+1);
          geneannotation.setEnd(geneend+1);
          geneannotation.setId(sTag.getId());
          geneannotation.setGeneName(sTag.getText().substring(start, end));
          //System.out.println(geneannotation.getId());
          geneannotation.addToIndexes();
        }
      } catch (ResourceInitializationException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
    
  }

}
