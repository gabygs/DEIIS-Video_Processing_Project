
/* First created by JCasGen Fri Mar 28 00:42:28 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Mar 28 00:42:28 CST 2014
 * @generated */
public class QueryAnnotation_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QueryAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QueryAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QueryAnnotation(addr, QueryAnnotation_Type.this);
  			   QueryAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QueryAnnotation(addr, QueryAnnotation_Type.this);
  	  }
    };
  /** @generated */
 // @SuppressWarnings ("hiding")
  public final static int typeIndexID = QueryAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
 // @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.QueryAnnotation");
 
  /** @generated */
  final Feature casFeat_image;
  /** @generated */
  final int     casFeatCode_image;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getImage(int addr) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "edu.cmu.deiis.types.QueryAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_image);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setImage(int addr, String v) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "edu.cmu.deiis.types.QueryAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_image, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dictionary;
  /** @generated */
  final int     casFeatCode_dictionary;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDictionary(int addr) {
        if (featOkTst && casFeat_dictionary == null)
      jcas.throwFeatMissing("dictionary", "edu.cmu.deiis.types.QueryAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_dictionary);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDictionary(int addr, int v) {
        if (featOkTst && casFeat_dictionary == null)
      jcas.throwFeatMissing("dictionary", "edu.cmu.deiis.types.QueryAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_dictionary, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QueryAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_image = jcas.getRequiredFeatureDE(casType, "image", "uima.cas.String", featOkTst);
    casFeatCode_image  = (null == casFeat_image) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_image).getCode();

 
    casFeat_dictionary = jcas.getRequiredFeatureDE(casType, "dictionary", "edu.cmu.deiis.types.PathType", featOkTst);
    casFeatCode_dictionary  = (null == casFeat_dictionary) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dictionary).getCode();

  }
}



    