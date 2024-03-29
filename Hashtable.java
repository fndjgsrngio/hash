
import java.util.*;
interface HashFunction<T>{
    int hash(T dataEntry);
}
public class HashTable<T> {
    // T is the class of the data to be stored
    // in the dictionary

    private int[] hashArray;
    private HashFunction<T> hashFunction;
    private int tableLength;
    private LinkedList<T>[] dictionary;

    public void genHashArray (int tableLength) {
        this.tableLength = tableLength;
        hashArray = new int[tableLength];
        for (int i = 0; i < tableLength; i++){
            hashArray[i] = i;
        }
        dictionary = new LinkedList[tableLength];

    }


    public void addEntry(T newEntry) {
        int hashValue = hashFunction.hash(newEntry);
        if (hashValue >= tableLength)
            throw new IllegalArgumentException("Hash function incompatible with hash table length;");

    }
}
