public class main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,100,70,20);
        Fighter f2 = new Fighter("B",15,110,90,40);

        Match match = new Match(f1,f2,90,70);
        match.run();


    }
}
