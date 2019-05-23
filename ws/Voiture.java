
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour voiture complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="voiture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVoiture" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="marque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personne" type="{http://wssoap.infotel.com/}personne" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voiture", propOrder = {
    "idVoiture",
    "marque",
    "personne"
})
public class Voiture {

    protected Long idVoiture;
    protected String marque;
    protected Personne personne;

    /**
     * Obtient la valeur de la propri�t� idVoiture.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVoiture() {
        return idVoiture;
    }

    /**
     * D�finit la valeur de la propri�t� idVoiture.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVoiture(Long value) {
        this.idVoiture = value;
    }

    /**
     * Obtient la valeur de la propri�t� marque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarque() {
        return marque;
    }

    /**
     * D�finit la valeur de la propri�t� marque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarque(String value) {
        this.marque = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getPersonne() {
        return personne;
    }

    /**
     * D�finit la valeur de la propri�t� personne.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setPersonne(Personne value) {
        this.personne = value;
    }

}
