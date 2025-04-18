package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.ja;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class wl implements ja {

    /* renamed from: b, reason: collision with root package name */
    private static final List f27740b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f27741a;

    /* loaded from: classes2.dex */
    public static final class b implements ja.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f27742a;

        /* renamed from: b, reason: collision with root package name */
        private wl f27743b;

        private b() {
        }

        private void b() {
            this.f27742a = null;
            this.f27743b = null;
            wl.b(this);
        }

        public b a(Message message, wl wlVar) {
            this.f27742a = message;
            this.f27743b = wlVar;
            return this;
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) b1.a(this.f27742a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.impl.ja.a
        public void a() {
            ((Message) b1.a(this.f27742a)).sendToTarget();
            b();
        }
    }

    public wl(Handler handler) {
        this.f27741a = handler;
    }

    @Override // com.applovin.impl.ja
    public void b(int i2) {
        this.f27741a.removeMessages(i2);
    }

    @Override // com.applovin.impl.ja
    public boolean c(int i2) {
        return this.f27741a.sendEmptyMessage(i2);
    }

    @Override // com.applovin.impl.ja
    public ja.a d(int i2) {
        return a().a(this.f27741a.obtainMessage(i2), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b bVar) {
        List list = f27740b;
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

    @Override // com.applovin.impl.ja
    public boolean a(int i2) {
        return this.f27741a.hasMessages(i2);
    }

    @Override // com.applovin.impl.ja
    public boolean a(Runnable runnable) {
        return this.f27741a.post(runnable);
    }

    @Override // com.applovin.impl.ja
    public void a(Object obj) {
        this.f27741a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.ja
    public boolean a(int i2, long j2) {
        return this.f27741a.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // com.applovin.impl.ja
    public boolean a(ja.a aVar) {
        return ((b) aVar).a(this.f27741a);
    }

    @Override // com.applovin.impl.ja
    public ja.a a(int i2, Object obj) {
        return a().a(this.f27741a.obtainMessage(i2, obj), this);
    }

    @Override // com.applovin.impl.ja
    public ja.a a(int i2, int i3, int i4) {
        return a().a(this.f27741a.obtainMessage(i2, i3, i4), this);
    }

    @Override // com.applovin.impl.ja
    public ja.a a(int i2, int i3, int i4, Object obj) {
        return a().a(this.f27741a.obtainMessage(i2, i3, i4, obj), this);
    }

    private static b a() {
        b bVar;
        List list = f27740b;
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
