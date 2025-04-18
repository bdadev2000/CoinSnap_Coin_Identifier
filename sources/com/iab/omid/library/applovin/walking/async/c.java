package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c implements b.a {
    private final BlockingQueue<Runnable> a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f12216b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f12217c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f12218d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.f12216b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f12217c.poll();
        this.f12218d = poll;
        if (poll != null) {
            poll.a(this.f12216b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f12217c.add(bVar);
        if (this.f12218d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f12218d = null;
        a();
    }
}
