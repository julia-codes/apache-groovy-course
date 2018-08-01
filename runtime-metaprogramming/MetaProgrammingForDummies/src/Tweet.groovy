//Extending Groovy Object
package codes.julia

@groovy.transform.ToString()
class Tweet implements GroovyObject{
    String username, name, post
    Date timestamp = new Date()
    int likes, retweets = 0
    List tags = ['@','#']
    List props = ['username','name','post','timestamp','likes','retweets','tags']

    def invokeMethod (String name, Object args){
        println "called invokeMethod $name $args"
    }
    def retweet(){
        retweets++
    }
    def like(){
        likes++
    }
    def getProperty(String name){
        println "In Get Property"
        if (name in props){
            return metaClass.getProperty(this, name)
        }
        return "property ($name) not found"

    }
    void setProperty(String name, Object value){
        List strs = ['username', 'name','post']
        if (name in strs){
            this.@"$name"= 'overridden'
        }
        else if (name in props){
            this.@"$name"= value
        }
        else {
            println "cannot set value on property ($name): DNE"
        }

    }
}