package hu.gde.runnersdemo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoeNameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shoeNameId;
    private String shoeNameName;

    @OneToMany
    private List<RunnerEntity> runners;

    public long getShoeNameId() {
        return shoeNameId;
    }

    public String getShoeNameName() {
        return shoeNameName;
    }

    public void setShoeNameId(long nameId) {
        this.shoeNameId = nameId;
    }

    public void setShoeNameName (String nameName) {
        this.shoeNameName = nameName;
    }
}
