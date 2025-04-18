package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public /* synthetic */ class CrashlyticsWorkers$Companion$checkBackgroundThread$1 extends o implements q0.a {
    public CrashlyticsWorkers$Companion$checkBackgroundThread$1(Object obj) {
        super(0, obj, CrashlyticsWorkers.Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
    }

    @Override // q0.a
    @NotNull
    public final Boolean invoke() {
        boolean isBackgroundThread;
        isBackgroundThread = ((CrashlyticsWorkers.Companion) this.receiver).isBackgroundThread();
        return Boolean.valueOf(isBackgroundThread);
    }
}
