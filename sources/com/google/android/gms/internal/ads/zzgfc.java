package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzgfc extends TimeoutException {
    public /* synthetic */ zzgfc(String str, zzgfd zzgfdVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
