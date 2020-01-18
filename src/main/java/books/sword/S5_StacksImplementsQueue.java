package books.sword;

import java.util.Stack;

/**
 * @Description :用两个栈实现一个队列。队列的声明如下，请实现
 * 它的两个函数appendTail和deleteHead，分别完成在队列尾部插
 * 入结点和在队列头部删除结点的功能
 * @Author : Administrator
 * @Date : 2020-01-18 8:42
 **/
public class S5_StacksImplementsQueue {
    public static void main(String[] args) {

    }

    public static void test1() {
        StackQueue1<Integer> queue1 = new StackQueue1<>();
        queue1.appendTail(12);
        queue1.appendTail(4);
        queue1.appendTail(24);
        System.out.println(queue1.deleteHead());
        System.out.println(queue1.deleteHead());
        queue1.appendTail(99);
        System.out.println(queue1.deleteHead());
        System.out.println(queue1.deleteHead());
    }
}

/**
 * 单向队列
 *
 * @param <T>
 */
class StackQueue1<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void appendTail(T t) {
        stack1.push(t);
    }

    /**
     * 按照假想思维来，如果遇到问题尝试去解决它。有问题不代表假想是错误的。
     *
     * @return
     */
    public T deleteHead() {
        while (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()) {
            return null;
        }
        return stack2.pop();
    }
}