package io.vbrains.ipldashboard.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import io.vbrains.ipldashboard.model.Match;

public interface MatchRepository extends CrudRepository<Match, Long> {
    
    List<Match> getByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2, Pageable pageable);

    default List<Match> findLatestMatchesByTeam(String teamName, int count){
        Pageable pageable = PageRequest.of(0, count);
        return this.getByTeam1OrTeam2OrderByDateDesc(teamName, teamName,pageable);
        
    }

}
