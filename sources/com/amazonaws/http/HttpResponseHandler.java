package com.amazonaws.http;

/* loaded from: classes7.dex */
public interface HttpResponseHandler<T> {
    T handle(HttpResponse httpResponse) throws Exception;

    boolean needsConnectionLeftOpen();
}
