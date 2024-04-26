public interface VehicleService {

    default void updateTyres (){
        System.out.println("NO TYRES!");
    }
    default void checkEngine (){
        System.out.println("NO ENGINE!");
    }
    default void checkTrailer(){
        System.out.println("NO TRAILER!");
    }
}
