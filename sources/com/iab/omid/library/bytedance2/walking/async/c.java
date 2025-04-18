package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c implements b.a {
    private final BlockingQueue<Runnable> a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f12309b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f12310c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f12311d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.f12309b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f12310c.poll();
        this.f12311d = poll;
        if (poll != null) {
            poll.a(this.f12309b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f12310c.add(bVar);
        if (this.f12311d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.a
    public void a(b bVar) {
        this.f12311d = null;
        a();
    }
}
