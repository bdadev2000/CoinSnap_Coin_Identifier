package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class tl implements ha {
    private static final List b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f11501a;

    public tl(Handler handler) {
        this.f11501a = handler;
    }

    @Override // com.applovin.impl.ha
    public void b(int i9) {
        this.f11501a.removeMessages(i9);
    }

    @Override // com.applovin.impl.ha
    public boolean c(int i9) {
        return this.f11501a.sendEmptyMessage(i9);
    }

    @Override // com.applovin.impl.ha
    public ha.a d(int i9) {
        return a().a(this.f11501a.obtainMessage(i9), this);
    }

    /* loaded from: classes.dex */
    public static final class b implements ha.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f11502a;
        private tl b;

        private b() {
        }

        private void b() {
            this.f11502a = null;
            this.b = null;
            tl.b(this);
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC0669a1.a(this.f11502a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.impl.ha.a
        public void a() {
            ((Message) AbstractC0669a1.a(this.f11502a)).sendToTarget();
            b();
        }

        public b a(Message message, tl tlVar) {
            this.f11502a = message;
            this.b = tlVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b bVar) {
        List list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.ha
    public boolean a(int i9) {
        return this.f11501a.hasMessages(i9);
    }

    @Override // com.applovin.impl.ha
    public boolean a(Runnable runnable) {
        return this.f11501a.post(runnable);
    }

    @Override // com.applovin.impl.ha
    public void a(Object obj) {
        this.f11501a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.ha
    public boolean a(int i9, long j7) {
        return this.f11501a.sendEmptyMessageAtTime(i9, j7);
    }

    @Override // com.applovin.impl.ha
    public boolean a(ha.a aVar) {
        return ((b) aVar).a(this.f11501a);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i9, Object obj) {
        return a().a(this.f11501a.obtainMessage(i9, obj), this);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i9, int i10, int i11) {
        return a().a(this.f11501a.obtainMessage(i9, i10, i11), this);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i9, int i10, int i11, Object obj) {
        return a().a(this.f11501a.obtainMessage(i9, i10, i11, obj), this);
    }

    private static b a() {
        b bVar;
        List list = b;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    bVar = new b();
                } else {
                    bVar = (b) list.remove(list.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
