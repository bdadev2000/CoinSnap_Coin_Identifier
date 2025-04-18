package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f29027a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f29028b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f29029c = new ArrayDeque<>();
    private b d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f29027a = linkedBlockingQueue;
        this.f29028b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f29029c.poll();
        this.d = poll;
        if (poll != null) {
            poll.a(this.f29028b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f29029c.add(bVar);
        if (this.d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.d = null;
        a();
    }
}
