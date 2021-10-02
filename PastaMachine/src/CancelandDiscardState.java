public class CancelandDiscardState implements OrderState{
    @Override
    public void openOrder() {
        System.out.println("we got the order from counter and it is in preparing state");
    }
    @Override
    public void cancelOrder() {
        System.out.println("we got the order from counter to cancel the existing order");

    }
    @Override
    public void DoorDashOpenOrder() {
        System.out.println("we got the order from Doordash and the Order is being prepared for delivery");

    }
    @Override
    public void DoorDashCancelOrder() {
        System.out.println("we got the operation to the cancel the doordash order");

    }
}
