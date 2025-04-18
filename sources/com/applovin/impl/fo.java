package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.impl.eb;
import com.applovin.impl.o2;
import com.applovin.impl.td;
import com.applovin.impl.u;

/* loaded from: classes2.dex */
public abstract class fo implements o2 {

    /* renamed from: a */
    public static final fo f23945a = new a();

    /* renamed from: b */
    public static final o2.a f23946b = new rs(11);

    /* loaded from: classes2.dex */
    public class a extends fo {
        @Override // com.applovin.impl.fo
        public int a() {
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int a(Object obj) {
            return -1;
        }

        @Override // com.applovin.impl.fo
        public Object b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.fo
        public d a(int i2, d dVar, long j2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.fo
        public b a(int i2, b bVar, boolean z2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements o2 {

        /* renamed from: i */
        public static final o2.a f23947i = new rs(12);

        /* renamed from: a */
        public Object f23948a;

        /* renamed from: b */
        public Object f23949b;

        /* renamed from: c */
        public int f23950c;
        public long d;

        /* renamed from: f */
        public long f23951f;

        /* renamed from: g */
        public boolean f23952g;

        /* renamed from: h */
        private u f23953h = u.f27217h;

        public static /* synthetic */ b b(Bundle bundle) {
            return a(bundle);
        }

        private static String g(int i2) {
            return Integer.toString(i2, 36);
        }

        public b a(Object obj, Object obj2, int i2, long j2, long j3, u uVar, boolean z2) {
            this.f23948a = obj;
            this.f23949b = obj2;
            this.f23950c = i2;
            this.d = j2;
            this.f23951f = j3;
            this.f23953h = uVar;
            this.f23952g = z2;
            return this;
        }

        public long c() {
            return this.d;
        }

        public int d(int i2) {
            return this.f23953h.a(i2).a();
        }

        public long e() {
            return this.f23951f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return xp.a(this.f23948a, bVar.f23948a) && xp.a(this.f23949b, bVar.f23949b) && this.f23950c == bVar.f23950c && this.d == bVar.d && this.f23951f == bVar.f23951f && this.f23952g == bVar.f23952g && xp.a(this.f23953h, bVar.f23953h);
        }

        public int f() {
            return this.f23953h.f27223f;
        }

        public int hashCode() {
            Object obj = this.f23948a;
            int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.f23949b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f23950c) * 31;
            long j2 = this.d;
            int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f23951f;
            return this.f23953h.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f23952g ? 1 : 0)) * 31);
        }

        public int b(long j2) {
            return this.f23953h.b(j2, this.d);
        }

        public long c(int i2) {
            return this.f23953h.a(i2).f27230g;
        }

        public long d() {
            return t2.b(this.f23951f);
        }

        public boolean e(int i2) {
            return !this.f23953h.a(i2).b();
        }

        public boolean f(int i2) {
            return this.f23953h.a(i2).f27231h;
        }

        public static b a(Bundle bundle) {
            u uVar;
            int i2 = bundle.getInt(g(0), 0);
            long j2 = bundle.getLong(g(1), -9223372036854775807L);
            long j3 = bundle.getLong(g(2), 0L);
            boolean z2 = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                uVar = (u) u.f27219j.a(bundle2);
            } else {
                uVar = u.f27217h;
            }
            u uVar2 = uVar;
            b bVar = new b();
            bVar.a(null, null, i2, j2, j3, uVar2, z2);
            return bVar;
        }

        public long b(int i2) {
            return this.f23953h.a(i2).f27226a;
        }

        public long b() {
            return this.f23953h.f27222c;
        }

        public int b(int i2, int i3) {
            return this.f23953h.a(i2).a(i3);
        }

        public int a(int i2) {
            return this.f23953h.a(i2).f27227b;
        }

        public long a(int i2, int i3) {
            u.a a2 = this.f23953h.a(i2);
            if (a2.f27227b != -1) {
                return a2.f27229f[i3];
            }
            return -9223372036854775807L;
        }

