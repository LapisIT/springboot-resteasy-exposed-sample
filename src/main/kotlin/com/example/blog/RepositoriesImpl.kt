package com.example.blog

import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
class ArticleRepositoryImpl: ArticleRepository {

  private fun fromRow(r: ResultRow) =
    Article(r[Articles.id], r[Articles.title], r[Articles.headline], r[Articles.content])

  override fun findAll() = Articles.selectAll().map { fromRow(it) }
}
