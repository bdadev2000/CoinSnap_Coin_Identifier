package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class tl implements ha {

    /* renamed from: b, reason: collision with root package name */
    private static final List f8284b = new ArrayList(50);
    private final Handler a;

    public tl(Handler handler) {
        this.a = handler;
    }

    @Override // com.applovin.impl.ha
    public void b(int i10) {
        this.a.removeMessages(i10);
    }

    @Override // com.applovin.impl.ha
    public boolean c(int i10) {
        return this.a.sendEmptyMessage(i10);
    }

    @Override // com.applovin.impl.ha
    public ha.a d(int i10) {
        return a().a(this.a.obtainMessage(i10), this);
    }

    /* loaded from: classes.dex */
    public static final class b implements ha.a {
        private Message a;

        /* renamed from: b, reason: collision with root package name */
        private tl f8285b;

        private b() {
        }

        private void b() {
            this.a = null;
            this.f8285b = null;
            tl.b(this);
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a1.a(this.a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.impl.ha.a
        public void a() {
            ((Message) a1.a(this.a)).sendToTarget();
            b();
        }

        public b a(Message message, tl tlVar) {
            this.a = message;
            this.f8285b = tlVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b bVar) {
        List list = f8284b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // com.applovin.impl.ha
    public boolean a(int i10) {
        return this.a.hasMessages(i10);
    }

    @Override // com.applovin.impl.ha
    public boolean a(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.applovin.impl.ha
    public void a(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.ha
    public boolean a(int i10, long j3) {
        return this.a.sendEmptyMessageAtTime(i10, j3);
    }

    @Override // com.applovin.impl.ha
    public boolean a(ha.a aVar) {
        return ((b) aVar).a(this.a);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i10, Object obj) {
        return a().a(this.a.obtainMessage(i10, obj), this);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i10, int i11, int i12) {
        return a().a(this.a.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i10, int i11, int i12, Object obj) {
        return a().a(this.a.obtainMessage(i10, i11, i12, obj), this);
    }

    private static b a() {
        b bVar;
        List list = f8284b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new b();
            } else {
                bVar = (b) list.remove(list.size() - 1);
            }
        }
        return bVar;
    }
}
