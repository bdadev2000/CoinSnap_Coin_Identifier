package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class v {
    private ThreadPoolExecutor a;

    /* renamed from: e, reason: collision with root package name */
    private final int f15516e;

    /* renamed from: f, reason: collision with root package name */
    private final b f15517f;

    /* renamed from: g, reason: collision with root package name */
    private final n f15518g;

    /* renamed from: h, reason: collision with root package name */
    private final x f15519h;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f15513b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final Set<u<?>> f15514c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<u<?>> f15515d = new PriorityBlockingQueue<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<a> f15520i = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a {
        void a(u<?> uVar, int i10);
    }

    public v(n nVar, x xVar, int i10, b bVar) {
        this.f15516e = i10;
        this.f15517f = bVar;
        this.f15518g = nVar;
        this.f15519h = xVar;
    }

    public final void a() {
        int i10 = this.f15516e;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.network.v.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "NetworkDispatcher");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final <T> void b(u<T> uVar) {
        synchronized (this.f15514c) {
            this.f15514c.remove(uVar);
        }
        a(uVar, 5);
    }

    public final <T> u<T> a(u<T> uVar) {
        uVar.a(this);
        synchronized (this.f15514c) {
            this.f15514c.add(uVar);
        }
        uVar.c(this.f15513b.incrementAndGet());
        a(uVar, 0);
        this.f15515d.add(uVar);
        this.a.execute(new Runnable() { // from class: com.mbridge.msdk.tracker.network.v.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    new o(v.this.f15515d, v.this.f15518g, v.this.f15517f, v.this.f15519h).run();
                } catch (Throwable unused) {
                }
            }
        });
        return uVar;
    }

    public final void a(u<?> uVar, int i10) {
        synchronized (this.f15520i) {
            Iterator<a> it = this.f15520i.iterator();
            while (it.hasNext()) {
                it.next().a(uVar, i10);
            }
        }
    }
}
