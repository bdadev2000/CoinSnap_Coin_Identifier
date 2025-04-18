package l;

import com.otaliastudios.cameraview.CameraView;
import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jb.u;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f21086b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21087c;

    public c() {
        this.a = 1;
        this.f21087c = Executors.defaultThreadFactory();
        this.f21086b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.a;
        Object obj = this.f21087c;
        Serializable serializable = this.f21086b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) serializable).getAndIncrement());
                return thread;
            case 1:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + ((AtomicInteger) serializable).getAndIncrement());
                return newThread;
            case 2:
                Thread newThread2 = Executors.defaultThreadFactory().newThread(new u(runnable));
                newThread2.setName(((String) serializable) + ((AtomicLong) obj).getAndIncrement());
                return newThread2;
            default:
                return new Thread(runnable, "FrameExecutor #" + ((AtomicInteger) serializable).getAndIncrement());
        }
    }

    public c(d dVar) {
        this.a = 0;
        this.f21087c = dVar;
        this.f21086b = new AtomicInteger(0);
    }

    public c(AtomicLong atomicLong) {
        this.a = 2;
        this.f21086b = "awaitEvenIfOnMainThread task continuation executor";
        this.f21087c = atomicLong;
    }

    public c(CameraView cameraView) {
        this.a = 3;
        this.f21087c = cameraView;
        this.f21086b = new AtomicInteger(1);
    }
}
