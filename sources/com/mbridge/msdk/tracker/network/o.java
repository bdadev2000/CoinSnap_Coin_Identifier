package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class o implements Runnable {
    private final BlockingQueue<u<?>> a;

    /* renamed from: b, reason: collision with root package name */
    private final n f15443b;

    /* renamed from: c, reason: collision with root package name */
    private final b f15444c;

    /* renamed from: d, reason: collision with root package name */
    private final x f15445d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f15446e = false;

    public o(BlockingQueue<u<?>> blockingQueue, n nVar, b bVar, x xVar) {
        this.a = blockingQueue;
        this.f15443b = nVar;
        this.f15444c = bVar;
        this.f15445d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                u<?> take = this.a.take();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                take.b(3);
                try {
                    try {
                        if (take.n()) {
                            take.c("network-discard-cancelled");
                            take.y();
                        } else {
                            TrafficStats.setThreadStatsTag(take.j());
                            r a = this.f15443b.a(take);
                            if (a.f15474e && take.x()) {
                                take.c("not-modified");
                                take.y();
                            } else {
                                w<?> a10 = take.a(a);
                                if (take.r() && a10.f15521b != null) {
                                    this.f15444c.a(take.l(), a10.f15521b);
                                }
                                take.w();
                                this.f15445d.a(take, a10);
                                take.a(a10);
                            }
                        }
                    } catch (ad e2) {
                        e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                        this.f15445d.a(take, e2);
                        take.y();
                    } catch (Exception e10) {
                        ae.a(e10, "Unhandled exception %s", e10.toString());
                        ac acVar = new ac(e10);
                        acVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                        this.f15445d.a(take, acVar);
                        take.y();
                    }
                    take.b(4);
                } catch (Throwable th2) {
                    take.b(4);
                    throw th2;
                    break;
                }
            } catch (InterruptedException unused) {
                if (this.f15446e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ae.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
