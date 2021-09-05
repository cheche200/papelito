package com.juanicheche.papelito.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter
public class Game {

    @Id
    private Long id;
    private int numberOfTeams;
    private int namesLimit;
    @OneToMany
    private List<Name> names;
}
