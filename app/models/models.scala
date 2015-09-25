package models

import play.api.libs.json.Json

case class BonoboKey(id: String,
  key: String,
  email: String,
  name: String,
  company: String,
  url: String,
  requestsPerDay: Int,
  requestsPerMinute: Int,
  tier: String,
  status: String,
  created_at: Long)

case class KongCreateKeyResponse(id: String, created_at: Long)

object KongCreateKeyResponse {
  implicit val consumerRead = Json.reads[KongCreateKeyResponse]
}

