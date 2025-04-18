package j4;

import a9.g;
import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ThreadFactory threadFactory, Runnable runnable, int i10) {
        super(runnable);
        this.f19749b = i10;
        this.f19750c = threadFactory;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f19749b) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                super.run();
                return;
            default:
                g gVar = (g) this.f19750c;
                gVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (gVar.d());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f19749b = 2;
        this.f19750c = gVar;
    }
}
