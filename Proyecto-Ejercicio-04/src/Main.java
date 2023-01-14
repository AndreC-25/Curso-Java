import com.ClaseHija.SmartPhone;
import com.ClaseHija.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.marca = "Iphone";
        smartPhone.modelo = "Iphone";
        smartPhone.bateria = 4800;
        smartPhone.cargaRapida = false;
        smartPhone.cargaInalambrica = false;
        smartPhone.almacenamiento = 512;
        smartPhone.camara = true;

        System.out.println(smartPhone);


        SmartWatch smartWatch = new SmartWatch("Samsung", "Galaxy Watch5 Small", 284, true, true, 8, true);

        System.out.println(smartWatch);
    }
}