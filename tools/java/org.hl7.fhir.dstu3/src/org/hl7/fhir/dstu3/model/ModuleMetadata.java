package org.hl7.fhir.dstu3.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Fri, Jul 15, 2016 13:24+1000 for FHIR v1.5.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.dstu3.exceptions.FHIRException;
/**
 * The ModuleMetadata structure defines the common metadata elements used by quality improvement artifacts. This information includes descriptive and topical metadata to enable repository searches, as well as governance and evidentiary support information.
 */
@DatatypeDef(name="ModuleMetadata")
public class ModuleMetadata extends Type implements ICompositeType {

    public enum ModuleMetadataType {
        /**
         * The resource is a description of a knowledge module
         */
        MODULE, 
        /**
         * The resource is a shareable library of formalized knowledge
         */
        LIBRARY, 
        /**
         * An Event-Condition-Action Rule Artifact
         */
        DECISIONSUPPORTRULE, 
        /**
         * A Documentation Template Artifact
         */
        DOCUMENTATIONTEMPLATE, 
        /**
         * An Order Set Artifact
         */
        ORDERSET, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static ModuleMetadataType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("module".equals(codeString))
          return MODULE;
        if ("library".equals(codeString))
          return LIBRARY;
        if ("decision-support-rule".equals(codeString))
          return DECISIONSUPPORTRULE;
        if ("documentation-template".equals(codeString))
          return DOCUMENTATIONTEMPLATE;
        if ("order-set".equals(codeString))
          return ORDERSET;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown ModuleMetadataType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case MODULE: return "module";
            case LIBRARY: return "library";
            case DECISIONSUPPORTRULE: return "decision-support-rule";
            case DOCUMENTATIONTEMPLATE: return "documentation-template";
            case ORDERSET: return "order-set";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MODULE: return "http://hl7.org/fhir/module-metadata-type";
            case LIBRARY: return "http://hl7.org/fhir/module-metadata-type";
            case DECISIONSUPPORTRULE: return "http://hl7.org/fhir/module-metadata-type";
            case DOCUMENTATIONTEMPLATE: return "http://hl7.org/fhir/module-metadata-type";
            case ORDERSET: return "http://hl7.org/fhir/module-metadata-type";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MODULE: return "The resource is a description of a knowledge module";
            case LIBRARY: return "The resource is a shareable library of formalized knowledge";
            case DECISIONSUPPORTRULE: return "An Event-Condition-Action Rule Artifact";
            case DOCUMENTATIONTEMPLATE: return "A Documentation Template Artifact";
            case ORDERSET: return "An Order Set Artifact";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MODULE: return "Module";
            case LIBRARY: return "Library";
            case DECISIONSUPPORTRULE: return "Decision Support Rule";
            case DOCUMENTATIONTEMPLATE: return "Documentation Template";
            case ORDERSET: return "Order Set";
            default: return "?";
          }
        }
    }

  public static class ModuleMetadataTypeEnumFactory implements EnumFactory<ModuleMetadataType> {
    public ModuleMetadataType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("module".equals(codeString))
          return ModuleMetadataType.MODULE;
        if ("library".equals(codeString))
          return ModuleMetadataType.LIBRARY;
        if ("decision-support-rule".equals(codeString))
          return ModuleMetadataType.DECISIONSUPPORTRULE;
        if ("documentation-template".equals(codeString))
          return ModuleMetadataType.DOCUMENTATIONTEMPLATE;
        if ("order-set".equals(codeString))
          return ModuleMetadataType.ORDERSET;
        throw new IllegalArgumentException("Unknown ModuleMetadataType code '"+codeString+"'");
        }
        public Enumeration<ModuleMetadataType> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("module".equals(codeString))
          return new Enumeration<ModuleMetadataType>(this, ModuleMetadataType.MODULE);
        if ("library".equals(codeString))
          return new Enumeration<ModuleMetadataType>(this, ModuleMetadataType.LIBRARY);
        if ("decision-support-rule".equals(codeString))
          return new Enumeration<ModuleMetadataType>(this, ModuleMetadataType.DECISIONSUPPORTRULE);
        if ("documentation-template".equals(codeString))
          return new Enumeration<ModuleMetadataType>(this, ModuleMetadataType.DOCUMENTATIONTEMPLATE);
        if ("order-set".equals(codeString))
          return new Enumeration<ModuleMetadataType>(this, ModuleMetadataType.ORDERSET);
        throw new FHIRException("Unknown ModuleMetadataType code '"+codeString+"'");
        }
    public String toCode(ModuleMetadataType code) {
      if (code == ModuleMetadataType.MODULE)
        return "module";
      if (code == ModuleMetadataType.LIBRARY)
        return "library";
      if (code == ModuleMetadataType.DECISIONSUPPORTRULE)
        return "decision-support-rule";
      if (code == ModuleMetadataType.DOCUMENTATIONTEMPLATE)
        return "documentation-template";
      if (code == ModuleMetadataType.ORDERSET)
        return "order-set";
      return "?";
      }
    public String toSystem(ModuleMetadataType code) {
      return code.getSystem();
      }
    }

    public enum ModuleMetadataStatus {
        /**
         * The module is in draft state
         */
        DRAFT, 
        /**
         * The module is active
         */
        ACTIVE, 
        /**
         * The module is inactive, either rejected before publication, or retired after publication
         */
        INACTIVE, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static ModuleMetadataStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("inactive".equals(codeString))
          return INACTIVE;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown ModuleMetadataStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case DRAFT: return "draft";
            case ACTIVE: return "active";
            case INACTIVE: return "inactive";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case DRAFT: return "http://hl7.org/fhir/module-metadata-status";
            case ACTIVE: return "http://hl7.org/fhir/module-metadata-status";
            case INACTIVE: return "http://hl7.org/fhir/module-metadata-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case DRAFT: return "The module is in draft state";
            case ACTIVE: return "The module is active";
            case INACTIVE: return "The module is inactive, either rejected before publication, or retired after publication";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case DRAFT: return "Draft";
            case ACTIVE: return "Active";
            case INACTIVE: return "Inactive";
            default: return "?";
          }
        }
    }

  public static class ModuleMetadataStatusEnumFactory implements EnumFactory<ModuleMetadataStatus> {
    public ModuleMetadataStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return ModuleMetadataStatus.DRAFT;
        if ("active".equals(codeString))
          return ModuleMetadataStatus.ACTIVE;
        if ("inactive".equals(codeString))
          return ModuleMetadataStatus.INACTIVE;
        throw new IllegalArgumentException("Unknown ModuleMetadataStatus code '"+codeString+"'");
        }
        public Enumeration<ModuleMetadataStatus> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("draft".equals(codeString))
          return new Enumeration<ModuleMetadataStatus>(this, ModuleMetadataStatus.DRAFT);
        if ("active".equals(codeString))
          return new Enumeration<ModuleMetadataStatus>(this, ModuleMetadataStatus.ACTIVE);
        if ("inactive".equals(codeString))
          return new Enumeration<ModuleMetadataStatus>(this, ModuleMetadataStatus.INACTIVE);
        throw new FHIRException("Unknown ModuleMetadataStatus code '"+codeString+"'");
        }
    public String toCode(ModuleMetadataStatus code) {
      if (code == ModuleMetadataStatus.DRAFT)
        return "draft";
      if (code == ModuleMetadataStatus.ACTIVE)
        return "active";
      if (code == ModuleMetadataStatus.INACTIVE)
        return "inactive";
      return "?";
      }
    public String toSystem(ModuleMetadataStatus code) {
      return code.getSystem();
      }
    }

    /**
     * An absolute URL that is used to identify this module when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this module definition is (or will be) published.
     */
    @Child(name = "url", type = {UriType.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Logical URL to reference this module", formalDefinition="An absolute URL that is used to identify this module when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this module definition is (or will be) published." )
    protected UriType url;

    /**
     * A logical identifier for the module such as the CMS or NQF identifiers for a measure artifact.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Logical identifier(s) for the module", formalDefinition="A logical identifier for the module such as the CMS or NQF identifiers for a measure artifact." )
    protected List<Identifier> identifier;

    /**
     * The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification. Note that the version is required for non-experimental published artifact.
     */
    @Child(name = "version", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The version of the module, if any", formalDefinition="The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification. Note that the version is required for non-experimental published artifact." )
    protected StringType version;

    /**
     * A machine-friendly name for the module. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="A machine-friendly name for the module", formalDefinition="A machine-friendly name for the module. This name should be usable as an identifier for the module by machine processing applications such as code generation." )
    protected StringType name;

    /**
     * A short, descriptive, user-friendly title for the module.
     */
    @Child(name = "title", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="A user-friendly title for the module", formalDefinition="A short, descriptive, user-friendly title for the module." )
    protected StringType title;

    /**
     * Identifies the type of knowledge module, such as a rule, library, documentation template, or measure.
     */
    @Child(name = "type", type = {CodeType.class}, order=5, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="module | library | decision-support-rule | documentation-template | order-set", formalDefinition="Identifies the type of knowledge module, such as a rule, library, documentation template, or measure." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/module-metadata-type")
    protected Enumeration<ModuleMetadataType> type;

    /**
     * The status of the module.
     */
    @Child(name = "status", type = {CodeType.class}, order=6, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="draft | active | inactive", formalDefinition="The status of the module." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/module-metadata-status")
    protected Enumeration<ModuleMetadataStatus> status;

    /**
     * Determines whether the module was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments.
     */
    @Child(name = "experimental", type = {BooleanType.class}, order=7, min=0, max=1, modifier=true, summary=true)
    @Description(shortDefinition="If for testing purposes, not real usage", formalDefinition="Determines whether the module was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments." )
    protected BooleanType experimental;

    /**
     * A free text natural language description of the module from the consumer's perspective.
     */
    @Child(name = "description", type = {StringType.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Natural language description of the module", formalDefinition="A free text natural language description of the module from the consumer's perspective." )
    protected StringType description;

    /**
     * A brief description of the purpose of the module.
     */
    @Child(name = "purpose", type = {StringType.class}, order=9, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Describes the purpose of the module", formalDefinition="A brief description of the purpose of the module." )
    protected StringType purpose;

    /**
     * A detailed description of how the module is used from a clinical perspective.
     */
    @Child(name = "usage", type = {StringType.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Describes the clinical usage of the module", formalDefinition="A detailed description of how the module is used from a clinical perspective." )
    protected StringType usage;

    /**
     * The date on which the module was published.
     */
    @Child(name = "publicationDate", type = {DateType.class}, order=11, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Publication date for this version of the module", formalDefinition="The date on which the module was published." )
    protected DateType publicationDate;

    /**
     * The date on which the module content was last reviewed.
     */
    @Child(name = "lastReviewDate", type = {DateType.class}, order=12, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Last review date for the module", formalDefinition="The date on which the module content was last reviewed." )
    protected DateType lastReviewDate;

    /**
     * The period during which the module content is effective.
     */
    @Child(name = "effectivePeriod", type = {Period.class}, order=13, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The effective date range for the module", formalDefinition="The period during which the module content is effective." )
    protected Period effectivePeriod;

    /**
     * Specifies various attributes of the patient population for whom and/or environment of care in which, the knowledge module is applicable.
     */
    @Child(name = "coverage", type = {UsageContext.class}, order=14, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Describes the context of use for this module", formalDefinition="Specifies various attributes of the patient population for whom and/or environment of care in which, the knowledge module is applicable." )
    protected List<UsageContext> coverage;

    /**
     * Clinical topics related to the content of the module.
     */
    @Child(name = "topic", type = {CodeableConcept.class}, order=15, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Descriptional topics for the module", formalDefinition="Clinical topics related to the content of the module." )
    protected List<CodeableConcept> topic;

    /**
     * A contributor to the content of the module, including authors, editors, reviewers, and endorsers.
     */
    @Child(name = "contributor", type = {Contributor.class}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="A content contributor", formalDefinition="A contributor to the content of the module, including authors, editors, reviewers, and endorsers." )
    protected List<Contributor> contributor;

    /**
     * The name of the individual or organization that published the module (also known as the steward for the module). This information is required for non-experimental published artifacts.
     */
    @Child(name = "publisher", type = {StringType.class}, order=17, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Name of the publisher (Organization or individual)", formalDefinition="The name of the individual or organization that published the module (also known as the steward for the module). This information is required for non-experimental published artifacts." )
    protected StringType publisher;

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     */
    @Child(name = "contact", type = {ContactDetail.class}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Contact details of the publisher", formalDefinition="Contact details to assist a user in finding and communicating with the publisher." )
    protected List<ContactDetail> contact;

    /**
     * A copyright statement relating to the module and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the module.
     */
    @Child(name = "copyright", type = {StringType.class}, order=19, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Use and/or publishing restrictions", formalDefinition="A copyright statement relating to the module and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the module." )
    protected StringType copyright;

    /**
     * Related resources such as additional documentation, justification, or bibliographic references.
     */
    @Child(name = "relatedResource", type = {RelatedResource.class}, order=20, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Related resources for the module", formalDefinition="Related resources such as additional documentation, justification, or bibliographic references." )
    protected List<RelatedResource> relatedResource;

    private static final long serialVersionUID = 774796920L;

  /**
   * Constructor
   */
    public ModuleMetadata() {
      super();
    }

  /**
   * Constructor
   */
    public ModuleMetadata(Enumeration<ModuleMetadataType> type, Enumeration<ModuleMetadataStatus> status) {
      super();
      this.type = type;
      this.status = status;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this module when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this module definition is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URL that is used to identify this module when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this module definition is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ModuleMetadata setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URL that is used to identify this module when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this module definition is (or will be) published.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this module when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this module definition is (or will be) published.
     */
    public ModuleMetadata setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #identifier} (A logical identifier for the module such as the CMS or NQF identifiers for a measure artifact.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ModuleMetadata setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public ModuleMetadata addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #version} (The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification. Note that the version is required for non-experimental published artifact.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification. Note that the version is required for non-experimental published artifact.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ModuleMetadata setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification. Note that the version is required for non-experimental published artifact.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification. Note that the version is required for non-experimental published artifact.
     */
    public ModuleMetadata setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #name} (A machine-friendly name for the module. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() { 
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() { 
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A machine-friendly name for the module. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ModuleMetadata setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return A machine-friendly name for the module. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A machine-friendly name for the module. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public ModuleMetadata setName(String value) { 
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #title} (A short, descriptive, user-friendly title for the module.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short, descriptive, user-friendly title for the module.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public ModuleMetadata setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return A short, descriptive, user-friendly title for the module.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short, descriptive, user-friendly title for the module.
     */
    public ModuleMetadata setTitle(String value) { 
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #type} (Identifies the type of knowledge module, such as a rule, library, documentation template, or measure.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<ModuleMetadataType> getTypeElement() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.type");
        else if (Configuration.doAutoCreate())
          this.type = new Enumeration<ModuleMetadataType>(new ModuleMetadataTypeEnumFactory()); // bb
      return this.type;
    }

    public boolean hasTypeElement() { 
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Identifies the type of knowledge module, such as a rule, library, documentation template, or measure.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ModuleMetadata setTypeElement(Enumeration<ModuleMetadataType> value) { 
      this.type = value;
      return this;
    }

    /**
     * @return Identifies the type of knowledge module, such as a rule, library, documentation template, or measure.
     */
    public ModuleMetadataType getType() { 
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Identifies the type of knowledge module, such as a rule, library, documentation template, or measure.
     */
    public ModuleMetadata setType(ModuleMetadataType value) { 
        if (this.type == null)
          this.type = new Enumeration<ModuleMetadataType>(new ModuleMetadataTypeEnumFactory());
        this.type.setValue(value);
      return this;
    }

    /**
     * @return {@link #status} (The status of the module.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ModuleMetadataStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<ModuleMetadataStatus>(new ModuleMetadataStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the module.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ModuleMetadata setStatusElement(Enumeration<ModuleMetadataStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the module.
     */
    public ModuleMetadataStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the module.
     */
    public ModuleMetadata setStatus(ModuleMetadataStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<ModuleMetadataStatus>(new ModuleMetadataStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #experimental} (Determines whether the module was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() { 
      if (this.experimental == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.experimental");
        else if (Configuration.doAutoCreate())
          this.experimental = new BooleanType(); // bb
      return this.experimental;
    }

    public boolean hasExperimentalElement() { 
      return this.experimental != null && !this.experimental.isEmpty();
    }

    public boolean hasExperimental() { 
      return this.experimental != null && !this.experimental.isEmpty();
    }

    /**
     * @param value {@link #experimental} (Determines whether the module was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public ModuleMetadata setExperimentalElement(BooleanType value) { 
      this.experimental = value;
      return this;
    }

    /**
     * @return Determines whether the module was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments.
     */
    public boolean getExperimental() { 
      return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value Determines whether the module was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments.
     */
    public ModuleMetadata setExperimental(boolean value) { 
        if (this.experimental == null)
          this.experimental = new BooleanType();
        this.experimental.setValue(value);
      return this;
    }

    /**
     * @return {@link #description} (A free text natural language description of the module from the consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free text natural language description of the module from the consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ModuleMetadata setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free text natural language description of the module from the consumer's perspective.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the module from the consumer's perspective.
     */
    public ModuleMetadata setDescription(String value) { 
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #purpose} (A brief description of the purpose of the module.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public StringType getPurposeElement() { 
      if (this.purpose == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.purpose");
        else if (Configuration.doAutoCreate())
          this.purpose = new StringType(); // bb
      return this.purpose;
    }

    public boolean hasPurposeElement() { 
      return this.purpose != null && !this.purpose.isEmpty();
    }

    public boolean hasPurpose() { 
      return this.purpose != null && !this.purpose.isEmpty();
    }

    /**
     * @param value {@link #purpose} (A brief description of the purpose of the module.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public ModuleMetadata setPurposeElement(StringType value) { 
      this.purpose = value;
      return this;
    }

    /**
     * @return A brief description of the purpose of the module.
     */
    public String getPurpose() { 
      return this.purpose == null ? null : this.purpose.getValue();
    }

    /**
     * @param value A brief description of the purpose of the module.
     */
    public ModuleMetadata setPurpose(String value) { 
      if (Utilities.noString(value))
        this.purpose = null;
      else {
        if (this.purpose == null)
          this.purpose = new StringType();
        this.purpose.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #usage} (A detailed description of how the module is used from a clinical perspective.). This is the underlying object with id, value and extensions. The accessor "getUsage" gives direct access to the value
     */
    public StringType getUsageElement() { 
      if (this.usage == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.usage");
        else if (Configuration.doAutoCreate())
          this.usage = new StringType(); // bb
      return this.usage;
    }

    public boolean hasUsageElement() { 
      return this.usage != null && !this.usage.isEmpty();
    }

    public boolean hasUsage() { 
      return this.usage != null && !this.usage.isEmpty();
    }

    /**
     * @param value {@link #usage} (A detailed description of how the module is used from a clinical perspective.). This is the underlying object with id, value and extensions. The accessor "getUsage" gives direct access to the value
     */
    public ModuleMetadata setUsageElement(StringType value) { 
      this.usage = value;
      return this;
    }

    /**
     * @return A detailed description of how the module is used from a clinical perspective.
     */
    public String getUsage() { 
      return this.usage == null ? null : this.usage.getValue();
    }

    /**
     * @param value A detailed description of how the module is used from a clinical perspective.
     */
    public ModuleMetadata setUsage(String value) { 
      if (Utilities.noString(value))
        this.usage = null;
      else {
        if (this.usage == null)
          this.usage = new StringType();
        this.usage.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #publicationDate} (The date on which the module was published.). This is the underlying object with id, value and extensions. The accessor "getPublicationDate" gives direct access to the value
     */
    public DateType getPublicationDateElement() { 
      if (this.publicationDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.publicationDate");
        else if (Configuration.doAutoCreate())
          this.publicationDate = new DateType(); // bb
      return this.publicationDate;
    }

    public boolean hasPublicationDateElement() { 
      return this.publicationDate != null && !this.publicationDate.isEmpty();
    }

    public boolean hasPublicationDate() { 
      return this.publicationDate != null && !this.publicationDate.isEmpty();
    }

    /**
     * @param value {@link #publicationDate} (The date on which the module was published.). This is the underlying object with id, value and extensions. The accessor "getPublicationDate" gives direct access to the value
     */
    public ModuleMetadata setPublicationDateElement(DateType value) { 
      this.publicationDate = value;
      return this;
    }

    /**
     * @return The date on which the module was published.
     */
    public Date getPublicationDate() { 
      return this.publicationDate == null ? null : this.publicationDate.getValue();
    }

    /**
     * @param value The date on which the module was published.
     */
    public ModuleMetadata setPublicationDate(Date value) { 
      if (value == null)
        this.publicationDate = null;
      else {
        if (this.publicationDate == null)
          this.publicationDate = new DateType();
        this.publicationDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #lastReviewDate} (The date on which the module content was last reviewed.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public DateType getLastReviewDateElement() { 
      if (this.lastReviewDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.lastReviewDate");
        else if (Configuration.doAutoCreate())
          this.lastReviewDate = new DateType(); // bb
      return this.lastReviewDate;
    }

    public boolean hasLastReviewDateElement() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    public boolean hasLastReviewDate() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    /**
     * @param value {@link #lastReviewDate} (The date on which the module content was last reviewed.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public ModuleMetadata setLastReviewDateElement(DateType value) { 
      this.lastReviewDate = value;
      return this;
    }

    /**
     * @return The date on which the module content was last reviewed.
     */
    public Date getLastReviewDate() { 
      return this.lastReviewDate == null ? null : this.lastReviewDate.getValue();
    }

    /**
     * @param value The date on which the module content was last reviewed.
     */
    public ModuleMetadata setLastReviewDate(Date value) { 
      if (value == null)
        this.lastReviewDate = null;
      else {
        if (this.lastReviewDate == null)
          this.lastReviewDate = new DateType();
        this.lastReviewDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #effectivePeriod} (The period during which the module content is effective.)
     */
    public Period getEffectivePeriod() { 
      if (this.effectivePeriod == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.effectivePeriod");
        else if (Configuration.doAutoCreate())
          this.effectivePeriod = new Period(); // cc
      return this.effectivePeriod;
    }

    public boolean hasEffectivePeriod() { 
      return this.effectivePeriod != null && !this.effectivePeriod.isEmpty();
    }

    /**
     * @param value {@link #effectivePeriod} (The period during which the module content is effective.)
     */
    public ModuleMetadata setEffectivePeriod(Period value) { 
      this.effectivePeriod = value;
      return this;
    }

    /**
     * @return {@link #coverage} (Specifies various attributes of the patient population for whom and/or environment of care in which, the knowledge module is applicable.)
     */
    public List<UsageContext> getCoverage() { 
      if (this.coverage == null)
        this.coverage = new ArrayList<UsageContext>();
      return this.coverage;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ModuleMetadata setCoverage(List<UsageContext> theCoverage) { 
      this.coverage = theCoverage;
      return this;
    }

    public boolean hasCoverage() { 
      if (this.coverage == null)
        return false;
      for (UsageContext item : this.coverage)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public UsageContext addCoverage() { //3
      UsageContext t = new UsageContext();
      if (this.coverage == null)
        this.coverage = new ArrayList<UsageContext>();
      this.coverage.add(t);
      return t;
    }

    public ModuleMetadata addCoverage(UsageContext t) { //3
      if (t == null)
        return this;
      if (this.coverage == null)
        this.coverage = new ArrayList<UsageContext>();
      this.coverage.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #coverage}, creating it if it does not already exist
     */
    public UsageContext getCoverageFirstRep() { 
      if (getCoverage().isEmpty()) {
        addCoverage();
      }
      return getCoverage().get(0);
    }

    /**
     * @return {@link #topic} (Clinical topics related to the content of the module.)
     */
    public List<CodeableConcept> getTopic() { 
      if (this.topic == null)
        this.topic = new ArrayList<CodeableConcept>();
      return this.topic;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ModuleMetadata setTopic(List<CodeableConcept> theTopic) { 
      this.topic = theTopic;
      return this;
    }

    public boolean hasTopic() { 
      if (this.topic == null)
        return false;
      for (CodeableConcept item : this.topic)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addTopic() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.topic == null)
        this.topic = new ArrayList<CodeableConcept>();
      this.topic.add(t);
      return t;
    }

    public ModuleMetadata addTopic(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.topic == null)
        this.topic = new ArrayList<CodeableConcept>();
      this.topic.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #topic}, creating it if it does not already exist
     */
    public CodeableConcept getTopicFirstRep() { 
      if (getTopic().isEmpty()) {
        addTopic();
      }
      return getTopic().get(0);
    }

    /**
     * @return {@link #contributor} (A contributor to the content of the module, including authors, editors, reviewers, and endorsers.)
     */
    public List<Contributor> getContributor() { 
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      return this.contributor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ModuleMetadata setContributor(List<Contributor> theContributor) { 
      this.contributor = theContributor;
      return this;
    }

    public boolean hasContributor() { 
      if (this.contributor == null)
        return false;
      for (Contributor item : this.contributor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Contributor addContributor() { //3
      Contributor t = new Contributor();
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      this.contributor.add(t);
      return t;
    }

    public ModuleMetadata addContributor(Contributor t) { //3
      if (t == null)
        return this;
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      this.contributor.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contributor}, creating it if it does not already exist
     */
    public Contributor getContributorFirstRep() { 
      if (getContributor().isEmpty()) {
        addContributor();
      }
      return getContributor().get(0);
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the module (also known as the steward for the module). This information is required for non-experimental published artifacts.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() { 
      if (this.publisher == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.publisher");
        else if (Configuration.doAutoCreate())
          this.publisher = new StringType(); // bb
      return this.publisher;
    }

    public boolean hasPublisherElement() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    public boolean hasPublisher() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    /**
     * @param value {@link #publisher} (The name of the individual or organization that published the module (also known as the steward for the module). This information is required for non-experimental published artifacts.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public ModuleMetadata setPublisherElement(StringType value) { 
      this.publisher = value;
      return this;
    }

    /**
     * @return The name of the individual or organization that published the module (also known as the steward for the module). This information is required for non-experimental published artifacts.
     */
    public String getPublisher() { 
      return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the module (also known as the steward for the module). This information is required for non-experimental published artifacts.
     */
    public ModuleMetadata setPublisher(String value) { 
      if (Utilities.noString(value))
        this.publisher = null;
      else {
        if (this.publisher == null)
          this.publisher = new StringType();
        this.publisher.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #contact} (Contact details to assist a user in finding and communicating with the publisher.)
     */
    public List<ContactDetail> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      return this.contact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ModuleMetadata setContact(List<ContactDetail> theContact) { 
      this.contact = theContact;
      return this;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (ContactDetail item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addContact() { //3
      ContactDetail t = new ContactDetail();
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return t;
    }

    public ModuleMetadata addContact(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist
     */
    public ContactDetail getContactFirstRep() { 
      if (getContact().isEmpty()) {
        addContact();
      }
      return getContact().get(0);
    }

    /**
     * @return {@link #copyright} (A copyright statement relating to the module and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the module.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() { 
      if (this.copyright == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ModuleMetadata.copyright");
        else if (Configuration.doAutoCreate())
          this.copyright = new StringType(); // bb
      return this.copyright;
    }

    public boolean hasCopyrightElement() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    public boolean hasCopyright() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    /**
     * @param value {@link #copyright} (A copyright statement relating to the module and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the module.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public ModuleMetadata setCopyrightElement(StringType value) { 
      this.copyright = value;
      return this;
    }

    /**
     * @return A copyright statement relating to the module and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the module.
     */
    public String getCopyright() { 
      return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the module and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the module.
     */
    public ModuleMetadata setCopyright(String value) { 
      if (Utilities.noString(value))
        this.copyright = null;
      else {
        if (this.copyright == null)
          this.copyright = new StringType();
        this.copyright.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #relatedResource} (Related resources such as additional documentation, justification, or bibliographic references.)
     */
    public List<RelatedResource> getRelatedResource() { 
      if (this.relatedResource == null)
        this.relatedResource = new ArrayList<RelatedResource>();
      return this.relatedResource;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ModuleMetadata setRelatedResource(List<RelatedResource> theRelatedResource) { 
      this.relatedResource = theRelatedResource;
      return this;
    }

    public boolean hasRelatedResource() { 
      if (this.relatedResource == null)
        return false;
      for (RelatedResource item : this.relatedResource)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public RelatedResource addRelatedResource() { //3
      RelatedResource t = new RelatedResource();
      if (this.relatedResource == null)
        this.relatedResource = new ArrayList<RelatedResource>();
      this.relatedResource.add(t);
      return t;
    }

    public ModuleMetadata addRelatedResource(RelatedResource t) { //3
      if (t == null)
        return this;
      if (this.relatedResource == null)
        this.relatedResource = new ArrayList<RelatedResource>();
      this.relatedResource.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatedResource}, creating it if it does not already exist
     */
    public RelatedResource getRelatedResourceFirstRep() { 
      if (getRelatedResource().isEmpty()) {
        addRelatedResource();
      }
      return getRelatedResource().get(0);
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this module when it is referenced. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this module definition is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("identifier", "Identifier", "A logical identifier for the module such as the CMS or NQF identifiers for a measure artifact.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("version", "string", "The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification. Note that the version is required for non-experimental published artifact.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A machine-friendly name for the module. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("title", "string", "A short, descriptive, user-friendly title for the module.", 0, java.lang.Integer.MAX_VALUE, title));
        childrenList.add(new Property("type", "code", "Identifies the type of knowledge module, such as a rule, library, documentation template, or measure.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("status", "code", "The status of the module.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "Determines whether the module was developed for testing purposes (or education/evaluation/marketing), and is not intended to be used in production environments.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("description", "string", "A free text natural language description of the module from the consumer's perspective.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("purpose", "string", "A brief description of the purpose of the module.", 0, java.lang.Integer.MAX_VALUE, purpose));
        childrenList.add(new Property("usage", "string", "A detailed description of how the module is used from a clinical perspective.", 0, java.lang.Integer.MAX_VALUE, usage));
        childrenList.add(new Property("publicationDate", "date", "The date on which the module was published.", 0, java.lang.Integer.MAX_VALUE, publicationDate));
        childrenList.add(new Property("lastReviewDate", "date", "The date on which the module content was last reviewed.", 0, java.lang.Integer.MAX_VALUE, lastReviewDate));
        childrenList.add(new Property("effectivePeriod", "Period", "The period during which the module content is effective.", 0, java.lang.Integer.MAX_VALUE, effectivePeriod));
        childrenList.add(new Property("coverage", "UsageContext", "Specifies various attributes of the patient population for whom and/or environment of care in which, the knowledge module is applicable.", 0, java.lang.Integer.MAX_VALUE, coverage));
        childrenList.add(new Property("topic", "CodeableConcept", "Clinical topics related to the content of the module.", 0, java.lang.Integer.MAX_VALUE, topic));
        childrenList.add(new Property("contributor", "Contributor", "A contributor to the content of the module, including authors, editors, reviewers, and endorsers.", 0, java.lang.Integer.MAX_VALUE, contributor));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the module (also known as the steward for the module). This information is required for non-experimental published artifacts.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "ContactDetail", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the module and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the module.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("relatedResource", "RelatedResource", "Related resources such as additional documentation, justification, or bibliographic references.", 0, java.lang.Integer.MAX_VALUE, relatedResource));
      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Enumeration<ModuleMetadataType>
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<ModuleMetadataStatus>
        case -404562712: /*experimental*/ return this.experimental == null ? new Base[0] : new Base[] {this.experimental}; // BooleanType
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case -220463842: /*purpose*/ return this.purpose == null ? new Base[0] : new Base[] {this.purpose}; // StringType
        case 111574433: /*usage*/ return this.usage == null ? new Base[0] : new Base[] {this.usage}; // StringType
        case 1470566394: /*publicationDate*/ return this.publicationDate == null ? new Base[0] : new Base[] {this.publicationDate}; // DateType
        case -1687512484: /*lastReviewDate*/ return this.lastReviewDate == null ? new Base[0] : new Base[] {this.lastReviewDate}; // DateType
        case -403934648: /*effectivePeriod*/ return this.effectivePeriod == null ? new Base[0] : new Base[] {this.effectivePeriod}; // Period
        case -351767064: /*coverage*/ return this.coverage == null ? new Base[0] : this.coverage.toArray(new Base[this.coverage.size()]); // UsageContext
        case 110546223: /*topic*/ return this.topic == null ? new Base[0] : this.topic.toArray(new Base[this.topic.size()]); // CodeableConcept
        case -1895276325: /*contributor*/ return this.contributor == null ? new Base[0] : this.contributor.toArray(new Base[this.contributor.size()]); // Contributor
        case 1447404028: /*publisher*/ return this.publisher == null ? new Base[0] : new Base[] {this.publisher}; // StringType
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
        case 1522889671: /*copyright*/ return this.copyright == null ? new Base[0] : new Base[] {this.copyright}; // StringType
        case 1554540889: /*relatedResource*/ return this.relatedResource == null ? new Base[0] : this.relatedResource.toArray(new Base[this.relatedResource.size()]); // RelatedResource
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116079: // url
          this.url = castToUri(value); // UriType
          break;
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          break;
        case 351608024: // version
          this.version = castToString(value); // StringType
          break;
        case 3373707: // name
          this.name = castToString(value); // StringType
          break;
        case 110371416: // title
          this.title = castToString(value); // StringType
          break;
        case 3575610: // type
          this.type = new ModuleMetadataTypeEnumFactory().fromType(value); // Enumeration<ModuleMetadataType>
          break;
        case -892481550: // status
          this.status = new ModuleMetadataStatusEnumFactory().fromType(value); // Enumeration<ModuleMetadataStatus>
          break;
        case -404562712: // experimental
          this.experimental = castToBoolean(value); // BooleanType
          break;
        case -1724546052: // description
          this.description = castToString(value); // StringType
          break;
        case -220463842: // purpose
          this.purpose = castToString(value); // StringType
          break;
        case 111574433: // usage
          this.usage = castToString(value); // StringType
          break;
        case 1470566394: // publicationDate
          this.publicationDate = castToDate(value); // DateType
          break;
        case -1687512484: // lastReviewDate
          this.lastReviewDate = castToDate(value); // DateType
          break;
        case -403934648: // effectivePeriod
          this.effectivePeriod = castToPeriod(value); // Period
          break;
        case -351767064: // coverage
          this.getCoverage().add(castToUsageContext(value)); // UsageContext
          break;
        case 110546223: // topic
          this.getTopic().add(castToCodeableConcept(value)); // CodeableConcept
          break;
        case -1895276325: // contributor
          this.getContributor().add(castToContributor(value)); // Contributor
          break;
        case 1447404028: // publisher
          this.publisher = castToString(value); // StringType
          break;
        case 951526432: // contact
          this.getContact().add(castToContactDetail(value)); // ContactDetail
          break;
        case 1522889671: // copyright
          this.copyright = castToString(value); // StringType
          break;
        case 1554540889: // relatedResource
          this.getRelatedResource().add(castToRelatedResource(value)); // RelatedResource
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url"))
          this.url = castToUri(value); // UriType
        else if (name.equals("identifier"))
          this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("version"))
          this.version = castToString(value); // StringType
        else if (name.equals("name"))
          this.name = castToString(value); // StringType
        else if (name.equals("title"))
          this.title = castToString(value); // StringType
        else if (name.equals("type"))
          this.type = new ModuleMetadataTypeEnumFactory().fromType(value); // Enumeration<ModuleMetadataType>
        else if (name.equals("status"))
          this.status = new ModuleMetadataStatusEnumFactory().fromType(value); // Enumeration<ModuleMetadataStatus>
        else if (name.equals("experimental"))
          this.experimental = castToBoolean(value); // BooleanType
        else if (name.equals("description"))
          this.description = castToString(value); // StringType
        else if (name.equals("purpose"))
          this.purpose = castToString(value); // StringType
        else if (name.equals("usage"))
          this.usage = castToString(value); // StringType
        else if (name.equals("publicationDate"))
          this.publicationDate = castToDate(value); // DateType
        else if (name.equals("lastReviewDate"))
          this.lastReviewDate = castToDate(value); // DateType
        else if (name.equals("effectivePeriod"))
          this.effectivePeriod = castToPeriod(value); // Period
        else if (name.equals("coverage"))
          this.getCoverage().add(castToUsageContext(value));
        else if (name.equals("topic"))
          this.getTopic().add(castToCodeableConcept(value));
        else if (name.equals("contributor"))
          this.getContributor().add(castToContributor(value));
        else if (name.equals("publisher"))
          this.publisher = castToString(value); // StringType
        else if (name.equals("contact"))
          this.getContact().add(castToContactDetail(value));
        else if (name.equals("copyright"))
          this.copyright = castToString(value); // StringType
        else if (name.equals("relatedResource"))
          this.getRelatedResource().add(castToRelatedResource(value));
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: throw new FHIRException("Cannot make property url as it is not a complex type"); // UriType
        case -1618432855:  return addIdentifier(); // Identifier
        case 351608024: throw new FHIRException("Cannot make property version as it is not a complex type"); // StringType
        case 3373707: throw new FHIRException("Cannot make property name as it is not a complex type"); // StringType
        case 110371416: throw new FHIRException("Cannot make property title as it is not a complex type"); // StringType
        case 3575610: throw new FHIRException("Cannot make property type as it is not a complex type"); // Enumeration<ModuleMetadataType>
        case -892481550: throw new FHIRException("Cannot make property status as it is not a complex type"); // Enumeration<ModuleMetadataStatus>
        case -404562712: throw new FHIRException("Cannot make property experimental as it is not a complex type"); // BooleanType
        case -1724546052: throw new FHIRException("Cannot make property description as it is not a complex type"); // StringType
        case -220463842: throw new FHIRException("Cannot make property purpose as it is not a complex type"); // StringType
        case 111574433: throw new FHIRException("Cannot make property usage as it is not a complex type"); // StringType
        case 1470566394: throw new FHIRException("Cannot make property publicationDate as it is not a complex type"); // DateType
        case -1687512484: throw new FHIRException("Cannot make property lastReviewDate as it is not a complex type"); // DateType
        case -403934648:  return getEffectivePeriod(); // Period
        case -351767064:  return addCoverage(); // UsageContext
        case 110546223:  return addTopic(); // CodeableConcept
        case -1895276325:  return addContributor(); // Contributor
        case 1447404028: throw new FHIRException("Cannot make property publisher as it is not a complex type"); // StringType
        case 951526432:  return addContact(); // ContactDetail
        case 1522889671: throw new FHIRException("Cannot make property copyright as it is not a complex type"); // StringType
        case 1554540889:  return addRelatedResource(); // RelatedResource
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.version");
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.name");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.title");
        }
        else if (name.equals("type")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.type");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.status");
        }
        else if (name.equals("experimental")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.experimental");
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.description");
        }
        else if (name.equals("purpose")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.purpose");
        }
        else if (name.equals("usage")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.usage");
        }
        else if (name.equals("publicationDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.publicationDate");
        }
        else if (name.equals("lastReviewDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.lastReviewDate");
        }
        else if (name.equals("effectivePeriod")) {
          this.effectivePeriod = new Period();
          return this.effectivePeriod;
        }
        else if (name.equals("coverage")) {
          return addCoverage();
        }
        else if (name.equals("topic")) {
          return addTopic();
        }
        else if (name.equals("contributor")) {
          return addContributor();
        }
        else if (name.equals("publisher")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.publisher");
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else if (name.equals("copyright")) {
          throw new FHIRException("Cannot call addChild on a primitive type ModuleMetadata.copyright");
        }
        else if (name.equals("relatedResource")) {
          return addRelatedResource();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "ModuleMetadata";

  }

      public ModuleMetadata copy() {
        ModuleMetadata dst = new ModuleMetadata();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.title = title == null ? null : title.copy();
        dst.type = type == null ? null : type.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.description = description == null ? null : description.copy();
        dst.purpose = purpose == null ? null : purpose.copy();
        dst.usage = usage == null ? null : usage.copy();
        dst.publicationDate = publicationDate == null ? null : publicationDate.copy();
        dst.lastReviewDate = lastReviewDate == null ? null : lastReviewDate.copy();
        dst.effectivePeriod = effectivePeriod == null ? null : effectivePeriod.copy();
        if (coverage != null) {
          dst.coverage = new ArrayList<UsageContext>();
          for (UsageContext i : coverage)
            dst.coverage.add(i.copy());
        };
        if (topic != null) {
          dst.topic = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : topic)
            dst.topic.add(i.copy());
        };
        if (contributor != null) {
          dst.contributor = new ArrayList<Contributor>();
          for (Contributor i : contributor)
            dst.contributor.add(i.copy());
        };
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
          dst.contact = new ArrayList<ContactDetail>();
          for (ContactDetail i : contact)
            dst.contact.add(i.copy());
        };
        dst.copyright = copyright == null ? null : copyright.copy();
        if (relatedResource != null) {
          dst.relatedResource = new ArrayList<RelatedResource>();
          for (RelatedResource i : relatedResource)
            dst.relatedResource.add(i.copy());
        };
        return dst;
      }

      protected ModuleMetadata typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ModuleMetadata))
          return false;
        ModuleMetadata o = (ModuleMetadata) other;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true)
           && compareDeep(name, o.name, true) && compareDeep(title, o.title, true) && compareDeep(type, o.type, true)
           && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(description, o.description, true)
           && compareDeep(purpose, o.purpose, true) && compareDeep(usage, o.usage, true) && compareDeep(publicationDate, o.publicationDate, true)
           && compareDeep(lastReviewDate, o.lastReviewDate, true) && compareDeep(effectivePeriod, o.effectivePeriod, true)
           && compareDeep(coverage, o.coverage, true) && compareDeep(topic, o.topic, true) && compareDeep(contributor, o.contributor, true)
           && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(copyright, o.copyright, true)
           && compareDeep(relatedResource, o.relatedResource, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ModuleMetadata))
          return false;
        ModuleMetadata o = (ModuleMetadata) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true)
           && compareValues(title, o.title, true) && compareValues(type, o.type, true) && compareValues(status, o.status, true)
           && compareValues(experimental, o.experimental, true) && compareValues(description, o.description, true)
           && compareValues(purpose, o.purpose, true) && compareValues(usage, o.usage, true) && compareValues(publicationDate, o.publicationDate, true)
           && compareValues(lastReviewDate, o.lastReviewDate, true) && compareValues(publisher, o.publisher, true)
           && compareValues(copyright, o.copyright, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(url, identifier, version
          , name, title, type, status, experimental, description, purpose, usage, publicationDate
          , lastReviewDate, effectivePeriod, coverage, topic, contributor, publisher, contact
          , copyright, relatedResource);
      }


}

