class GymServices {
    int massage;
    int sauna;
    int personal_trainer;
    public void showServices() {
        System.out.println("_______________________________________________");
        System.out.println("Додаткові послуги в спортзалі:");
        System.out.println("1. Персональний тренер - 400");
        System.out.println("2. Сауна - 500");
        System.out.println("3. Масаж - 300");
        System.out.println("_______________________________________________");
    }
    public void alldis(){
        int a = (int) (sauna+massage+personal_trainer*0.90);
        System.out.println("Ви купили всі допи і отримали знижку 10% : " + a);
    }

    public GymServices(int massage, int sauna, int personal_trainer) {
        this.massage = massage;
        this.sauna = sauna;
        this.personal_trainer = personal_trainer;
    }
}
