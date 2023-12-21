public class Main {
    public static void main(String[] args) {
        GymMembership member1 = new GymMembership("Анна", 2);
        GymMembership member2 = new GymMembership("Петро", 3);
        SportShop sportShop = new SportShop(135,135,150,235,190,130,450,145,550);


                                                                // Виклик методу для обчислення ціни абонементу зі знижкою

        member1.calculatePrice(15.5);
        member2.calculatePrice(15.0);
        sportShop.choice();
        sportShop.choice(2);
        sportShop.choice(1,2);

                                                                //Виклик методу, що викликає метод із іншого класу
        GymServices additionalServices = new GymServices(300,500,400);
        member2.purchaseServices(additionalServices);
        additionalServices.alldis();
    }
}