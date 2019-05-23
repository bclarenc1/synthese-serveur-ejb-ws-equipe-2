
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour modifierVoiture complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="modifierVoiture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVoiture" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPersonne" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifierVoiture", propOrder = {
    "idVoiture",
    "marque",
    "idPersonne"
})
public class ModifierVoiture {

    protected long idVoiture;
    protected String marque;
    protected long idPersonne;

    /**
     * Obtient la valeur de la propriété idVoiture.
     * 
     */
    public long getIdVoiture() {
        return idVoiture;
    }

    /**
     * Définit la valeur de la propriété idVoiture.
     * 
     */
    public void setIdVoiture(long value) {
        this.idVoiture = value;
    }

    /**
     * Obtient la valeur de la propriété marque.
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
     * Définit la valeur de la propriété marque.
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
     * Obtient la valeur de la propriété idPersonne.
     * 
     */
    public long getIdPersonne() {
        return idPersonne;
    }

    /**
     * Définit la valeur de la propriété idPersonne.
     * 
     */
    public void setIdPersonne(long value) {
        this.idPersonne = value;
    }

}
