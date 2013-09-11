package codemotion2013

class Post {

    static constraints = {
        content maxSize: 20..200
        previous nullable: true
    }

    String content
    Date created
    Post previous = null
}
