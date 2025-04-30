package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class zzggp extends TimeoutException {
    public /* synthetic */ zzggp(String str, zzggo zzggoVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
