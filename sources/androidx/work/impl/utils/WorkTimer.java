package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import com.facebook.AuthenticationTokenClaims;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes.dex */
public class WorkTimer {
    public static final String e = Logger.e("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f22233a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22234b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22235c;
    public final Object d;

    /* renamed from: androidx.work.impl.utils.WorkTimer$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f22236a;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f22236a);
            this.f22236a = this.f22236a + 1;
            return newThread;
        }
    }

    @RestrictTo
    /* loaded from: classes.dex */
    public interface TimeLimitExceededListener {
        void a(String str);
    }

    @RestrictTo
    /* loaded from: classes.dex */
    public static class WorkTimerRunnable implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WorkTimer f22237a;

        /* renamed from: b, reason: collision with root package name */
        public final String f22238b;

        public WorkTimerRunnable(WorkTimer workTimer, String str) {
            this.f22237a = workTimer;
            this.f22238b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f22237a.d) {
                try {
                    if (((WorkTimerRunnable) this.f22237a.f22234b.remove(this.f22238b)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.f22237a.f22235c.remove(this.f22238b);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.a(this.f22238b);
                        }
                    } else {
                        Logger.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f22238b), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.work.impl.utils.WorkTimer$1, java.lang.Object, java.util.concurrent.ThreadFactory] */
    public WorkTimer() {
        ?? obj = new Object();
        obj.f22236a = 0;
        this.f22234b = new HashMap();
        this.f22235c = new HashMap();
        this.d = new Object();
        this.f22233a = Executors.newSingleThreadScheduledExecutor(obj);
    }

    public final void a(String str, TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.d) {
            Logger.c().a(e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, str);
            this.f22234b.put(str, workTimerRunnable);
            this.f22235c.put(str, timeLimitExceededListener);
            this.f22233a.schedule(workTimerRunnable, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            try {
                if (((WorkTimerRunnable) this.f22234b.remove(str)) != null) {
                    Logger.c().a(e, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f22235c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
