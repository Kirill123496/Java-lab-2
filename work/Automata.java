enum STATES {OFF,WAIT,ACCEPT,CHECK,COOK}

public class Automata {
    int cash = 0;
int x = 0;
        String state = STATES.OFF.toString();

        String[] menu = {"чай","кофе","молоко","лимонад"};
        int[] prices = {30,35,20,25};

        public void on(){
            if (state == STATES.OFF.toString()){
                state = STATES.WAIT.toString();
            }
        }
    public void off(){
        if (state == STATES.WAIT.toString()){
            state = STATES.OFF.toString();
        }else System.out.println("нельзя выключать автомат при работе!");
    }

    public void coin(int c){
            if (state == STATES.WAIT.toString() | state == STATES.ACCEPT.toString()){
                state = STATES.ACCEPT.toString();
                cash = cash+c;
            }
    }
    public void choice(int n){
        if (state == STATES.ACCEPT.toString()){
            state = STATES.CHECK.toString();
            this.x = n;
            check();
        }
    }
    public void check(){
        if (state == STATES.CHECK.toString() & cash>=prices[x]){
        }else System.out.println("Добавьте средств!"); on();
    }
public void cancel(){
        if (state == STATES.ACCEPT.toString()){
            state = STATES.WAIT.toString();
        }else if (state == STATES.CHECK.toString()){
            state = STATES.WAIT.toString();
        }
}
public void cook(){
    if (state == STATES.CHECK.toString()){
        check();
        state = STATES.COOK.toString();
        finish();

    }
}
public void finish(){
    if (state == STATES.COOK.toString()){
        state = STATES.WAIT.toString();
        System.out.println("Ваш напиток "+ menu[x]+ " готов!");
        if (cash > prices[x]){
            int y = cash - prices[x];
            System.out.println("Заберите вашу здачу "+y);
        }
    }
}

}
