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

     public void userWithMostLikes(){
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
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    //////////////////////////////////////////////////////////////
    public void getTop5InactiveUserOverall(int a){
        
        Map<Integer,Integer> overallScore = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        
        for(User user : users.values()){
            for(Comment c : user.getComments()){
                int likes=0;
                if(overallScore.containsKey(user.getId())){
                    likes = overallScore.get(user.getId());
                }
                
                likes += c.getLikes();
                
                overallScore.put(user.getId(), likes);
            }
        }
       
        for(User user : users.values()){  
            int totalComments=0;
            if(overallScore.containsKey(user.getId())){
                totalComments = overallScore.get(user.getId());
            }
           
            totalComments += user.getComments().size();
            overallScore.put(user.getId(), totalComments);
        }
        
        for(Post p : posts.values()){
            int totalPosts = 0;
            if(overallScore.containsKey(p.getUserId())){
                totalPosts = overallScore.get(p.getUserId());
            }
            totalPosts += 1;
            overallScore.put(p.getUserId(), totalPosts);
        }
  
        Set set = overallScore.entrySet();     
        List list = new LinkedList(overallScore.entrySet());
        // Defined Custom Comparator here
        if (a == 1){
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
               return ((Comparable) ((Map.Entry) (o1)).getValue())
                  .compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        }
        else {
             Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
               return ((Comparable) ((Map.Entry) (o2)).getValue())
                  .compareTo(((Map.Entry) (o1)).getValue());
            }
        });
        }

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
        } 
    
        Set set2 = sortedHashMap.entrySet();
        Iterator iterator2 = set2.iterator();
        int i = 0;
        if (a==1){ 
              System.out.println("\nTop 5 Inactive Users are: ");  
              while(iterator2.hasNext() && i<5) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print("User ID :" + me2.getKey() + "      Overall Score: ");
              System.out.println(me2.getValue());
              i++;
            }
        }
        else {  
            System.out.println("\nTop 5 Proactive Users are: ");
            while(iterator2.hasNext() && i<5) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print("User ID :" + me2.getKey() + "      Overall Score: ");
              System.out.println(me2.getValue());
              i++;
            }
        }
    }

    
    public void getTop5ProactiveUserOverall(){
        
        getTop5InactiveUserOverall(0);
    
    
    }
   
     
// this fuction gets the post of most comments  
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
 // gets all the inactive users based on comments posted
   public void getInactiveUsersBasedOnComments(){
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        List<User> usersCommentList = new ArrayList<>(users.values());
    
        Comparator<User> test3 = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getComments().size() - u2.getComments().size();
            }
        };
        Collections.sort(usersCommentList, test3);
    
        System.out.println("\nTop five inactive users based on comments:");
        for(int i = 0; i<usersCommentList.size() && i <5; i++){
        System.out.println("User ID :"  + usersCommentList.get(i).getId() +" "+ "No. of Comments:" + usersCommentList.get(i).getComments().size());
        }
    }
   
    public void getInactiveUsersBasedOnPost(){
        Map<Integer, Integer> userPostCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        
        for(Post p: posts.values()){
            int postCount = 0;
            if(userPostCount.containsKey(p.getUserId())){
                postCount = userPostCount.get(p.getUserId());
            }
            postCount += 1;
            userPostCount.put(p.getUserId(), postCount);
            
        }
        
        List<Map.Entry<Integer, Integer>> list= new LinkedList<>(userPostCount.entrySet());
        
        Comparator<Map.Entry<Integer, Integer>> test2 = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
              return o1.getValue() - o2.getValue();  
            }
        };
        
        Collections.sort(list, test2);
        System.out.println("\nTop Five inactive users based on total posts : ");
        for(int i =0; i< list.size() && i<5; i++){
            System.out.println("User ID :" + list.get(i).getKey() +" " + "Total Posts:" + list.get(i).getValue());
        }
        
    }

}
