package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.impl.C0761u;
import com.applovin.impl.InterfaceC0725m2;
import com.applovin.impl.ab;
import com.applovin.impl.od;

/* loaded from: classes.dex */
public abstract class go implements InterfaceC0725m2 {

    /* renamed from: a */
    public static final go f7931a = new a();
    public static final InterfaceC0725m2.a b = new I(16);

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
        public Object b(int i9) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.go
        public d a(int i9, d dVar, long j7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.go
        public b a(int i9, b bVar, boolean z8) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0725m2 {

        /* renamed from: i */
        public static final InterfaceC0725m2.a f7932i = new I(17);

        /* renamed from: a */
        public Object f7933a;
        public Object b;

        /* renamed from: c */
        public int f7934c;

        /* renamed from: d */
        public long f7935d;

        /* renamed from: f */
        public long f7936f;

        /* renamed from: g */
        public boolean f7937g;

        /* renamed from: h */
        private C0761u f7938h = C0761u.f11516h;

        public static /* synthetic */ b b(Bundle bundle) {
            return a(bundle);
        }

        private static String g(int i9) {
            return Integer.toString(i9, 36);
        }

        public long c(int i9) {
            return this.f7938h.a(i9).f11529g;
        }

        public int d(int i9) {
            return this.f7938h.a(i9).a();
        }

        public long e() {
            return this.f7936f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (yp.a(this.f7933a, bVar.f7933a) && yp.a(this.b, bVar.b) && this.f7934c == bVar.f7934c && this.f7935d == bVar.f7935d && this.f7936f == bVar.f7936f && this.f7937g == bVar.f7937g && yp.a(this.f7938h, bVar.f7938h)) {
                return true;
            }
            return false;
        }

        public int f() {
            return this.f7938h.f11522f;
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.f7933a;
            int i9 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i10 = (hashCode + 217) * 31;
            Object obj2 = this.b;
            if (obj2 != null) {
                i9 = obj2.hashCode();
            }
            int i11 = (((i10 + i9) * 31) + this.f7934c) * 31;
            long j7 = this.f7935d;
            int i12 = (i11 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j9 = this.f7936f;
            return this.f7938h.hashCode() + ((((i12 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f7937g ? 1 : 0)) * 31);
        }

        public static b a(Bundle bundle) {
            C0761u c0761u;
            int i9 = bundle.getInt(g(0), 0);
            long j7 = bundle.getLong(g(1), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            long j9 = bundle.getLong(g(2), 0L);
            boolean z8 = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                c0761u = (C0761u) C0761u.f11518j.a(bundle2);
            } else {
                c0761u = C0761u.f11516h;
            }
            C0761u c0761u2 = c0761u;
            b bVar = new b();
            bVar.a(null, null, i9, j7, j9, c0761u2, z8);
            return bVar;
        }

        public int b(long j7) {
            return this.f7938h.b(j7, this.f7935d);
        }

        public long c() {
            return this.f7935d;
        }

        public long d() {
            return AbstractC0744r2.b(this.f7936f);
        }

        public boolean e(int i9) {
            return !this.f7938h.a(i9).b();
        }

        public boolean f(int i9) {
            return this.f7938h.a(i9).f11530h;
        }

        public long b(int i9) {
            return this.f7938h.a(i9).f11525a;
        }

        public long b() {
            return this.f7938h.f11520c;
        }

        public int b(int i9, int i10) {
            return this.f7938h.a(i9).a(i10);
        }

        public int a(int i9) {
            return this.f7938h.a(i9).b;
        }

        public long a(int i9, int i10) {
            C0761u.a a6 = this.f7938h.a(i9);
            return a6.b != -1 ? a6.f11528f[i10] : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }

        public int a() {
            return this.f7938h.b;
        }

        public int a(long j7) {
            return this.f7938h.a(j7, this.f7935d);
        }

        public b a(Object obj, Object obj2, int i9, long j7, long j9) {
            return a(obj, obj2, i9, j7, j9, C0761u.f11516h, false);
        }

        public b a(Object obj, Object obj2, int i9, long j7, long j9, C0761u c0761u, boolean z8) {
            this.f7933a = obj;
            this.b = obj2;
            this.f7934c = i9;
            this.f7935d = j7;
            this.f7936f = j9;
            this.f7938h = c0761u;
            this.f7937g = z8;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0725m2 {

        /* renamed from: s */
        public static final Object f7943s = new Object();

        /* renamed from: t */
        private static final Object f7944t = new Object();

        /* renamed from: u */
        private static final od f7945u = new od.c().b("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: v */
        public static final InterfaceC0725m2.a f7946v = new I(18);
        public Object b;

        /* renamed from: d */
        public Object f7949d;

        /* renamed from: f */
        public long f7950f;

        /* renamed from: g */
        public long f7951g;

        /* renamed from: h */
        public long f7952h;

        /* renamed from: i */
        public boolean f7953i;

        /* renamed from: j */
        public boolean f7954j;

        /* renamed from: k */
        public boolean f7955k;
        public od.f l;
        public boolean m;

        /* renamed from: n */
        public long f7956n;

        /* renamed from: o */
        public long f7957o;

        /* renamed from: p */
        public int f7958p;

        /* renamed from: q */
        public int f7959q;

        /* renamed from: r */
        public long f7960r;

        /* renamed from: a */
        public Object f7947a = f7943s;

        /* renamed from: c */
        public od f7948c = f7945u;

        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            od odVar = bundle2 != null ? (od) od.f9411h.a(bundle2) : null;
            long j7 = bundle.getLong(a(2), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            long j9 = bundle.getLong(a(3), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            long j10 = bundle.getLong(a(4), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            boolean z8 = bundle.getBoolean(a(5), false);
            boolean z9 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            od.f fVar = bundle3 != null ? (od.f) od.f.f9448h.a(bundle3) : null;
            boolean z10 = bundle.getBoolean(a(8), false);
            long j11 = bundle.getLong(a(9), 0L);
            long j12 = bundle.getLong(a(10), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            int i9 = bundle.getInt(a(11), 0);
            int i10 = bundle.getInt(a(12), 0);
            long j13 = bundle.getLong(a(13), 0L);
            d dVar = new d();
            dVar.a(f7944t, odVar, null, j7, j9, j10, z8, z9, fVar, j11, j12, i9, i10, j13);
            dVar.m = z10;
            return dVar;
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return a(bundle);
        }

        public long c() {
            return this.f7956n;
        }

        public long d() {
            return AbstractC0744r2.b(this.f7957o);
        }

        public boolean e() {
            boolean z8;
            boolean z9;
            boolean z10 = this.f7955k;
            if (this.l != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z10 == z8) {
                z9 = true;
            } else {
                z9 = false;
            }
            AbstractC0669a1.b(z9);
            if (this.l == null) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            if (yp.a(this.f7947a, dVar.f7947a) && yp.a(this.f7948c, dVar.f7948c) && yp.a(this.f7949d, dVar.f7949d) && yp.a(this.l, dVar.l) && this.f7950f == dVar.f7950f && this.f7951g == dVar.f7951g && this.f7952h == dVar.f7952h && this.f7953i == dVar.f7953i && this.f7954j == dVar.f7954j && this.m == dVar.m && this.f7956n == dVar.f7956n && this.f7957o == dVar.f7957o && this.f7958p == dVar.f7958p && this.f7959q == dVar.f7959q && this.f7960r == dVar.f7960r) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.f7948c.hashCode() + ((this.f7947a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f7949d;
            int i9 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i10 = (hashCode2 + hashCode) * 31;
            od.f fVar = this.l;
            if (fVar != null) {
                i9 = fVar.hashCode();
            }
            int i11 = (i10 + i9) * 31;
            long j7 = this.f7950f;
            int i12 = (i11 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j9 = this.f7951g;
            int i13 = (i12 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f7952h;
            int i14 = (((((((i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f7953i ? 1 : 0)) * 31) + (this.f7954j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
            long j11 = this.f7956n;
            int i15 = (i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f7957o;
            int i16 = (((((i15 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f7958p) * 31) + this.f7959q) * 31;
            long j13 = this.f7960r;
            return i16 + ((int) (j13 ^ (j13 >>> 32)));
        }

        public long b() {
            return AbstractC0744r2.b(this.f7956n);
        }

        public long a() {
            return yp.a(this.f7952h);
        }

        private static String a(int i9) {
            return Integer.toString(i9, 36);
        }

        public d a(Object obj, od odVar, Object obj2, long j7, long j9, long j10, boolean z8, boolean z9, od.f fVar, long j11, long j12, int i9, int i10, long j13) {
            od.g gVar;
            this.f7947a = obj;
            this.f7948c = odVar != null ? odVar : f7945u;
            this.b = (odVar == null || (gVar = odVar.b) == null) ? null : gVar.f9462g;
            this.f7949d = obj2;
            this.f7950f = j7;
            this.f7951g = j9;
            this.f7952h = j10;
            this.f7953i = z8;
            this.f7954j = z9;
            this.f7955k = fVar != null;
            this.l = fVar;
            this.f7956n = j11;
            this.f7957o = j12;
            this.f7958p = i9;
            this.f7959q = i10;
            this.f7960r = j13;
            this.m = false;
            return this;
        }
    }

    public static go a(Bundle bundle) {
        ab a6 = a(d.f7946v, AbstractC0721l2.a(bundle, c(0)));
        ab a9 = a(b.f7932i, AbstractC0721l2.a(bundle, c(1)));
        int[] intArray = bundle.getIntArray(c(2));
        if (intArray == null) {
            intArray = a(a6.size());
        }
        return new c(a6, a9, intArray);
    }

    public static /* synthetic */ go b(Bundle bundle) {
        return a(bundle);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i9, b bVar, boolean z8);

    public abstract d a(int i9, d dVar, long j7);

    public abstract int b();

    public abstract Object b(int i9);

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
        for (int i9 = 0; i9 < b(); i9++) {
            if (!a(i9, dVar).equals(goVar.a(i9, dVar2))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < a(); i10++) {
            if (!a(i10, bVar, true).equals(goVar.a(i10, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int b8 = b() + 217;
        for (int i9 = 0; i9 < b(); i9++) {
            b8 = (b8 * 31) + a(i9, dVar).hashCode();
        }
        int a6 = a() + (b8 * 31);
        for (int i10 = 0; i10 < a(); i10++) {
            a6 = (a6 * 31) + a(i10, bVar, true).hashCode();
        }
        return a6;
    }

    /* loaded from: classes.dex */
    public static final class c extends go {

        /* renamed from: c */
        private final ab f7939c;

        /* renamed from: d */
        private final ab f7940d;

        /* renamed from: f */
        private final int[] f7941f;

        /* renamed from: g */
        private final int[] f7942g;

        public c(ab abVar, ab abVar2, int[] iArr) {
            boolean z8;
            if (abVar.size() == iArr.length) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC0669a1.a(z8);
            this.f7939c = abVar;
            this.f7940d = abVar2;
            this.f7941f = iArr;
            this.f7942g = new int[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                this.f7942g[iArr[i9]] = i9;
            }
        }

        @Override // com.applovin.impl.go
        public int a(boolean z8) {
            if (c()) {
                return -1;
            }
            if (z8) {
                return this.f7941f[0];
            }
            return 0;
        }

        @Override // com.applovin.impl.go
        public int b(boolean z8) {
            if (c()) {
                return -1;
            }
            if (z8) {
                return this.f7941f[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.impl.go
        public int a(int i9, int i10, boolean z8) {
            if (i10 == 1) {
                return i9;
            }
            if (i9 != b(z8)) {
                return z8 ? this.f7941f[this.f7942g[i9] + 1] : i9 + 1;
            }
            if (i10 == 2) {
                return a(z8);
            }
            return -1;
        }

        @Override // com.applovin.impl.go
        public int b(int i9, int i10, boolean z8) {
            if (i10 == 1) {
                return i9;
            }
            if (i9 != a(z8)) {
                return z8 ? this.f7941f[this.f7942g[i9] - 1] : i9 - 1;
            }
            if (i10 == 2) {
                return b(z8);
            }
            return -1;
        }

        @Override // com.applovin.impl.go
        public b a(int i9, b bVar, boolean z8) {
            b bVar2 = (b) this.f7940d.get(i9);
            bVar.a(bVar2.f7933a, bVar2.b, bVar2.f7934c, bVar2.f7935d, bVar2.f7936f, bVar2.f7938h, bVar2.f7937g);
            return bVar;
        }

        @Override // com.applovin.impl.go
        public int b() {
            return this.f7939c.size();
        }

        @Override // com.applovin.impl.go
        public Object b(int i9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.impl.go
        public int a() {
            return this.f7940d.size();
        }

        @Override // com.applovin.impl.go
        public d a(int i9, d dVar, long j7) {
            d dVar2 = (d) this.f7939c.get(i9);
            dVar.a(dVar2.f7947a, dVar2.f7948c, dVar2.f7949d, dVar2.f7950f, dVar2.f7951g, dVar2.f7952h, dVar2.f7953i, dVar2.f7954j, dVar2.l, dVar2.f7956n, dVar2.f7957o, dVar2.f7958p, dVar2.f7959q, dVar2.f7960r);
            dVar.m = dVar2.m;
            return dVar;
        }

        @Override // com.applovin.impl.go
        public int a(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    private static String c(int i9) {
        return Integer.toString(i9, 36);
    }

    public int b(boolean z8) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public int b(int i9, int i10, boolean z8) {
        if (i10 == 0) {
            if (i9 == a(z8)) {
                return -1;
            }
            return i9 - 1;
        }
        if (i10 == 1) {
            return i9;
        }
        if (i10 == 2) {
            return i9 == a(z8) ? b(z8) : i9 - 1;
        }
        throw new IllegalStateException();
    }

    public final boolean b(int i9, b bVar, d dVar, int i10, boolean z8) {
        return a(i9, bVar, dVar, i10, z8) == -1;
    }

    private static ab a(InterfaceC0725m2.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return ab.h();
        }
        ab.a aVar2 = new ab.a();
        ab a6 = AbstractBinderC0717k2.a(iBinder);
        for (int i9 = 0; i9 < a6.size(); i9++) {
            aVar2.b(aVar.a((Bundle) a6.get(i9)));
        }
        return aVar2.a();
    }

    private static int[] a(int i9) {
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr[i10] = i10;
        }
        return iArr;
    }

    public int a(boolean z8) {
        return c() ? -1 : 0;
    }

    public final int a(int i9, b bVar, d dVar, int i10, boolean z8) {
        int i11 = a(i9, bVar).f7934c;
        if (a(i11, dVar).f7959q != i9) {
            return i9 + 1;
        }
        int a6 = a(i11, i10, z8);
        if (a6 == -1) {
            return -1;
        }
        return a(a6, dVar).f7958p;
    }

    public int a(int i9, int i10, boolean z8) {
        if (i10 == 0) {
            if (i9 == b(z8)) {
                return -1;
            }
            return i9 + 1;
        }
        if (i10 == 1) {
            return i9;
        }
        if (i10 == 2) {
            return i9 == b(z8) ? a(z8) : i9 + 1;
        }
        throw new IllegalStateException();
    }

    public final b a(int i9, b bVar) {
        return a(i9, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair a(d dVar, b bVar, int i9, long j7) {
        return (Pair) AbstractC0669a1.a(a(dVar, bVar, i9, j7, 0L));
    }

    public final Pair a(d dVar, b bVar, int i9, long j7, long j9) {
        AbstractC0669a1.a(i9, 0, b());
        a(i9, dVar, j9);
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j7 = dVar.c();
            if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return null;
            }
        }
        int i10 = dVar.f7958p;
        a(i10, bVar);
        while (i10 < dVar.f7959q && bVar.f7936f != j7) {
            int i11 = i10 + 1;
            if (a(i11, bVar).f7936f > j7) {
                break;
            }
            i10 = i11;
        }
        a(i10, bVar, true);
        long j10 = j7 - bVar.f7936f;
        long j11 = bVar.f7935d;
        if (j11 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j10 = Math.min(j10, j11 - 1);
        }
        return Pair.create(AbstractC0669a1.a(bVar.b), Long.valueOf(Math.max(0L, j10)));
    }

    public final d a(int i9, d dVar) {
        return a(i9, dVar, 0L);
    }
}
