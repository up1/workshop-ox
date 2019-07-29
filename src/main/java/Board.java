public class Board {

    private char[] elements = new char[9];

    public Board() {
        for (int i = 0; i < size(); i++) {
            elements[i] = ' ';
        }
    }

    public char[] getElements() {
        return elements;
    }

    public int size() {
        return elements.length;
    }
}
