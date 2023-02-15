package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList {
    private SortedIntList intList;
    private int totalAdded;

    public DelegationSortedIntList() {
        intList = new SortedIntList();
        totalAdded = 0;
    }

    public boolean add(int num) {
        totalAdded++;
        return intList.add(num);
    }

    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return intList.addAll(list);
    }

    public int getTotalAdded() {
        return this.totalAdded;
    }
}