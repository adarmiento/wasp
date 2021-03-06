package it.agilelab.bigdata.wasp.master.web.openapi

import io.swagger.v3.oas.models.media.{ComposedSchema, Discriminator, Schema}
import it.agilelab.bigdata.wasp.core.models.editor.{
  CodeResponse,
  FlowNifiDTO,
  FreeCodeDTO,
  IndexDTO,
  KeyValueDTO,
  NifiStatelessInstanceModel,
  PipegraphDTO,
  RawDataDTO,
  StrategyClassDTO,
  StrategyDTO,
  StreamingOutputDTO,
  StructuredStreamingETLDTO,
  TopicDTO
}

trait EditorOpenApiComponentSupport extends LangOpenApi with ProductOpenApi with CollectionsOpenApi {

  implicit lazy val nifiStatelessInstanceOpenApi: ToOpenApiSchema[NifiStatelessInstanceModel] =
    product3(NifiStatelessInstanceModel)

  implicit lazy val strategyCodeInstanceOpenApi: ToOpenApiSchema[CodeResponse] =
    product2(CodeResponse)

  implicit lazy val pipegraphDTOInstanceOpenApi: ToOpenApiSchema[PipegraphDTO] =
    product4(PipegraphDTO)

  implicit lazy val structuredStreamingETLDTOInstanceOpenApi: ToOpenApiSchema[StructuredStreamingETLDTO] =
    product6(StructuredStreamingETLDTO)

  implicit lazy val streamingOutputDTOInstanceOpenApi: ToOpenApiSchema[StreamingOutputDTO] =
    new ToOpenApiSchema[StreamingOutputDTO] {
      override def schema(ctx: Context): Schema[_] = {
        val composed      = new ComposedSchema()
        val discriminator = new Discriminator().propertyName("outputType")
        composed
          .addOneOfItem(shouldBecomeARef(ctx, topicInstanceOpenApi.schema(ctx)))
          .addOneOfItem(shouldBecomeARef(ctx, rawDataInstanceOpenApi.schema(ctx)))
          .addOneOfItem(shouldBecomeARef(ctx, indexInstanceOpenApi.schema(ctx)))
          .addOneOfItem(shouldBecomeARef(ctx, keyValueInstanceOpenApi.schema(ctx)))
          .discriminator(discriminator)
      }
    }

  implicit lazy val topicInstanceOpenApi: ToOpenApiSchema[TopicDTO]       = product2(TopicDTO)
  implicit lazy val rawDataInstanceOpenApi: ToOpenApiSchema[RawDataDTO]   = product2(RawDataDTO)
  implicit lazy val indexInstanceOpenApi: ToOpenApiSchema[IndexDTO]       = product2(IndexDTO)
  implicit lazy val keyValueInstanceOpenApi: ToOpenApiSchema[KeyValueDTO] = product2(KeyValueDTO)

  implicit lazy val strategyDTOInstanceOpenApi: ToOpenApiSchema[StrategyDTO] =
    new ToOpenApiSchema[StrategyDTO] {
      override def schema(ctx: Context): Schema[_] = {
        val composed      = new ComposedSchema()
        val discriminator = new Discriminator().propertyName("strategyType")
        composed
          .addOneOfItem(shouldBecomeARef(ctx, freeCodeInstanceOpenApi.schema(ctx)))
          .addOneOfItem(shouldBecomeARef(ctx, flowNifinstanceOpenApi.schema(ctx)))
          .addOneOfItem(shouldBecomeARef(ctx, strategyClassInstanceOpenApi.schema(ctx)))
          .discriminator(discriminator)
      }
    }

  implicit lazy val freeCodeInstanceOpenApi: ToOpenApiSchema[FreeCodeDTO]           = product2(FreeCodeDTO)
  implicit lazy val flowNifinstanceOpenApi: ToOpenApiSchema[FlowNifiDTO]            = product2(FlowNifiDTO)
  implicit lazy val strategyClassInstanceOpenApi: ToOpenApiSchema[StrategyClassDTO] = product2(StrategyClassDTO)
}
