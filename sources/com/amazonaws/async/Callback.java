package com.amazonaws.async;

/* loaded from: classes7.dex */
public interface Callback<R> {
    void onError(Exception exc);

    void onResult(R r);
}
