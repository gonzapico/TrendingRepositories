package xyz.gonzapico.trendingrepositories

import kotlinx.coroutines.experimental.Deferred
import xyz.gonzapico.trendingrepositories.GitHubAPI.GitHubRepositories

object GitHubRepository {

  internal val appid = "f08f5bce8d0fe0c0903f145a88d773f8"

  suspend fun getHottiestRepositories(technology : String) : List<>

  /**
   * @throws IllegalStateException
   */
  suspend fun getCityCharts(city: String): List<GitHubRepository> {
    val forecasts = getDailyForecastsByCity(city, 10, "metric").list?.toList() ?: return emptyList()
    forecasts.size > 1 || return emptyList()
    return listOf(
        forecasts.tempChart,
        forecasts.humidityAndCloudinessChart,
        forecasts.windSpeedChart,
        forecasts.pressureChart,
        forecasts.rainAndSnowChart
    )
    // TODO: more charts? use all private functions from below?
  }

  private suspend fun getRepositoriesByTechnology() : Deferred<GitHubRepositories>
  = GitHubAPI.service.search("android", 10, 10)

}