package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.impl.f8;
import com.applovin.impl.i0;
import com.applovin.impl.m2;
import com.applovin.impl.oc;
import com.applovin.impl.vo;
import com.applovin.impl.wd;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public class k6 extends oc {

    /* renamed from: f */
    private static final int[] f5592f = new int[0];

    /* renamed from: g */
    private static final tg f5593g = tg.a(new et(7));

    /* renamed from: h */
    private static final tg f5594h = tg.a(new et(8));

    /* renamed from: d */
    private final f8.b f5595d;

    /* renamed from: e */
    private final AtomicReference f5596e;

    /* loaded from: classes.dex */
    public static final class b implements Comparable {
        public final boolean a;

        /* renamed from: b */
        private final String f5597b;

        /* renamed from: c */
        private final d f5598c;

        /* renamed from: d */
        private final boolean f5599d;

        /* renamed from: f */
        private final int f5600f;

        /* renamed from: g */
        private final int f5601g;

        /* renamed from: h */
        private final int f5602h;

        /* renamed from: i */
        private final int f5603i;

        /* renamed from: j */
        private final int f5604j;

        /* renamed from: k */
        private final boolean f5605k;

        /* renamed from: l */
        private final int f5606l;

        /* renamed from: m */
        private final int f5607m;

        /* renamed from: n */
        private final int f5608n;

        /* renamed from: o */
        private final int f5609o;

        public b(d9 d9Var, d dVar, int i10) {
            int i11;
            int i12;
            boolean z10;
            int i13;
            this.f5598c = dVar;
            this.f5597b = k6.a(d9Var.f4219c);
            int i14 = 0;
            this.f5599d = k6.a(i10, false);
            int i15 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i15 < dVar.f8592n.size()) {
                    i12 = k6.a(d9Var, (String) dVar.f8592n.get(i15), false);
                    if (i12 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                } else {
                    i12 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f5601g = i15;
            this.f5600f = i12;
            this.f5602h = Integer.bitCount(d9Var.f4221f & dVar.f8593o);
            boolean z11 = true;
            if ((d9Var.f4220d & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5605k = z10;
            int i16 = d9Var.f4240z;
            this.f5606l = i16;
            this.f5607m = d9Var.A;
            int i17 = d9Var.f4224i;
            this.f5608n = i17;
            if ((i17 != -1 && i17 > dVar.f8595q) || (i16 != -1 && i16 > dVar.f8594p)) {
                z11 = false;
            }
            this.a = z11;
            String[] e2 = yp.e();
            int i18 = 0;
            while (true) {
                if (i18 < e2.length) {
                    i13 = k6.a(d9Var, e2[i18], false);
                    if (i13 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                } else {
                    i13 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f5603i = i18;
            this.f5604j = i13;
            while (true) {
                if (i14 < dVar.f8596r.size()) {
                    String str = d9Var.f4228m;
                    if (str != null && str.equals(dVar.f8596r.get(i14))) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.f5609o = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            tg c10;
            tg tgVar;
            if (this.a && this.f5599d) {
                c10 = k6.f5593g;
            } else {
                c10 = k6.f5593g.c();
            }
            w3 a = w3.e().a(this.f5599d, bVar.f5599d).a(Integer.valueOf(this.f5601g), Integer.valueOf(bVar.f5601g), tg.a().c()).a(this.f5600f, bVar.f5600f).a(this.f5602h, bVar.f5602h).a(this.a, bVar.a).a(Integer.valueOf(this.f5609o), Integer.valueOf(bVar.f5609o), tg.a().c());
            Integer valueOf = Integer.valueOf(this.f5608n);
            Integer valueOf2 = Integer.valueOf(bVar.f5608n);
            if (!this.f5598c.f8599v) {
                tgVar = k6.f5594h;
            } else {
                tgVar = k6.f5593g.c();
            }
            w3 a10 = a.a(valueOf, valueOf2, tgVar).a(this.f5605k, bVar.f5605k).a(Integer.valueOf(this.f5603i), Integer.valueOf(bVar.f5603i), tg.a().c()).a(this.f5604j, bVar.f5604j).a(Integer.valueOf(this.f5606l), Integer.valueOf(bVar.f5606l), c10).a(Integer.valueOf(this.f5607m), Integer.valueOf(bVar.f5607m), c10);
            Integer valueOf3 = Integer.valueOf(this.f5608n);
            Integer valueOf4 = Integer.valueOf(bVar.f5608n);
            if (!yp.a((Object) this.f5597b, (Object) bVar.f5597b)) {
                c10 = k6.f5594h;
            }
            return a10.a(valueOf3, valueOf4, c10).d();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable {
        private final boolean a;

        /* renamed from: b */
        private final boolean f5610b;

        public c(d9 d9Var, int i10) {
            this.a = (d9Var.f4220d & 1) != 0;
            this.f5610b = k6.a(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            return w3.e().a(this.f5610b, cVar.f5610b).a(this.a, cVar.a).d();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends vo {
        public static final d O;
        public static final d P;
        public static final m2.a Q;
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
            d a = new e().a();
            O = a;
            P = a;
            Q = new ss(21);
        }

        private d(e eVar) {
            super(eVar);
            this.C = eVar.f5611x;
            this.D = eVar.f5612y;
            this.E = eVar.f5613z;
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
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static /* synthetic */ d d(Bundle bundle) {
            return b(bundle);
        }

        public final boolean b(int i10, qo qoVar) {
            Map map = (Map) this.M.get(i10);
            return map != null && map.containsKey(qoVar);
        }

        @Override // com.applovin.impl.vo
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.B == dVar.B && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && a(this.N, dVar.N) && a(this.M, dVar.M)) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.impl.vo
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.B) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
        }

        public final boolean d(int i10) {
            return this.N.get(i10);
        }

        private static boolean a(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !a((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return new e(bundle).a();
        }

        private static boolean a(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                qo qoVar = (qo) entry.getKey();
                if (!map2.containsKey(qoVar) || !yp.a(entry.getValue(), map2.get(qoVar))) {
                    return false;
                }
            }
            return true;
        }

        public final f a(int i10, qo qoVar) {
            Map map = (Map) this.M.get(i10);
            if (map != null) {
                return (f) map.get(qoVar);
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
    public static final class e extends vo.a {
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

        /* renamed from: x */
        private boolean f5611x;

        /* renamed from: y */
        private boolean f5612y;

        /* renamed from: z */
        private boolean f5613z;

        public e() {
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        private void c() {
            this.f5611x = true;
            this.f5612y = false;
            this.f5613z = true;
            this.A = true;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = 0;
            this.F = true;
            this.G = false;
            this.H = true;
        }

        public e b(boolean z10) {
            this.B = z10;
            return this;
        }

        public e d(boolean z10) {
            this.H = z10;
            return this;
        }

        public e e(boolean z10) {
            this.f5612y = z10;
            return this;
        }

        public e f(boolean z10) {
            this.f5613z = z10;
            return this;
        }

        public e g(boolean z10) {
            this.A = z10;
            return this;
        }

        public e h(boolean z10) {
            this.F = z10;
            return this;
        }

        public e i(boolean z10) {
            this.f5611x = z10;
            return this;
        }

        public e j(boolean z10) {
            this.G = z10;
            return this;
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i10 : iArr) {
                sparseBooleanArray.append(i10, true);
            }
            return sparseBooleanArray;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b */
        public e a(int i10, int i11, boolean z10) {
            super.a(i10, i11, z10);
            return this;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b */
        public e a(Context context, boolean z10) {
            super.a(context, z10);
            return this;
        }

        public e(Context context) {
            super(context);
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b */
        public d a() {
            return new d(this);
        }

        public e a(boolean z10) {
            this.D = z10;
            return this;
        }

        public e a(int i10) {
            this.E = i10;
            return this;
        }

        private e(Bundle bundle) {
            super(bundle);
            d dVar = d.O;
            i(bundle.getBoolean(d.b(1000), dVar.C));
            e(bundle.getBoolean(d.b(1001), dVar.D));
            f(bundle.getBoolean(d.b(1002), dVar.E));
            g(bundle.getBoolean(d.b(1003), dVar.F));
            b(bundle.getBoolean(d.b(1004), dVar.G));
            c(bundle.getBoolean(d.b(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), dVar.H));
            a(bundle.getBoolean(d.b(1006), dVar.I));
            a(bundle.getInt(d.b(1007), dVar.B));
            h(bundle.getBoolean(d.b(1008), dVar.J));
            j(bundle.getBoolean(d.b(1009), dVar.K));
            d(bundle.getBoolean(d.b(1010), dVar.L));
            this.I = new SparseArray();
            a(bundle);
            this.J = a(bundle.getIntArray(d.b(1014)));
        }

        public final e a(int i10, qo qoVar, f fVar) {
            Map map = (Map) this.I.get(i10);
            if (map == null) {
                map = new HashMap();
                this.I.put(i10, map);
            }
            if (map.containsKey(qoVar) && yp.a(map.get(qoVar), fVar)) {
                return this;
            }
            map.put(qoVar, fVar);
            return this;
        }

        public e c(boolean z10) {
            this.C = z10;
            return this;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: c */
        public e a(Context context) {
            super.a(context);
            return this;
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(d.b(1011));
            List a = n2.a(qo.f7277f, bundle.getParcelableArrayList(d.b(1012)), ab.h());
            SparseArray a10 = n2.a(f.f5614f, bundle.getSparseParcelableArray(d.b(1013)), new SparseArray());
            if (intArray == null || intArray.length != a.size()) {
                return;
            }
            for (int i10 = 0; i10 < intArray.length; i10++) {
                a(intArray[i10], (qo) a.get(i10), (f) a10.get(i10));
            }
        }

        public /* synthetic */ e(Bundle bundle, a aVar) {
            this(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements m2 {

        /* renamed from: f */
        public static final m2.a f5614f = new ss(22);
        public final int a;

        /* renamed from: b */
        public final int[] f5615b;

        /* renamed from: c */
        public final int f5616c;

        /* renamed from: d */
        public final int f5617d;

        public f(int i10, int[] iArr, int i11) {
            this.a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f5615b = copyOf;
            this.f5616c = iArr.length;
            this.f5617d = i11;
            Arrays.sort(copyOf);
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ f b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == fVar.a && Arrays.equals(this.f5615b, fVar.f5615b) && this.f5617d == fVar.f5617d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f5615b) + (this.a * 31)) * 31) + this.f5617d;
        }

        public static /* synthetic */ f a(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i11 = bundle.getInt(a(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            a1.a(z10);
            a1.a(intArray);
            return new f(i10, intArray, i11);
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Comparable {
        public final boolean a;

        /* renamed from: b */
        private final boolean f5618b;

        /* renamed from: c */
        private final boolean f5619c;

        /* renamed from: d */
        private final boolean f5620d;

        /* renamed from: f */
        private final int f5621f;

        /* renamed from: g */
        private final int f5622g;

        /* renamed from: h */
        private final int f5623h;

        /* renamed from: i */
        private final int f5624i;

        /* renamed from: j */
        private final boolean f5625j;

        public g(d9 d9Var, d dVar, int i10, String str) {
            boolean z10;
            boolean z11;
            ab abVar;
            int i11;
            boolean z12;
            boolean z13;
            boolean z14 = false;
            this.f5618b = k6.a(i10, false);
            int i12 = d9Var.f4220d & (~dVar.B);
            if ((i12 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5619c = z10;
            if ((i12 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5620d = z11;
            if (dVar.f8597s.isEmpty()) {
                abVar = ab.a("");
            } else {
                abVar = dVar.f8597s;
            }
            int i13 = 0;
            while (true) {
                if (i13 < abVar.size()) {
                    i11 = k6.a(d9Var, (String) abVar.get(i13), dVar.u);
                    if (i11 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                } else {
                    i13 = Integer.MAX_VALUE;
                    i11 = 0;
                    break;
                }
            }
            this.f5621f = i13;
            this.f5622g = i11;
            int bitCount = Integer.bitCount(d9Var.f4221f & dVar.f8598t);
            this.f5623h = bitCount;
            if ((d9Var.f4221f & 1088) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f5625j = z12;
            if (k6.a(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int a = k6.a(d9Var, str, z13);
            this.f5624i = a;
            if (i11 > 0 || ((dVar.f8597s.isEmpty() && bitCount > 0) || this.f5619c || (this.f5620d && a > 0))) {
                z14 = true;
            }
            this.a = z14;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(g gVar) {
            tg c10;
            w3 a = w3.e().a(this.f5618b, gVar.f5618b).a(Integer.valueOf(this.f5621f), Integer.valueOf(gVar.f5621f), tg.a().c()).a(this.f5622g, gVar.f5622g).a(this.f5623h, gVar.f5623h).a(this.f5619c, gVar.f5619c);
            Boolean valueOf = Boolean.valueOf(this.f5620d);
            Boolean valueOf2 = Boolean.valueOf(gVar.f5620d);
            if (this.f5622g == 0) {
                c10 = tg.a();
            } else {
                c10 = tg.a().c();
            }
            w3 a10 = a.a(valueOf, valueOf2, c10).a(this.f5624i, gVar.f5624i);
            if (this.f5623h == 0) {
                a10 = a10.b(this.f5625j, gVar.f5625j);
            }
            return a10.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Comparable {
        public final boolean a;

        /* renamed from: b */
        private final d f5626b;

        /* renamed from: c */
        private final boolean f5627c;

        /* renamed from: d */
        private final boolean f5628d;

        /* renamed from: f */
        private final int f5629f;

        /* renamed from: g */
        private final int f5630g;

        /* renamed from: h */
        private final int f5631h;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        
            if (r10 < r8.f8586h) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        
            if (r10 < r8.f8587i) goto L99;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(com.applovin.impl.d9 r7, com.applovin.impl.k6.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f5626b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f4233r
                if (r4 == r3) goto L14
                int r5 = r8.a
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f4234s
                if (r4 == r3) goto L1c
                int r5 = r8.f8581b
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f4235t
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f8582c
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f4224i
                if (r4 == r3) goto L31
                int r5 = r8.f8583d
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.a = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f4233r
                if (r10 == r3) goto L40
                int r4 = r8.f8584f
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f4234s
                if (r10 == r3) goto L48
                int r4 = r8.f8585g
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f4235t
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f8586h
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f4224i
                if (r10 == r3) goto L5f
                int r0 = r8.f8587i
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f5627c = r1
                boolean r9 = com.applovin.impl.k6.a(r9, r2)
                r6.f5628d = r9
                int r9 = r7.f4224i
                r6.f5629f = r9
                int r9 = r7.b()
                r6.f5630g = r9
            L71:
                com.applovin.impl.ab r9 = r8.f8591m
                int r9 = r9.size()
                if (r2 >= r9) goto L8d
                java.lang.String r9 = r7.f4228m
                if (r9 == 0) goto L8a
                com.applovin.impl.ab r10 = r8.f8591m
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
                r6.f5631h = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.h.<init>(com.applovin.impl.d9, com.applovin.impl.k6$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(h hVar) {
            tg c10;
            tg tgVar;
            if (this.a && this.f5628d) {
                c10 = k6.f5593g;
            } else {
                c10 = k6.f5593g.c();
            }
            w3 a = w3.e().a(this.f5628d, hVar.f5628d).a(this.a, hVar.a).a(this.f5627c, hVar.f5627c).a(Integer.valueOf(this.f5631h), Integer.valueOf(hVar.f5631h), tg.a().c());
            Integer valueOf = Integer.valueOf(this.f5629f);
            Integer valueOf2 = Integer.valueOf(hVar.f5629f);
            if (!this.f5626b.f8599v) {
                tgVar = k6.f5594h;
            } else {
                tgVar = k6.f5593g.c();
            }
            return a.a(valueOf, valueOf2, tgVar).a(Integer.valueOf(this.f5630g), Integer.valueOf(hVar.f5630g), c10).a(Integer.valueOf(this.f5629f), Integer.valueOf(hVar.f5629f), c10).d();
        }
    }

    public k6(Context context) {
        this(context, new i0.b());
    }

    private static void a(po poVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list.get(size)).intValue();
            if (!a(poVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public static /* synthetic */ int c(Integer num, Integer num2) {
        return a(num, num2);
    }

    public static /* synthetic */ int d(Integer num, Integer num2) {
        return b(num, num2);
    }

    public k6(Context context, f8.b bVar) {
        this(d.a(context), bVar);
    }

    @Override // com.applovin.impl.wo
    public boolean b() {
        return true;
    }

    public k6(d dVar, f8.b bVar) {
        this.f5595d = bVar;
        this.f5596e = new AtomicReference(dVar);
    }

    private static int b(po poVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int intValue = ((Integer) list.get(i20)).intValue();
            if (a(poVar.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    private static int[] a(po poVar, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        d9 a10 = poVar.a(i10);
        int[] iArr2 = new int[poVar.a];
        int i12 = 0;
        for (int i13 = 0; i13 < poVar.a; i13++) {
            if (i13 == i10 || a(poVar.a(i13), iArr[i13], a10, i11, z10, z11, z12)) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return Arrays.copyOf(iArr2, i12);
    }

    public f8.a b(qo qoVar, int[][] iArr, int i10, d dVar, boolean z10) {
        f8.a a10 = (dVar.f8600w || dVar.f8599v || !z10) ? null : a(qoVar, iArr, i10, dVar);
        return a10 == null ? a(qoVar, iArr, dVar) : a10;
    }

    private static int[] a(po poVar, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        int i21;
        int i22;
        HashSet hashSet;
        if (poVar.a < 2) {
            return f5592f;
        }
        List a10 = a(poVar, i19, i20, z11);
        if (a10.size() < 2) {
            return f5592f;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i24 < a10.size()) {
                String str3 = poVar.a(((Integer) a10.get(i24)).intValue()).f4228m;
                if (hashSet2.add(str3)) {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                    int b3 = b(poVar, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, a10);
                    if (b3 > i21) {
                        i23 = b3;
                        str2 = str3;
                        i24 = i22 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                }
                i23 = i21;
                i24 = i22 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        a(poVar, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, a10);
        return a10.size() < 2 ? f5592f : pb.a(a10);
    }

    public static int a(d9 d9Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(d9Var.f4219c)) {
            return 4;
        }
        String a10 = a(str);
        String a11 = a(d9Var.f4219c);
        if (a11 == null || a10 == null) {
            return (z10 && a11 == null) ? 1 : 0;
        }
        if (a11.startsWith(a10) || a10.startsWith(a11)) {
            return 3;
        }
        return yp.b(a11, "-")[0].equals(yp.b(a10, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.applovin.impl.yp.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.impl.yp.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.a(boolean, int, int, int, int):android.graphics.Point");
    }

    public static boolean a(int i10, boolean z10) {
        int d10 = mi.d(i10);
        return d10 == 4 || (z10 && d10 == 3);
    }

    private static boolean a(d9 d9Var, int i10, d9 d9Var2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        int i13;
        String str;
        int i14;
        if (!a(i10, false) || (i12 = d9Var.f4224i) == -1 || i12 > i11) {
            return false;
        }
        if (!z12 && ((i14 = d9Var.f4240z) == -1 || i14 != d9Var2.f4240z)) {
            return false;
        }
        if (z10 || ((str = d9Var.f4228m) != null && TextUtils.equals(str, d9Var2.f4228m))) {
            return z11 || ((i13 = d9Var.A) != -1 && i13 == d9Var2.A);
        }
        return false;
    }

    private static boolean a(d9 d9Var, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        if ((d9Var.f4221f & JsonLexerKt.BATCH_SIZE) != 0 || !a(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !yp.a((Object) d9Var.f4228m, (Object) str)) {
            return false;
        }
        int i21 = d9Var.f4233r;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        int i22 = d9Var.f4234s;
        if (i22 != -1 && (i17 > i22 || i22 > i13)) {
            return false;
        }
        float f10 = d9Var.f4235t;
        return (f10 == -1.0f || (((float) i18) <= f10 && f10 <= ((float) i14))) && (i20 = d9Var.f4224i) != -1 && i19 <= i20 && i20 <= i15;
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

    private static void a(oc.a aVar, int[][][] iArr, ni[] niVarArr, f8[] f8VarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.a(); i12++) {
            int a10 = aVar.a(i12);
            f8 f8Var = f8VarArr[i12];
            if ((a10 == 1 || a10 == 2) && f8Var != null && a(iArr[i12], aVar.b(i12), f8Var)) {
                if (a10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            ni niVar = new ni(true);
            niVarArr[i11] = niVar;
            niVarArr[i10] = niVar;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    private static boolean a(int[][] iArr, qo qoVar, f8 f8Var) {
        if (f8Var == null) {
            return false;
        }
        int a10 = qoVar.a(f8Var.a());
        for (int i10 = 0; i10 < f8Var.b(); i10++) {
            if (mi.c(iArr[a10][f8Var.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static f8.a a(qo qoVar, int[][] iArr, int i10, d dVar) {
        qo qoVar2 = qoVar;
        d dVar2 = dVar;
        int i11 = dVar2.E ? 24 : 16;
        boolean z10 = dVar2.D && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < qoVar2.a) {
            po a10 = qoVar2.a(i12);
            int i13 = i12;
            int[] a11 = a(a10, iArr[i12], z10, i11, dVar2.a, dVar2.f8581b, dVar2.f8582c, dVar2.f8583d, dVar2.f8584f, dVar2.f8585g, dVar2.f8586h, dVar2.f8587i, dVar2.f8588j, dVar2.f8589k, dVar2.f8590l);
            if (a11.length > 0) {
                return new f8.a(a10, a11);
            }
            i12 = i13 + 1;
            qoVar2 = qoVar;
            dVar2 = dVar;
        }
        return null;
    }

    public f8.a[] a(oc.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        boolean z10;
        String str;
        int i10;
        String str2;
        b bVar;
        int i11;
        int a10 = aVar.a();
        f8.a[] aVarArr = new f8.a[a10];
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            if (i13 >= a10) {
                break;
            }
            if (2 == aVar.a(i13)) {
                if (!z11) {
                    f8.a b3 = b(aVar.b(i13), iArr[i13], iArr2[i13], dVar, true);
                    aVarArr[i13] = b3;
                    z11 = b3 != null;
                }
                z12 |= aVar.b(i13).a > 0;
            }
            i13++;
        }
        int i14 = 0;
        int i15 = -1;
        String str3 = null;
        b bVar2 = null;
        while (i14 < a10) {
            if (z10 == aVar.a(i14)) {
                boolean z13 = (dVar.L || !z12) ? z10 : false;
                i10 = i15;
                str2 = str3;
                bVar = bVar2;
                i11 = i14;
                Pair a11 = a(aVar.b(i14), iArr[i14], iArr2[i14], dVar, z13);
                if (a11 != null && (bVar == null || ((b) a11.second).compareTo(bVar) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    f8.a aVar2 = (f8.a) a11.first;
                    aVarArr[i11] = aVar2;
                    str3 = aVar2.a.a(aVar2.f4622b[0]).f4219c;
                    bVar2 = (b) a11.second;
                    i15 = i11;
                    i14 = i11 + 1;
                    z10 = true;
                }
            } else {
                i10 = i15;
                str2 = str3;
                bVar = bVar2;
                i11 = i14;
            }
            i15 = i10;
            bVar2 = bVar;
            str3 = str2;
            i14 = i11 + 1;
            z10 = true;
        }
        String str4 = str3;
        int i16 = -1;
        g gVar = null;
        while (i12 < a10) {
            int a12 = aVar.a(i12);
            if (a12 != 1) {
                if (a12 != 2) {
                    if (a12 != 3) {
                        aVarArr[i12] = a(a12, aVar.b(i12), iArr[i12], dVar);
                    } else {
                        str = str4;
                        Pair a13 = a(aVar.b(i12), iArr[i12], dVar, str);
                        if (a13 != null && (gVar == null || ((g) a13.second).compareTo(gVar) > 0)) {
                            if (i16 != -1) {
                                aVarArr[i16] = null;
                            }
                            aVarArr[i12] = (f8.a) a13.first;
                            gVar = (g) a13.second;
                            i16 = i12;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i12++;
            str4 = str;
        }
        return aVarArr;
    }

    public Pair a(qo qoVar, int[][] iArr, int i10, d dVar, boolean z10) {
        f8.a aVar = null;
        int i11 = -1;
        int i12 = -1;
        b bVar = null;
        for (int i13 = 0; i13 < qoVar.a; i13++) {
            po a10 = qoVar.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < a10.a; i14++) {
                if (a(iArr2[i14], dVar.J)) {
                    b bVar2 = new b(a10.a(i14), dVar, iArr2[i14]);
                    if ((bVar2.a || dVar.F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        po a11 = qoVar.a(i11);
        if (!dVar.f8600w && !dVar.f8599v && z10) {
            int[] a12 = a(a11, iArr[i11], i12, dVar.f8595q, dVar.G, dVar.H, dVar.I);
            if (a12.length > 1) {
                aVar = new f8.a(a11, a12);
            }
        }
        if (aVar == null) {
            aVar = new f8.a(a11, i12);
        }
        return Pair.create(aVar, (b) a1.a(bVar));
    }

    private static f8.a a(qo qoVar, int[][] iArr, d dVar) {
        int i10 = -1;
        po poVar = null;
        h hVar = null;
        for (int i11 = 0; i11 < qoVar.a; i11++) {
            po a10 = qoVar.a(i11);
            List a11 = a(a10, dVar.f8588j, dVar.f8589k, dVar.f8590l);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < a10.a; i12++) {
                d9 a12 = a10.a(i12);
                if ((a12.f4221f & JsonLexerKt.BATCH_SIZE) == 0 && a(iArr2[i12], dVar.J)) {
                    h hVar2 = new h(a12, dVar, iArr2[i12], a11.contains(Integer.valueOf(i12)));
                    if ((hVar2.a || dVar.C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        poVar = a10;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i10);
    }

    public f8.a a(int i10, qo qoVar, int[][] iArr, d dVar) {
        po poVar = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < qoVar.a; i12++) {
            po a10 = qoVar.a(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a10.a; i13++) {
                if (a(iArr2[i13], dVar.J)) {
                    c cVar2 = new c(a10.a(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        poVar = a10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i11);
    }

    public Pair a(qo qoVar, int[][] iArr, d dVar, String str) {
        int i10 = -1;
        po poVar = null;
        g gVar = null;
        for (int i11 = 0; i11 < qoVar.a; i11++) {
            po a10 = qoVar.a(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < a10.a; i12++) {
                if (a(iArr2[i12], dVar.J)) {
                    g gVar2 = new g(a10.a(i12), dVar, iArr2[i12], str);
                    if (gVar2.a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        poVar = a10;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return Pair.create(new f8.a(poVar, i10), (g) a1.a(gVar));
    }

    @Override // com.applovin.impl.oc
    public final Pair a(oc.a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar) {
        d dVar = (d) this.f5596e.get();
        int a10 = aVar.a();
        f8.a[] a11 = a(aVar, iArr, iArr2, dVar);
        int i10 = 0;
        while (true) {
            if (i10 >= a10) {
                break;
            }
            int a12 = aVar.a(i10);
            if (!dVar.d(i10) && !dVar.f8601x.contains(Integer.valueOf(a12))) {
                qo b3 = aVar.b(i10);
                if (dVar.b(i10, b3)) {
                    f a13 = dVar.a(i10, b3);
                    a11[i10] = a13 != null ? new f8.a(b3.a(a13.a), a13.f5615b, a13.f5617d) : null;
                }
            } else {
                a11[i10] = null;
            }
            i10++;
        }
        f8[] a14 = this.f5595d.a(a11, a(), aVar2, goVar);
        ni[] niVarArr = new ni[a10];
        for (int i11 = 0; i11 < a10; i11++) {
            niVarArr[i11] = (dVar.d(i11) || dVar.f8601x.contains(Integer.valueOf(aVar.a(i11))) || (aVar.a(i11) != -2 && a14[i11] == null)) ? null : ni.f6416b;
        }
        if (dVar.K) {
            a(aVar, iArr, niVarArr, a14);
        }
        return Pair.create(niVarArr, a14);
    }

    private static List a(po poVar, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(poVar.a);
        for (int i13 = 0; i13 < poVar.a; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < poVar.a; i15++) {
                d9 a10 = poVar.a(i15);
                int i16 = a10.f4233r;
                if (i16 > 0 && (i12 = a10.f4234s) > 0) {
                    Point a11 = a(z10, i10, i11, i16, i12);
                    int i17 = a10.f4233r;
                    int i18 = a10.f4234s;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (a11.x * 0.98f)) && i18 >= ((int) (a11.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int b3 = poVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (b3 == -1 || b3 > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }
}
