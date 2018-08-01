//Extending Groovy Object
package codes.julia

@groovy.transform.ToString()
class Tweet implements GroovyObject{
    String username, name, post
    Date timestamp = new Date()
    int likes, retweets = 0
    List tags = ['@','#']

    def invokeMethod (String name, Object args){
        return "called invokeMethod $name $args"
    }
    def retweet(){
        retweets++
    }
    def like(){
        likes++
    }
}