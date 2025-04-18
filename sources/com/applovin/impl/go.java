package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.impl.ab;
import com.applovin.impl.m2;
import com.applovin.impl.od;
import com.applovin.impl.u;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public abstract class go implements m2 {
    public static final go a = new a();

    /* renamed from: b */
    public static final m2.a f4955b = new ss(15);

    /* loaded from: classes.dex */
    public class a extends go {
        @Override // com.applovin.impl.go
        public int a() {
            return 0;
        }

        @Override // com.applovin.impl.go
        public int b() {
            return 0;
        }

        @Override // com.applovin.impl.go
        public int a(Object obj) {
            return -1;
        }

        @Override // com.applovin.impl.go
        public Object b(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.go
        public d a(int i10, d dVar, long j3) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.go
        public b a(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements m2 {

        /* renamed from: i */
        public static final m2.a f4956i = new ss(16);
        public Object a;

        /* renamed from: b */
        public Object f4957b;

        /* renamed from: c */
        public int f4958c;

        /* renamed from: d */
        public long f4959d;

        /* renamed from: f */
        public long f4960f;

        /* renamed from: g */
        public boolean f4961g;

        /* renamed from: h */
        private u f4962h = u.f8304h;

        public static /* synthetic */ b b(Bundle bundle) {
            return a(bundle);
        }

        private static String g(int i10) {
            return Integer.toString(i10, 36);
        }

        public long c(int i10) {
            return this.f4962h.a(i10).f8317g;
        }

        public int d(int i10) {
            return this.f4962h.a(i10).a();
        }

        public long e() {
            return this.f4960f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (yp.a(this.a, bVar.a) && yp.a(this.f4957b, bVar.f4957b) && this.f4958c == bVar.f4958c && this.f4959d == bVar.f4959d && this.f4960f == bVar.f4960f && this.f4961g == bVar.f4961g && yp.a(this.f4962h, bVar.f4962h)) {
                return true;
            }
            return false;
        }

        public int f() {
            return this.f4962h.f8310f;
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.a;
            int i10 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i11 = (hashCode + 217) * 31;
            Object obj2 = this.f4957b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            int i12 = (((i11 + i10) * 31) + this.f4958c) * 31;
            long j3 = this.f4959d;
            int i13 = (i12 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j10 = this.f4960f;
            return this.f4962h.hashCode() + ((((i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f4961g ? 1 : 0)) * 31);
        }

        public static b a(Bundle bundle) {
            u uVar;
            int i10 = bundle.getInt(g(0), 0);
            long j3 = bundle.getLong(g(1), C.TIME_UNSET);
            long j10 = bundle.getLong(g(2), 0L);
            boolean z10 = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                uVar = (u) u.f8306j.a(bundle2);
            } else {
                uVar = u.f8304h;
            }
            u uVar2 = uVar;
            b bVar = new b();
            bVar.a(null, null, i10, j3, j10, uVar2, z10);
            return bVar;
        }

        public int b(long j3) {
            return this.f4962h.b(j3, this.f4959d);
        }

        public long c() {
            return this.f4959d;
        }

        public long d() {
            return r2.b(this.f4960f);
        }

        public boolean e(int i10) {
            return !this.f4962h.a(i10).b();
        }

        public boolean f(int i10) {
            return this.f4962h.a(i10).f8318h;
        }

        public long b(int i10) {
            return this.f4962h.a(i10).a;
        }

        public long b() {
            return this.f4962h.f8308c;
        }

        public int b(int i10, int i11) {
            return this.f4962h.a(i10).a(i11);
        }

        public int a(int i10) {
            return this.f4962h.a(i10).f8313b;
        }

        public long a(int i10, int i11) {
            u.a a = this.f4962h.a(i10);
            return a.f8313b != -1 ? a.f8316f[i11] : C.TIME_UNSET;
        }

        public int a() {
            return this.f4962h.f8307b;
        }

        public int a(long j3) {
            return this.f4962h.a(j3, this.f4959d);
        }

        public b a(Object obj, Object obj2, int i10, long j3, long j10) {
            return a(obj, obj2, i10, j3, j10, u.f8304h, false);
        }

        public b a(Object obj, Object obj2, int i10, long j3, long j10, u uVar, boolean z10) {
            this.a = obj;
            this.f4957b = obj2;
            this.f4958c = i10;
            this.f4959d = j3;
            this.f4960f = j10;
            this.f4962h = uVar;
            this.f4961g = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements m2 {

        /* renamed from: s */
        public static final Object f4967s = new Object();

        /* renamed from: t */
        private static final Object f4968t = new Object();
        private static final od u = new od.c().b("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: v */
        public static final m2.a f4969v = new ss(17);

        /* renamed from: b */
        public Object f4970b;

        /* renamed from: d */
        public Object f4972d;

        /* renamed from: f */
        public long f4973f;

        /* renamed from: g */
        public long f4974g;

        /* renamed from: h */
        public long f4975h;

        /* renamed from: i */
        public boolean f4976i;

        /* renamed from: j */
        public boolean f4977j;

        /* renamed from: k */
        public boolean f4978k;

        /* renamed from: l */
        public od.f f4979l;

        /* renamed from: m */
        public boolean f4980m;

        /* renamed from: n */
        public long f4981n;

        /* renamed from: o */
        public long f4982o;

        /* renamed from: p */
        public int f4983p;

        /* renamed from: q */
        public int f4984q;

        /* renamed from: r */
        public long f4985r;
        public Object a = f4967s;

        /* renamed from: c */
        public od f4971c = u;

        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            od odVar = bundle2 != null ? (od) od.f6476h.a(bundle2) : null;
            long j3 = bundle.getLong(a(2), C.TIME_UNSET);
            long j10 = bundle.getLong(a(3), C.TIME_UNSET);
            long j11 = bundle.getLong(a(4), C.TIME_UNSET);
            boolean z10 = bundle.getBoolean(a(5), false);
            boolean z11 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            od.f fVar = bundle3 != null ? (od.f) od.f.f6515h.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(a(8), false);
            long j12 = bundle.getLong(a(9), 0L);
            long j13 = bundle.getLong(a(10), C.TIME_UNSET);
            int i10 = bundle.getInt(a(11), 0);
            int i11 = bundle.getInt(a(12), 0);
            long j14 = bundle.getLong(a(13), 0L);
            d dVar = new d();
            dVar.a(f4968t, odVar, null, j3, j10, j11, z10, z11, fVar, j12, j13, i10, i11, j14);
            dVar.f4980m = z12;
            return dVar;
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return a(bundle);
        }

        public long c() {
            return this.f4981n;
        }

        public long d() {
            return r2.b(this.f4982o);
        }

        public boolean e() {
            boolean z10;
            boolean z11;
            boolean z12 = this.f4978k;
            if (this.f4979l != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            a1.b(z11);
            if (this.f4979l != null) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            if (yp.a(this.a, dVar.a) && yp.a(this.f4971c, dVar.f4971c) && yp.a(this.f4972d, dVar.f4972d) && yp.a(this.f4979l, dVar.f4979l) && this.f4973f == dVar.f4973f && this.f4974g == dVar.f4974g && this.f4975h == dVar.f4975h && this.f4976i == dVar.f4976i && this.f4977j == dVar.f4977j && this.f4980m == dVar.f4980m && this.f4981n == dVar.f4981n && this.f4982o == dVar.f4982o && this.f4983p == dVar.f4983p && this.f4984q == dVar.f4984q && this.f4985r == dVar.f4985r) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.f4971c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f4972d;
            int i10 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i11 = (hashCode2 + hashCode) * 31;
            od.f fVar = this.f4979l;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            int i12 = (i11 + i10) * 31;
            long j3 = this.f4973f;
            int i13 = (i12 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j10 = this.f4974g;
            int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f4975h;
            int i15 = (((((((i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f4976i ? 1 : 0)) * 31) + (this.f4977j ? 1 : 0)) * 31) + (this.f4980m ? 1 : 0)) * 31;
            long j12 = this.f4981n;
            int i16 = (i15 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f4982o;
            int i17 = (((((i16 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f4983p) * 31) + this.f4984q) * 31;
            long j14 = this.f4985r;
            return i17 + ((int) (j14 ^ (j14 >>> 32)));
        }

        public long b() {
            return r2.b(this.f4981n);
        }

        public long a() {
            return yp.a(this.f4975h);
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public d a(Object obj, od odVar, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, od.f fVar, long j12, long j13, int i10, int i11, long j14) {
            od.g gVar;
            this.a = obj;
            this.f4971c = odVar != null ? odVar : u;
            this.f4970b = (odVar == null || (gVar = odVar.f6477b) == null) ? null : gVar.f6529g;
            this.f4972d = obj2;
            this.f4973f = j3;
            this.f4974g = j10;
            this.f4975h = j11;
            this.f4976i = z10;
            this.f4977j = z11;
            this.f4978k = fVar != null;
            this.f4979l = fVar;
            this.f4981n = j12;
            this.f4982o = j13;
            this.f4983p = i10;
            this.f4984q = i11;
            this.f4985r = j14;
            this.f4980m = false;
            return this;
        }
    }

    public static go a(Bundle bundle) {
        ab a10 = a(d.f4969v, l2.a(bundle, c(0)));
        ab a11 = a(b.f4956i, l2.a(bundle, c(1)));
        int[] intArray = bundle.getIntArray(c(2));
        if (intArray == null) {
            intArray = a(a10.size());
        }
        return new c(a10, a11, intArray);
    }

    public static /* synthetic */ go b(Bundle bundle) {
        return a(bundle);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i10, b bVar, boolean z10);

    public abstract d a(int i10, d dVar, long j3);

    public abstract int b();

    public abstract Object b(int i10);

    public final boolean c() {
        return b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        if (goVar.b() != b() || goVar.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < b(); i10++) {
            if (!a(i10, dVar).equals(goVar.a(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < a(); i11++) {
            if (!a(i11, bVar, true).equals(goVar.a(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int b3 = b() + 217;
        for (int i10 = 0; i10 < b(); i10++) {
            b3 = (b3 * 31) + a(i10, dVar).hashCode();
        }
        int a10 = a() + (b3 * 31);
        for (int i11 = 0; i11 < a(); i11++) {
            a10 = (a10 * 31) + a(i11, bVar, true).hashCode();
        }
        return a10;
    }

    /* loaded from: classes.dex */
    public static final class c extends go {

        /* renamed from: c */
        private final ab f4963c;

        /* renamed from: d */
        private final ab f4964d;

        /* renamed from: f */
        private final int[] f4965f;

        /* renamed from: g */
        private final int[] f4966g;

        public c(ab abVar, ab abVar2, int[] iArr) {
            boolean z10;
            if (abVar.size() == iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1.a(z10);
            this.f4963c = abVar;
            this.f4964d = abVar2;
            this.f4965f = iArr;
            this.f4966g = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f4966g[iArr[i10]] = i10;
            }
        }

        @Override // com.applovin.impl.go
        public int a(boolean z10) {
            if (c()) {
                return -1;
            }
            if (z10) {
                return this.f4965f[0];
            }
            return 0;
        }

        @Override // com.applovin.impl.go
        public int b(boolean z10) {
            if (c()) {
                return -1;
            }
            if (z10) {
                return this.f4965f[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.impl.go
        public int a(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != b(z10)) {
                return z10 ? this.f4965f[this.f4966g[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        }

        @Override // com.applovin.impl.go
        public int b(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != a(z10)) {
                return z10 ? this.f4965f[this.f4966g[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return b(z10);
            }
            return -1;
        }

        @Override // com.applovin.impl.go
        public b a(int i10, b bVar, boolean z10) {
            b bVar2 = (b) this.f4964d.get(i10);
            bVar.a(bVar2.a, bVar2.f4957b, bVar2.f4958c, bVar2.f4959d, bVar2.f4960f, bVar2.f4962h, bVar2.f4961g);
            return bVar;
        }

        @Override // com.applovin.impl.go
        public int b() {
            return this.f4963c.size();
        }

        @Override // com.applovin.impl.go
        public Object b(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.impl.go
        public int a() {
            return this.f4964d.size();
        }

        @Override // com.applovin.impl.go
        public d a(int i10, d dVar, long j3) {
            d dVar2 = (d) this.f4963c.get(i10);
            dVar.a(dVar2.a, dVar2.f4971c, dVar2.f4972d, dVar2.f4973f, dVar2.f4974g, dVar2.f4975h, dVar2.f4976i, dVar2.f4977j, dVar2.f4979l, dVar2.f4981n, dVar2.f4982o, dVar2.f4983p, dVar2.f4984q, dVar2.f4985r);
            dVar.f4980m = dVar2.f4980m;
            return dVar;
        }

        @Override // com.applovin.impl.go
        public int a(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public final boolean b(int i10, b bVar, d dVar, int i11, boolean z10) {
        return a(i10, bVar, dVar, i11, z10) == -1;
    }

    private static ab a(m2.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return ab.h();
        }
        ab.a aVar2 = new ab.a();
        ab a10 = k2.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.b(aVar.a((Bundle) a10.get(i10)));
        }
        return aVar2.a();
    }

    private static int[] a(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int a(boolean z10) {
        return c() ? -1 : 0;
    }

    public final int a(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = a(i10, bVar).f4958c;
        if (a(i12, dVar).f4984q != i10) {
            return i10 + 1;
        }
        int a10 = a(i12, i11, z10);
        if (a10 == -1) {
            return -1;
        }
        return a(a10, dVar).f4983p;
    }

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == b(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == b(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b a(int i10, b bVar) {
        return a(i10, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair a(d dVar, b bVar, int i10, long j3) {
        return (Pair) a1.a(a(dVar, bVar, i10, j3, 0L));
    }

    public final Pair a(d dVar, b bVar, int i10, long j3, long j10) {
        a1.a(i10, 0, b());
        a(i10, dVar, j10);
        if (j3 == C.TIME_UNSET) {
            j3 = dVar.c();
            if (j3 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = dVar.f4983p;
        a(i11, bVar);
        while (i11 < dVar.f4984q && bVar.f4960f != j3) {
            int i12 = i11 + 1;
            if (a(i12, bVar).f4960f > j3) {
                break;
            }
            i11 = i12;
        }
        a(i11, bVar, true);
        long j11 = j3 - bVar.f4960f;
        long j12 = bVar.f4959d;
        if (j12 != C.TIME_UNSET) {
            j11 = Math.min(j11, j12 - 1);
        }
        return Pair.create(a1.a(bVar.f4957b), Long.valueOf(Math.max(0L, j11)));
    }

    public final d a(int i10, d dVar) {
        return a(i10, dVar, 0L);
    }
}
