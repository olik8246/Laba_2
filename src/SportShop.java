public class SportShop {
    int Shaker1;int Shaker2;int Shaker3;
    int bottle1;int bottle2;int bottle3;
    int belts1;int belts2;int belts3;

    public SportShop(int shaker1, int shaker2, int shaker3, int bottle1, int bottle2, int bottle3, int belts1, int belts2, int belts3) {
        Shaker1 = shaker1;
        Shaker2 = shaker2;
        Shaker3 = shaker3;
        this.bottle1 = bottle1;
        this.bottle2 = bottle2;
        this.bottle3 = bottle3;
        this.belts1 = belts1;
        this.belts2 = belts2;
        this.belts3 = belts3;
    }

    void choice(){
        System.out.println("1)Шейкери");
        System.out.println("2)Ємкості для води");
        System.out.println("3)Ремні та пояси");
    }


    int choice(int a) {
        choice();
        if (a==1){
            System.out.println("__Шейкери__\nBiotech USA Wave Shaker 600 ml 135 грн \nBiotech USA Wave Shaker 600 ml 135 грн \nOstroVit Shaker Sport 700 ml Чорний 150 грн ");
            return 1;
        }
        else if(a==2){
            System.out.println("__Ємкості для води__\nSiS Wide Neck Bottle 600 ml 235 грн \nUniversal Nutrition Animal Meal Iconic Food Container 710 ml 190 грн \nOstroVit Shaker 700 ml Темно-зелений 130 грн");
            return 2;
        }
        else if(a==3){
            System.out.println("__Ремні та пояси__\nOlimp Training Gloves Hardcore Raptor 450 грн \nMyprotein Бинти для кістей 145 грн \nOstroVit Gym Bag Black 23 l 550 грн");
            return 3;
        }
        else {
            System.out.println("Хибна відповідь");
            return 0;
        }

    }


    void discount(){
        System.out.println("Ви отримали знижку в магазині!!!");
    }
    int choice(int a, int b){
        choice(a);
        if (a==1){
            if (b==1){
                System.out.println("Ви обрали:Biotech USA Wave Shaker 600 ml 135 грн");
                return 135;
            }
            else if(b==2){
                System.out.println("Ви обрали:Biotech USA Wave Shaker 600 ml 135 грн");
                return 135;
            }
            else if(b==3){
                System.out.println("Ви обрали:OstroVit Shaker Sport 700 ml Чорний 150 грн ");
                return 150;
            }
            else {
                System.out.println("Ви обрали:ніц");
                return 0;
            }

        }
        else if(a==2){
            if (b==1){
                System.out.println("Ви обрали:SiS Wide Neck Bottle 600 ml 235 грн ");
                return 235;
            }
            else if(b==2){
                System.out.println("Ви обрали:Universal Nutrition Animal Meal Iconic Food Container 710 ml 190 грн ");
                return 190;
            }
            else if(b==3){
                System.out.println("Ви обрали:OstroVit Shaker 700 ml Темно-зелений 130 грн");
                return 130;
            }
            else {
                System.out.println("Ви обрали:nits");
                return 0;
            }
        }
        else if(a==3){
            if (b==1){
                System.out.println("Ви обрали:Olimp Training Gloves Hardcore Raptor 450 грн");
                return 450;
            }
            else if(b==2){
                System.out.println("Ви обрали:Myprotein Бинти для кістей 145 грн");
                return 145;
            }
            else if(b==3){
                System.out.println("Ви обрали:OstroVit Gym Bag Black 23 l 550 грн");
                return 550;
            }
            else {
                System.out.println("Ви обрали:nits");
                return 0;
            }
        }
        else {
            System.out.println("ne to");
            return 0;
        }

    }

    public int getShaker1() {
        return Shaker1;
    }

    public void setShaker1(int shaker1) {
        Shaker1 = shaker1;
    }

    public int getShaker2() {
        return Shaker2;
    }

    public void setShaker2(int shaker2) {
        Shaker2 = shaker2;
    }

    public int getShaker3() {
        return Shaker3;
    }

    public void setShaker3(int shaker3) {
        Shaker3 = shaker3;
    }

    public int getBottle1() {
        return bottle1;
    }

    public void setBottle1(int bottle1) {
        this.bottle1 = bottle1;
    }

    public int getBottle2() {
        return bottle2;
    }

    public void setBottle2(int bottle2) {
        this.bottle2 = bottle2;
    }

    public int getBottle3() {
        return bottle3;
    }

    public void setBottle3(int bottle3) {
        this.bottle3 = bottle3;
    }

    public int getBelts1() {
        return belts1;
    }

    public void setBelts1(int belts1) {
        this.belts1 = belts1;
    }

    public int getBelts2() {
        return belts2;
    }

    public void setBelts2(int belts2) {
        this.belts2 = belts2;
    }

    public int getBelts3() {
        return belts3;
    }

    public void setBelts3(int belts3) {
        this.belts3 = belts3;
    }
}