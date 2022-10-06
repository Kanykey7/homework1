public class Main {
    public static void main(String[] args) {


                baby baby = new baby("1");
                dad dad = new dad("Henk", 38, colorEnum.Brown, baby);
                System.out.println(dad.getInfo());

                dad.makeHit();
                System.out.println("---------");


                baby babyk1 = new baby("Beige");
                son son = new son("baby", 12, colorEnum.Brown, baby);
                System.out.println(son.getInfo());

            }
        }
