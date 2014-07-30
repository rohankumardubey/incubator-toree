package com.ibm.kernel.protocol.v5.content
import play.api.libs.json._

case class StreamContent(
   name: String,
   data: String
   )


object StreamContent {
  implicit val inspectRequestReads = Json.reads[StreamContent]
  implicit val inspectRequestWrites = Json.writes[StreamContent]
}
