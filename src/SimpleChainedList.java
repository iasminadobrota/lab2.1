import java.util.List;

public class SimpleChainedList implements MyList {
    private SimpleChainedNode head;

    public SimpleChainedList() {
        this.head = null;
    }

    @Override
    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            SimpleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
    }

    @Override
    public SimpleChainedNode getNodeByValue(int value) {
        SimpleChainedNode temp = head;
        while (temp != null) {
            if (temp.getValue() == value) {
                return temp;
            }
            temp = temp.getNextNode();
        }
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {
        if (head == null) return;

        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }

        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getNextNode().getValue() == value) {
                temp.setNextNode(temp.getNextNode().getNextNode());
                return;
            }
            temp = temp.getNextNode();
        }
    }

    @Override
    public void listNodes() {
        SimpleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNextNode();
        }
        System.out.println("null");
    }

    @Override
    public int sumValues() {
        int sum = 0;
        SimpleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;

        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }
}
