import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

import edu.stanford.nlp.pipeline.POSTaggerAnnotator;
public class GeneEntity extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
   FSIterator<Annotation> it = arg0.getAnnotationIndex(sentencesTag.type).iterator();
    System.out.println("aaaaa");
    File f=new File("src/main/resources/ne-en-bio-genetag.HmmChunker");

    Chunker chunker = null;
    try {
      chunker = (Chunker) AbstractExternalizable.readObject(f);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    while(it.hasNext())
    {
      sentencesTag sTag = (sentencesTag)it.next();
     try {
       /* PosTagNamedEntityRecognizer recognizer=new PosTagNamedEntityRecognizer();
        Map<Integer, Integer> result;
        String text=sTag.getText();
        result=recognizer.getGeneSpans(text);
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
      */
      int start, end;
      String text=sTag.getText();
      System.out.println("aasss");

      Chunking chunking = chunker.chunk(text);
      int idlength= sTag.getId().length();
      for(Chunk chunkit: chunking.chunkSet()) 
      {
        
        start=text.substring(0, chunkit.start()).replace("\\s", "").length();
        //whitespace-excluded offsets are calculated only until cas consumer
        end=-1+text.substring(0, chunkit.end()).replace("\\s", "").length();
        geneTag geneannotation= new geneTag(arg0);
        geneannotation.setBegin(start);
        geneannotation.setEnd(end);
        geneannotation.setId(sTag.getId());
        geneannotation.setGeneName(sTag.getText().substring(chunkit.start(),chunkit.end()));
        //System.out.println(geneannotation.getId());
        geneannotation.addToIndexes();
      }
      
     }
     finally
     {
       
     }
      
     }
    }
    
  }



