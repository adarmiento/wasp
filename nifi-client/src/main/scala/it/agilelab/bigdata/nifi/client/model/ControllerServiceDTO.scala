/**
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * The version of the OpenAPI document: 1.11.4
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package it.agilelab.bigdata.nifi.client.model

import it.agilelab.bigdata.nifi.client.core.ApiModel

case class ControllerServiceDTO(
  /* The id of the component. */
  id: Option[String] = None,
  /* The ID of the corresponding component that is under version control */
  versionedComponentId: Option[String] = None,
  /* The id of parent process group of this component if applicable. */
  parentGroupId: Option[String] = None,
  position: Option[PositionDTO] = None,
  /* The name of the controller service. */
  name: Option[String] = None,
  /* The type of the controller service. */
  `type`: Option[String] = None,
  bundle: Option[BundleDTO] = None,
  /* Lists the APIs this Controller Service implements. */
  controllerServiceApis: Option[Seq[ControllerServiceApiDTO]] = None,
  /* The comments for the controller service. */
  comments: Option[String] = None,
  /* The state of the controller service. */
  state: Option[ControllerServiceDTOEnums.State] = None,
  /* Whether the controller service persists state. */
  persistsState: Option[Boolean] = None,
  /* Whether the controller service requires elevated privileges. */
  restricted: Option[Boolean] = None,
  /* Whether the ontroller service has been deprecated. */
  deprecated: Option[Boolean] = None,
  /* Whether the controller service has multiple versions available. */
  multipleVersionsAvailable: Option[Boolean] = None,
  /* The properties of the controller service. */
  properties: Option[Map[String, String]] = None,
  /* The descriptors for the controller service properties. */
  descriptors: Option[Map[String, PropertyDescriptorDTO]] = None,
  /* The URL for the controller services custom configuration UI if applicable. */
  customUiUrl: Option[String] = None,
  /* The annotation for the controller service. This is how the custom UI relays configuration to the controller service. */
  annotationData: Option[String] = None,
  /* All components referencing this controller service. */
  referencingComponents: Option[Set[ControllerServiceReferencingComponentEntity]] = None,
  /* The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled. */
  validationErrors: Option[Seq[String]] = None,
  /* Indicates whether the ControllerService is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the ControllerService is valid) */
  validationStatus: Option[ControllerServiceDTOEnums.ValidationStatus] = None,
  /* Whether the underlying extension is missing. */
  extensionMissing: Option[Boolean] = None
) extends ApiModel

object ControllerServiceDTOEnums {

  type State = State.Value
  type ValidationStatus = ValidationStatus.Value
  object State extends Enumeration {
    val ENABLED = Value("ENABLED")
    val ENABLING = Value("ENABLING")
    val DISABLED = Value("DISABLED")
    val DISABLING = Value("DISABLING")
  }

  object ValidationStatus extends Enumeration {
    val VALID = Value("VALID")
    val INVALID = Value("INVALID")
    val VALIDATING = Value("VALIDATING")
  }

}
