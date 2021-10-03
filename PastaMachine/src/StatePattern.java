public class StatePattern {
    public static void main(String[] args){
        PastaMachine pastamachine = new PastaMachine();

        pastamachine.openOrder();
        pastamachine.DoorDashOpenOrder();
        pastamachine.cancelOrder();
        pastamachine.DoorDashCancelOrder();
    }
}
