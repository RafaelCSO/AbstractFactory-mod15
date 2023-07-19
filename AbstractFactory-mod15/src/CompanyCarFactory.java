public class CompanyCarFactory extends Factory{
    Car retrieveCar(String requestedGrade){
        switch (requestedGrade){
            case "A":
                return new Tesla(1000,"full","blue" );
            case "B":
                return new Audi(800,"full","red");
            default:
                System.out.println("The requested car was not avaliable");
                return null;
        }
    }
}
