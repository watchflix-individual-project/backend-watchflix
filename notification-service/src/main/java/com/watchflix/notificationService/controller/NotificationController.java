package com.watchflix.notificationservice.controller;
import com.watchflix.notificationservice.model.Notification;
import com.watchflix.notificationservice.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/notification")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationRepository notificationRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<Notification> findAll(){
    return notificationRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Notification notification){
     notificationRepository.save(notification);
    }
}
