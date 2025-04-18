package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.be;
import com.applovin.impl.qh;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface s0 {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f26393a;

        /* renamed from: b, reason: collision with root package name */
        public final fo f26394b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26395c;
        public final be.a d;
        public final long e;

        /* renamed from: f, reason: collision with root package name */
        public final fo f26396f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26397g;

        /* renamed from: h, reason: collision with root package name */
        public final be.a f26398h;

        /* renamed from: i, reason: collision with root package name */
        public final long f26399i;

        /* renamed from: j, reason: collision with root package name */
        public final long f26400j;

        public a(long j2, fo foVar, int i2, be.a aVar, long j3, fo foVar2, int i3, be.a aVar2, long j4, long j5) {
            this.f26393a = j2;
            this.f26394b = foVar;
            this.f26395c = i2;
            this.d = aVar;
            this.e = j3;
            this.f26396f = foVar2;
            this.f26397g = i3;
            this.f26398h = aVar2;
            this.f26399i = j4;
            this.f26400j = j5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26393a == aVar.f26393a && this.f26395c == aVar.f26395c && this.e == aVar.e && this.f26397g == aVar.f26397g && this.f26399i == aVar.f26399i && this.f26400j == aVar.f26400j && Objects.equal(this.f26394b, aVar.f26394b) && Objects.equal(this.d, aVar.d) && Objects.equal(this.f26396f, aVar.f26396f) && Objects.equal(this.f26398h, aVar.f26398h);
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f26393a), this.f26394b, Integer.valueOf(this.f26395c), this.d, Long.valueOf(this.e), this.f26396f, Integer.valueOf(this.f26397g), this.f26398h, Long.valueOf(this.f26399i), Long.valueOf(this.f26400j));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final b9 f26401a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray f26402b;

        public b(b9 b9Var, SparseArray sparseArray) {
            this.f26401a = b9Var;
            SparseArray sparseArray2 = new SparseArray(b9Var.a());
            for (int i2 = 0; i2 < b9Var.a(); i2++) {
                int b2 = b9Var.b(i2);
                sparseArray2.append(b2, (a) b1.a((a) sparseArray.get(b2)));
            }
            this.f26402b = sparseArray2;
        }
    }

    void a(qh qhVar, b bVar);

    void a(a aVar);

    void a(a aVar, float f2);

    void a(a aVar, int i2);

    void a(a aVar, int i2, int i3);

    void a(a aVar, int i2, int i3, int i4, float f2);

    void a(a aVar, int i2, long j2);

    void a(a aVar, int i2, long j2, long j3);

    void a(a aVar, int i2, f9 f9Var);

    void a(a aVar, int i2, n5 n5Var);

    void a(a aVar, int i2, String str, long j2);

    void a(a aVar, long j2);

    void a(a aVar, long j2, int i2);

    void a(a aVar, bf bfVar);

    void a(a aVar, f9 f9Var);

    void a(a aVar, f9 f9Var, q5 q5Var);

    void a(a aVar, n5 n5Var);

    void a(a aVar, nc ncVar, ud udVar);

    void a(a aVar, nc ncVar, ud udVar, IOException iOException, boolean z2);

    void a(a aVar, nh nhVar);

    void a(a aVar, ph phVar);

    void a(a aVar, po poVar, to toVar);

    void a(a aVar, qh.b bVar);

    void a(a aVar, qh.f fVar, qh.f fVar2, int i2);

    void a(a aVar, td tdVar, int i2);

    void a(a aVar, ud udVar);

    void a(a aVar, vd vdVar);

    void a(a aVar, xq xqVar);

    void a(a aVar, Exception exc);

    void a(a aVar, Object obj, long j2);

    void a(a aVar, String str);

    void a(a aVar, String str, long j2);

    void a(a aVar, String str, long j2, long j3);

    void a(a aVar, boolean z2);

    void a(a aVar, boolean z2, int i2);

    void b(a aVar);

    void b(a aVar, int i2);

    void b(a aVar, int i2, long j2, long j3);

    void b(a aVar, int i2, n5 n5Var);

    void b(a aVar, f9 f9Var);

    void b(a aVar, f9 f9Var, q5 q5Var);

    void b(a aVar, n5 n5Var);

    void b(a aVar, nc ncVar, ud udVar);

    void b(a aVar, Exception exc);

    void b(a aVar, String str);

    void b(a aVar, String str, long j2);

    void b(a aVar, String str, long j2, long j3);

    void b(a aVar, boolean z2);

    void b(a aVar, boolean z2, int i2);

    void c(a aVar);

    void c(a aVar, int i2);

    void c(a aVar, n5 n5Var);

    void c(a aVar, nc ncVar, ud udVar);

    void c(a aVar, Exception exc);

    void c(a aVar, boolean z2);

    void d(a aVar);

    void d(a aVar, int i2);

    void d(a aVar, n5 n5Var);

    void d(a aVar, Exception exc);

    void d(a aVar, boolean z2);

    void e(a aVar);

    void e(a aVar, int i2);

    void e(a aVar, boolean z2);

    void f(a aVar);

    void f(a aVar, int i2);

    void g(a aVar);

    void h(a aVar);
}
