
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getVoiture complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getVoiture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVoiture" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoiture", propOrder = {
    "idVoiture"
})
public class GetVoiture {

    protected long idVoiture;

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

}
