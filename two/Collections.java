package two;

import java.util.*;

/**
 * In the main method
 * 2 collections are defined, one contains integers 1 thru 10 in a random order 
 * and the other contains 6 thru 15 in a random order. Both collections are printed
 * and their size is printed following the collection. These are implemented with Lists
 * for their variable size. It also allows us to easily reverse the list.
 * 
 * These two collections are then combined into a third collection which is implemented as
 * a TreeSet so that it is automatically sorted. The middle entry of the set is removed and
 * the set is printed in reverse order with its size immediately following
 * 
 * Finally, a List of key/value pairs is created. This uses the class KeyValue which
 * implements the Map.Entry interface. Five pairs are added to the collection, a duplicate
 * is then added and found in the collection. The pairs are printed with the size
 * immediately following.
 * 
 * @author Sarah Jeter
 *
 */
public class Collections {
	/**
	 * main method
	 * @param args command line arguments
	 */
	public static void main(String[] args){
		/*make collection from 1 to 10 in random order
		 *print collection and size*/
		List<Integer> c1 = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
		    c1.add(i);
		}
		java.util.Collections.shuffle(c1);
		printCollection(c1);
		System.out.println("Size: " + c1.size());
		
		/*make collection from 6 to 15 in random order
		 *print collection and size*/
		List<Integer> c2 = new ArrayList<Integer>();
		for(int i = 6; i <= 15; i++) {
		    c2.add(i);
		}
		java.util.Collections.shuffle(c2);
		printCollection(c2);
	    System.out.println("Size: " + c2.size());
	    
	    /*join and sort c1 and c2
	     * A TreeSet was chosen to be used here because the set is
	     * automatically sorted*/
	    TreeSet<Integer> joined = new TreeSet<Integer>(joinCollections(c1, c2));
	    
	    /*remove the middle element*/
	    int num = joined.size()/2;
	    joined.remove(num);
	    
	    /*print collection in reverse and size of collection*/
	    printReverse(new ArrayList<Integer>(joined));
	    System.out.println("Size: " + joined.size());
	    
	    /*create a collection of KeyValue pairs and add 5 pairs to the collection
	     *A separate class KeyValue was created using Map.Entry to make the Key,Value
	     *sets. This was used because it allows for pairs and a separate class was made
	     *for flexibility*/
	    List<KeyValue<Integer, String>> pair = new ArrayList<KeyValue<Integer, String>>();
	    for(int i = 1; i <= 5; i++){
	    	pair.add(new KeyValue<Integer,String>(new Integer(i), Integer.toString(i*i)));
	    }
	    
	    /*add a duplicate value pair of (3, 9)*/
	    pair.add(new KeyValue<Integer, String>(new Integer(3), "9"));
	    
	    /*find and print duplicate pair*/
	    findDuplicate(pair);
	    
	    /*print the key/value pairs*/
	    printCollection(pair);
	    System.out.println("Size: " + pair.size());
	}
	
	/**
	 * overloaded method
	 * prints a collection with any parameter
	 * @param c collection to print
	 */
	public static void printCollection(Collection<?> c){
		Iterator<?> it = c.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
	/**
	 * overloaded method
	 * prints collection of KeyValue pairs
	 * @param c collection to print
	 */
	public static void printCollection(List<KeyValue<Integer, String>> c){
		Iterator<KeyValue<Integer, String>> it = c.iterator();
		while(it.hasNext()){
			it.next().print();
		}
		System.out.println();
	}
	
	/**
	 * print the collection in reverse
	 * @param c collection to print
	 */
	public static void printReverse(List<?> c){
		java.util.Collections.reverse(c);
		Iterator<?> it = c.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
	/**
	 * join two collections without duplicates
	 * @param a collection to merge
	 * @param b collection to merge with collection a
	 * @return Set of the two collections
	 */
	public static Set<Integer> joinCollections(Collection<Integer> a, Collection<Integer> b){
		Object[] coll = b.toArray();
		//use a Set here because no duplicates are allowed
		Set<Integer> rtn = new HashSet<Integer>();
		rtn.addAll(a);
		for(int i = 0; i < coll.length; i++){
			//check for duplicates
			if(!rtn.contains(coll[i])){
				rtn.add((Integer) coll[i]);
			}
		}
		return rtn;
	}
	
	/**
	 * find duplicates in a list
	 * each pair is added to a new list one by one and
	 * if it is already in the list, the pair is printed
	 * @param col collection to find duplicates in
	 */
	public static void findDuplicate(List<KeyValue<Integer,String>> col){
		List<KeyValue<Integer, String>> list = new ArrayList<KeyValue<Integer, String>>();
		for(KeyValue<Integer,String> c : col){
			if(list.contains(c)){
				c.println();
			}
			else{
				list.add(c);
			}
		}
	}
}
