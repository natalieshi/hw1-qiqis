

/* First created by JCasGen Mon Sep 22 14:34:49 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** the type for gene
 * Updated by JCasGen Mon Sep 22 19:57:55 EDT 2014
 * XML source: /Users/shiqiqi/Documents/workspace/hw1-qiqis/src/main/resources/CpeDescriptor.xml
 * @generated */
public class geneTag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(geneTag.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected geneTag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public geneTag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public geneTag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public geneTag(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: id

  /** getter for id - gets the id of sentence for the genetag
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "geneTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((geneTag_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets the id of sentence for the genetag 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "geneTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((geneTag_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: start

  /** getter for start - gets the start point of the geneTag
   * @generated
   * @return value of the feature 
   */
  public int getStart() {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "geneTag");
    return jcasType.ll_cas.ll_getIntValue(addr, ((geneTag_Type)jcasType).casFeatCode_start);}
    
  /** setter for start - sets the start point of the geneTag 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStart(int v) {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "geneTag");
    jcasType.ll_cas.ll_setIntValue(addr, ((geneTag_Type)jcasType).casFeatCode_start, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets the end point of geneTag
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "geneTag");
    return jcasType.ll_cas.ll_getIntValue(addr, ((geneTag_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets the end point of geneTag 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "geneTag");
    jcasType.ll_cas.ll_setIntValue(addr, ((geneTag_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: geneName

  /** getter for geneName - gets the geneName
   * @generated
   * @return value of the feature 
   */
  public String getGeneName() {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "geneTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((geneTag_Type)jcasType).casFeatCode_geneName);}
    
  /** setter for geneName - sets the geneName 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneName(String v) {
    if (geneTag_Type.featOkTst && ((geneTag_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "geneTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((geneTag_Type)jcasType).casFeatCode_geneName, v);}    
  }

    