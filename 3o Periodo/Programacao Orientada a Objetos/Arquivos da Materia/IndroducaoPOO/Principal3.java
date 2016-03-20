class Car {
    private int door;
    private static int numObj = 0;

    Car() {
        door = 4;
        //this.door = 4;
        Car.numObj++;
        //numObj++;
    }

    Car(int d) {
        door = d;
        numObj++;
    }

    static int getNumObj() {
        return numObj;
    }

    void numberOfDoor() {
        System.out.println(door);
    }

    int maxSpeed() {
        return 180;
    }

    int getDoor() {
        return door;
    }

    void setDoor(int d) {
        door = d;
    }
}

class Ferrari extends Car{
    private boolean rico;

    Ferrari() {
        //this.setDoor(2);
        setDoor(2);
        rico = true;
    }

    Ferrari(int d, boolean r) {
        //this.setDoor(d);
        setDoor(d);
        rico = r;
    }

    boolean getRico() {
        return rico;
    }

    void setRico(boolean r) {
        rico = r;
    }

    int maxSpeed() {
        return 300;
    }
}

class Principal3 {
    public static void main(String[] argumentos) {
        Car meuCarro, seuCarro, carroTeste;
        int valor;
        Ferrari carroCoordenador, ferrariTeste;

        System.out.println("\nNúmero de objetos da classe Car: " +
                Car.getNumObj());
        carroTeste = new Car(1);
        System.out.println("Portas do Carro Teste:");
        carroTeste.numberOfDoor();
        meuCarro = new Car();
        System.out.println("Portas do meu Carro:");
        meuCarro.numberOfDoor();
        valor = meuCarro.maxSpeed();
        System.out.println("Velocidade máxima do meu Carro:" + valor);
        seuCarro = new Car();
        seuCarro.setDoor(3);
        //seuCarro.setDoor(seuCarro.getDoor() - 1);
        System.out.println("Portas do seu Carro:" + seuCarro.getDoor());
        carroCoordenador = new Ferrari();
        System.out.println("Velocidade máxima de uma ferrari:" +
                carroCoordenador.maxSpeed());
        System.out.println("Portas de uma ferrari:" +
                carroCoordenador.getDoor());
        ferrariTeste = new Ferrari(2, false);

        System.out.print("O dono da ferrari teste é ");
        if(ferrariTeste.getRico())
            System.out.println("rico.");
        else
            System.out.println("pobre.");
        System.out.print("O coordenador é ");
        if(carroCoordenador.getRico())
            System.out.println("rico.");
        else
            System.out.println("pobre.");
        
        System.out.println("\nNúmero de objetos da classe Car: " +
                Car.getNumObj());
    }
}
