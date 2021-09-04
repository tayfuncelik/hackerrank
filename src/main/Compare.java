package src.main;

import java.util.ArrayList;
import java.util.List;

class Compare {

  public static void main(String[] args) {
    System.out.print(//aaio
//        Cus_free_hitechtalentsllc_jt541Challenge("abceiou"));
        Cus_free_hitechtalentsllc_jt541Challenge("abcdeaeiaaioaaaaeiiiiouuuooaauuaeiu"));
  }

  static boolean isVowel(char c) {
    return (c == 'a' || c == 'e' || c == 'i'
        || c == 'o' || c == 'u');
  }

  public static Integer Cus_free_hitechtalentsllc_jt541Challenge(String word) {
    // code goes here

    int max = 0;
    List<Character> stlist = new ArrayList<Character>();
    List<Integer> countList = new ArrayList<Integer>();
    int index = 0;
    for (int j = 0; j < word.length(); j++) {

      if (isVowel(word.charAt(j))) {

        if (stlist.size() > 0) {
          index = stlist.size() - 1;
        }

        if (stlist.size() == 0) {
          if (word.charAt(j) == 'a') {
            stlist.add(word.charAt(j));
          }
        } else {
          if (stlist.get(index) == 'a' && (word.charAt(j) == 'a' || word.charAt(j) == 'e')) {
            stlist.add(word.charAt(j));
          } else if (stlist.get(index) == 'e' && (word.charAt(j) == 'e' || word.charAt(j) == 'i')) {
            stlist.add(word.charAt(j));
          } else if (stlist.get(index) == 'i' && (word.charAt(j) == 'i' || word.charAt(j) == 'o')) {
            stlist.add(word.charAt(j));
          } else if (stlist.get(index) == 'o' && (word.charAt(j) == 'o' || word.charAt(j) == 'u')) {
            stlist.add(word.charAt(j));
          } else if (stlist.get(index) == 'u' && (word.charAt(j) == 'u')) {
            stlist.add(word.charAt(j));
          } else {
            if (stlist.contains('a') &&
                stlist.contains('e') &&
                stlist.contains('i') &&
                stlist.contains('o') &&
                stlist.contains('u')) {
              countList.add(stlist.size());
            }
            index = 0;
            stlist = new ArrayList<>();
          }
        }


      } else {
        if (stlist.contains('a') &&
            stlist.contains('e') &&
            stlist.contains('i') &&
            stlist.contains('o') &&
            stlist.contains('u')) {
          countList.add(stlist.size());
        } else {
          index = 0;
          stlist = new ArrayList<>();
        }
      }
    }

    if (countList.size() == 0) {
      return 0;
    }
    return countList.get(0);
  }
}
