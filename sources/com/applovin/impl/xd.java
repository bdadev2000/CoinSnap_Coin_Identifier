package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface xd {

    /* loaded from: classes.dex */
    public static class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final wd.a f8969b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f8970c;

        /* renamed from: d, reason: collision with root package name */
        private final long f8971d;

        /* renamed from: com.applovin.impl.xd$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0045a {
            public Handler a;

            /* renamed from: b, reason: collision with root package name */
            public xd f8972b;

            public C0045a(Handler handler, xd xdVar) {
                this.a = handler;
                this.f8972b = xdVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, wd.a aVar, long j3) {
            this.f8970c = copyOnWriteArrayList;
            this.a = i10;
            this.f8969b = aVar;
            this.f8971d = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(xd xdVar, ic icVar, pd pdVar) {
            xdVar.c(this.a, this.f8969b, icVar, pdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(xd xdVar, ic icVar, pd pdVar) {
            xdVar.b(this.a, this.f8969b, icVar, pdVar);
        }

        public void a(Handler handler, xd xdVar) {
            a1.a(handler);
            a1.a(xdVar);
            this.f8970c.add(new C0045a(handler, xdVar));
        }

        public void b(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j3, long j10) {
            b(icVar, new pd(i10, i11, d9Var, i12, obj, a(j3), a(j10)));
        }

        public void c(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j3, long j10) {
            c(icVar, new pd(i10, i11, d9Var, i12, obj, a(j3), a(j10)));
        }

        private long a(long j3) {
            long b3 = r2.b(j3);
            return b3 == C.TIME_UNSET ? C.TIME_UNSET : this.f8971d + b3;
        }

        public void a(int i10, d9 d9Var, int i11, Object obj, long j3) {
            a(new pd(1, i10, d9Var, i11, obj, a(j3), C.TIME_UNSET));
        }

        public void b(ic icVar, pd pdVar) {
            Iterator it = this.f8970c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.a, (Runnable) new ew(this, c0045a.f8972b, icVar, pdVar, 1));
            }
        }

        public void c(ic icVar, pd pdVar) {
            Iterator it = this.f8970c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.a, (Runnable) new ew(this, c0045a.f8972b, icVar, pdVar, 2));
            }
        }

        public void a(pd pdVar) {
            Iterator it = this.f8970c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.a, (Runnable) new yv(12, this, c0045a.f8972b, pdVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, pd pdVar) {
            xdVar.a(this.a, this.f8969b, pdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar) {
            xdVar.a(this.a, this.f8969b, icVar, pdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
            xdVar.a(this.a, this.f8969b, icVar, pdVar, iOException, z10);
        }

        public void a(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j3, long j10) {
            a(icVar, new pd(i10, i11, d9Var, i12, obj, a(j3), a(j10)));
        }

        public void a(ic icVar, pd pdVar) {
            Iterator it = this.f8970c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.a, (Runnable) new ew(this, c0045a.f8972b, icVar, pdVar, 0));
            }
        }

        public void a(ic icVar, int i10, int i11, d9 d9Var, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
            a(icVar, new pd(i10, i11, d9Var, i12, obj, a(j3), a(j10)), iOException, z10);
        }

        public void a(ic icVar, pd pdVar, IOException iOException, boolean z10) {
            Iterator it = this.f8970c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                yp.a(c0045a.a, (Runnable) new fw(this, c0045a.f8972b, icVar, pdVar, iOException, z10, 0));
            }
        }

        public void a(xd xdVar) {
            Iterator it = this.f8970c.iterator();
            while (it.hasNext()) {
                C0045a c0045a = (C0045a) it.next();
                if (c0045a.f8972b == xdVar) {
                    this.f8970c.remove(c0045a);
                }
            }
        }

        public a a(int i10, wd.a aVar, long j3) {
            return new a(this.f8970c, i10, aVar, j3);
        }
    }

    void a(int i10, wd.a aVar, ic icVar, pd pdVar);

    void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10);

    void a(int i10, wd.a aVar, pd pdVar);

    void b(int i10, wd.a aVar, ic icVar, pd pdVar);

    void c(int i10, wd.a aVar, ic icVar, pd pdVar);
}
