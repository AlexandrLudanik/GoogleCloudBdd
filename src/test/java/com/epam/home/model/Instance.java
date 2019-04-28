package com.epam.home.model;

import java.util.Objects;

public class Instance {

    private int numberOfInstances;
    private String whatAreTheseInstancesFor;
    private String operationSystem;
    private String VMClass;
    private String instanceType;
    private int numberOfGPU;
    private String gpuType;
    private String localSSD;
    private String dataCenterLocation;
    private String committedUsage;


    public Instance(String numberOfInstances, String whatAreTheseInstancesFor, String operationSystem, String VMClass, String instanceType, String numberOfGPU, String gpuType, String localSSD, String dataCenterLocation, String committedUsage) {
        this.numberOfInstances = Integer.parseInt(numberOfInstances);
        this.whatAreTheseInstancesFor = whatAreTheseInstancesFor;
        this.operationSystem = operationSystem;
        this.VMClass = VMClass;
        this.instanceType = instanceType;
        this.numberOfGPU = Integer.parseInt(numberOfGPU);
        this.gpuType = gpuType;
        this.localSSD = localSSD;
        this.dataCenterLocation = dataCenterLocation;
        this.committedUsage = committedUsage;
    }

    public String getNumberOfInstances() {
        return String.valueOf(numberOfInstances);
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = Integer.parseInt(numberOfInstances);
    }

    public String getWhatAreTheseInstancesFor() {
        return whatAreTheseInstancesFor;
    }

    public void setWhatAreTheseInstancesFor(String whatAreTheseInstancesFor) {
        this.whatAreTheseInstancesFor = whatAreTheseInstancesFor;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getVMClass() {
        return VMClass;
    }

    public void setVMClass(String VMClass) {
        this.VMClass = VMClass;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getNumberOfGPU() {
        return String.valueOf(numberOfGPU);
    }

    public void setNumberOfGPU(String numberOfGPU) {
        this.numberOfGPU = Integer.parseInt(numberOfGPU);
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getDataCenterLocation() {
        return dataCenterLocation;
    }

    public void setDataCenterLocation(String dataCenterLocation) {
        this.dataCenterLocation = dataCenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "numberOfInstances='" + numberOfInstances + '\'' +
                ", whatAreTheseInstancesFor='" + whatAreTheseInstancesFor + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", VMClass='" + VMClass + '\'' +
                ", instanceType='" + instanceType + '\'' +
                ", numberOfGPU='" + numberOfGPU + '\'' +
                ", gpuType='" + gpuType + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", dataCenterLocation='" + dataCenterLocation + '\'' +
                ", committedUsage='" + committedUsage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instance instance = (Instance) o;
        return Objects.equals(numberOfInstances, instance.numberOfInstances) &&
                Objects.equals(whatAreTheseInstancesFor, instance.whatAreTheseInstancesFor) &&
                Objects.equals(operationSystem, instance.operationSystem) &&
                Objects.equals(VMClass, instance.VMClass) &&
                Objects.equals(instanceType, instance.instanceType) &&
                Objects.equals(numberOfGPU, instance.numberOfGPU) &&
                Objects.equals(gpuType, instance.gpuType) &&
                Objects.equals(localSSD, instance.localSSD) &&
                Objects.equals(dataCenterLocation, instance.dataCenterLocation) &&
                Objects.equals(committedUsage, instance.committedUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstances, whatAreTheseInstancesFor, operationSystem, VMClass, instanceType, numberOfGPU, gpuType, localSSD, dataCenterLocation, committedUsage);
    }
}
