package com.myhr.dev.empapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="DEPT")
@Data
@EqualsAndHashCode
public class Dept  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private     Long    did ;

    private     String  dname ;

    private     String  dlocation ;

}
