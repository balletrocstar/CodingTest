package two;

import java.util.Map;
import java.util.Objects;

/**
 * KeyValue is a generic class that implements Map.Entry
 * methods added include print(), println() to print KeyValue pairs
 * and equals as a comparator (used in this project to implement
 * Collections functions such as contains)
 * 
 * @author Sarah Jeter
 *
 * @param <Key> generic type
 * @param <Value> generic type
 */
public class KeyValue<Key, Value> implements Map.Entry<Key, Value>
{
    private Key key;
    private Value value;

    /**
     * constructor
     * @param key 
     * @param value
     */
    public KeyValue(Key key, Value value)
    {
        this.key = key;
        this.value = value;
    }
    
    /**
     * get key
     */
    public Key getKey()
    {
        return this.key;
    }

    /**
     * get value
     */
    public Value getValue()
    {
        return this.value;
    }
    
    /**
     * set key
     * @param key value to set key to
     * @return key
     */
    public Key setKey(Key key)
    {
        return this.key = key;
    }

    /**
     * set value
     * @param value value to set value to
     * @return value
     */
    public Value setValue(Value value)
    {
        return this.value = value;
    }
    
    /**
     * determines if object is equal to KeyValue
     * @param obj object to compare
     * @return true if object is equal to KeyValue, false otherwise
     */
    public boolean equals(Object obj) {
        if(obj == this) 
        	return true;
        if(!(obj instanceof KeyValue)) 
        	return false;
        KeyValue<?,?> p=(KeyValue<?,?>)obj;
        return Objects.equals(this.key, p.key) && Objects.equals(this.value, p.value);
    }
    
    /**
     * print key value pair in (k, v) format
     * no new line
     */
    public void print(){
    	System.out.print("(" + key + ", " + value + ") ");
    }
    
    /**
     * print key value pair in (k, v) format
     * new line added after pair
     */
    public void println(){
    	System.out.println("(" + key + ", " + value + ")");
    }
}