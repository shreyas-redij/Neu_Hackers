/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lab7.entities.Comment;
import lab7.entities.User;
import lab7.entities.Post;

/**
 *
 * @author Joy, Shreyas and Ravi
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
     public void getUserwithMostLikes(){
        Map<Integer,Integer> userLikesCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
       
        for(User user : users.values()){
            for(Comment c : user.getComments()){
                int likes=0;
                if(userLikesCount.containsKey(user.getId())){
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
         System.out.println(userLikesCount);
        int max=0;
        int maxId=0;
        for(int id: userLikesCount.keySet()){
            if(userLikesCount.get(id)>max){
                max= userLikesCount.get(id);
                maxId=id;
            }
        }
        System.out.println("\nUser with most likes : "+ max+ "\n"+ users.get(maxId));
    }
     
     // find 5 comments which have the most likes
    // TODO
    public void getTopFiveLikedCommnets(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<Comment>(comments.values());
        
        Comparator<Comment> test = new Comparator<Comment>(){
            public int compare(Comment c1, Comment c2){
                return c2.getLikes() - c1.getLikes();
            }
        };
        
        Collections.sort(commentList, test);
        
        System.out.println("\nTop 5 Comments with most likes");
        for(int i =0; i<commentList.size() && i<5; i++){
            
            System.out.println(commentList.get(i));
        }   
    }

    
   

 public void getPostWithMostComments(){
        Map<Integer, Integer> postCommentCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        
        for(Post p: posts.values()){
            for(Comment c : p.getComments()){
                int commentCount = 0;
                if(postCommentCount.containsKey(p.getPostId())){
                    commentCount = postCommentCount.get(p.getPostId());
                    
                }
                commentCount += 1;
                postCommentCount.put(p.getPostId(), commentCount);
                
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : postCommentCount.keySet()) {
            if (postCommentCount.get(id) > max) {
                max = postCommentCount.get(id);
                maxId = id;
            }
        }
        System.out.println("\nPost with most Comments ");
        System.out.println(posts.get(maxId));
        
     }

}
