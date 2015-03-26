import com.davidoladeji.park.service.implementation.BookingService;
import com.davidoladeji.park.service.implementation.BookingService_Service;
import com.davidoladeji.park.service.interfaces.Booking;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        BookingService_Service service_service = new BookingService_Service();

        System.out.println(service_service);
        BookingService service  = service_service.getBookingServiceImplPort();



        System.out.println(service);
        Booking booking =  service.findByCarRegistration("134567890");

        System.out.print(booking.isActive());


    }
}
