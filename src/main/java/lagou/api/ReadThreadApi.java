package lagou.api;

/**
 * 多线程的几个工具类
 */
public class ReadThreadApi {

}

/**
 * 构造器(n) countDown() await(n,TimeUnit.MINUTES) getCount()
 */
class ReadCountDownLatch{}

/**
 * 只有n为正整数才会执行，所以一开始n=0，再release时，n变成了1
 * 构造器(n) acquire() n -= 1 release(): n += 1
 */
class ReadSemaphore{}