package com.applovin.impl;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public interface y1 {
    xo a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i2, long j2, long j3);

        /* renamed from: com.applovin.impl.y1$a$a */
        /* loaded from: classes2.dex */
        public static final class C0102a {

            /* renamed from: a */
            private final CopyOnWriteArrayList f28029a = new CopyOnWriteArrayList();

            /* renamed from: com.applovin.impl.y1$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0103a {

                /* renamed from: a */
                private final Handler f28030a;

                /* renamed from: b */
                private final a f28031b;

                /* renamed from: c */
                private boolean f28032c;

                public C0103a(Handler handler, a aVar) {
                    this.f28030a = handler;
                    this.f28031b = aVar;
                }

                public void a() {
                    this.f28032c = true;
                }
            }

            public void a(Handler handler, a aVar) {
                b1.a(handler);
                b1.a(aVar);
                a(aVar);
                this.f28029a.add(new C0103a(handler, aVar));
            }

            public void a(int i2, long j2, long j3) {
                Iterator it = this.f28029a.iterator();
                while (it.hasNext()) {
                    C0103a c0103a = (C0103a) it.next();
                    if (!c0103a.f28032c) {
                        c0103a.f28030a.post(new qw(c0103a, i2, j2, j3, 0));
                    }
                }
            }

            public static /* synthetic */ void a(C0103a c0103a, int i2, long j2, long j3) {
                c0103a.f28031b.a(i2, j2, j3);
            }

            public void a(a aVar) {
                Iterator it = this.f28029a.iterator();
                while (it.hasNext()) {
                    C0103a c0103a = (C0103a) it.next();
                    if (c0103a.f28031b == aVar) {
                        c0103a.a();
                        this.f28029a.remove(c0103a);
                    }
                }
            }
        }
    }
}
