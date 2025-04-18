package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* loaded from: classes2.dex */
public final class CrashlyticsWorkers {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static boolean enforcement;

    @NotNull
    public final CrashlyticsWorker common;

    @NotNull
    public final CrashlyticsWorker dataCollect;

    @NotNull
    public final CrashlyticsWorker diskWrite;

    @NotNull
    public final CrashlyticsWorker network;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final void checkThread(q0.a aVar, q0.a aVar2) {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return;
            }
            Logger.getLogger().d((String) aVar2.invoke());
            getEnforcement();
        }

        public static /* synthetic */ void getEnforcement$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getThreadName() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            p0.a.r(threadName, "threadName");
            return m.M0(threadName, "Firebase Background Thread #", false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            p0.a.r(threadName, "threadName");
            return m.M0(threadName, "Firebase Blocking Thread #", false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void checkBackgroundThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), CrashlyticsWorkers$Companion$checkBackgroundThread$2.INSTANCE);
        }

        public final void checkBlockingThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), CrashlyticsWorkers$Companion$checkBlockingThread$2.INSTANCE);
        }

        public final void checkNotMainThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), CrashlyticsWorkers$Companion$checkNotMainThread$2.INSTANCE);
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z2) {
            CrashlyticsWorkers.enforcement = z2;
        }
    }

    public CrashlyticsWorkers(@NotNull ExecutorService executorService, @NotNull ExecutorService executorService2) {
        p0.a.s(executorService, "backgroundExecutorService");
        p0.a.s(executorService2, "blockingExecutorService");
        this.common = new CrashlyticsWorker(executorService);
        this.diskWrite = new CrashlyticsWorker(executorService);
        this.dataCollect = new CrashlyticsWorker(executorService);
        this.network = new CrashlyticsWorker(executorService2);
    }

    public static final void checkBackgroundThread() {
        Companion.checkBackgroundThread();
    }

    public static final void checkBlockingThread() {
        Companion.checkBlockingThread();
    }

    public static final void checkNotMainThread() {
        Companion.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return Companion.getEnforcement();
    }

    public static final void setEnforcement(boolean z2) {
        Companion.setEnforcement(z2);
    }
}
