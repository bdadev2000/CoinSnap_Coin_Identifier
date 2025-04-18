package ai;

import com.facebook.internal.i;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f498b;

    public e(f fVar) {
        this.f498b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c10;
        long j3;
        while (true) {
            f fVar = this.f498b;
            synchronized (fVar) {
                c10 = fVar.c();
            }
            if (c10 == null) {
                return;
            }
            c cVar = c10.f489c;
            Intrinsics.checkNotNull(cVar);
            f fVar2 = this.f498b;
            boolean isLoggable = f.f501j.isLoggable(Level.FINE);
            if (isLoggable) {
                cVar.a.a.getClass();
                j3 = System.nanoTime();
                i.e(c10, cVar, "starting");
            } else {
                j3 = -1;
            }
            try {
                try {
                    f.a(fVar2, c10);
                    Unit unit = Unit.INSTANCE;
                    if (isLoggable) {
                        cVar.a.a.getClass();
                        i.e(c10, cVar, Intrinsics.stringPlus("finished run in ", i.q(System.nanoTime() - j3)));
                    }
                } finally {
                }
            } catch (Throwable th2) {
                if (isLoggable) {
                    cVar.a.a.getClass();
                    i.e(c10, cVar, Intrinsics.stringPlus("failed a run in ", i.q(System.nanoTime() - j3)));
                }
                throw th2;
            }
        }
    }
}
