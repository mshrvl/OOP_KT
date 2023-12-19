data class Post(
    val id: Int,
    val authorId: Int,
    val authorName: String,
    val content: String,
    val published: Long,
    val likes: Int
)

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post:Post): Post {
        posts += post
        return post
    }

    fun likeById(id: Int) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes + 1)
            }
        }
    }
}
fun main() {
    val post = Post(1, 1, "author", "content", likes = 0, published = 0)
    val liked = post.copy(likes = post.likes + 1)
    val(id, authorId,_, content) = post
    println(liked)


}