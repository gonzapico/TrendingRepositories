package xyz.gonzapico.trendingrepositories

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class HomeActivity : AppCompatActivity(),
    RepositoriesView {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.home_activity)

    rvRepositories
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