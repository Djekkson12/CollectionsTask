public class Coll1 {
    public static void main(String[] args) {

        CharList arr = new CharList("acb123123");
        System.out.println(arr.toString());
        System.out.println(arr.length(9));
        System.out.println(arr.charAt(1));
        System.out.println(arr.indexOf('c'));
        System.out.println(arr.subString(3,5));
        System.out.println(arr.removeDuplicates());
        System.out.println(arr.removeFirst('c'));
        System.out.println(arr.removeAll('c'));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains('a'));
        System.out.println(arr.contains('q'));
        System.out.println(arr.sortList());
        System.out.println(arr.reverseList());
        System.out.println(arr.mixedList());
        System.out.println(arr.clearList());

    }
}