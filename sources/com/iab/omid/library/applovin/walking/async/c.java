package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f14482a;
    private final ThreadPoolExecutor b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f14483c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f14484d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f14482a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f14483c.poll();
        this.f14484d = poll;
        if (poll != null) {
            poll.a(this.b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f14483c.add(bVar);
        if (this.f14484d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f14484d = null;
        a();
    }
}