        public int a() {
            return this.f23953h.f27221b;
        }

        public int a(long j2) {
            return this.f23953h.a(j2, this.d);
        }

        public b a(Object obj, Object obj2, int i2, long j2, long j3) {
            return a(obj, obj2, i2, j2, j3, u.f27217h, false);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements o2 {

        /* renamed from: s */
        public static final Object f23957s = new Object();

        /* renamed from: t */
        private static final Object f23958t = new Object();

        /* renamed from: u */
        private static final td f23959u = new td.c().b("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: v */
        public static final o2.a f23960v = new rs(13);

        /* renamed from: b */
        public Object f23962b;
        public Object d;

        /* renamed from: f */
        public long f23964f;

        /* renamed from: g */
        public long f23965g;

        /* renamed from: h */
        public long f23966h;

        /* renamed from: i */
        public boolean f23967i;

        /* renamed from: j */
        public boolean f23968j;

        /* renamed from: k */
        public boolean f23969k;

        /* renamed from: l */
        public td.f f23970l;

        /* renamed from: m */
        public boolean f23971m;

        /* renamed from: n */
        public long f23972n;

        /* renamed from: o */
        public long f23973o;

        /* renamed from: p */
        public int f23974p;

        /* renamed from: q */
        public int f23975q;

        /* renamed from: r */
        public long f23976r;

        /* renamed from: a */
        public Object f23961a = f23957s;

        /* renamed from: c */
        public td f23963c = f23959u;

        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            td tdVar = bundle2 != null ? (td) td.f27056h.a(bundle2) : null;
            long j2 = bundle.getLong(a(2), -9223372036854775807L);
            long j3 = bundle.getLong(a(3), -9223372036854775807L);
            long j4 = bundle.getLong(a(4), -9223372036854775807L);
            boolean z2 = bundle.getBoolean(a(5), false);
            boolean z3 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            td.f fVar = bundle3 != null ? (td.f) td.f.f27092h.a(bundle3) : null;
            boolean z4 = bundle.getBoolean(a(8), false);
            long j5 = bundle.getLong(a(9), 0L);
            long j6 = bundle.getLong(a(10), -9223372036854775807L);
            int i2 = bundle.getInt(a(11), 0);
            int i3 = bundle.getInt(a(12), 0);
            long j7 = bundle.getLong(a(13), 0L);
            d dVar = new d();
            dVar.a(f23958t, tdVar, null, j2, j3, j4, z2, z3, fVar, j5, j6, i2, i3, j7);
            dVar.f23971m = z4;
            return dVar;
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return a(bundle);
        }

        public long c() {
            return this.f23972n;
        }

        public long d() {
            return t2.b(this.f23973o);
        }

        public boolean e() {
            b1.b(this.f23969k == (this.f23970l != null));
            return this.f23970l != null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return xp.a(this.f23961a, dVar.f23961a) && xp.a(this.f23963c, dVar.f23963c) && xp.a(this.d, dVar.d) && xp.a(this.f23970l, dVar.f23970l) && this.f23964f == dVar.f23964f && this.f23965g == dVar.f23965g && this.f23966h == dVar.f23966h && this.f23967i == dVar.f23967i && this.f23968j == dVar.f23968j && this.f23971m == dVar.f23971m && this.f23972n == dVar.f23972n && this.f23973o == dVar.f23973o && this.f23974p == dVar.f23974p && this.f23975q == dVar.f23975q && this.f23976r == dVar.f23976r;
        }

        public int hashCode() {
            int hashCode = (this.f23963c.hashCode() + ((this.f23961a.hashCode() + 217) * 31)) * 31;
            Object obj = this.d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            td.f fVar = this.f23970l;
            int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            long j2 = this.f23964f;
            int i2 = (hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f23965g;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f23966h;
            int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f23967i ? 1 : 0)) * 31) + (this.f23968j ? 1 : 0)) * 31) + (this.f23971m ? 1 : 0)) * 31;
            long j5 = this.f23972n;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f23973o;
            int i6 = (((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f23974p) * 31) + this.f23975q) * 31;
            long j7 = this.f23976r;
            return i6 + ((int) (j7 ^ (j7 >>> 32)));
        }

        public long b() {
            return t2.b(this.f23972n);
        }

        public long a() {
            return xp.a(this.f23966h);
        }

        private static String a(int i2) {
            return Integer.toString(i2, 36);
        }

        public d a(Object obj, td tdVar, Object obj2, long j2, long j3, long j4, boolean z2, boolean z3, td.f fVar, long j5, long j6, int i2, int i3, long j7) {
            td.g gVar;
            this.f23961a = obj;
            this.f23963c = tdVar != null ? tdVar : f23959u;
            this.f23962b = (tdVar == null || (gVar = tdVar.f27058b) == null) ? null : gVar.f27104g;
            this.d = obj2;
            this.f23964f = j2;
            this.f23965g = j3;
            this.f23966h = j4;
            this.f23967i = z2;
            this.f23968j = z3;
            this.f23969k = fVar != null;
            this.f23970l = fVar;
            this.f23972n = j5;
            this.f23973o = j6;
            this.f23974p = i2;
            this.f23975q = i3;
            this.f23976r = j7;
            this.f23971m = false;
            return this;
        }
    }

    public static fo a(Bundle bundle) {
        eb a2 = a(d.f23960v, n2.a(bundle, c(0)));
        eb a3 = a(b.f23947i, n2.a(bundle, c(1)));
        int[] intArray = bundle.getIntArray(c(2));
        if (intArray == null) {
            intArray = a(a2.size());
        }
        return new c(a2, a3, intArray);
    }

    public static /* synthetic */ fo b(Bundle bundle) {
        return a(bundle);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i2, b bVar, boolean z2);

    public abstract d a(int i2, d dVar, long j2);

    public abstract int b();

    public abstract Object b(int i2);

    public final boolean c() {
        return b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        if (foVar.b() != b() || foVar.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i2 = 0; i2 < b(); i2++) {
            if (!a(i2, dVar).equals(foVar.a(i2, dVar2))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < a(); i3++) {
            if (!a(i3, bVar, true).equals(foVar.a(i3, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int b2 = b() + 217;
        for (int i2 = 0; i2 < b(); i2++) {
            b2 = (b2 * 31) + a(i2, dVar).hashCode();
        }
        int a2 = a() + (b2 * 31);
        for (int i3 = 0; i3 < a(); i3++) {
            a2 = (a2 * 31) + a(i3, bVar, true).hashCode();
        }
        return a2;
    }

    /* loaded from: classes2.dex */
    public static final class c extends fo {

        /* renamed from: c */
        private final eb f23954c;
        private final eb d;

        /* renamed from: f */
        private final int[] f23955f;

        /* renamed from: g */
        private final int[] f23956g;

        public c(eb ebVar, eb ebVar2, int[] iArr) {
            b1.a(ebVar.size() == iArr.length);
            this.f23954c = ebVar;
            this.d = ebVar2;
            this.f23955f = iArr;
            this.f23956g = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f23956g[iArr[i2]] = i2;
            }
        }

        @Override // com.applovin.impl.fo
        public int a(boolean z2) {
            if (c()) {
                return -1;
            }
            if (z2) {
                return this.f23955f[0];
            }
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int b(boolean z2) {
            if (c()) {
                return -1;
            }
            if (z2) {
                return this.f23955f[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.impl.fo
        public int a(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != b(z2)) {
                return z2 ? this.f23955f[this.f23956g[i2] + 1] : i2 + 1;
            }
            if (i3 == 2) {
                return a(z2);
            }
            return -1;
        }

        @Override // com.applovin.impl.fo
        public int b(int i2, int i3, boolean z2) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != a(z2)) {
                return z2 ? this.f23955f[this.f23956g[i2] - 1] : i2 - 1;
            }
            if (i3 == 2) {
                return b(z2);
            }
            return -1;
        }

        @Override // com.applovin.impl.fo
        public b a(int i2, b bVar, boolean z2) {
            b bVar2 = (b) this.d.get(i2);
            bVar.a(bVar2.f23948a, bVar2.f23949b, bVar2.f23950c, bVar2.d, bVar2.f23951f, bVar2.f23953h, bVar2.f23952g);
            return bVar;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return this.f23954c.size();
        }

        @Override // com.applovin.impl.fo
        public Object b(int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.impl.fo
        public int a() {
            return this.d.size();
        }

        @Override // com.applovin.impl.fo
        public d a(int i2, d dVar, long j2) {
            d dVar2 = (d) this.f23954c.get(i2);
            dVar.a(dVar2.f23961a, dVar2.f23963c, dVar2.d, dVar2.f23964f, dVar2.f23965g, dVar2.f23966h, dVar2.f23967i, dVar2.f23968j, dVar2.f23970l, dVar2.f23972n, dVar2.f23973o, dVar2.f23974p, dVar2.f23975q, dVar2.f23976r);
            dVar.f23971m = dVar2.f23971m;
            return dVar;
        }

        @Override // com.applovin.impl.fo
        public int a(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    private static String c(int i2) {
        return Integer.toString(i2, 36);
    }

    public int b(boolean z2) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public int b(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == a(z2)) {
                return -1;
            }
            return i2 - 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == a(z2) ? b(z2) : i2 - 1;
        }
        throw new IllegalStateException();
    }

    public final boolean b(int i2, b bVar, d dVar, int i3, boolean z2) {
        return a(i2, bVar, dVar, i3, z2) == -1;
    }

    private static eb a(o2.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return eb.h();
        }
        eb.a aVar2 = new eb.a();
        eb a2 = m2.a(iBinder);
        for (int i2 = 0; i2 < a2.size(); i2++) {
            aVar2.b(aVar.a((Bundle) a2.get(i2)));
        }
        return aVar2.a();
    }

    private static int[] a(int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3;
        }
        return iArr;
    }

    public int a(boolean z2) {
        return c() ? -1 : 0;
    }

    public final int a(int i2, b bVar, d dVar, int i3, boolean z2) {
        int i4 = a(i2, bVar).f23950c;
        if (a(i4, dVar).f23975q != i2) {
            return i2 + 1;
        }
        int a2 = a(i4, i3, z2);
        if (a2 == -1) {
            return -1;
        }
        return a(a2, dVar).f23974p;
    }

    public int a(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == b(z2)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == b(z2) ? a(z2) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public final b a(int i2, b bVar) {
        return a(i2, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair a(d dVar, b bVar, int i2, long j2) {
        return (Pair) b1.a(a(dVar, bVar, i2, j2, 0L));
    }

    public final Pair a(d dVar, b bVar, int i2, long j2, long j3) {
        b1.a(i2, 0, b());
        a(i2, dVar, j3);
        if (j2 == -9223372036854775807L) {
            j2 = dVar.c();
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = dVar.f23974p;
        a(i3, bVar);
        while (i3 < dVar.f23975q && bVar.f23951f != j2) {
            int i4 = i3 + 1;
            if (a(i4, bVar).f23951f > j2) {
                break;
            }
            i3 = i4;
        }
        a(i3, bVar, true);
        long j4 = j2 - bVar.f23951f;
        long j5 = bVar.d;
        if (j5 != -9223372036854775807L) {
            j4 = Math.min(j4, j5 - 1);
        }
        return Pair.create(b1.a(bVar.f23949b), Long.valueOf(Math.max(0L, j4)));
    }

    public final d a(int i2, d dVar) {
        return a(i2, dVar, 0L);
    }
}
