package com.therealdanvega;

import java.io.Serializable;

@groovy.transform.ToString
class Tweet implements Serializable{
    String username, name, post
    ArrayList<String> hashtags, mentions
    int retweets = 0
    int likes = 0
    Date timestamp = new Date()
    void setPost(String text){
        post = text
        hashtags = getTags(text, '#')
        mentions = getTags(text, '@')
    }
    ArrayList<String> getTags(String text, String tag){
        ArrayList<String> foundTags = new ArrayList<String>()
        if (text.contains(tag)){
            ArrayList<String> splitText = text.split(tag)
            for(i in 1..splitText.size()-1){
                foundTags.push(splitText[i].split(' ').first())
            }
        }
        foundTags
    }
    //could use findAll with a regex instead
    void retweet(){
        retweets ++
    }
    void like(){
        likes++
    }


}
