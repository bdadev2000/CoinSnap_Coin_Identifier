package com.glority.android.base.aws.s3;

import com.amazonaws.auth.AWSSessionCredentials;

/* loaded from: classes14.dex */
public class AppAWSSessionCredentials implements AWSSessionCredentials {
    private String awsAccessKey;
    private String awsSecretKey;
    private String sessionToken;

    public AppAWSSessionCredentials() {
    }

    public AppAWSSessionCredentials(String str, String str2, String str3) {
        this.awsAccessKey = str;
        this.awsSecretKey = str2;
        this.sessionToken = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSAccessKeyId() {
        return this.awsAccessKey;
    }

    public void setAwsAccessKey(String str) {
        this.awsAccessKey = str;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSSecretKey() {
        return this.awsSecretKey;
    }

    public void setAwsSecretKey(String str) {
        this.awsSecretKey = str;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    public String getSessionToken() {
        return this.sessionToken;
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }
}
