package com.watchflix.notificationservice.repository;

import com.watchflix.notificationservice.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification,String> {
}
