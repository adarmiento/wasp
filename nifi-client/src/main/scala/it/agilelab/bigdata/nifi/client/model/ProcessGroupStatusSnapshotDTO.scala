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

case class ProcessGroupStatusSnapshotDTO(
  /* The id of the process group. */
  id: Option[String] = None,
  /* The name of this process group. */
  name: Option[String] = None,
  /* The status of all connections in the process group. */
  connectionStatusSnapshots: Option[Seq[ConnectionStatusSnapshotEntity]] = None,
  /* The status of all processors in the process group. */
  processorStatusSnapshots: Option[Seq[ProcessorStatusSnapshotEntity]] = None,
  /* The status of all process groups in the process group. */
  processGroupStatusSnapshots: Option[Seq[ProcessGroupStatusSnapshotEntity]] = None,
  /* The status of all remote process groups in the process group. */
  remoteProcessGroupStatusSnapshots: Option[Seq[RemoteProcessGroupStatusSnapshotEntity]] = None,
  /* The status of all input ports in the process group. */
  inputPortStatusSnapshots: Option[Seq[PortStatusSnapshotEntity]] = None,
  /* The status of all output ports in the process group. */
  outputPortStatusSnapshots: Option[Seq[PortStatusSnapshotEntity]] = None,
  /* The current state of the Process Group, as it relates to the Versioned Flow */
  versionedFlowState: Option[ProcessGroupStatusSnapshotDTOEnums.VersionedFlowState] = None,
  /* The number of FlowFiles that have come into this ProcessGroup in the last 5 minutes */
  flowFilesIn: Option[Int] = None,
  /* The number of bytes that have come into this ProcessGroup in the last 5 minutes */
  bytesIn: Option[Long] = None,
  /* The input count/size for the process group in the last 5 minutes (pretty printed). */
  input: Option[String] = None,
  /* The number of FlowFiles that are queued up in this ProcessGroup right now */
  flowFilesQueued: Option[Int] = None,
  /* The number of bytes that are queued up in this ProcessGroup right now */
  bytesQueued: Option[Long] = None,
  /* The count/size that is queued in the the process group. */
  queued: Option[String] = None,
  /* The count that is queued for the process group. */
  queuedCount: Option[String] = None,
  /* The size that is queued for the process group. */
  queuedSize: Option[String] = None,
  /* The number of bytes read by components in this ProcessGroup in the last 5 minutes */
  bytesRead: Option[Long] = None,
  /* The number of bytes read in the last 5 minutes. */
  read: Option[String] = None,
  /* The number of bytes written by components in this ProcessGroup in the last 5 minutes */
  bytesWritten: Option[Long] = None,
  /* The number of bytes written in the last 5 minutes. */
  written: Option[String] = None,
  /* The number of FlowFiles transferred out of this ProcessGroup in the last 5 minutes */
  flowFilesOut: Option[Int] = None,
  /* The number of bytes transferred out of this ProcessGroup in the last 5 minutes */
  bytesOut: Option[Long] = None,
  /* The output count/size for the process group in the last 5 minutes. */
  output: Option[String] = None,
  /* The number of FlowFiles transferred in this ProcessGroup in the last 5 minutes */
  flowFilesTransferred: Option[Int] = None,
  /* The number of bytes transferred in this ProcessGroup in the last 5 minutes */
  bytesTransferred: Option[Long] = None,
  /* The count/size transferred to/from queues in the process group in the last 5 minutes. */
  transferred: Option[String] = None,
  /* The number of bytes received from external sources by components within this ProcessGroup in the last 5 minutes */
  bytesReceived: Option[Long] = None,
  /* The number of FlowFiles received from external sources by components within this ProcessGroup in the last 5 minutes */
  flowFilesReceived: Option[Int] = None,
  /* The count/size sent to the process group in the last 5 minutes. */
  received: Option[String] = None,
  /* The number of bytes sent to an external sink by components within this ProcessGroup in the last 5 minutes */
  bytesSent: Option[Long] = None,
  /* The number of FlowFiles sent to an external sink by components within this ProcessGroup in the last 5 minutes */
  flowFilesSent: Option[Int] = None,
  /* The count/size sent from this process group in the last 5 minutes. */
  sent: Option[String] = None,
  /* The active thread count for this process group. */
  activeThreadCount: Option[Int] = None,
  /* The number of threads currently terminated for the process group. */
  terminatedThreadCount: Option[Int] = None
) extends ApiModel

object ProcessGroupStatusSnapshotDTOEnums {

  type VersionedFlowState = VersionedFlowState.Value
  object VersionedFlowState extends Enumeration {
    val LOCALLYMODIFIED = Value("LOCALLY_MODIFIED")
    val STALE = Value("STALE")
    val LOCALLYMODIFIEDANDSTALE = Value("LOCALLY_MODIFIED_AND_STALE")
    val UPTODATE = Value("UP_TO_DATE")
    val SYNCFAILURE = Value("SYNC_FAILURE")
  }

}
