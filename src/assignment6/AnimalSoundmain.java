package assignment6;

class Animal{





    public void makeSound(){
        System.out.println("Animal makes sound ");

    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog makes bark sound" );



    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){

        System.out.println("Cats make meow meow sound");
    }
}

public class AnimalSoundmain {

    public static void checkHealth(Animal a){
        System.out.println("Vet is checking the animal...");
        a.makeSound();
    }
    public static void main(String[] args){


        Animal[] arr = new Animal[4];

//        Animal b1 = new Cat();
//        Animal a1 = new Dog();

        arr[0] = new Dog();
        arr[1] = new Cat();
        arr[2] = new Dog();
        arr[3] = new Cat();
        for(int i =0; i<arr.length;i++){
            arr[i].makeSound();

        }

        System.out.println("Vet check------");

        checkHealth(new Dog());
        checkHealth(new Cat());

    }
}
