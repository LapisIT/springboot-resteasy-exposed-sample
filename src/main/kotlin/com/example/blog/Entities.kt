package com.example.blog

import org.jetbrains.exposed.sql.Table
import java.time.LocalDateTime


class Article(
    val id: Long,
		var title: String,
		var headline: String,
		var content: String,
		var slug: String = title.toSlug(),
		var addedAt: LocalDateTime = LocalDateTime.now()
		)


object Articles : Table() {
  val id = long("id").autoIncrement().primaryKey()
  val title = text("title")
  val headline = text("headline")
  val content = text("content")

}
