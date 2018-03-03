package xyz.gonzapico.trendingrepositories

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import xyz.gonzapico.trendingrepositories.data.GitHubRepository
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Date
import java.util.TimeZone

class HomeActivity : AppCompatActivity(),
    RepositoriesView {

  lateinit var githubRepository : GitHubRepository

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.home_activity)
  }

  fun getHottestRepositories(){
    showLoading()
    launch (UI) { githubRepository.getRepositoriesByTechnology("android", "stars", getToday() ?: "") }

  }

  private fun getToday(): String? {
    val date = Date()
    val strDateFormat = "YYYY-mm-DD"
    val dateFormat = SimpleDateFormat(strDateFormat)
    val formattedDate = dateFormat.format(date)
    return formattedDate
  }

  override fun showLoading() {
    TODO(
        "not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun hideLoading() {
    TODO(
        "not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun populateList() {
    TODO(
        "not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}