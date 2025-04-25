package androidx.work;

/* loaded from: classes7.dex */
public interface RunnableScheduler {
    void cancel(Runnable runnable);

    void scheduleWithDelay(long delayInMillis, Runnable runnable);
}
