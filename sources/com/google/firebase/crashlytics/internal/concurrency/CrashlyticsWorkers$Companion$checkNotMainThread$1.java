package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public /* synthetic */ class CrashlyticsWorkers$Companion$checkNotMainThread$1 extends o implements q0.a {
    public CrashlyticsWorkers$Companion$checkNotMainThread$1(Object obj) {
        super(0, obj, CrashlyticsWorkers.Companion.class, "isNotMainThread", "isNotMainThread()Z", 0);
    }

    @Override // q0.a
    @NotNull
    public final Boolean invoke() {
        boolean isNotMainThread;
        isNotMainThread = ((CrashlyticsWorkers.Companion) this.receiver).isNotMainThread();
        return Boolean.valueOf(isNotMainThread);
    }
}
