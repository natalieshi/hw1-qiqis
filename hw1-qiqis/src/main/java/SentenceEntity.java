import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;


public class SentenceEntity extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
     sentencesTag sentencesTag=new sentencesTag(arg0);
     String tmp= arg0.getDocumentText();
     int index=tmp.indexOf(" ");
     sentencesTag.setId(tmp.substring(0, index-1));
     sentencesTag.setText(tmp.substring(index+1, tmp.length()-1));
     sentencesTag.addToIndexes();
  }

}
