package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.nh;
import com.applovin.impl.wd;
import java.io.IOException;

/* renamed from: com.applovin.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0746s0 {

    /* renamed from: com.applovin.impl.s0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f10541a;
        public final go b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10542c;

        /* renamed from: d, reason: collision with root package name */
        public final wd.a f10543d;

        /* renamed from: e, reason: collision with root package name */
        public final long f10544e;

        /* renamed from: f, reason: collision with root package name */
        public final go f10545f;

        /* renamed from: g, reason: collision with root package name */
        public final int f10546g;

        /* renamed from: h, reason: collision with root package name */
        public final wd.a f10547h;

        /* renamed from: i, reason: collision with root package name */
        public final long f10548i;

        /* renamed from: j, reason: collision with root package name */
        public final long f10549j;

        public a(long j7, go goVar, int i9, wd.a aVar, long j9, go goVar2, int i10, wd.a aVar2, long j10, long j11) {
            this.f10541a = j7;
            this.b = goVar;
            this.f10542c = i9;
            this.f10543d = aVar;
            this.f10544e = j9;
            this.f10545f = goVar2;
            this.f10546g = i10;
            this.f10547h = aVar2;
            this.f10548i = j10;
            this.f10549j = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f10541a == aVar.f10541a && this.f10542c == aVar.f10542c && this.f10544e == aVar.f10544e && this.f10546g == aVar.f10546g && this.f10548i == aVar.f10548i && this.f10549j == aVar.f10549j && Objects.equal(this.b, aVar.b) && Objects.equal(this.f10543d, aVar.f10543d) && Objects.equal(this.f10545f, aVar.f10545f) && Objects.equal(this.f10547h, aVar.f10547h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f10541a), this.b, Integer.valueOf(this.f10542c), this.f10543d, Long.valueOf(this.f10544e), this.f10545f, Integer.valueOf(this.f10546g), this.f10547h, Long.valueOf(this.f10548i), Long.valueOf(this.f10549j));
        }
    }

    /* renamed from: com.applovin.impl.s0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final z8 f10550a;
        private final SparseArray b;

        public b(z8 z8Var, SparseArray sparseArray) {
            this.f10550a = z8Var;
            SparseArray sparseArray2 = new SparseArray(z8Var.a());
            for (int i9 = 0; i9 < z8Var.a(); i9++) {
                int b = z8Var.b(i9);
                sparseArray2.append(b, (a) AbstractC0669a1.a((a) sparseArray.get(b)));
            }
            this.b = sparseArray2;
        }
    }

    void a(nh nhVar, b bVar);

    void a(a aVar);

    void a(a aVar, float f9);

    void a(a aVar, int i9);

    void a(a aVar, int i9, int i10);

    void a(a aVar, int i9, int i10, int i11, float f9);

    void a(a aVar, int i9, long j7);

    void a(a aVar, int i9, long j7, long j9);

    void a(a aVar, int i9, d9 d9Var);

    void a(a aVar, int i9, l5 l5Var);

    void a(a aVar, int i9, String str, long j7);

    void a(a aVar, long j7);

    void a(a aVar, long j7, int i9);

    void a(a aVar, d9 d9Var);

    void a(a aVar, d9 d9Var, o5 o5Var);

    void a(a aVar, ic icVar, pd pdVar);

    void a(a aVar, ic icVar, pd pdVar, IOException iOException, boolean z8);

    void a(a aVar, kh khVar);

    void a(a aVar, l5 l5Var);

    void a(a aVar, mh mhVar);

    void a(a aVar, nh.b bVar);

    void a(a aVar, nh.f fVar, nh.f fVar2, int i9);

    void a(a aVar, od odVar, int i9);

    void a(a aVar, pd pdVar);

    void a(a aVar, qd qdVar);

    void a(a aVar, qo qoVar, uo uoVar);

    void a(a aVar, we weVar);

    void a(a aVar, yq yqVar);

    void a(a aVar, Exception exc);

    void a(a aVar, Object obj, long j7);

    void a(a aVar, String str);

    void a(a aVar, String str, long j7);

    void a(a aVar, String str, long j7, long j9);

    void a(a aVar, boolean z8);

    void a(a aVar, boolean z8, int i9);

    void b(a aVar);

    void b(a aVar, int i9);

    void b(a aVar, int i9, long j7, long j9);

    void b(a aVar, int i9, l5 l5Var);

    void b(a aVar, d9 d9Var);

    void b(a aVar, d9 d9Var, o5 o5Var);

    void b(a aVar, ic icVar, pd pdVar);

    void b(a aVar, l5 l5Var);

    void b(a aVar, Exception exc);

    void b(a aVar, String str);

    void b(a aVar, String str, long j7);

    void b(a aVar, String str, long j7, long j9);

    void b(a aVar, boolean z8);

    void b(a aVar, boolean z8, int i9);

    void c(a aVar);

    void c(a aVar, int i9);

    void c(a aVar, ic icVar, pd pdVar);

    void c(a aVar, l5 l5Var);

    void c(a aVar, Exception exc);

    void c(a aVar, boolean z8);

    void d(a aVar);

    void d(a aVar, int i9);

    void d(a aVar, l5 l5Var);

    void d(a aVar, Exception exc);

    void d(a aVar, boolean z8);

    void e(a aVar);

    void e(a aVar, int i9);

    void e(a aVar, boolean z8);

    void f(a aVar);

    void f(a aVar, int i9);

    void g(a aVar);

    void h(a aVar);
}
