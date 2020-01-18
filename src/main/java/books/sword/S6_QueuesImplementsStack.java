package books.sword;

import java.util.*;

/**
 * @Description :两个队列实现一个栈;两个函数appendHead和deleteHead,分别完成在队列头部插
 * * 入结点和在队列头部删除结点的功能
 * @Author : Administrator
 * @Date : 2020-01-18 8:58
 **/
public class S6_QueuesImplementsStack {
    public static void main(String args[]) {
        QueueStack1<Integer> queueStack = new QueueStack1<>();
        queueStack.appendHead(23);
        queueStack.appendHead(53);
        queueStack.appendHead(6);
        queueStack.appendHead(7);
        System.out.println(queueStack.deleteHead());
        System.out.println(queueStack.deleteHead());
//        queueStack.appendHead(72);
        System.out.println(queueStack.deleteHead());
        System.out.println(queueStack.deleteHead());
        System.out.println(queueStack.deleteHead());
    }
}

class QueueStack1<T> {
    private Queue<T> queue1 = new LinkedList<>();
    private Queue<T> queue2 = new LinkedList<>();

    public void appendHead(T t) {
        queue1.offer(t);
    }

    /**
     * 捕捉最后一个值，作为栈pop的对象
     *
     * @return
     */
    public T deleteHead() {
        T t = null;
        while (!queue1.isEmpty()) {
            t = queue1.poll();
            if (queue1.isEmpty()) {
                return t;
            }
            queue2.offer(t);
        }
        if (t != null) {
            return t;
        }
        while (!queue2.isEmpty()) {
            t = queue2.poll();
            if (queue2.isEmpty()) {
                return t;
            }
            queue1.offer(t);
        }
        return t;
    }
}
