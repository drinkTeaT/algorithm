package lagou.api;

/**
 * 阅读栈和队列
 */
public class ReadStackQueue {

}

/**
 *  继承vector，栈是线程安全的。当栈为空时，pop会报异常
 *  push pop isEmpty peek
 */
class ReadStack{}

/**
 *  LinkedList为继承类，当队列为空时，poll的值为null
 *  offer poll peek 无empty
 */
class ReadQueue{}

/**
 *  LinkedList为继承类，当队列为空时，poll的值为null
 *    offer poll peek 无empty 方法后加first或last
 */
class ReadDeque{}

/**
 *  记忆，stack有empty因为无的时候pop会报错，queue则返回null
 */