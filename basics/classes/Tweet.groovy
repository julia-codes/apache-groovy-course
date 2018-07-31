

@groovy.transform.TypeChecked()
class Tweet {
    String username
    String name
    String content
    int likes = 0
    int retweets = 0
    Date    timestamp = new Date()
    String toString(){
        String likeslabel = likes == 1? "like": $/likes/$
        String retweetslabel = retweets == 1? "retweet": $/retweets/$
        "$name $username - \n $content \n $likes $likeslabel $retweets $retweetslabel \n - $timestamp"
    }
    String retweet(){
        retweets ++
    }
    String like(){
        likes ++
    }

}
