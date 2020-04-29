package com.valerii.parser.controlers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchSoccer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String countryOfTournament;
    @Column
    private String commandHomeTitle;
    @Column
    private String commandAwyTitle;
    @Column
    private String score;
    @Column
    private String timeOfGoals;

}
