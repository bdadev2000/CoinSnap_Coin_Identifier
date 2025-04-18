package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.nh;
import com.applovin.impl.wd;
import java.io.IOException;

/* loaded from: classes.dex */
public interface s0 {

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final go f7416b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7417c;

        /* renamed from: d, reason: collision with root package name */
        public final wd.a f7418d;

        /* renamed from: e, reason: collision with root package name */
        public final long f7419e;

        /* renamed from: f, reason: collision with root package name */
        public final go f7420f;

        /* renamed from: g, reason: collision with root package name */
        public final int f7421g;

        /* renamed from: h, reason: collision with root package name */
        public final wd.a f7422h;

        /* renamed from: i, reason: collision with root package name */
        public final long f7423i;

        /* renamed from: j, reason: collision with root package name */
        public final long f7424j;

        public a(long j3, go goVar, int i10, wd.a aVar, long j10, go goVar2, int i11, wd.a aVar2, long j11, long j12) {
            this.a = j3;
            this.f7416b = goVar;
            this.f7417c = i10;
            this.f7418d = aVar;
            this.f7419e = j10;
            this.f7420f = goVar2;
            this.f7421g = i11;
            this.f7422h = aVar2;
            this.f7423i = j11;
            this.f7424j = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f7417c == aVar.f7417c && this.f7419e == aVar.f7419e && this.f7421g == aVar.f7421g && this.f7423i == aVar.f7423i && this.f7424j == aVar.f7424j && Objects.equal(this.f7416b, aVar.f7416b) && Objects.equal(this.f7418d, aVar.f7418d) && Objects.equal(this.f7420f, aVar.f7420f) && Objects.equal(this.f7422h, aVar.f7422h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.a), this.f7416b, Integer.valueOf(this.f7417c), this.f7418d, Long.valueOf(this.f7419e), this.f7420f, Integer.valueOf(this.f7421g), this.f7422h, Long.valueOf(this.f7423i), Long.valueOf(this.f7424j));
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final z8 a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray f7425b;

        public b(z8 z8Var, SparseArray sparseArray) {
            this.a = z8Var;
            SparseArray sparseArray2 = new SparseArray(z8Var.a());
            for (int i10 = 0; i10 < z8Var.a(); i10++) {
                int b3 = z8Var.b(i10);
                sparseArray2.append(b3, (a) a1.a((a) sparseArray.get(b3)));
            }
            this.f7425b = sparseArray2;
        }
    }

    void a(nh nhVar, b bVar);

    void a(a aVar);

    void a(a aVar, float f10);

    void a(a aVar, int i10);

    void a(a aVar, int i10, int i11);

    void a(a aVar, int i10, int i11, int i12, float f10);

    void a(a aVar, int i10, long j3);

    void a(a aVar, int i10, long j3, long j10);

    void a(a aVar, int i10, d9 d9Var);

    void a(a aVar, int i10, l5 l5Var);

    void a(a aVar, int i10, String str, long j3);

    void a(a aVar, long j3);

    void a(a aVar, long j3, int i10);

    void a(a aVar, d9 d9Var);

    void a(a aVar, d9 d9Var, o5 o5Var);

    void a(a aVar, ic icVar, pd pdVar);

    void a(a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10);

    void a(a aVar, kh khVar);

    void a(a aVar, l5 l5Var);

    void a(a aVar, mh mhVar);

    void a(a aVar, nh.b bVar);

    void a(a aVar, nh.f fVar, nh.f fVar2, int i10);

    void a(a aVar, od odVar, int i10);

    void a(a aVar, pd pdVar);

    void a(a aVar, qd qdVar);

    void a(a aVar, qo qoVar, uo uoVar);

    void a(a aVar, we weVar);

    void a(a aVar, yq yqVar);

    void a(a aVar, Exception exc);

    void a(a aVar, Object obj, long j3);

    void a(a aVar, String str);

    void a(a aVar, String str, long j3);

    void a(a aVar, String str, long j3, long j10);

    void a(a aVar, boolean z10);

    void a(a aVar, boolean z10, int i10);

    void b(a aVar);

    void b(a aVar, int i10);

    void b(a aVar, int i10, long j3, long j10);

    void b(a aVar, int i10, l5 l5Var);

    void b(a aVar, d9 d9Var);

    void b(a aVar, d9 d9Var, o5 o5Var);

    void b(a aVar, ic icVar, pd pdVar);

    void b(a aVar, l5 l5Var);

    void b(a aVar, Exception exc);

    void b(a aVar, String str);

    void b(a aVar, String str, long j3);

    void b(a aVar, String str, long j3, long j10);

    void b(a aVar, boolean z10);

    void b(a aVar, boolean z10, int i10);

    void c(a aVar);

    void c(a aVar, int i10);

    void c(a aVar, ic icVar, pd pdVar);

    void c(a aVar, l5 l5Var);

    void c(a aVar, Exception exc);

    void c(a aVar, boolean z10);

    void d(a aVar);

    void d(a aVar, int i10);

    void d(a aVar, l5 l5Var);

    void d(a aVar, Exception exc);

    void d(a aVar, boolean z10);

    void e(a aVar);

    void e(a aVar, int i10);

    void e(a aVar, boolean z10);

    void f(a aVar);

    void f(a aVar, int i10);

    void g(a aVar);

    void h(a aVar);
}
