package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface xd {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f12171a;
        public final wd.a b;

        /* renamed from: c */
        private final CopyOnWriteArrayList f12172c;

        /* renamed from: d */
        private final long f12173d;

        /* renamed from: com.applovin.impl.xd$a$a */
        /* loaded from: classes.dex */
        public static final class C0045a {

            /* renamed from: a */
            public Handler f12174a;
            public xd b;

            public C0045a(Handler handler, xd xdVar) {
                this.f12174a = handler;
                this.b = xdVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i9, wd.a aVar, long j7) {
            this.f12172c = copyOnWriteArrayList;
            this.f12171a = i9;
            this.b = aVar;
            this.f12173d = j7;
        }

        public /* synthetic */ void b(xd xdVar, ic icVar, pd pdVar) {
            xdVar.c(this.f12171a, this.b, icVar, pdVar);
        }

        public /* synthetic */ void c(xd xdVar, ic icVar, pd pdVar) {
            xdVar.b(this.f12171a, this.b, icVar, pdVar);
        }

        public void a(Handler handler, xd xdVar) {
            AbstractC0669a1.a(handler);
            AbstractC0669a1.a(xdVar);
            this.f12172c.add(new C0045a(handler, xdVar));
        }

        public void b(ic icVar, int i9, int i10, d9 d9Var, int i11, Object obj, long j7, long j9) {
            b(icVar, new pd(i9, i10, d9Var, i11, obj, a(j7), a(j9)));
        }

        public void c(ic icVar, int i9, int i10, d9 d9Var, int i11, Object obj, long j7, long j9) {
            c(icVar, new pd(i9, i10, d9Var, i11, obj, a(j7), a(j9)));
        }

        private long a(long j7) {
            long b = AbstractC0744r2.b(j7);
            return b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : this.f12173d + b;
        }

        public void a(int i9, d9 d9Var, int i10, Object obj, long j7) {
            a(new pd(1, i9, d9Var, i10, obj, a(j7), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        }

        public void b(ic icVar, pd pdVar) {
            Iterator it = this.f12172c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.f12174a, (Runnable) new W2(this, c0045a.b, icVar, pdVar, 1));
            }
        }

        public void c(ic icVar, pd pdVar) {
            Iterator it = this.f12172c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.f12174a, (Runnable) new W2(this, c0045a.b, icVar, pdVar, 2));
            }
        }

        public void a(pd pdVar) {
            Iterator it = this.f12172c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.f12174a, (Runnable) new O2(this, c0045a.b, pdVar, 12));
            }
        }

        public /* synthetic */ void a(xd xdVar, pd pdVar) {
            xdVar.a(this.f12171a, this.b, pdVar);
        }

        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar) {
            xdVar.a(this.f12171a, this.b, icVar, pdVar);
        }

        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar, IOException iOException, boolean z8) {
            xdVar.a(this.f12171a, this.b, icVar, pdVar, iOException, z8);
        }

        public void a(ic icVar, int i9, int i10, d9 d9Var, int i11, Object obj, long j7, long j9) {
            a(icVar, new pd(i9, i10, d9Var, i11, obj, a(j7), a(j9)));
        }

        public void a(ic icVar, pd pdVar) {
            Iterator it = this.f12172c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.f12174a, (Runnable) new W2(this, c0045a.b, icVar, pdVar, 0));
            }
        }

        public void a(ic icVar, int i9, int i10, d9 d9Var, int i11, Object obj, long j7, long j9, IOException iOException, boolean z8) {
            a(icVar, new pd(i9, i10, d9Var, i11, obj, a(j7), a(j9)), iOException, z8);
        }

        public void a(final ic icVar, final pd pdVar, final IOException iOException, final boolean z8) {
            Iterator it = this.f12172c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                final xd xdVar = c0045a.b;
                yp.a(c0045a.f12174a, new Runnable() { // from class: com.applovin.impl.V2
                    @Override // java.lang.Runnable
                    public final void run() {
                        xd.a.this.a(xdVar, icVar, pdVar, iOException, z8);
                    }
                });
            }
        }

        public void a(xd xdVar) {
            Iterator it = this.f12172c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                if (c0045a.b == xdVar) {
                    this.f12172c.remove(c0045a);
                }
            }
        }

        public a a(int i9, wd.a aVar, long j7) {
            return new a(this.f12172c, i9, aVar, j7);
        }
    }

    void a(int i9, wd.a aVar, ic icVar, pd pdVar);

    void a(int i9, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z8);

    void a(int i9, wd.a aVar, pd pdVar);

    void b(int i9, wd.a aVar, ic icVar, pd pdVar);

    void c(int i9, wd.a aVar, ic icVar, pd pdVar);
}
