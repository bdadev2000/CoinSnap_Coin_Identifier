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

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f18275a;

    /* renamed from: e, reason: collision with root package name */
    private final int f18278e;

    /* renamed from: f, reason: collision with root package name */
    private final b f18279f;

    /* renamed from: g, reason: collision with root package name */
    private final n f18280g;

    /* renamed from: h, reason: collision with root package name */
    private final x f18281h;
    private final AtomicInteger b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final Set<u<?>> f18276c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<u<?>> f18277d = new PriorityBlockingQueue<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<a> f18282i = new ArrayList();

    /* loaded from: classes3.dex */
    public interface a {
        void a(u<?> uVar, int i9);
    }

    public v(n nVar, x xVar, int i9, b bVar) {
        this.f18278e = i9;
        this.f18279f = bVar;
        this.f18280g = nVar;
        this.f18281h = xVar;
    }

    public final void a() {
        int i9 = this.f18278e;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i9, i9, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.network.v.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "NetworkDispatcher");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.f18275a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final <T> void b(u<T> uVar) {
        synchronized (this.f18276c) {
            this.f18276c.remove(uVar);
        }
        a(uVar, 5);
    }

    public final <T> u<T> a(u<T> uVar) {
        uVar.a(this);
        synchronized (this.f18276c) {
            this.f18276c.add(uVar);
        }
        uVar.c(this.b.incrementAndGet());
        a(uVar, 0);
        this.f18277d.add(uVar);
        this.f18275a.execute(new Runnable() { // from class: com.mbridge.msdk.tracker.network.v.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    new o(v.this.f18277d, v.this.f18280g, v.this.f18279f, v.this.f18281h).run();
                } catch (Throwable unused) {
                }
            }
        });
        return uVar;
    }

    public final void a(u<?> uVar, int i9) {
        synchronized (this.f18282i) {
            try {
                Iterator<a> it = this.f18282i.iterator();
                while (it.hasNext()) {
                    it.next().a(uVar, i9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
