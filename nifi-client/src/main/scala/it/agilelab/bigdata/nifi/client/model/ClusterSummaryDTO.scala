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

case class ClusterSummaryDTO(
  /* When clustered, reports the number of nodes connected vs the number of nodes in the cluster. */
  connectedNodes: Option[String] = None,
  /* The number of nodes that are currently connected to the cluster */
  connectedNodeCount: Option[Int] = None,
  /* The number of nodes in the cluster, regardless of whether or not they are connected */
  totalNodeCount: Option[Int] = None,
  /* Whether this NiFi instance is clustered. */
  clustered: Option[Boolean] = None,
  /* Whether this NiFi instance is connected to a cluster. */
  connectedToCluster: Option[Boolean] = None
) extends ApiModel


