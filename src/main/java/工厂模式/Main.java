package 工厂模式;

/**
 * @created by 24745
 * @date 2019/12/13
 */

public class Main {
    public static void main(String[] args) {
       AnimalFactory animalFactory = new DogFactory();
        Animal animal = animalFactory.createAnimal();
        Animal animal1 =   animalFactory.createAnimal();
        System.out.println(animal);
        System.out.println(animal1);
    }
}
