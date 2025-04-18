package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.impl.be;
import com.applovin.impl.h8;
import com.applovin.impl.i0;
import com.applovin.impl.o2;
import com.applovin.impl.tc;
import com.applovin.impl.uo;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class m6 extends tc {

    /* renamed from: f */
    private static final int[] f25183f = new int[0];

    /* renamed from: g */
    private static final wg f25184g = wg.a(new ns(7));

    /* renamed from: h */
    private static final wg f25185h = wg.a(new ns(8));
    private final h8.b d;
    private final AtomicReference e;

    /* loaded from: classes.dex */
    public static final class b implements Comparable {

        /* renamed from: a */
        public final boolean f25186a;

        /* renamed from: b */
        private final String f25187b;

        /* renamed from: c */
        private final d f25188c;
        private final boolean d;

        /* renamed from: f */
        private final int f25189f;

        /* renamed from: g */
        private final int f25190g;

        /* renamed from: h */
        private final int f25191h;

        /* renamed from: i */
        private final int f25192i;

        /* renamed from: j */
        private final int f25193j;

        /* renamed from: k */
        private final boolean f25194k;

        /* renamed from: l */
        private final int f25195l;

        /* renamed from: m */
        private final int f25196m;

        /* renamed from: n */
        private final int f25197n;

        /* renamed from: o */
        private final int f25198o;

        public b(f9 f9Var, d dVar, int i2) {
            int i3;
            int i4;
            int i5;
            this.f25188c = dVar;
            this.f25187b = m6.a(f9Var.f23832c);
            int i6 = 0;
            this.d = m6.a(i2, false);
            int i7 = 0;
            while (true) {
                int size = dVar.f27399n.size();
                i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i7 >= size) {
                    i4 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    i4 = m6.a(f9Var, (String) dVar.f27399n.get(i7), false);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f25190g = i7;
            this.f25189f = i4;
            this.f25191h = Integer.bitCount(f9Var.f23833f & dVar.f27400o);
            boolean z2 = true;
            this.f25194k = (f9Var.d & 1) != 0;
            int i8 = f9Var.f23851z;
            this.f25195l = i8;
            this.f25196m = f9Var.A;
            int i9 = f9Var.f23836i;
            this.f25197n = i9;
            if ((i9 != -1 && i9 > dVar.f27402q) || (i8 != -1 && i8 > dVar.f27401p)) {
                z2 = false;
            }
            this.f25186a = z2;
            String[] e = xp.e();
            int i10 = 0;
            while (true) {
                if (i10 >= e.length) {
                    i5 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                } else {
                    i5 = m6.a(f9Var, e[i10], false);
                    if (i5 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f25192i = i10;
            this.f25193j = i5;
            while (true) {
                if (i6 < dVar.f27403r.size()) {
                    String str = f9Var.f23840m;
                    if (str != null && str.equals(dVar.f27403r.get(i6))) {
                        i3 = i6;
                        break;
                    }
                    i6++;
                } else {
                    break;
                }
            }
            this.f25198o = i3;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            wg c2 = (this.f25186a && this.d) ? m6.f25184g : m6.f25184g.c();
            y3 a2 = y3.e().a(this.d, bVar.d).a(Integer.valueOf(this.f25190g), Integer.valueOf(bVar.f25190g), wg.a().c()).a(this.f25189f, bVar.f25189f).a(this.f25191h, bVar.f25191h).a(this.f25186a, bVar.f25186a).a(Integer.valueOf(this.f25198o), Integer.valueOf(bVar.f25198o), wg.a().c()).a(Integer.valueOf(this.f25197n), Integer.valueOf(bVar.f25197n), this.f25188c.f27407v ? m6.f25184g.c() : m6.f25185h).a(this.f25194k, bVar.f25194k).a(Integer.valueOf(this.f25192i), Integer.valueOf(bVar.f25192i), wg.a().c()).a(this.f25193j, bVar.f25193j).a(Integer.valueOf(this.f25195l), Integer.valueOf(bVar.f25195l), c2).a(Integer.valueOf(this.f25196m), Integer.valueOf(bVar.f25196m), c2);
            Integer valueOf = Integer.valueOf(this.f25197n);
            Integer valueOf2 = Integer.valueOf(bVar.f25197n);
            if (!xp.a((Object) this.f25187b, (Object) bVar.f25187b)) {
                c2 = m6.f25185h;
            }
            return a2.a(valueOf, valueOf2, c2).d();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable {

        /* renamed from: a */
        private final boolean f25199a;

        /* renamed from: b */
        private final boolean f25200b;

        public c(f9 f9Var, int i2) {
            this.f25199a = (f9Var.d & 1) != 0;
            this.f25200b = m6.a(i2, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            return y3.e().a(this.f25200b, cVar.f25200b).a(this.f25199a, cVar.f25199a).d();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends uo implements o2 {
        public static final d O;
        public static final d P;
        public static final o2.a Q;
        public final int B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        private final SparseArray M;
        private final SparseBooleanArray N;

        static {
            d a2 = new e().a();
            O = a2;
            P = a2;
            Q = new rs(23);
        }

        private d(e eVar) {
            super(eVar);
            this.C = eVar.x;
            this.D = eVar.f25201y;
            this.E = eVar.f25202z;
            this.F = eVar.A;
            this.G = eVar.B;
            this.H = eVar.C;
            this.I = eVar.D;
            this.B = eVar.E;
            this.J = eVar.F;
            this.K = eVar.G;
            this.L = eVar.H;
            this.M = eVar.I;
            this.N = eVar.J;
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(int i2, po poVar) {
            Map map = (Map) this.M.get(i2);
            return map != null && map.containsKey(poVar);
        }

        @Override // com.applovin.impl.uo
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.B == dVar.B && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && a(this.N, dVar.N) && a(this.M, dVar.M);
        }

        @Override // com.applovin.impl.uo
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.B) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
        }

        public final boolean d(int i2) {
            return this.N.get(i2);
        }

        public static String b(int i2) {
            return Integer.toString(i2, 36);
        }

        private static boolean a(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (indexOfKey < 0 || !a((Map) sparseArray.valueAt(i2), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return new e(bundle).a();
        }

        private static boolean a(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                po poVar = (po) entry.getKey();
                if (!map2.containsKey(poVar) || !xp.a(entry.getValue(), map2.get(poVar))) {
                    return false;
                }
            }
            return true;
        }

        public final f a(int i2, po poVar) {
            Map map = (Map) this.M.get(i2);
            if (map != null) {
                return (f) map.get(poVar);
            }
            return null;
        }

        public /* synthetic */ d(e eVar, a aVar) {
            this(eVar);
        }

        public static d a(Context context) {
            return new e(context).a();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends uo.a {
        private boolean A;
        private boolean B;
        private boolean C;
        private boolean D;
        private int E;
        private boolean F;
        private boolean G;
        private boolean H;
        private final SparseArray I;
        private final SparseBooleanArray J;
        private boolean x;

        /* renamed from: y */
        private boolean f25201y;

        /* renamed from: z */
        private boolean f25202z;

        public e() {
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        public e a(int i2) {
            this.E = i2;
            return this;
        }

        public e b(boolean z2) {
            this.B = z2;
            return this;
        }

        public e c(boolean z2) {
            this.C = z2;
            return this;
        }

        public e d(boolean z2) {
            this.H = z2;
            return this;
        }

        public e e(boolean z2) {
            this.f25201y = z2;
            return this;
        }

        public e f(boolean z2) {
            this.f25202z = z2;
            return this;
        }

        public e g(boolean z2) {
            this.A = z2;
            return this;
        }

        public e h(boolean z2) {
            this.F = z2;
            return this;
        }

        public e i(boolean z2) {
            this.x = z2;
            return this;
        }

        public e j(boolean z2) {
            this.G = z2;
            return this;
        }

        private void c() {
            this.x = true;
            this.f25201y = false;
            this.f25202z = true;
            this.A = true;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = 0;
            this.F = true;
            this.G = false;
            this.H = true;
        }

        public e a(boolean z2) {
            this.D = z2;
            return this;
        }

        @Override // com.applovin.impl.uo.a
        /* renamed from: b */
        public e a(int i2, int i3, boolean z2) {
            super.a(i2, i3, z2);
            return this;
        }

        @Override // com.applovin.impl.uo.a
        /* renamed from: b */
        public e a(Context context, boolean z2) {
            super.a(context, z2);
            return this;
        }

        @Override // com.applovin.impl.uo.a
        /* renamed from: c */
        public e a(Context context) {
            super.a(context);
            return this;
        }

        public e(Context context) {
            super(context);
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i2 : iArr) {
                sparseBooleanArray.append(i2, true);
            }
            return sparseBooleanArray;
        }

        @Override // com.applovin.impl.uo.a
        /* renamed from: b */
        public d a() {
            return new d(this);
        }

        private e(Bundle bundle) {
            super(bundle);
            d dVar = d.O;
            i(bundle.getBoolean(d.b(1000), dVar.C));
            e(bundle.getBoolean(d.b(1001), dVar.D));
            f(bundle.getBoolean(d.b(1002), dVar.E));
            g(bundle.getBoolean(d.b(1003), dVar.F));
            b(bundle.getBoolean(d.b(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), dVar.G));
            c(bundle.getBoolean(d.b(1005), dVar.H));
            a(bundle.getBoolean(d.b(1006), dVar.I));
            a(bundle.getInt(d.b(1007), dVar.B));
            h(bundle.getBoolean(d.b(1008), dVar.J));
            j(bundle.getBoolean(d.b(1009), dVar.K));
            d(bundle.getBoolean(d.b(1010), dVar.L));
            this.I = new SparseArray();
            a(bundle);
            this.J = a(bundle.getIntArray(d.b(1014)));
        }

        public final e a(int i2, po poVar, f fVar) {
            Map map = (Map) this.I.get(i2);
            if (map == null) {
                map = new HashMap();
                this.I.put(i2, map);
            }
            if (map.containsKey(poVar) && xp.a(map.get(poVar), fVar)) {
                return this;
            }
            map.put(poVar, fVar);
            return this;
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(d.b(1011));
            List a2 = p2.a(po.f26087f, bundle.getParcelableArrayList(d.b(1012)), eb.h());
            SparseArray a3 = p2.a(f.f25203f, bundle.getSparseParcelableArray(d.b(1013)), new SparseArray());
            if (intArray == null || intArray.length != a2.size()) {
                return;
            }
            for (int i2 = 0; i2 < intArray.length; i2++) {
                a(intArray[i2], (po) a2.get(i2), (f) a3.get(i2));
            }
        }

        public /* synthetic */ e(Bundle bundle, a aVar) {
            this(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements o2 {

        /* renamed from: f */
        public static final o2.a f25203f = new rs(24);

        /* renamed from: a */
        public final int f25204a;

        /* renamed from: b */
        public final int[] f25205b;

        /* renamed from: c */
        public final int f25206c;
        public final int d;

        public f(int i2, int[] iArr, int i3) {
            this.f25204a = i2;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f25205b = copyOf;
            this.f25206c = iArr.length;
            this.d = i3;
            Arrays.sort(copyOf);
        }

        private static String a(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f25204a == fVar.f25204a && Arrays.equals(this.f25205b, fVar.f25205b) && this.d == fVar.d;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f25205b) + (this.f25204a * 31)) * 31) + this.d;
        }

        public static /* synthetic */ f a(Bundle bundle) {
            boolean z2 = false;
            int i2 = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i3 = bundle.getInt(a(2), -1);
            if (i2 >= 0 && i3 >= 0) {
                z2 = true;
            }
            b1.a(z2);
            b1.a(intArray);
            return new f(i2, intArray, i3);
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Comparable {

        /* renamed from: a */
        public final boolean f25207a;

        /* renamed from: b */
        private final boolean f25208b;

        /* renamed from: c */
        private final boolean f25209c;
        private final boolean d;

        /* renamed from: f */
        private final int f25210f;

        /* renamed from: g */
        private final int f25211g;

        /* renamed from: h */
        private final int f25212h;

        /* renamed from: i */
        private final int f25213i;

        /* renamed from: j */
        private final boolean f25214j;

        public g(f9 f9Var, d dVar, int i2, String str) {
            int i3;
            boolean z2 = false;
            this.f25208b = m6.a(i2, false);
            int i4 = f9Var.d & (~dVar.B);
            this.f25209c = (i4 & 1) != 0;
            this.d = (i4 & 2) != 0;
            eb a2 = dVar.f27404s.isEmpty() ? eb.a("") : dVar.f27404s;
            int i5 = 0;
            while (true) {
                if (i5 >= a2.size()) {
                    i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i3 = 0;
                    break;
                } else {
                    i3 = m6.a(f9Var, (String) a2.get(i5), dVar.f27406u);
                    if (i3 > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f25210f = i5;
            this.f25211g = i3;
            int bitCount = Integer.bitCount(f9Var.f23833f & dVar.f27405t);
            this.f25212h = bitCount;
            this.f25214j = (f9Var.f23833f & 1088) != 0;
            int a3 = m6.a(f9Var, str, m6.a(str) == null);
            this.f25213i = a3;
            if (i3 > 0 || ((dVar.f27404s.isEmpty() && bitCount > 0) || this.f25209c || (this.d && a3 > 0))) {
                z2 = true;
            }
            this.f25207a = z2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(g gVar) {
            y3 a2 = y3.e().a(this.f25208b, gVar.f25208b).a(Integer.valueOf(this.f25210f), Integer.valueOf(gVar.f25210f), wg.a().c()).a(this.f25211g, gVar.f25211g).a(this.f25212h, gVar.f25212h).a(this.f25209c, gVar.f25209c).a(Boolean.valueOf(this.d), Boolean.valueOf(gVar.d), this.f25211g == 0 ? wg.a() : wg.a().c()).a(this.f25213i, gVar.f25213i);
            if (this.f25212h == 0) {
                a2 = a2.b(this.f25214j, gVar.f25214j);
            }
            return a2.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Comparable {

        /* renamed from: a */
        public final boolean f25215a;

        /* renamed from: b */
        private final d f25216b;

        /* renamed from: c */
        private final boolean f25217c;
        private final boolean d;

        /* renamed from: f */
        private final int f25218f;

        /* renamed from: g */
        private final int f25219g;

        /* renamed from: h */
        private final int f25220h;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        
            if (r10 < r8.f27393h) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        
            if (r10 < r8.f27394i) goto L99;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(com.applovin.impl.f9 r7, com.applovin.impl.m6.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f25216b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f23845r
                if (r4 == r3) goto L14
                int r5 = r8.f27388a
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f23846s
                if (r4 == r3) goto L1c
                int r5 = r8.f27389b
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f23847t
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f27390c
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f23836i
                if (r4 == r3) goto L31
                int r5 = r8.d
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f25215a = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f23845r
                if (r10 == r3) goto L40
                int r4 = r8.f27391f
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f23846s
                if (r10 == r3) goto L48
                int r4 = r8.f27392g
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f23847t
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f27393h
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f23836i
                if (r10 == r3) goto L5f
                int r0 = r8.f27394i
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f25217c = r1
                boolean r9 = com.applovin.impl.m6.a(r9, r2)
                r6.d = r9
                int r9 = r7.f23836i
                r6.f25218f = r9
                int r9 = r7.b()
                r6.f25219g = r9
            L71:
                com.applovin.impl.eb r9 = r8.f27398m
                int r9 = r9.size()
                if (r2 >= r9) goto L8d
                java.lang.String r9 = r7.f23840m
                if (r9 == 0) goto L8a
                com.applovin.impl.eb r10 = r8.f27398m
                java.lang.Object r10 = r10.get(r2)
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L8a
                goto L90
            L8a:
                int r2 = r2 + 1
                goto L71
            L8d:
                r2 = 2147483647(0x7fffffff, float:NaN)
            L90:
                r6.f25220h = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.m6.h.<init>(com.applovin.impl.f9, com.applovin.impl.m6$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(h hVar) {
            wg c2 = (this.f25215a && this.d) ? m6.f25184g : m6.f25184g.c();
            return y3.e().a(this.d, hVar.d).a(this.f25215a, hVar.f25215a).a(this.f25217c, hVar.f25217c).a(Integer.valueOf(this.f25220h), Integer.valueOf(hVar.f25220h), wg.a().c()).a(Integer.valueOf(this.f25218f), Integer.valueOf(hVar.f25218f), this.f25216b.f27407v ? m6.f25184g.c() : m6.f25185h).a(Integer.valueOf(this.f25219g), Integer.valueOf(hVar.f25219g), c2).a(Integer.valueOf(this.f25218f), Integer.valueOf(hVar.f25218f), c2).d();
        }
    }

    public m6(Context context) {
        this(context, new i0.b());
    }

    private static void a(oo ooVar, int[] iArr, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list.get(size)).intValue();
            if (!a(ooVar.a(intValue), str, iArr[intValue], i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
                list.remove(size);
            }
        }
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public m6(Context context, h8.b bVar) {
        this(d.a(context), bVar);
    }

    @Override // com.applovin.impl.vo
    public boolean b() {
        return true;
    }

    public m6(d dVar, h8.b bVar) {
        this.d = bVar;
        this.e = new AtomicReference(dVar);
    }

    private static int b(oo ooVar, int[] iArr, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue = ((Integer) list.get(i12)).intValue();
            if (a(ooVar.a(intValue), str, iArr[intValue], i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
                i11++;
            }
        }
        return i11;
    }

    private static int[] a(oo ooVar, int[] iArr, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        f9 a2 = ooVar.a(i2);
        int[] iArr2 = new int[ooVar.f25910a];
        int i4 = 0;
        for (int i5 = 0; i5 < ooVar.f25910a; i5++) {
            if (i5 == i2 || a(ooVar.a(i5), iArr[i5], a2, i3, z2, z3, z4)) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        return Arrays.copyOf(iArr2, i4);
    }

    public h8.a b(po poVar, int[][] iArr, int i2, d dVar, boolean z2) {
        h8.a a2 = (dVar.w || dVar.f27407v || !z2) ? null : a(poVar, iArr, i2, dVar);
        return a2 == null ? a(poVar, iArr, dVar) : a2;
    }

    private static int[] a(oo ooVar, int[] iArr, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z3) {
        String str;
        int i13;
        int i14;
        HashSet hashSet;
        if (ooVar.f25910a < 2) {
            return f25183f;
        }
        List a2 = a(ooVar, i11, i12, z3);
        if (a2.size() < 2) {
            return f25183f;
        }
        if (z2) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i15 = 0;
            int i16 = 0;
            while (i16 < a2.size()) {
                String str3 = ooVar.a(((Integer) a2.get(i16)).intValue()).f23840m;
                if (hashSet2.add(str3)) {
                    i13 = i15;
                    i14 = i16;
                    hashSet = hashSet2;
                    int b2 = b(ooVar, iArr, i2, str3, i3, i4, i5, i6, i7, i8, i9, i10, a2);
                    if (b2 > i13) {
                        i15 = b2;
                        str2 = str3;
                        i16 = i14 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i13 = i15;
                    i14 = i16;
                    hashSet = hashSet2;
                }
                i15 = i13;
                i16 = i14 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        a(ooVar, iArr, i2, str, i3, i4, i5, i6, i7, i8, i9, i10, a2);
        return a2.size() < 2 ? f25183f : ub.a(a2);
    }

    public static int a(f9 f9Var, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(f9Var.f23832c)) {
            return 4;
        }
        String a2 = a(str);
        String a3 = a(f9Var.f23832c);
        if (a3 == null || a2 == null) {
            return (z2 && a3 == null) ? 1 : 0;
        }
        if (a3.startsWith(a2) || a2.startsWith(a3)) {
            return 3;
        }
        return xp.b(a3, "-")[0].equals(xp.b(a2, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.applovin.impl.xp.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.impl.xp.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.m6.a(boolean, int, int, int, int):android.graphics.Point");
    }

    public static boolean a(int i2, boolean z2) {
        int d2 = ri.d(i2);
        return d2 == 4 || (z2 && d2 == 3);
    }

    private static boolean a(f9 f9Var, int i2, f9 f9Var2, int i3, boolean z2, boolean z3, boolean z4) {
        int i4;
        int i5;
        String str;
        int i6;
        if (!a(i2, false) || (i4 = f9Var.f23836i) == -1 || i4 > i3) {
            return false;
        }
        if (!z4 && ((i6 = f9Var.f23851z) == -1 || i6 != f9Var2.f23851z)) {
            return false;
        }
        if (z2 || ((str = f9Var.f23840m) != null && TextUtils.equals(str, f9Var2.f23840m))) {
            return z3 || ((i5 = f9Var.A) != -1 && i5 == f9Var2.A);
        }
        return false;
    }

    private static boolean a(f9 f9Var, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        if ((f9Var.f23833f & 16384) != 0 || !a(i2, false) || (i2 & i3) == 0) {
            return false;
        }
        if (str != null && !xp.a((Object) f9Var.f23840m, (Object) str)) {
            return false;
        }
        int i13 = f9Var.f23845r;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        int i14 = f9Var.f23846s;
        if (i14 != -1 && (i9 > i14 || i14 > i5)) {
            return false;
        }
        float f2 = f9Var.f23847t;
        return (f2 == -1.0f || (((float) i10) <= f2 && f2 <= ((float) i6))) && (i12 = f9Var.f23836i) != -1 && i11 <= i12 && i12 <= i7;
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void a(tc.a aVar, int[][][] iArr, si[] siVarArr, h8[] h8VarArr) {
        boolean z2;
        boolean z3 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.a(); i4++) {
            int a2 = aVar.a(i4);
            h8 h8Var = h8VarArr[i4];
            if ((a2 == 1 || a2 == 2) && h8Var != null && a(iArr[i4], aVar.b(i4), h8Var)) {
                if (a2 == 1) {
                    if (i3 != -1) {
                        z2 = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z2 = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z2 = true;
        if (i3 != -1 && i2 != -1) {
            z3 = true;
        }
        if (z2 && z3) {
            si siVar = new si(true);
            siVarArr[i3] = siVar;
            siVarArr[i2] = siVar;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean a(int[][] iArr, po poVar, h8 h8Var) {
        if (h8Var == null) {
            return false;
        }
        int a2 = poVar.a(h8Var.a());
        for (int i2 = 0; i2 < h8Var.b(); i2++) {
            if (ri.c(iArr[a2][h8Var.b(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static h8.a a(po poVar, int[][] iArr, int i2, d dVar) {
        po poVar2 = poVar;
        d dVar2 = dVar;
        int i3 = dVar2.E ? 24 : 16;
        boolean z2 = dVar2.D && (i2 & i3) != 0;
        int i4 = 0;
        while (i4 < poVar2.f26088a) {
            oo a2 = poVar2.a(i4);
            int i5 = i4;
            int[] a3 = a(a2, iArr[i4], z2, i3, dVar2.f27388a, dVar2.f27389b, dVar2.f27390c, dVar2.d, dVar2.f27391f, dVar2.f27392g, dVar2.f27393h, dVar2.f27394i, dVar2.f27395j, dVar2.f27396k, dVar2.f27397l);
            if (a3.length > 0) {
                return new h8.a(a2, a3);
            }
            i4 = i5 + 1;
            poVar2 = poVar;
            dVar2 = dVar;
        }
        return null;
    }

    public h8.a[] a(tc.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        boolean z2;
        String str;
        int i2;
        String str2;
        b bVar;
        int i3;
        int a2 = aVar.a();
        h8.a[] aVarArr = new h8.a[a2];
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 >= a2) {
                break;
            }
            if (2 == aVar.a(i5)) {
                if (!z3) {
                    h8.a b2 = b(aVar.b(i5), iArr[i5], iArr2[i5], dVar, true);
                    aVarArr[i5] = b2;
                    z3 = b2 != null;
                }
                z4 |= aVar.b(i5).f26088a > 0;
            }
            i5++;
        }
        int i6 = 0;
        int i7 = -1;
        String str3 = null;
        b bVar2 = null;
        while (i6 < a2) {
            if (z2 == aVar.a(i6)) {
                boolean z5 = (dVar.L || !z4) ? z2 : false;
                i2 = i7;
                str2 = str3;
                bVar = bVar2;
                i3 = i6;
                Pair a3 = a(aVar.b(i6), iArr[i6], iArr2[i6], dVar, z5);
                if (a3 != null && (bVar == null || ((b) a3.second).compareTo(bVar) > 0)) {
                    if (i2 != -1) {
                        aVarArr[i2] = null;
                    }
                    h8.a aVar2 = (h8.a) a3.first;
                    aVarArr[i3] = aVar2;
                    str3 = aVar2.f24241a.a(aVar2.f24242b[0]).f23832c;
                    bVar2 = (b) a3.second;
                    i7 = i3;
                    i6 = i3 + 1;
                    z2 = true;
                }
            } else {
                i2 = i7;
                str2 = str3;
                bVar = bVar2;
                i3 = i6;
            }
            i7 = i2;
            bVar2 = bVar;
            str3 = str2;
            i6 = i3 + 1;
            z2 = true;
        }
        String str4 = str3;
        int i8 = -1;
        g gVar = null;
        while (i4 < a2) {
            int a4 = aVar.a(i4);
            if (a4 != 1) {
                if (a4 != 2) {
                    if (a4 != 3) {
                        aVarArr[i4] = a(a4, aVar.b(i4), iArr[i4], dVar);
                    } else {
                        str = str4;
                        Pair a5 = a(aVar.b(i4), iArr[i4], dVar, str);
                        if (a5 != null && (gVar == null || ((g) a5.second).compareTo(gVar) > 0)) {
                            if (i8 != -1) {
                                aVarArr[i8] = null;
                            }
                            aVarArr[i4] = (h8.a) a5.first;
                            gVar = (g) a5.second;
                            i8 = i4;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i4++;
            str4 = str;
        }
        return aVarArr;
    }

    public Pair a(po poVar, int[][] iArr, int i2, d dVar, boolean z2) {
        h8.a aVar = null;
        int i3 = -1;
        int i4 = -1;
        b bVar = null;
        for (int i5 = 0; i5 < poVar.f26088a; i5++) {
            oo a2 = poVar.a(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < a2.f25910a; i6++) {
                if (a(iArr2[i6], dVar.J)) {
                    b bVar2 = new b(a2.a(i6), dVar, iArr2[i6]);
                    if ((bVar2.f25186a || dVar.F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i3 = i5;
                        i4 = i6;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        oo a3 = poVar.a(i3);
        if (!dVar.w && !dVar.f27407v && z2) {
            int[] a4 = a(a3, iArr[i3], i4, dVar.f27402q, dVar.G, dVar.H, dVar.I);
            if (a4.length > 1) {
                aVar = new h8.a(a3, a4);
            }
        }
        if (aVar == null) {
            aVar = new h8.a(a3, i4);
        }
        return Pair.create(aVar, (b) b1.a(bVar));
    }

    private static h8.a a(po poVar, int[][] iArr, d dVar) {
        int i2 = -1;
        oo ooVar = null;
        h hVar = null;
        for (int i3 = 0; i3 < poVar.f26088a; i3++) {
            oo a2 = poVar.a(i3);
            List a3 = a(a2, dVar.f27395j, dVar.f27396k, dVar.f27397l);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a2.f25910a; i4++) {
                f9 a4 = a2.a(i4);
                if ((a4.f23833f & 16384) == 0 && a(iArr2[i4], dVar.J)) {
                    h hVar2 = new h(a4, dVar, iArr2[i4], a3.contains(Integer.valueOf(i4)));
                    if ((hVar2.f25215a || dVar.C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        ooVar = a2;
                        i2 = i4;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (ooVar == null) {
            return null;
        }
        return new h8.a(ooVar, i2);
    }

    public h8.a a(int i2, po poVar, int[][] iArr, d dVar) {
        oo ooVar = null;
        c cVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < poVar.f26088a; i4++) {
            oo a2 = poVar.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a2.f25910a; i5++) {
                if (a(iArr2[i5], dVar.J)) {
                    c cVar2 = new c(a2.a(i5), iArr2[i5]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        ooVar = a2;
                        i3 = i5;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (ooVar == null) {
            return null;
        }
        return new h8.a(ooVar, i3);
    }

    public Pair a(po poVar, int[][] iArr, d dVar, String str) {
        int i2 = -1;
        oo ooVar = null;
        g gVar = null;
        for (int i3 = 0; i3 < poVar.f26088a; i3++) {
            oo a2 = poVar.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a2.f25910a; i4++) {
                if (a(iArr2[i4], dVar.J)) {
                    g gVar2 = new g(a2.a(i4), dVar, iArr2[i4], str);
                    if (gVar2.f25207a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        ooVar = a2;
                        i2 = i4;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (ooVar == null) {
            return null;
        }
        return Pair.create(new h8.a(ooVar, i2), (g) b1.a(gVar));
    }

    @Override // com.applovin.impl.tc
    public final Pair a(tc.a aVar, int[][][] iArr, int[] iArr2, be.a aVar2, fo foVar) {
        d dVar = (d) this.e.get();
        int a2 = aVar.a();
        h8.a[] a3 = a(aVar, iArr, iArr2, dVar);
        int i2 = 0;
        while (true) {
            if (i2 >= a2) {
                break;
            }
            int a4 = aVar.a(i2);
            if (!dVar.d(i2) && !dVar.x.contains(Integer.valueOf(a4))) {
                po b2 = aVar.b(i2);
                if (dVar.b(i2, b2)) {
                    f a5 = dVar.a(i2, b2);
                    a3[i2] = a5 != null ? new h8.a(b2.a(a5.f25204a), a5.f25205b, a5.d) : null;
                }
            } else {
                a3[i2] = null;
            }
            i2++;
        }
        h8[] a6 = this.d.a(a3, a(), aVar2, foVar);
        si[] siVarArr = new si[a2];
        for (int i3 = 0; i3 < a2; i3++) {
            siVarArr[i3] = (dVar.d(i3) || dVar.x.contains(Integer.valueOf(aVar.a(i3))) || (aVar.a(i3) != -2 && a6[i3] == null)) ? null : si.f26901b;
        }
        if (dVar.K) {
            a(aVar, iArr, siVarArr, a6);
        }
        return Pair.create(siVarArr, a6);
    }

    private static List a(oo ooVar, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList = new ArrayList(ooVar.f25910a);
        for (int i5 = 0; i5 < ooVar.f25910a; i5++) {
            arrayList.add(Integer.valueOf(i5));
        }
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < ooVar.f25910a; i7++) {
                f9 a2 = ooVar.a(i7);
                int i8 = a2.f23845r;
                if (i8 > 0 && (i4 = a2.f23846s) > 0) {
                    Point a3 = a(z2, i2, i3, i8, i4);
                    int i9 = a2.f23845r;
                    int i10 = a2.f23846s;
                    int i11 = i9 * i10;
                    if (i9 >= ((int) (a3.x * 0.98f)) && i10 >= ((int) (a3.y * 0.98f)) && i11 < i6) {
                        i6 = i11;
                    }
                }
            }
            if (i6 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int b2 = ooVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (b2 == -1 || b2 > i6) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }
}
