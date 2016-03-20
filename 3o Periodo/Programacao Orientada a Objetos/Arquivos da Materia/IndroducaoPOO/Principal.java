class Car {
    int door;

    Car() {
        door = 4;
    }

    void numberOfDoor() {
        System.out.println(door);
    }

    int maxSpeed() {
        return 180;
    }
}

class Ferrari extends Car{
    int maxSpeed() {
        return 300;
    }
}

class Principal {
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
        seuCarro.door = 3;
        //seuCarro.door --;
        System.out.println("Portas do seu Carro:" + seuCarro.door);
        carroCoordenador = new Ferrari();
        System.out.println("Velocidade máxima de uma ferrari:" +
                carroCoordenador.maxSpeed());
    }
}
