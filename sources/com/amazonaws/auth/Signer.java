package com.amazonaws.auth;

import com.amazonaws.Request;

/* loaded from: classes7.dex */
public interface Signer {
    void sign(Request<?> request, AWSCredentials aWSCredentials);
}
