package HomeTask2;

class Women extends AbstractHuman {

    Women(String name, float height) {
        super(false, height);
    }

    private double random() {
        double a = 0;
        double b = 100;
        return a + (int) (Math.random() * b);
    }

    private boolean giveBirth() {
        double random = random();
        if(random > 50) {
            System.out.println("If > 50 = Give a birth to a girl " + random);
            return true;
        }
        else System.out.println("If < 50 = Give a birth to a boy " + random);
        return false;
    }

    @Override
    boolean haveRelationship(AbstractHuman human) {
        if (talk(human) && endure(human) && spendTimeTogether(human, human)) {
            System.out.println("если “говорить” && “терпеть/выдерживать общество” && " +
                    "“проводить время вместе” равно true");
            if (!gender && !human.gender) {
                System.out.println("женщина и женщина = null");
                return Boolean.parseBoolean(null);
            }
        }
        return giveBirth();
    }
}
