package hu.gde.runnersdemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RunnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long runnerId;
    private String runnerName;
    private long pace;
    private long shoeSize;

    @OneToMany(mappedBy = "runner")
    private List<LapTimeEntity> laptimes = new ArrayList<>();

    @ManyToOne
    private ShoeNameEntity shoeName;

    public RunnerEntity() {
    }

    public long getRunnerId() {
        return runnerId;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public long getPace() {
        return pace;
    }

    public long getShoeSize() {
        return shoeSize;
    }

    public String getShoeName() {
        return shoeName.getShoeNameName();
    }

    public void setRunnerId(long runnerId) {
        this.runnerId = runnerId;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public void setPace(long pace) {
        this.pace = pace;
    }

    public void setShoeSize(long shoeSize) {
        this.shoeSize = shoeSize;
    }

    public List<LapTimeEntity> getLaptimes() {
        return laptimes;
    }

    public void setShoeName(ShoeNameEntity shoeName) {
        this.shoeName = shoeName;
    }
}
