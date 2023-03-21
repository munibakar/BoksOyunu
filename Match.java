public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int maxWeight,int minWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }


    boolean isCheck(){
        return (this.f1.weight<= this.maxWeight && this.f1.weight >= this.minWeight) && (this.f2.weight<= this.maxWeight && this.f2.weight >= this.minWeight);
    }

    void run(){
        double start = Math.random()*10;
        if (isCheck()){
            if (start <= 5){
                System.out.println(f1.name + " yarışmacısı yarışmaya başlıyor!!!!");
                while (this.f1.health>0 && this.f2.health>0){
                    System.out.println("-----YENİ ROUND-----");

                    this.f2.health = this.f1.hit(this.f2);


                    if (isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);

                    if (isWin()){
                        break;
                    }

                    System.out.println(this.f1.name +" Sağlık :" + this.f1.health);
                    System.out.println(this.f2.name +" Sağlık :" + this.f2.health);

                }


            }
            if (start>5){
                System.out.println(f2.name + " yarışmacısı yarışmaya başlıyor!!!!");
                while (this.f1.health>0 && this.f2.health>0){
                    System.out.println("-----YENİ ROUND-----");

                    this.f1.health = this.f2.hit(this.f1);



                    if (isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);

                    if (isWin()){
                        break;
                    }

                    System.out.println(this.f1.name +" Sağlık :" + this.f1.health);
                    System.out.println(this.f2.name +" Sağlık :" + this.f2.health);

                }

            }

        }else {
            System.out.println("Sporcuların sikletleri uyuşmuyor!");
        }
    }
    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " Kazandı!");
            return true;

        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " Kazandı!");
            return  true;
        }
        return false;
    }
}
