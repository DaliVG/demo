package com.dali.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="persons")
public class PersonEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private Long id;
        @Column
        private String name;

}
