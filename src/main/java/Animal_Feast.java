public class Animal_Feast {


    public static void main(String[] args) {

        animal("dog","pizza");

    }

    public static boolean animal (String animalName,String dish){
        if (animalName.charAt(0) == dish.charAt(0) &&
                animalName.charAt(animalName.length()-1) == dish.charAt(dish.length()-1)){
            System.out.println("accepted!");
            return true;
        }
        System.out.println("not accepted");
        return false;
    }


}


/*
All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and
end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and
the chickadee is bringing chocolate cake.
Write a method that takes the animal's name and dish as arguments and returns true or false to indicate
whether the beast is allowed to bring the dish to the feast.
Assume that beast and dish are always lowercase strings, and that each has at least two letters.
Beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
They will not contain numerals.
 */
