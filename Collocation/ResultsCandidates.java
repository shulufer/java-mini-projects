public class ResultsCandidates {

  public static void main(String[] args) {

    Order order = new Order();
    order.addCandidates();
    order.calculatePoints();

    System.out.println("********************************");
    System.out.println(order.candidates.size());
    // System.out.println(order.orderList());
    System.out.println(order.getCandidates());
    System.out.println("********************************");

  }

}
