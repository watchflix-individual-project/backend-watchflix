package com.watchflix.watchhistoryservice.repository;

import com.watchflix.watchhistoryservice.model.watchHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface watchHistoryRepository extends JpaRepository<watchHistory,Integer> {
}
