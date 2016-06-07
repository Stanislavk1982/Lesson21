public class PopAndPush {

    private Element first = null;
    Element temp = new Element();

    public class Element {
        private String massege;
        private boolean repeat = true;
        private Element next = null;
    }

    public void push(String massege) {
        Element element = new Element();


        element.massege = massege;
        if (first == null) {
            first = element;
        } else {
            temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = element;
        }
    }

    public void pushCycle(String massege) {
        Element element = new Element();
        element.massege = massege;
        temp = first;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = element;

        temp = first;
        int i=0;
        while (i!=3) {
            temp = temp.next;
            i++;
        }
        element.next=temp;

    }

    public String pop() {

        temp = first;
        String massage = first.massege;
        first = first.next;
        temp = null;
        return massage;
    }

    public void cycle() {
        temp = first;
        while (temp.repeat == true && temp.next != null) {
            temp.repeat = false;
            temp = temp.next;
            if (temp.repeat == false) {
                System.out.println("In turn is cycle");
                System.out.println(temp.massege);
            }
            if (temp.next == null) {
                System.out.println("End of turn");
            }


        }
    }

}
