/*
 * *** Michael Simmons / COMP272-400C ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // Create two temporary TreeSets
    Set<Integer> tempSet1 = new TreeSet<Integer>(setA);
    Set<Integer> tempSet2 = new TreeSet<Integer>(setB);

    // Remove all elements that are outside of the intersection of the two sets
    tempSet1.removeAll(setB);
    tempSet2.removeAll(setA);

    // Then, add all elements from the two temporary sets
    tempSet1.addAll(tempSet2);
    return tempSet1;

    // I didn't use retainAll(), but it still seems to be working fine

  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    // If key mod 2 = 0 (even), remove the key
    treeMap.keySet().removeIf(key -> key % 2 == 0);
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    return tree1.equals(tree2);
  }
} // end treeProblems class
