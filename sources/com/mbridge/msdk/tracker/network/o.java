package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<u<?>> f18185a;
    private final n b;

    /* renamed from: c, reason: collision with root package name */
    private final b f18186c;

    /* renamed from: d, reason: collision with root package name */
    private final x f18187d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f18188e = false;

    public o(BlockingQueue<u<?>> blockingQueue, n nVar, b bVar, x xVar) {
        this.f18185a = blockingQueue;
        this.b = nVar;
        this.f18186c = bVar;
        this.f18187d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                u<?> take = this.f18185a.take();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                take.b(3);
                try {
                    try {
                        if (take.n()) {
                            take.c("network-discard-cancelled");
                            take.y();
                        } else {
                            TrafficStats.setThreadStatsTag(take.j());
                            r a6 = this.b.a(take);
                            if (a6.f18234e && take.x()) {
                                take.c("not-modified");
                                take.y();
                            } else {
                                w<?> a9 = take.a(a6);
                                if (take.r() && a9.b != null) {
                                    this.f18186c.a(take.l(), a9.b);
                                }
                                take.w();
                                this.f18187d.a(take, a9);
                                take.a(a9);
                            }
                        }
                    } catch (ad e4) {
                        e4.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                        this.f18187d.a(take, e4);
                        take.y();
                    } catch (Exception e9) {
                        ae.a(e9, "Unhandled exception %s", e9.toString());
                        ac acVar = new ac(e9);
                        acVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                        this.f18187d.a(take, acVar);
                        take.y();
                    }
                    take.b(4);
                } catch (Throwable th) {
                    take.b(4);
                    throw th;
                    break;
                }
            } catch (InterruptedException unused) {
                if (this.f18188e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ae.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
