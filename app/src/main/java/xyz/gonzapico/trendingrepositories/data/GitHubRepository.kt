package xyz.gonzapico.trendingrepositories

import kotlinx.coroutines.experimental.Deferred
import xyz.gonzapico.trendingrepositories.GitHubAPI.GitHubRepositories

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
  fun getRepositoriesByTechnology(technology: String, order: String):
      Deferred<GitHubRepositories> = GitHubAPI.service.search(
      "language:"+technology,
      "created:>`date -v-7d '+%Y-%m-%d'`",
      "starts",
      order)

}