
/* First created by JCasGen Mon Sep 22 14:34:49 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** the type for gene
 * Updated by JCasGen Wed Sep 24 18:36:07 EDT 2014
 * @generated */
public class geneTag_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
 
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (geneTag_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = geneTag_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new geneTag(addr, geneTag_Type.this);
  			   geneTag_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new geneTag(addr, geneTag_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = geneTag.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("geneTag");



  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "geneTag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "geneTag");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_start;
  /** @generated */
  final int     casFeatCode_start;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStart(int addr) {
        if (featOkTst && casFeat_start == null)
      jcas.throwFeatMissing("start", "geneTag");
    return ll_cas.ll_getIntValue(addr, casFeatCode_start);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStart(int addr, int v) {
        if (featOkTst && casFeat_start == null)
      jcas.throwFeatMissing("start", "geneTag");
    ll_cas.ll_setIntValue(addr, casFeatCode_start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ed;
  /** @generated */
  final int     casFeatCode_ed;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEd(int addr) {
        if (featOkTst && casFeat_ed == null)
      jcas.throwFeatMissing("ed", "geneTag");
    return ll_cas.ll_getIntValue(addr, casFeatCode_ed);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEd(int addr, int v) {
        if (featOkTst && casFeat_ed == null)
      jcas.throwFeatMissing("ed", "geneTag");
    ll_cas.ll_setIntValue(addr, casFeatCode_ed, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geneName;
  /** @generated */
  final int     casFeatCode_geneName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_geneName == null)
      jcas.throwFeatMissing("geneName", "geneTag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_geneName == null)
      jcas.throwFeatMissing("geneName", "geneTag");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public geneTag_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_start = jcas.getRequiredFeatureDE(casType, "start", "uima.cas.Integer", featOkTst);
    casFeatCode_start  = (null == casFeat_start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_start).getCode();

 
    casFeat_ed = jcas.getRequiredFeatureDE(casType, "ed", "uima.cas.Integer", featOkTst);
    casFeatCode_ed  = (null == casFeat_ed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ed).getCode();

 
    casFeat_geneName = jcas.getRequiredFeatureDE(casType, "geneName", "uima.cas.String", featOkTst);
    casFeatCode_geneName  = (null == casFeat_geneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneName).getCode();

  }
}



    