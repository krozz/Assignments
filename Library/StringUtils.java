/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krozz
 */
public class StringUtils {

    private String words;
    private String searcheds;
    private static boolean found;

    public static boolean included(String word, String searched) {
     
        String words        = word.toUpperCase().trim();
        String searcheds = searched.toUpperCase().trim();
       
        if(words.contains(searcheds)) {
              found = true;
        } else {
             found = false;
        }
        return found;
    }

}
