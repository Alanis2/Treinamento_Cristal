package org.meuprojeto.projeto.controller;

import org.meuprojeto.projeto.domain.Anime;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.meuprojeto.projeto.service.AnimeService;
import org.meuprojeto.projeto.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/animes")
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
    }

    //Exemplo
    @GetMapping(path = "/{id}")
      public ResponseEntity<Anime> findById(@PathVariable long id){
      return ResponseEntity.ok(animeService.findById(id));
    }
}
