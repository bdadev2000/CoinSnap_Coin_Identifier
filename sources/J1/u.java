package J1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import u4.C2775t;

/* loaded from: classes.dex */
public final class u implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1547a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Number f1548c;

    public u() {
        this.f1547a = 0;
        this.b = Executors.defaultThreadFactory();
        this.f1548c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1547a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f1548c;
                Thread newThread = ((ThreadFactory) this.b).newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = Executors.defaultThreadFactory().newThread(new C2775t(runnable));
                newThread2.setName(((String) this.b) + ((AtomicLong) this.f1548c).getAndIncrement());
                return newThread2;
        }
    }

    public u(String str, AtomicLong atomicLong) {
        this.f1547a = 1;
        this.b = str;
        this.f1548c = atomicLong;
    }
}
