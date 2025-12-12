package fr.sfv.m12526.bestioles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name="role")
public class Role {

    @Id
    @Column(columnDefinition = "int", nullable = false)
    private Integer id;

    @Column(columnDefinition = "varchar(50)")
    private String label;

}
