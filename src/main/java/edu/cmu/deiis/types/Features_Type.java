
/* First created by JCasGen Fri Mar 21 03:27:04 CST 2014 */
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
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * @generated */
public class Features_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Features_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Features_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Features(addr, Features_Type.this);
  			   Features_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Features(addr, Features_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Features.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Features");
 
  /** @generated */
  final Feature casFeat_vector;
  /** @generated */
  final int     casFeatCode_vector;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVector(int addr) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "edu.cmu.deiis.types.Features");
    return ll_cas.ll_getRefValue(addr, casFeatCode_vector);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVector(int addr, int v) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "edu.cmu.deiis.types.Features");
    ll_cas.ll_setRefValue(addr, casFeatCode_vector, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Features_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_vector = jcas.getRequiredFeatureDE(casType, "vector", "uima.cas.Sofa", featOkTst);
    casFeatCode_vector  = (null == casFeat_vector) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vector).getCode();

  }
}



    