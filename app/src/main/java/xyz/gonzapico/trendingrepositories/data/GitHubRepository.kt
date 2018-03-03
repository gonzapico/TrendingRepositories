package xyz.gonzapico.trendingrepositories.data

import kotlinx.coroutines.experimental.Deferred
import xyz.gonzapico.trendingrepositories.data.GitHubAPI
import xyz.gonzapico.trendingrepositories.data.GitHubAPI.GitHubRepositories
import java.time.Instant
import java.util.Date

object GitHubRepository {

  /***
   * curl -G
   * https://api.github.com/search/repositories
   * --data-urlencode
   * "sort=stars"
   * --data-urlencode
   * "order=desc"
   * --data-urlencode
   * "q=language:android"
   * --data-urlencode
   * "q=created:>`date -v-7d '+%Y-%m-%d'`"
   */
  fun getRepositoriesByTechnology(technology: String, order: String, currentDate : String):
      Deferred<GitHubRepositories> = GitHubAPI.service.search(
      "language:"+technology,
      "created:>`"+ currentDate +" -v-7d '+%Y-%m-%d'`",
      "starts",
      order)

}