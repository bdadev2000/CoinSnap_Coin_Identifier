package com.google.android.datatransport.runtime.retries;

/* loaded from: classes12.dex */
public interface RetryStrategy<TInput, TResult> {
    TInput shouldRetry(TInput tinput, TResult tresult);
}
