public class Demo2 {


    // kelinma class eka athule anonymus class eka mehema hadanna ba.

//    new Animal(){
//        @Override
//        public void speak() {
//            System.out.println("Anon speaking");
//        }
//    };



    // kelinma class eka athule anonymus class eka mehema hadanna puluvan assign karala.

    Animal animal2 = new Animal(){
        @Override
        public void speak() {
            System.out.println("Anon speaking");
        }
    };



    public static void main(String[] args) {

        AnimalImpl animal = new AnimalImpl();
        animal.eat();
        animal.speak();


        // Anonymus Inner Class
        Animal animal2 = new Animal(){
            @Override
            public void speak() {
                System.out.println("Anon speaking");
            }
        };
        // Anonymus Inner Class


        // Block ekak athule meheme anonymus class ekak hadanna puluvan
        new Animal(){
            @Override
            public void speak() {
                System.out.println("Anon speaking");
            }
        };


        animal2.eat();
        animal2.speak();

    }

}
