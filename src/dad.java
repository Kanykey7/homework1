public class dad extends grandpa {
        private baby baby;

    public dad(String name, int age, colorEnum colorEnum, colorEnum baby, baby baby1) {
        super(name, age, colorEnum, baby);
        this.baby = baby1;
    }

    public dad(String name, int age, colorEnum colorEnum, baby baby1) {
        super();
    }


    @Override
    public colorEnum getBaby() {

        return null;
    }

        public void makeHit () {

        }

        public void dead () {

        }
        public final String getInfo() {
            return "Name: " +getName() +
                    "\nAge: " + getAge() +
                    "\nColorHair: " + getColorEnum() +
                    "\nColorBody: " + getBaby();


        }




    }


