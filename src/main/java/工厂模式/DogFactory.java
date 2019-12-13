package 工厂模式;

//创建工厂支持 s 和
public class DogFactory implements AnimalFactory {
    private static final Dog DOG = new Dog();

    @Override
    public Animal createAnimal() {
        return DOG;
    }

    @Override
    public void run() {
        System.out.println("狗会跑...");
    }
}
