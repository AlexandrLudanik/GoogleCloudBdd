package com.epam.home.service;

import com.epam.home.model.Instance;

public class InstanceCreator {

    public static final String TESTDATA_INSTANCE_NUMBER = "testdata.instance.number";
    public static final String TESTDATA_INSTANCE_WHAT_ARE_THIS_INSTANCES_FOR = "testdata.instance.whatAreThisInstancesFor";
    public static final String TESTDATA_INSTANCE_OPERATION_SYSTEM = "testdata.instance.operatingSystem";
    public static final String TESTDATA_INSTANCE_VMCLASS = "testdata.instance.VMClass";
    public static final String TESTDATA_INSTANCE_INSTANCE_TYPE = "testdata.instance.instanceType";
    public static final String TESTDATA_INSTANCE_NUMBER_OF_GPU = "testdata.instance.numberOfGPUs";
    public static final String TESTDATA_INSTANCE_GPU_TYPE = "testdata.instance.GPUType";
    public static final String TESTDATA_INSTANCE_LOCAL_SSD = "testdata.instance.localSSD";
    public static final String TESTDATA_INSTANCE_DATA_CENTER_LOCATION = "testdata.instance.dataCentrLocation";
    public static final String TESTDATA_INSTANCE_COMMITTED_USAGE = "testdata.instance.committedUsage";

    public static Instance withCredentialsFromProperty() {
        return new Instance(TestDataReader.getTestData(TESTDATA_INSTANCE_NUMBER),
                TestDataReader.getTestData(TESTDATA_INSTANCE_WHAT_ARE_THIS_INSTANCES_FOR),
                TestDataReader.getTestData(TESTDATA_INSTANCE_OPERATION_SYSTEM),
                TestDataReader.getTestData(TESTDATA_INSTANCE_VMCLASS),
                TestDataReader.getTestData(TESTDATA_INSTANCE_INSTANCE_TYPE),
                TestDataReader.getTestData(TESTDATA_INSTANCE_NUMBER_OF_GPU),
                TestDataReader.getTestData(TESTDATA_INSTANCE_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_INSTANCE_LOCAL_SSD),
                TestDataReader.getTestData(TESTDATA_INSTANCE_DATA_CENTER_LOCATION),
                TestDataReader.getTestData(TESTDATA_INSTANCE_COMMITTED_USAGE));
    }

//    public static Instance withEmptyInstance(){
//        return new Instance("", TestDataReader.getTestData(TESTDATA_INSTANCE_WHAT_ARE_THIS_INSTANCES_FOR));
//    }
//
//    public static Instance withEmptyWhatAreThisInstancesFor(){
//        return new Instance(TestDataReader.getTestData(TESTDATA_INSTANCE_NUMBER), "");
//    }
}
