public class CarFactory extends Factory{
    Car retrieveCar(String requestedGrade){
        switch (requestedGrade){
            case "A":
                return new Volkswagem(100,"full","blue");
            case "B":
                return new Toyota(900,"full","blue");
            default:
                System.out.println("The requested car was not avaliable");
                return null;
        }
    }
}
