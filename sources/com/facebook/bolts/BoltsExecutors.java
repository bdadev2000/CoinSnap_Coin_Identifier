package com.facebook.bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* loaded from: classes2.dex */
public final class BoltsExecutors {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final BoltsExecutors INSTANCE = new BoltsExecutors();

    @NotNull
    private final ExecutorService background;

    @NotNull
    private final Executor immediate;

    @NotNull
    private final ScheduledExecutorService scheduled;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAndroidRuntime() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale locale = Locale.US;
            p0.a.r(locale, "US");
            String lowerCase = property.toLowerCase(locale);
            p0.a.r(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return m.M0(lowerCase, "android", false);
        }

        @NotNull
        public final ExecutorService background() {
            return BoltsExecutors.INSTANCE.background;
        }

        @NotNull
        public final Executor immediate$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.immediate;
        }

        @NotNull
        public final ScheduledExecutorService scheduled$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.scheduled;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ImmediateExecutor implements Executor {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final int MAX_DEPTH = 15;

        @NotNull
        private final ThreadLocal<Integer> executionDepth = new ThreadLocal<>();

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }
        }

        private final int decrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.executionDepth.remove();
            } else {
                this.executionDepth.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private final int incrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.executionDepth.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable runnable) {
            p0.a.s(runnable, "command");
            try {
                if (incrementDepth() <= 15) {
                    runnable.run();
                } else {
                    BoltsExecutors.Companion.background().execute(runnable);
                }
                decrementDepth();
            } catch (Throwable th) {
                decrementDepth();
                throw th;
            }
        }
    }

    private BoltsExecutors() {
        ExecutorService newCachedThreadPool;
        if (Companion.isAndroidRuntime()) {
            newCachedThreadPool = AndroidExecutors.Companion.newCachedThreadPool();
        } else {
            newCachedThreadPool = Executors.newCachedThreadPool();
            p0.a.r(newCachedThreadPool, "newCachedThreadPool()");
        }
        this.background = newCachedThreadPool;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        p0.a.r(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduled = newSingleThreadScheduledExecutor;
        this.immediate = new ImmediateExecutor();
    }

    @NotNull
    public static final ExecutorService background() {
        return Companion.background();
    }
}
