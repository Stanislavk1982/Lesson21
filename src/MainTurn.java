public class MainTurn {
    public static void main(String[] args) {
        PopAndPush list = new PopAndPush();
        list.push("a");
        list.push("b");
        list.push("c");
        list.push("d");
        list.push("e");
        list.push("f");
        list.push("g");
        list.push("h");
        list.push("i");
        list.push("j");
        System.out.println("Pop: " + list.pop());
        System.out.println("Pop: " + list.pop());
        list.pushCycle("Cycle");
        if (list.isCycleRabbitAndTurtle()) {
            System.out.println("In turn is cycle");
        } else {
            System.out.println("In turn isn't cycle");
        }

    }
}
