package com.example.lovelaceapis
data class AllPosts(
    val results:List<Post>
)
data class Post(
    var userId:String,
    var id:String,
    var title:String,
    var body:String

)
