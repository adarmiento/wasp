package it.agilelab.bigdata.wasp.core.models.editor

/**
  * Pipegraph data transfer object
  *
  * @param name name of the pipegraph
  * @param description description of the pipegraph
  * @param owner owner of the pipegraph
  * @param structuredStreamingComponents components describing processing built on Spark Structured Streaming
  *
  */
case class PipegraphDTO(
    name: String,
    description: String,
    owner: String,
    structuredStreamingComponents: List[StructuredStreamingETLDTO]
)

/**
  * StructuredStreamingETLModel data transfer object
  *
  * @param name unique name of the processing component
  * @param group group of which the processing component is part
  * @param streamingInput streaming input unique name
  * @param streamingOutput streaming output definition
  * @param strategy strategy model that defines the processing
  * @param triggerIntervalMs trigger interval to use, in milliseconds
  */
case class StructuredStreamingETLDTO(
    name: String,
    group: String,
    streamingInput: String,
    streamingOutput: StreamingOutputDTO,
    strategy: StrategyDTO,
    triggerIntervalMs: Long
)

/**
  * WriterModel data transfer object
  */
sealed trait StreamingOutputDTO {
  def name: String
  def outputType: String
}

case class TopicDTO(name: String, topicName: String) extends StreamingOutputDTO {
  override def outputType: String = "Topic"
}
case class RawDataDTO(name: String, destinationPath: String) extends StreamingOutputDTO {
  override def outputType: String = "RawData"
}
case class IndexDTO(name: String, indexName: String) extends StreamingOutputDTO {
  override def outputType: String = "Index"
}
case class KeyValueDTO(name: String, keyValueName: String) extends StreamingOutputDTO {
  override def outputType: String = "KeyValue"
}

/**
  * Strategy data transfer object
  */
sealed trait StrategyDTO {
  def name: String
  def strategyType: String
}

case class FreeCodeDTO(name: String, code: String) extends StrategyDTO {
  override def strategyType: String = "FreeCode"
}
case class FlowNifiDTO(name: String, nifiFlow: String) extends StrategyDTO {
  override def strategyType: String = "FreeCode"
}
case class StrategyClassDTO(name: String, className: String) extends StrategyDTO {
  override def strategyType: String = "StrategyClass"
}
