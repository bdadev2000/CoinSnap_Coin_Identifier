package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public /* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends o implements q0.a {
    public CrashlyticsWorkers$Companion$checkBlockingThread$1(Object obj) {
        super(0, obj, CrashlyticsWorkers.Companion.class, "isBlockingThread", "isBlockingThread()Z", 0);
    }

    @Override // q0.a
    @NotNull
    public final Boolean invoke() {
        boolean isBlockingThread;
        isBlockingThread = ((CrashlyticsWorkers.Companion) this.receiver).isBlockingThread();
        return Boolean.valueOf(isBlockingThread);
    }
}
