package com.osagie.springbootmongo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping
    public List<Hotel> hotel(){
        return hotelRepository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Hotel hotel){
        hotelRepository.save(hotel);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Hotel hotel){
        hotelRepository.insert(hotel);
    }

    @PutMapping("/{id}")
    public void delete(@PathVariable String id){
        hotelRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void find(@PathVariable String id){
        hotelRepository.findById(id);
    }
}
