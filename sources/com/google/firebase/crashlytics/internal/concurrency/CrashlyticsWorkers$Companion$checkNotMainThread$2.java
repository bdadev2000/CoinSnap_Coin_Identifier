package com.google.firebase.crashlytics.internal.concurrency;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class CrashlyticsWorkers$Companion$checkNotMainThread$2 extends r implements q0.a {
    public static final CrashlyticsWorkers$Companion$checkNotMainThread$2 INSTANCE = new CrashlyticsWorkers$Companion$checkNotMainThread$2();

    public CrashlyticsWorkers$Companion$checkNotMainThread$2() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final String invoke() {
        String threadName;
        StringBuilder sb = new StringBuilder("Must not be called on a main thread, was called on ");
        threadName = CrashlyticsWorkers.Companion.getThreadName();
        sb.append(threadName);
        sb.append('.');
        return sb.toString();
    }
}
