package cinema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static cinema.CinemaRoom.getAllSeats;

@RestController
public class CinemaRoomController {
    private final CinemaRoom cinemaRoom;

    public CinemaRoomController() {
        this.cinemaRoom = getAllSeats(9 ,9);
    }

    @GetMapping("/seats")
    public CinemaRoom getSeats() {
        return cinemaRoom;
    }
}
