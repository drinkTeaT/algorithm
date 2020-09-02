package lagou.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @author EDZ
 * @description
 * @date 2020/9/1 13:56
 */
public class TrieApp{
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello world");
        trie.insert("come on hahahha");
        trie.insert("comedy");
        trie.insert("我爱小蜗");
        trie.insert("我爱深圳");
        String s = "我";
        System.out.println(trie.startsWith(s));
    }
}
class Trie {
    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.contains(c)) {
                node.add(c);
            }
            node = node.get(c);
        }
        node.setEnd();
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.contains(c)) {
                node = node.get(c);
            } else {
                return false;
            }
        }
        return node.isEnd();
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (node.contains(c)) {
                node = node.get(c);
            } else {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class TrieNode {
    private boolean isEnd;
    private char c;
    Map<Character, TrieNode> map;

    public TrieNode(char c) {
        map = new HashMap<>();
        this.c = c;
    }

    public TrieNode() {
        map = new HashMap<>();
    }

    public boolean contains(char c) {
        return map.containsKey(c);
    }

    public void add(char c) {
        map.put(c, new TrieNode(c));
    }

    public TrieNode get(char c) {
        return map.get(c);
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd() {
        isEnd = true;
    }
}