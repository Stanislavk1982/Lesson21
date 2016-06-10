public class PopAndPush {

    private Element first = null;
    private Element temp = new Element();

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
        int i = 0;
        while (i != 3) {
            temp = temp.next;
            i++;
        }
        element.next = temp;

    }

    public String pop() {

        temp = first;
        String massage = first.massege;
        first = first.next;
        temp = null;
        return massage;
    }

    public boolean cycle() {
        temp = first;
        int counter = 1;
        System.out.println(temp.massege);
        while (temp.repeat && temp.next != null) {

            temp.repeat = false;
            temp = temp.next;
            System.out.println(temp.massege);
            if (!temp.repeat) {
                System.out.println(counter + " elements in the turn");
                return true;

            }
            counter++;
        }
        System.out.println(counter + " elements in the turn");
        return false;
    }

    public boolean isCycleRabbitAndTurtle() {
        Element rabbit = first.next.next, turtle = first.next;
        int counter = 1;
        System.out.println(first.massege);
        while (rabbit != turtle && rabbit != null && turtle != null) {
            System.out.println(rabbit.massege);
            System.out.println(turtle.massege);
            rabbit = rabbit.next.next;
            turtle = turtle.next;
            if (rabbit == turtle) {
                System.out.println(counter + " elements in the turn");
                return true;
            }
            counter++;
        }
        System.out.println(counter + " elements in the turn");
        return false;
    }
}
