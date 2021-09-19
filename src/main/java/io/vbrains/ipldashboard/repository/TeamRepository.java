package io.vbrains.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.vbrains.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team,Long> {

    Team findByTeamName(String teamName);
}
