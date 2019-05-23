
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour modifierVoiture complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� idVoiture.
     * 
     */
    public long getIdVoiture() {
        return idVoiture;
    }

    /**
     * D�finit la valeur de la propri�t� idVoiture.
     * 
     */
    public void setIdVoiture(long value) {
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
     * Obtient la valeur de la propri�t� idPersonne.
     * 
     */
    public long getIdPersonne() {
        return idPersonne;
    }

    /**
     * D�finit la valeur de la propri�t� idPersonne.
     * 
     */
    public void setIdPersonne(long value) {
        this.idPersonne = value;
    }

}
