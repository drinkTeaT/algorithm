package lagou.api;

import java.util.*;

/**
 * java 数据结构常用的api
 */
public class ReadJavaApi {

}

/**
 * size isEmpty toArray add remove get contains subList indexOf lastIndexOf
 */
class ReadList implements List {
    public int size() {
        return 0;
    }
    public boolean isEmpty() {
        return false;
    }
    public boolean contains(Object o) {
        return false;
    }
    public Iterator iterator() {
        return null;
    }
    public Object[] toArray() {
        return new Object[0];
    }
    public boolean add(Object o) {
        return false;
    }
    public boolean remove(Object o) {
        return false;
    }
    public boolean addAll(Collection c) {
        return false;
    }
    public boolean addAll(int index, Collection c) {
        return false;
    }
    public void clear() {

    }
    public Object get(int index) {
        return null;
    }
    public Object set(int index, Object element) {
        return null;
    }
    public void add(int index, Object element) {

    }
    public Object remove(int index) {
        return null;
    }
    public int indexOf(Object o) {
        return 0;
    }
    public int lastIndexOf(Object o) {
        return 0;
    }
    public ListIterator listIterator() {
        return null;
    }
    public ListIterator listIterator(int index) {
        return null;
    }
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
    public boolean retainAll(Collection c) {
        return false;
    }
    public boolean removeAll(Collection c) {
        return false;
    }
    public boolean containsAll(Collection c) {
        return false;
    }
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

/**
 * size isEmpty containsKey containsValue get put remove keySet values entrySet
 */
class ReadMap implements Map{
    public int size() {
        return 0;
    }
    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Object get(Object key) {
        return null;
    }

    public Object put(Object key, Object value) {
        return null;
    }

    public Object remove(Object key) {
        return null;
    }

    public void putAll(Map m) {

    }

    public void clear() {

    }

    public Set keySet() {
        return null;
    }

    public Collection values() {
        return null;
    }

    public Set<Entry> entrySet() {
        return null;
    }
}

/**
 * size isEmpty toArray add remove get contains
 */
class ReadSet implements Set{
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

/**
 * length toCharArray charAt String.valueOf() substring(0,1+1)
 */
class ReadString{
    private String str;

    public ReadString(){
       str.toCharArray();
    }
}


/**
 * 记忆 ：增(add put) 删(remove) 改(toArray keySet values) 查(isEmpty size contains containsValue containsKey get)
 */