class Car {
    private int door;

    Car() {
        door = 4;
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
    Ferrari() {
        this.setDoor(2);
        //setDoor(2);
    }
    int maxSpeed() {
        return 300;
    }
}

class Principal2 {
    public static void main(String[] argumentos) {
        Car meuCarro, seuCarro;
        int valor;
        Ferrari carroCoordenador;

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
    }
}
