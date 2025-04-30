package com.applovin.impl;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.impl.x1 */
/* loaded from: classes.dex */
public interface InterfaceC0775x1 {
    yo a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    /* renamed from: com.applovin.impl.x1$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i9, long j7, long j9);

        /* renamed from: com.applovin.impl.x1$a$a */
        /* loaded from: classes.dex */
        public static final class C0042a {

            /* renamed from: a */
            private final CopyOnWriteArrayList f12098a = new CopyOnWriteArrayList();

            /* renamed from: com.applovin.impl.x1$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0043a {

                /* renamed from: a */
                private final Handler f12099a;
                private final a b;

                /* renamed from: c */
                private boolean f12100c;

                public C0043a(Handler handler, a aVar) {
                    this.f12099a = handler;
                    this.b = aVar;
                }

                public void a() {
                    this.f12100c = true;
                }
            }

            public void a(Handler handler, a aVar) {
                AbstractC0669a1.a(handler);
                AbstractC0669a1.a(aVar);
                a(aVar);
                this.f12098a.add(new C0043a(handler, aVar));
            }

            public void a(int i9, long j7, long j9) {
                Iterator it = this.f12098a.iterator();
                while (it.hasNext()) {
                    C0043a c0043a = (C0043a) it.next();
                    if (!c0043a.f12100c) {
                        c0043a.f12099a.post(new U2(c0043a, i9, j7, j9, 0));
                    }
                }
            }

            public static /* synthetic */ void a(C0043a c0043a, int i9, long j7, long j9) {
                c0043a.b.a(i9, j7, j9);
            }

            public void a(a aVar) {
                Iterator it = this.f12098a.iterator();
                while (it.hasNext()) {
                    C0043a c0043a = (C0043a) it.next();
                    if (c0043a.b == aVar) {
                        c0043a.a();
                        this.f12098a.remove(c0043a);
                    }
                }
            }
        }
    }
}
