
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour client complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="client">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wssoap.infotel.com/}personne">
 *       &lt;sequence>
 *         &lt;element name="numAdherent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", propOrder = {
    "numAdherent"
})
public class Client
    extends Personne
{

    protected int numAdherent;

    /**
     * Obtient la valeur de la propriété numAdherent.
     * 
     */
    public int getNumAdherent() {
        return numAdherent;
    }

    /**
     * Définit la valeur de la propriété numAdherent.
     * 
     */
    public void setNumAdherent(int value) {
        this.numAdherent = value;
    }

}
