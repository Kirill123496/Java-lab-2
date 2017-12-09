public class Start {
    public static void main(String[] args) {
        Automata coffi = new Automata();
        coffi.on();
        System.out.println(coffi.state);
        coffi.coin(35);
        System.out.println(coffi.state);
        coffi.choice(2);
        System.out.println(coffi.state);
        coffi.cook();
        System.out.println(coffi.state);

    }
}
