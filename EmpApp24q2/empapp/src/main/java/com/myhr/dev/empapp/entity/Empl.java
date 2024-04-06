package com.myhr.dev.empapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="EMPL")
@Data
@EqualsAndHashCode
public class Empl implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private     Long    eid ;

    private     String  fname ;

    private     String  lname ;

    private     String  phonenum ;

}
