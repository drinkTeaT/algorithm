package lagou.api;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 查看工具类的继承
 */
public class ReadJavaApiExtend {
}

/**
 * vector为同步容器copyOnWriteArrayList为并发容器
 */
class ReadListExtend{
    private ArrayList arrayList;
    private LinkedList linkedList;
    private Vector vector;
    private CopyOnWriteArrayList copyOnWriteArrayList;
}

class ReadSetExtend{
    private HashSet hashSet;
}


class ReadMapExtend{
    private HashMap hashMap;
    private Hashtable hashtable;
    private LinkedHashMap linkedHashMap;
    private ConcurrentHashMap concurrentHashMap;
    private TreeMap treeMap;
}