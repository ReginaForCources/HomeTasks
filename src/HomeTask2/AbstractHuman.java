package HomeTask2;

abstract class AbstractHuman {

    boolean gender;
    String name;

    //статический полиморфизм = перегрузка методов
    // динамачиский - оверрайд

    AbstractHuman(boolean gender, float height) {
        this.gender = gender;
        this.height = height;
    }

    private float height;

    boolean talk(AbstractHuman human) {
        boolean result;

        if (gender == false && human.gender == false) {
            result = true;
            System.out.println("women + women");
        } else if (gender == false && human.gender == true) {
            result = true;
            System.out.println(" man + woman");
        } else if (gender == true && human.gender == false) {
            result = true;
        } else {
            double resultRandom = random();
            if (resultRandom > 50) {
                result = true;
                System.out.println("> 50" + "random number " + resultRandom);
            } else {
                result = false;
                System.out.println("< 50" + "random number " + resultRandom);
            }
        }
        return result;
    }

    private double random() {
        double a = 0;
        double b = 100;
        return a + (int) (Math.random() * b);
    }

    boolean haveRelationship(AbstractHuman human) {
        return false;
    }

    boolean endure(AbstractHuman human) {
        boolean result = false;
        double resultRandom = random();

        if (gender == false && human.gender == false) {
            if (resultRandom < 5) {
                System.out.println("endure woman and woman > than 5% " + resultRandom);
                result = true;
            } else {
                System.out.println("endure woman and woman < than 5% " + resultRandom);
            }
        } else if (gender == false && human.gender == true) {
            if (resultRandom < 70) {
                result = true;
                System.out.println("endure - woman and man > 70 % " + "random number " + resultRandom);
            } else {
                System.out.println("endure - woman and man < 70 % " + "random number " + resultRandom);
            }
        } else if (gender == true && human.gender == true) {
            if (resultRandom < 0.56) {
                System.out.println("endure - man and man < 0.056 % " + "random number " + resultRandom);
                result = true;
            } else {
                System.out.println("endure - man and man > 0.056 % " + "random number " + resultRandom);
            }
        }
        return result;
    }

    boolean spendTimeTogether(AbstractHuman human, AbstractHuman human1) {
        boolean result = false;
        double resultRandom = random();
        float percentage = (1 - (human.height / human1.height)) * 100;
        System.out.println("процент " + percentage);

        if (percentage > 10) {
            if (resultRandom < 85) {
                System.out.println("если рост экземпляров отличается более чем на 10%, " +
                        "метод возвращает true с вероятностью 85% " + "(рандомное значение = "
                        + resultRandom + ")");
                result = true;
            } else {
                System.out.println("не попали в вероятность 85 % " + "рандомное число = " + resultRandom);
            }
        } else if (percentage < 10) {
            if (resultRandom < 95) {
                System.out.println("если рост экземпляров отличается менее чем на 10%, " +
                        "метод возвращает true с вероятностью 95%. " + "(Рандомное значение = "
                        + resultRandom + ")");
                result = true;
            } else {
                System.out.println("не попали в вероятность 95 %. " + "Рандомное число = " + resultRandom);
            }
        }
        return result;
    }
}
