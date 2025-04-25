package com.amazonaws.auth;

/* loaded from: classes7.dex */
public interface AWSIdentityProvider {
    String getToken();

    String refresh();
}
