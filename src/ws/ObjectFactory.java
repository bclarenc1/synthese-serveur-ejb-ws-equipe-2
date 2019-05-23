
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetVoituresParPersonneResponse_QNAME = new QName("http://wssoap.infotel.com/", "getVoituresParPersonneResponse");
    private final static QName _AjouterClient_QNAME = new QName("http://wssoap.infotel.com/", "ajouterClient");
    private final static QName _GetVoitureResponse_QNAME = new QName("http://wssoap.infotel.com/", "getVoitureResponse");
    private final static QName _ModifierClient_QNAME = new QName("http://wssoap.infotel.com/", "modifierClient");
    private final static QName _ModifierVoitureResponse_QNAME = new QName("http://wssoap.infotel.com/", "modifierVoitureResponse");
    private final static QName _GetVoiture_QNAME = new QName("http://wssoap.infotel.com/", "getVoiture");
    private final static QName _AjouterVoiture_QNAME = new QName("http://wssoap.infotel.com/", "ajouterVoiture");
    private final static QName _ModifierPrestataire_QNAME = new QName("http://wssoap.infotel.com/", "modifierPrestataire");
    private final static QName _ModifierClientResponse_QNAME = new QName("http://wssoap.infotel.com/", "modifierClientResponse");
    private final static QName _AjouterVoitureResponse_QNAME = new QName("http://wssoap.infotel.com/", "ajouterVoitureResponse");
    private final static QName _AjouterPrestataireResponse_QNAME = new QName("http://wssoap.infotel.com/", "ajouterPrestataireResponse");
    private final static QName _ModifierVoiture_QNAME = new QName("http://wssoap.infotel.com/", "modifierVoiture");
    private final static QName _SupprimerPersonne_QNAME = new QName("http://wssoap.infotel.com/", "supprimerPersonne");
    private final static QName _Voiture_QNAME = new QName("http://wssoap.infotel.com/", "voiture");
    private final static QName _GetPersonne_QNAME = new QName("http://wssoap.infotel.com/", "getPersonne");
    private final static QName _SupprimerVoitureResponse_QNAME = new QName("http://wssoap.infotel.com/", "supprimerVoitureResponse");
    private final static QName _GetAllPersonnes_QNAME = new QName("http://wssoap.infotel.com/", "getAllPersonnes");
    private final static QName _GetVoituresParPersonne_QNAME = new QName("http://wssoap.infotel.com/", "getVoituresParPersonne");
    private final static QName _SupprimerVoiture_QNAME = new QName("http://wssoap.infotel.com/", "supprimerVoiture");
    private final static QName _AjouterClientResponse_QNAME = new QName("http://wssoap.infotel.com/", "ajouterClientResponse");
    private final static QName _GetAllPersonnesResponse_QNAME = new QName("http://wssoap.infotel.com/", "getAllPersonnesResponse");
    private final static QName _GetAllVoitures_QNAME = new QName("http://wssoap.infotel.com/", "getAllVoitures");
    private final static QName _AjouterPrestataire_QNAME = new QName("http://wssoap.infotel.com/", "ajouterPrestataire");
    private final static QName _ModifierPrestataireResponse_QNAME = new QName("http://wssoap.infotel.com/", "modifierPrestataireResponse");
    private final static QName _SupprimerPersonneResponse_QNAME = new QName("http://wssoap.infotel.com/", "supprimerPersonneResponse");
    private final static QName _GetAllVoituresResponse_QNAME = new QName("http://wssoap.infotel.com/", "getAllVoituresResponse");
    private final static QName _GetPersonneResponse_QNAME = new QName("http://wssoap.infotel.com/", "getPersonneResponse");
    private final static QName _Personne_QNAME = new QName("http://wssoap.infotel.com/", "personne");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupprimerPersonne }
     * 
     */
    public SupprimerPersonne createSupprimerPersonne() {
        return new SupprimerPersonne();
    }

    /**
     * Create an instance of {@link Voiture }
     * 
     */
    public Voiture createVoiture() {
        return new Voiture();
    }

    /**
     * Create an instance of {@link GetPersonne }
     * 
     */
    public GetPersonne createGetPersonne() {
        return new GetPersonne();
    }

    /**
     * Create an instance of {@link AjouterPrestataireResponse }
     * 
     */
    public AjouterPrestataireResponse createAjouterPrestataireResponse() {
        return new AjouterPrestataireResponse();
    }

    /**
     * Create an instance of {@link ModifierVoiture }
     * 
     */
    public ModifierVoiture createModifierVoiture() {
        return new ModifierVoiture();
    }

    /**
     * Create an instance of {@link AjouterVoiture }
     * 
     */
    public AjouterVoiture createAjouterVoiture() {
        return new AjouterVoiture();
    }

    /**
     * Create an instance of {@link ModifierPrestataire }
     * 
     */
    public ModifierPrestataire createModifierPrestataire() {
        return new ModifierPrestataire();
    }

    /**
     * Create an instance of {@link AjouterVoitureResponse }
     * 
     */
    public AjouterVoitureResponse createAjouterVoitureResponse() {
        return new AjouterVoitureResponse();
    }

    /**
     * Create an instance of {@link ModifierClientResponse }
     * 
     */
    public ModifierClientResponse createModifierClientResponse() {
        return new ModifierClientResponse();
    }

    /**
     * Create an instance of {@link AjouterClient }
     * 
     */
    public AjouterClient createAjouterClient() {
        return new AjouterClient();
    }

    /**
     * Create an instance of {@link GetVoitureResponse }
     * 
     */
    public GetVoitureResponse createGetVoitureResponse() {
        return new GetVoitureResponse();
    }

    /**
     * Create an instance of {@link ModifierClient }
     * 
     */
    public ModifierClient createModifierClient() {
        return new ModifierClient();
    }

    /**
     * Create an instance of {@link GetVoituresParPersonneResponse }
     * 
     */
    public GetVoituresParPersonneResponse createGetVoituresParPersonneResponse() {
        return new GetVoituresParPersonneResponse();
    }

    /**
     * Create an instance of {@link GetVoiture }
     * 
     */
    public GetVoiture createGetVoiture() {
        return new GetVoiture();
    }

    /**
     * Create an instance of {@link ModifierVoitureResponse }
     * 
     */
    public ModifierVoitureResponse createModifierVoitureResponse() {
        return new ModifierVoitureResponse();
    }

    /**
     * Create an instance of {@link ModifierPrestataireResponse }
     * 
     */
    public ModifierPrestataireResponse createModifierPrestataireResponse() {
        return new ModifierPrestataireResponse();
    }

    /**
     * Create an instance of {@link GetAllVoituresResponse }
     * 
     */
    public GetAllVoituresResponse createGetAllVoituresResponse() {
        return new GetAllVoituresResponse();
    }

    /**
     * Create an instance of {@link SupprimerPersonneResponse }
     * 
     */
    public SupprimerPersonneResponse createSupprimerPersonneResponse() {
        return new SupprimerPersonneResponse();
    }

    /**
     * Create an instance of {@link GetPersonneResponse }
     * 
     */
    public GetPersonneResponse createGetPersonneResponse() {
        return new GetPersonneResponse();
    }

    /**
     * Create an instance of {@link GetAllPersonnesResponse }
     * 
     */
    public GetAllPersonnesResponse createGetAllPersonnesResponse() {
        return new GetAllPersonnesResponse();
    }

    /**
     * Create an instance of {@link AjouterPrestataire }
     * 
     */
    public AjouterPrestataire createAjouterPrestataire() {
        return new AjouterPrestataire();
    }

    /**
     * Create an instance of {@link GetAllVoitures }
     * 
     */
    public GetAllVoitures createGetAllVoitures() {
        return new GetAllVoitures();
    }

    /**
     * Create an instance of {@link AjouterClientResponse }
     * 
     */
    public AjouterClientResponse createAjouterClientResponse() {
        return new AjouterClientResponse();
    }

    /**
     * Create an instance of {@link SupprimerVoitureResponse }
     * 
     */
    public SupprimerVoitureResponse createSupprimerVoitureResponse() {
        return new SupprimerVoitureResponse();
    }

    /**
     * Create an instance of {@link GetAllPersonnes }
     * 
     */
    public GetAllPersonnes createGetAllPersonnes() {
        return new GetAllPersonnes();
    }

    /**
     * Create an instance of {@link GetVoituresParPersonne }
     * 
     */
    public GetVoituresParPersonne createGetVoituresParPersonne() {
        return new GetVoituresParPersonne();
    }

    /**
     * Create an instance of {@link SupprimerVoiture }
     * 
     */
    public SupprimerVoiture createSupprimerVoiture() {
        return new SupprimerVoiture();
    }

    /**
     * Create an instance of {@link Prestataire }
     * 
     */
    public Prestataire createPrestataire() {
        return new Prestataire();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoituresParPersonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getVoituresParPersonneResponse")
    public JAXBElement<GetVoituresParPersonneResponse> createGetVoituresParPersonneResponse(GetVoituresParPersonneResponse value) {
        return new JAXBElement<GetVoituresParPersonneResponse>(_GetVoituresParPersonneResponse_QNAME, GetVoituresParPersonneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "ajouterClient")
    public JAXBElement<AjouterClient> createAjouterClient(AjouterClient value) {
        return new JAXBElement<AjouterClient>(_AjouterClient_QNAME, AjouterClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoitureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getVoitureResponse")
    public JAXBElement<GetVoitureResponse> createGetVoitureResponse(GetVoitureResponse value) {
        return new JAXBElement<GetVoitureResponse>(_GetVoitureResponse_QNAME, GetVoitureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "modifierClient")
    public JAXBElement<ModifierClient> createModifierClient(ModifierClient value) {
        return new JAXBElement<ModifierClient>(_ModifierClient_QNAME, ModifierClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierVoitureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "modifierVoitureResponse")
    public JAXBElement<ModifierVoitureResponse> createModifierVoitureResponse(ModifierVoitureResponse value) {
        return new JAXBElement<ModifierVoitureResponse>(_ModifierVoitureResponse_QNAME, ModifierVoitureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoiture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getVoiture")
    public JAXBElement<GetVoiture> createGetVoiture(GetVoiture value) {
        return new JAXBElement<GetVoiture>(_GetVoiture_QNAME, GetVoiture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterVoiture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "ajouterVoiture")
    public JAXBElement<AjouterVoiture> createAjouterVoiture(AjouterVoiture value) {
        return new JAXBElement<AjouterVoiture>(_AjouterVoiture_QNAME, AjouterVoiture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierPrestataire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "modifierPrestataire")
    public JAXBElement<ModifierPrestataire> createModifierPrestataire(ModifierPrestataire value) {
        return new JAXBElement<ModifierPrestataire>(_ModifierPrestataire_QNAME, ModifierPrestataire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "modifierClientResponse")
    public JAXBElement<ModifierClientResponse> createModifierClientResponse(ModifierClientResponse value) {
        return new JAXBElement<ModifierClientResponse>(_ModifierClientResponse_QNAME, ModifierClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterVoitureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "ajouterVoitureResponse")
    public JAXBElement<AjouterVoitureResponse> createAjouterVoitureResponse(AjouterVoitureResponse value) {
        return new JAXBElement<AjouterVoitureResponse>(_AjouterVoitureResponse_QNAME, AjouterVoitureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterPrestataireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "ajouterPrestataireResponse")
    public JAXBElement<AjouterPrestataireResponse> createAjouterPrestataireResponse(AjouterPrestataireResponse value) {
        return new JAXBElement<AjouterPrestataireResponse>(_AjouterPrestataireResponse_QNAME, AjouterPrestataireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierVoiture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "modifierVoiture")
    public JAXBElement<ModifierVoiture> createModifierVoiture(ModifierVoiture value) {
        return new JAXBElement<ModifierVoiture>(_ModifierVoiture_QNAME, ModifierVoiture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerPersonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "supprimerPersonne")
    public JAXBElement<SupprimerPersonne> createSupprimerPersonne(SupprimerPersonne value) {
        return new JAXBElement<SupprimerPersonne>(_SupprimerPersonne_QNAME, SupprimerPersonne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Voiture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "voiture")
    public JAXBElement<Voiture> createVoiture(Voiture value) {
        return new JAXBElement<Voiture>(_Voiture_QNAME, Voiture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getPersonne")
    public JAXBElement<GetPersonne> createGetPersonne(GetPersonne value) {
        return new JAXBElement<GetPersonne>(_GetPersonne_QNAME, GetPersonne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerVoitureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "supprimerVoitureResponse")
    public JAXBElement<SupprimerVoitureResponse> createSupprimerVoitureResponse(SupprimerVoitureResponse value) {
        return new JAXBElement<SupprimerVoitureResponse>(_SupprimerVoitureResponse_QNAME, SupprimerVoitureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonnes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getAllPersonnes")
    public JAXBElement<GetAllPersonnes> createGetAllPersonnes(GetAllPersonnes value) {
        return new JAXBElement<GetAllPersonnes>(_GetAllPersonnes_QNAME, GetAllPersonnes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoituresParPersonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getVoituresParPersonne")
    public JAXBElement<GetVoituresParPersonne> createGetVoituresParPersonne(GetVoituresParPersonne value) {
        return new JAXBElement<GetVoituresParPersonne>(_GetVoituresParPersonne_QNAME, GetVoituresParPersonne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerVoiture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "supprimerVoiture")
    public JAXBElement<SupprimerVoiture> createSupprimerVoiture(SupprimerVoiture value) {
        return new JAXBElement<SupprimerVoiture>(_SupprimerVoiture_QNAME, SupprimerVoiture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "ajouterClientResponse")
    public JAXBElement<AjouterClientResponse> createAjouterClientResponse(AjouterClientResponse value) {
        return new JAXBElement<AjouterClientResponse>(_AjouterClientResponse_QNAME, AjouterClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonnesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getAllPersonnesResponse")
    public JAXBElement<GetAllPersonnesResponse> createGetAllPersonnesResponse(GetAllPersonnesResponse value) {
        return new JAXBElement<GetAllPersonnesResponse>(_GetAllPersonnesResponse_QNAME, GetAllPersonnesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllVoitures }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getAllVoitures")
    public JAXBElement<GetAllVoitures> createGetAllVoitures(GetAllVoitures value) {
        return new JAXBElement<GetAllVoitures>(_GetAllVoitures_QNAME, GetAllVoitures.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterPrestataire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "ajouterPrestataire")
    public JAXBElement<AjouterPrestataire> createAjouterPrestataire(AjouterPrestataire value) {
        return new JAXBElement<AjouterPrestataire>(_AjouterPrestataire_QNAME, AjouterPrestataire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierPrestataireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "modifierPrestataireResponse")
    public JAXBElement<ModifierPrestataireResponse> createModifierPrestataireResponse(ModifierPrestataireResponse value) {
        return new JAXBElement<ModifierPrestataireResponse>(_ModifierPrestataireResponse_QNAME, ModifierPrestataireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerPersonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "supprimerPersonneResponse")
    public JAXBElement<SupprimerPersonneResponse> createSupprimerPersonneResponse(SupprimerPersonneResponse value) {
        return new JAXBElement<SupprimerPersonneResponse>(_SupprimerPersonneResponse_QNAME, SupprimerPersonneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllVoituresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getAllVoituresResponse")
    public JAXBElement<GetAllVoituresResponse> createGetAllVoituresResponse(GetAllVoituresResponse value) {
        return new JAXBElement<GetAllVoituresResponse>(_GetAllVoituresResponse_QNAME, GetAllVoituresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "getPersonneResponse")
    public JAXBElement<GetPersonneResponse> createGetPersonneResponse(GetPersonneResponse value) {
        return new JAXBElement<GetPersonneResponse>(_GetPersonneResponse_QNAME, GetPersonneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssoap.infotel.com/", name = "personne")
    public JAXBElement<Personne> createPersonne(Personne value) {
        return new JAXBElement<Personne>(_Personne_QNAME, Personne.class, null, value);
    }

}
