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

case class ControllerDTO(
  /* The id of the NiFi. */
  id: Option[String] = None,
  /* The name of the NiFi. */
  name: Option[String] = None,
  /* The comments for the NiFi. */
  comments: Option[String] = None,
  /* The number of running components in the NiFi. */
  runningCount: Option[Int] = None,
  /* The number of stopped components in the NiFi. */
  stoppedCount: Option[Int] = None,
  /* The number of invalid components in the NiFi. */
  invalidCount: Option[Int] = None,
  /* The number of disabled components in the NiFi. */
  disabledCount: Option[Int] = None,
  /* The number of active remote ports contained in the NiFi. */
  activeRemotePortCount: Option[Int] = None,
  /* The number of inactive remote ports contained in the NiFi. */
  inactiveRemotePortCount: Option[Int] = None,
  /* The number of input ports contained in the NiFi. */
  inputPortCount: Option[Int] = None,
  /* The number of output ports in the NiFi. */
  outputPortCount: Option[Int] = None,
  /* The Socket Port on which this instance is listening for Remote Transfers of Flow Files. If this instance is not configured to receive Flow Files from remote instances, this will be null. */
  remoteSiteListeningPort: Option[Int] = None,
  /* The HTTP(S) Port on which this instance is listening for Remote Transfers of Flow Files. If this instance is not configured to receive Flow Files from remote instances, this will be null. */
  remoteSiteHttpListeningPort: Option[Int] = None,
  /* Indicates whether or not Site-to-Site communications with this instance is secure (2-way authentication). */
  siteToSiteSecure: Option[Boolean] = None,
  /* If clustered, the id of the Cluster Manager, otherwise the id of the NiFi. */
  instanceId: Option[String] = None,
  /* The input ports available to send data to for the NiFi. */
  inputPorts: Option[Set[PortDTO]] = None,
  /* The output ports available to received data from the NiFi. */
  outputPorts: Option[Set[PortDTO]] = None
) extends ApiModel

