

/* First created by JCasGen Mon Sep 22 14:34:49 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The Type for sentences
 * Updated by JCasGen Mon Sep 22 21:39:47 EDT 2014
 * XML source: /Users/shiqiqi/git/hw1-qiqis/hw1-qiqis/hw1-qiqis/src/main/resources/aeDescriptor.xml
 * @generated */
public class sentencesTag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(sentencesTag.class);
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
  protected sentencesTag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public sentencesTag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public sentencesTag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public sentencesTag(JCas jcas, int begin, int end) {
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

  /** getter for id - gets the id for this sentence
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (sentencesTag_Type.featOkTst && ((sentencesTag_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "sentencesTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((sentencesTag_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets the id for this sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (sentencesTag_Type.featOkTst && ((sentencesTag_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "sentencesTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((sentencesTag_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets the text for this sentence
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (sentencesTag_Type.featOkTst && ((sentencesTag_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "sentencesTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((sentencesTag_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets the text for this sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (sentencesTag_Type.featOkTst && ((sentencesTag_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "sentencesTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((sentencesTag_Type)jcasType).casFeatCode_text, v);}    
  }

    