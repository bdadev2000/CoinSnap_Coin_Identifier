package ki;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class b extends Thread {
    public b() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e c10;
        while (true) {
            try {
                reentrantLock = e.f20968h;
                reentrantLock.lock();
                try {
                    c10 = wh.c0.c();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (c10 == e.f20972l) {
                e.f20972l = null;
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (c10 != null) {
                c10.k();
            }
        }
    }
}
