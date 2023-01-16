package com.watchflix.watchhistoryservice.controller;

import com.watchflix.watchhistoryservice.model.watchHistory;
import com.watchflix.watchhistoryservice.service.watchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/watch-history")
public class watchHistoryController {
    @Autowired
    watchHistoryService whService;

    @GetMapping("")
    public List<watchHistory> list(){
        return whService.listAllWatchHistory();
    }

    @GetMapping("/{id}")
    public ResponseEntity<watchHistory> get(@PathVariable Integer id){
        try{
            watchHistory wh=whService.getWatchHistory(id);
            return new ResponseEntity<watchHistory>(wh, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<watchHistory>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody watchHistory wh){
        whService.saveWatchHistory(wh);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody watchHistory wh, @PathVariable Integer id){
        try{
            watchHistory existWatchHistory=whService.getWatchHistory(id);
            wh.setId(id);
            whService.saveWatchHistory(wh);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        whService.deleteWatchHistory(id);
    }
}
