package com.applovin.impl;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface x1 {
    yo a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, long j3, long j10);

        /* renamed from: com.applovin.impl.x1$a$a */
        /* loaded from: classes.dex */
        public static final class C0042a {
            private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

            /* renamed from: com.applovin.impl.x1$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0043a {
                private final Handler a;

                /* renamed from: b */
                private final a f8904b;

                /* renamed from: c */
                private boolean f8905c;

                public C0043a(Handler handler, a aVar) {
                    this.a = handler;
                    this.f8904b = aVar;
                }

                public void a() {
                    this.f8905c = true;
                }
            }

            public void a(Handler handler, a aVar) {
                a1.a(handler);
                a1.a(aVar);
                a(aVar);
                this.a.add(new C0043a(handler, aVar));
            }

            public void a(int i10, long j3, long j10) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    C0043a c0043a = (C0043a) it.next();
                    if (!c0043a.f8905c) {
                        c0043a.a.post(new dw(c0043a, i10, j3, j10, 0));
                    }
                }
            }

            public static /* synthetic */ void a(C0043a c0043a, int i10, long j3, long j10) {
                c0043a.f8904b.a(i10, j3, j10);
            }

            public void a(a aVar) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    C0043a c0043a = (C0043a) it.next();
                    if (c0043a.f8904b == aVar) {
                        c0043a.a();
                        this.a.remove(c0043a);
                    }
                }
            }
        }
    }
}
