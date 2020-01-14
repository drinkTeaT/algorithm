package books.sword;

/**
 * Description 空格替换
 * 请实现一个函数，把字符串中的每个空格替换
 * 成"%20"。例如输入“We  are  happy.”，则输
 * 出“We%20are%20happy.”
 * Author liuweibin
 * Date 2020/1/14 11:40
 **/
public class S2_SpaceReplace {
    public static void main(String[] args) {
        String s = "We  are  happy.";
        System.out.print(solution1(s));
    }

    /**
     * 没有太多隐藏信息，直接模拟结果，只有一种特殊情况需要处理
     * 连续空格的处理
     */
    public static String solution1(String s) {
        String r = "";
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == ' ') {
                r += "%20";
                while (s.charAt(++i) == ' ') ;
            } else {
                r += s.charAt(i++);
            }
        }
        return r;
    }
}
