package com.osagie.springbootmongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel hotel1 = new Hotel(
                "Flower Hotel",
                45000,
                new Address("Lagos", "Nigeria"),
                Arrays.asList(
                        new Reviews("John", 8, false),
                        new Reviews("Blessing", 9, true)
                )
        );
        Hotel hotel2 = new Hotel(
                "hotel2 Hotel",
                15000,
                new Address("Lagos", "Nigeria"),
                Arrays.asList(
                        new Reviews("Stanley", 8, false),
                        new Reviews("Akin", 4, false)
                )
        );
        Hotel hotel3 = new Hotel(
                "hotel3 Hotel",
                45000,
                new Address("Ibadan", "Nigeria"),
                Arrays.asList(
                        new Reviews("Toyin", 9, true),
                        new Reviews("Emma", 6, true)
                )
        );

        hotelRepository.deleteAll();

        List<Hotel> hotels = Arrays.asList(hotel1, hotel2, hotel3);

        System.out.println(hotel1.getAddress());

        hotelRepository.saveAll(hotels);

    }
}
