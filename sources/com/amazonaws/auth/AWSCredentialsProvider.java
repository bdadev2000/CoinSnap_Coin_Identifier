package com.amazonaws.auth;

/* loaded from: classes7.dex */
public interface AWSCredentialsProvider {
    AWSCredentials getCredentials();

    void refresh();
}
