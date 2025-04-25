package com.amazonaws.services.s3.model;

/* loaded from: classes7.dex */
public class ReplicationDestinationConfig {
    private String bucketARN;
    private String storageClass;

    public String getBucketARN() {
        return this.bucketARN;
    }

    public void setBucketARN(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Bucket name cannot be null");
        }
        this.bucketARN = str;
    }

    public ReplicationDestinationConfig withBucketARN(String str) {
        setBucketARN(str);
        return this;
    }

    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    public void setStorageClass(StorageClass storageClass) {
        String storageClass2;
        if (storageClass == null) {
            storageClass2 = null;
        } else {
            storageClass2 = storageClass.toString();
        }
        setStorageClass(storageClass2);
    }

    public ReplicationDestinationConfig withStorageClass(String str) {
        setStorageClass(str);
        return this;
    }

    public ReplicationDestinationConfig withStorageClass(StorageClass storageClass) {
        String storageClass2;
        if (storageClass == null) {
            storageClass2 = null;
        } else {
            storageClass2 = storageClass.toString();
        }
        setStorageClass(storageClass2);
        return this;
    }

    public String getStorageClass() {
        return this.storageClass;
    }
}
