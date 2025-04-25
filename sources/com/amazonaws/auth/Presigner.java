package com.amazonaws.auth;

import com.amazonaws.Request;
import java.util.Date;

/* loaded from: classes7.dex */
public interface Presigner {
    void presignRequest(Request<?> request, AWSCredentials aWSCredentials, Date date);
}
