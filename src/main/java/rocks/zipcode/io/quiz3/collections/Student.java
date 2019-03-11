package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Map<Lab, LabStatus> recordOfLabs;

    public Student() {
       // this(null);

        this.recordOfLabs = new HashMap<>();
    }

    public Student(Map<Lab, LabStatus> map) {
        this.recordOfLabs = map;
    }


    public Lab getLab(String labName) {

        for (Map.Entry<Lab, LabStatus> entry : recordOfLabs.entrySet()) {
            if (entry.getKey().getName().equals(labName)) {
                return entry.getKey();
            }
        } throw new UnsupportedOperationException();


    }



    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab l = getLab(labName);
        recordOfLabs.put(l,labStatus);

    }


    public void forkLab(Lab lab) {
        recordOfLabs.put(lab,LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {

        for(Map.Entry<Lab, LabStatus> entry : recordOfLabs.entrySet()) {
            if (entry.getKey().getName().equals(labName)) {
                return entry.getValue();
            }
        }
        return null;

    }

    public String toString() {
        String ans = "";

        for(Map.Entry<Lab, LabStatus> entry : recordOfLabs.entrySet()) {
            ans = ans + entry.getKey().getName() + " > " + entry.getValue().toString()
                    .replace("[","").replace("]","") + "\n";
        }


        return ans;
    }
}
