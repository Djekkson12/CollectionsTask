import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class CharList {

    private ArrayList<Character> container;


    CharList(String inputText) {
        char[] chars = inputText.toCharArray();
        container = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            container.add(chars[i]);
        }
    }

    private CharList(ArrayList<Character> list) {
        container = list;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(container.size());
        for (Character ch : container) {
            builder.append(ch);
        }
        return builder.toString();
    }

    int length(int i) {
        return container.size();
    }

    char charAt(int index) {
        return container.get(index);
    }

    int indexOf(char c) {
        return container.indexOf(c);
    }

    CharList subString(int start, int end) {
        return new CharList(new ArrayList<>(container.subList(start, end)));

    }

    CharList removeDuplicates() {
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>(container);
        ArrayList<Character> list1 = new ArrayList<>(hashSet);
        return new CharList(list1);
    }

    CharList removeFirst(Character c) {
        container.remove(c);
        return new CharList(container);
    }

    CharList removeAll(Character c) {
        container.removeAll(Collections.singleton(c));
        CharList list = new CharList(container);
        return list;
    }

    boolean isEmpty() {
        boolean b;
        String s = container.toString();

        if (s == "[]") {
            b = true;
        } else
            b = false;
        return b;
    }

    boolean contains(Character c) {
        if (container.toString().contains(c.toString())) {
            return true;
        } else
            return false;
    }

    CharList clearList() {
        container.clear();
        CharList list = new CharList(container);
        return list;
    }

    CharList sortList() {
        Collections.sort(container);
        CharList list = new CharList(container);
        return list;
    }

    CharList reverseList() {
        Collections.reverse(container);
        CharList list = new CharList(container);
        return list;
    }

    CharList mixedList() {
        Collections.shuffle(container);
        CharList list = new CharList(container);
        return list;
    }
}
