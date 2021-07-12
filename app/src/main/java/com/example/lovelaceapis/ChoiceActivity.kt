package com.example.lovelaceapis

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response

class ChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        getPosts()
    }
        fun getPosts() {
            var rvDataitems=findViewById<RecyclerView>(R.id.rvData)
            var retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
            var request = retrofit.getPosts()

            request.enqueue(object : retrofit2.Callback<List<Post>> {
                override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                    if (response.isSuccessful) {
                        var posts = response.body()!!
                        var getdataAdapter=PostViewAdapter(posts,baseContext)
//                        Toast.makeText(baseContext, "${posts!!.size} posts", Toast.LENGTH_SHORT)
//                            .show()
                        rvDataitems.adapter=getdataAdapter
                        rvDataitems.layoutManager=LinearLayoutManager(baseContext)

                    }
                }

                override fun onFailure(call: Call<List<Post>>, t: Throwable) {

                }


            }
            )


        }     }