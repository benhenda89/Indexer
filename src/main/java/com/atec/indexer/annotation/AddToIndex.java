/**
 * 
 */
package com.atec.indexer.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Solr Annotation.<br>
 * In this Version , We will only test the operation of two fields <b>stored</b> and <b>indexed</b>
 * 
 * @author Hafedh (Hafedhbenhenda@gmail.com)
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AddToIndex {
	/*Fonctionnment de cette Interface :
	 * 1- Verifier si un SOLR INSTANCE est localisé. ( Pour cette version , nous allons travaillé avec une Instance Solr , et nous n'allons pas Crée une
	 * 	  nouvelle Instance.
	 * 2 - verifié la validité des Fields à indexer ( verifier la correspondance des TYPE des champs à indexer avec le field localisé dans le shema.xml
	 * 		SINON : 
	 * 		en utilisant JaxB , nous allons Ajouter une nouvelle ligne dans le schema.xml comme cette example:
	 * 		<field name="product" type="String" stored="true" indexed="true"/>
	 * 
	 * 
	 * C'est pour le moment , c'est que nous allons faire.
	 */
	
	
	/**
	 * Specifie that this field was stored or no.<br>
	 * <b>Stored</b> means you can retrieve the field when you search
	 * @return
	 */
	public boolean stored();
	/**
	 * Specifie that this field was Indexed or no.<br>
	 * <b>Indexed</b> means if indexed=true makes a field searchable (and sortable and facetable).
	 * @return
	 */
	public boolean indexed();
}
