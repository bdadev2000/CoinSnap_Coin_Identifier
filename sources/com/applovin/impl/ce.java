package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public interface ce {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public final int f23269a;

        /* renamed from: b */
        public final be.a f23270b;

        /* renamed from: c */
        private final CopyOnWriteArrayList f23271c;
        private final long d;

        /* renamed from: com.applovin.impl.ce$a$a */
        /* loaded from: classes2.dex */
        public static final class C0077a {

            /* renamed from: a */
            public Handler f23272a;

            /* renamed from: b */
            public ce f23273b;

            public C0077a(Handler handler, ce ceVar) {
                this.f23272a = handler;
                this.f23273b = ceVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i2, be.a aVar, long j2) {
            this.f23271c = copyOnWriteArrayList;
            this.f23269a = i2;
            this.f23270b = aVar;
            this.d = j2;
        }

        public /* synthetic */ void b(ce ceVar, nc ncVar, ud udVar) {
            ceVar.c(this.f23269a, this.f23270b, ncVar, udVar);
        }

        public /* synthetic */ void c(ce ceVar, nc ncVar, ud udVar) {
            ceVar.b(this.f23269a, this.f23270b, ncVar, udVar);
        }

        public void a(Handler handler, ce ceVar) {
            b1.a(handler);
            b1.a(ceVar);
            this.f23271c.add(new C0077a(handler, ceVar));
        }

        public void b(nc ncVar, int i2, int i3, f9 f9Var, int i4, Object obj, long j2, long j3) {
            b(ncVar, new ud(i2, i3, f9Var, i4, obj, a(j2), a(j3)));
        }

        public void c(nc ncVar, int i2, int i3, f9 f9Var, int i4, Object obj, long j2, long j3) {
            c(ncVar, new ud(i2, i3, f9Var, i4, obj, a(j2), a(j3)));
        }

        private long a(long j2) {
            long b2 = t2.b(j2);
            if (b2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + b2;
        }

        public void a(int i2, f9 f9Var, int i3, Object obj, long j2) {
            a(new ud(1, i2, f9Var, i3, obj, a(j2), -9223372036854775807L));
        }

        public void b(nc ncVar, ud udVar) {
            Iterator it = this.f23271c.iterator();
            while (it.hasNext()) {
                C0077a c0077a = (C0077a) it.next();
                xp.a(c0077a.f23272a, (Runnable) new bt(this, c0077a.f23273b, ncVar, udVar, 2));
            }
        }

        public void c(nc ncVar, ud udVar) {
            Iterator it = this.f23271c.iterator();
            while (it.hasNext()) {
                C0077a c0077a = (C0077a) it.next();
                xp.a(c0077a.f23272a, (Runnable) new bt(this, c0077a.f23273b, ncVar, udVar, 1));
            }
        }

        public void a(ud udVar) {
            Iterator it = this.f23271c.iterator();
            while (it.hasNext()) {
                C0077a c0077a = (C0077a) it.next();
                xp.a(c0077a.f23272a, (Runnable) new ks(this, 2, c0077a.f23273b, udVar));
            }
        }

        public /* synthetic */ void a(ce ceVar, ud udVar) {
            ceVar.a(this.f23269a, this.f23270b, udVar);
        }

        public /* synthetic */ void a(ce ceVar, nc ncVar, ud udVar) {
            ceVar.a(this.f23269a, this.f23270b, ncVar, udVar);
        }

        public /* synthetic */ void a(ce ceVar, nc ncVar, ud udVar, IOException iOException, boolean z2) {
            ceVar.a(this.f23269a, this.f23270b, ncVar, udVar, iOException, z2);
        }

        public void a(nc ncVar, int i2, int i3, f9 f9Var, int i4, Object obj, long j2, long j3) {
            a(ncVar, new ud(i2, i3, f9Var, i4, obj, a(j2), a(j3)));
        }

        public void a(nc ncVar, ud udVar) {
            Iterator it = this.f23271c.iterator();
            while (it.hasNext()) {
                C0077a c0077a = (C0077a) it.next();
                xp.a(c0077a.f23272a, (Runnable) new bt(this, c0077a.f23273b, ncVar, udVar, 0));
            }
        }

        public void a(nc ncVar, int i2, int i3, f9 f9Var, int i4, Object obj, long j2, long j3, IOException iOException, boolean z2) {
            a(ncVar, new ud(i2, i3, f9Var, i4, obj, a(j2), a(j3)), iOException, z2);
        }

        public void a(final nc ncVar, final ud udVar, final IOException iOException, final boolean z2) {
            Iterator it = this.f23271c.iterator();
            while (it.hasNext()) {
                C0077a c0077a = (C0077a) it.next();
                final ce ceVar = c0077a.f23273b;
                xp.a(c0077a.f23272a, new Runnable() { // from class: com.applovin.impl.ct
                    @Override // java.lang.Runnable
                    public final void run() {
                        ce.a.this.a(ceVar, ncVar, udVar, iOException, z2);
                    }
                });
            }
        }

        public void a(ce ceVar) {
            Iterator it = this.f23271c.iterator();
            while (it.hasNext()) {
                C0077a c0077a = (C0077a) it.next();
                if (c0077a.f23273b == ceVar) {
                    this.f23271c.remove(c0077a);
                }
            }
        }

        public a a(int i2, be.a aVar, long j2) {
            return new a(this.f23271c, i2, aVar, j2);
        }
    }

    void a(int i2, be.a aVar, nc ncVar, ud udVar);

    void a(int i2, be.a aVar, nc ncVar, ud udVar, IOException iOException, boolean z2);

    void a(int i2, be.a aVar, ud udVar);

    void b(int i2, be.a aVar, nc ncVar, ud udVar);

    void c(int i2, be.a aVar, nc ncVar, ud udVar);
}
