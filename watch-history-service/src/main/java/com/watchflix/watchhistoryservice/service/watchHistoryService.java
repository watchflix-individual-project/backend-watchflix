package com.watchflix.watchhistoryservice.service;

import com.watchflix.watchhistoryservice.model.watchHistory;
import com.watchflix.watchhistoryservice.repository.watchHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class watchHistoryService {
    @Autowired
    private watchHistoryRepository whRepo;
    public List<watchHistory> listAllWatchHistory(){
        return whRepo.findAll();
    }

    public void saveWatchHistory(watchHistory wh){
        whRepo.save(wh);
    }

    public watchHistory getWatchHistory(Integer id){
        return whRepo.findById(id).get();
    }

    public void deleteWatchHistory(Integer id){
        whRepo.deleteById(id);
    }
}
