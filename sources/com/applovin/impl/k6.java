package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.impl.C0707i0;
import com.applovin.impl.InterfaceC0725m2;
import com.applovin.impl.f8;
import com.applovin.impl.oc;
import com.applovin.impl.vo;
import com.applovin.impl.wd;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class k6 extends oc {

    /* renamed from: f */
    private static final int[] f8541f = new int[0];

    /* renamed from: g */
    private static final tg f8542g = tg.a(new X(7));

    /* renamed from: h */
    private static final tg f8543h = tg.a(new X(8));

    /* renamed from: d */
    private final f8.b f8544d;

    /* renamed from: e */
    private final AtomicReference f8545e;

    /* loaded from: classes.dex */
    public static final class b implements Comparable {

        /* renamed from: a */
        public final boolean f8546a;
        private final String b;

        /* renamed from: c */
        private final d f8547c;

        /* renamed from: d */
        private final boolean f8548d;

        /* renamed from: f */
        private final int f8549f;

        /* renamed from: g */
        private final int f8550g;

        /* renamed from: h */
        private final int f8551h;

        /* renamed from: i */
        private final int f8552i;

        /* renamed from: j */
        private final int f8553j;

        /* renamed from: k */
        private final boolean f8554k;
        private final int l;
        private final int m;

        /* renamed from: n */
        private final int f8555n;

        /* renamed from: o */
        private final int f8556o;

        public b(d9 d9Var, d dVar, int i9) {
            int i10;
            int i11;
            boolean z8;
            int i12;
            this.f8547c = dVar;
            this.b = k6.a(d9Var.f7203c);
            int i13 = 0;
            this.f8548d = k6.a(i9, false);
            int i14 = 0;
            while (true) {
                i10 = Integer.MAX_VALUE;
                if (i14 < dVar.f11809n.size()) {
                    i11 = k6.a(d9Var, (String) dVar.f11809n.get(i14), false);
                    if (i11 > 0) {
                        break;
                    } else {
                        i14++;
                    }
                } else {
                    i11 = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f8550g = i14;
            this.f8549f = i11;
            this.f8551h = Integer.bitCount(d9Var.f7205f & dVar.f11810o);
            boolean z9 = true;
            if ((d9Var.f7204d & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f8554k = z8;
            int i15 = d9Var.f7223z;
            this.l = i15;
            this.m = d9Var.f7195A;
            int i16 = d9Var.f7208i;
            this.f8555n = i16;
            if ((i16 != -1 && i16 > dVar.f11812q) || (i15 != -1 && i15 > dVar.f11811p)) {
                z9 = false;
            }
            this.f8546a = z9;
            String[] e4 = yp.e();
            int i17 = 0;
            while (true) {
                if (i17 < e4.length) {
                    i12 = k6.a(d9Var, e4[i17], false);
                    if (i12 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    i12 = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f8552i = i17;
            this.f8553j = i12;
            while (true) {
                if (i13 < dVar.f11813r.size()) {
                    String str = d9Var.m;
                    if (str != null && str.equals(dVar.f11813r.get(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            this.f8556o = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            tg c9;
            tg tgVar;
            if (this.f8546a && this.f8548d) {
                c9 = k6.f8542g;
            } else {
                c9 = k6.f8542g.c();
            }
            w3 a6 = w3.e().a(this.f8548d, bVar.f8548d).a(Integer.valueOf(this.f8550g), Integer.valueOf(bVar.f8550g), tg.a().c()).a(this.f8549f, bVar.f8549f).a(this.f8551h, bVar.f8551h).a(this.f8546a, bVar.f8546a).a(Integer.valueOf(this.f8556o), Integer.valueOf(bVar.f8556o), tg.a().c());
            Integer valueOf = Integer.valueOf(this.f8555n);
            Integer valueOf2 = Integer.valueOf(bVar.f8555n);
            if (!this.f8547c.f11817v) {
                tgVar = k6.f8543h;
            } else {
                tgVar = k6.f8542g.c();
            }
            w3 a9 = a6.a(valueOf, valueOf2, tgVar).a(this.f8554k, bVar.f8554k).a(Integer.valueOf(this.f8552i), Integer.valueOf(bVar.f8552i), tg.a().c()).a(this.f8553j, bVar.f8553j).a(Integer.valueOf(this.l), Integer.valueOf(bVar.l), c9).a(Integer.valueOf(this.m), Integer.valueOf(bVar.m), c9);
            Integer valueOf3 = Integer.valueOf(this.f8555n);
            Integer valueOf4 = Integer.valueOf(bVar.f8555n);
            if (!yp.a((Object) this.b, (Object) bVar.b)) {
                c9 = k6.f8543h;
            }
            return a9.a(valueOf3, valueOf4, c9).d();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable {

        /* renamed from: a */
        private final boolean f8557a;
        private final boolean b;

        public c(d9 d9Var, int i9) {
            this.f8557a = (d9Var.f7204d & 1) != 0;
            this.b = k6.a(i9, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            return w3.e().a(this.b, cVar.b).a(this.f8557a, cVar.f8557a).d();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends vo implements InterfaceC0725m2 {
        public static final d O;

        /* renamed from: P */
        public static final d f8558P;

        /* renamed from: Q */
        public static final InterfaceC0725m2.a f8559Q;

        /* renamed from: B */
        public final int f8560B;

        /* renamed from: C */
        public final boolean f8561C;

        /* renamed from: D */
        public final boolean f8562D;

        /* renamed from: E */
        public final boolean f8563E;

        /* renamed from: F */
        public final boolean f8564F;

        /* renamed from: G */
        public final boolean f8565G;

        /* renamed from: H */
        public final boolean f8566H;

        /* renamed from: I */
        public final boolean f8567I;

        /* renamed from: J */
        public final boolean f8568J;

        /* renamed from: K */
        public final boolean f8569K;

        /* renamed from: L */
        public final boolean f8570L;

        /* renamed from: M */
        private final SparseArray f8571M;

        /* renamed from: N */
        private final SparseBooleanArray f8572N;

        static {
            d a6 = new e().a();
            O = a6;
            f8558P = a6;
            f8559Q = new I(22);
        }

        private d(e eVar) {
            super(eVar);
            this.f8561C = eVar.f8583x;
            this.f8562D = eVar.f8584y;
            this.f8563E = eVar.f8585z;
            this.f8564F = eVar.f8573A;
            this.f8565G = eVar.f8574B;
            this.f8566H = eVar.f8575C;
            this.f8567I = eVar.f8576D;
            this.f8560B = eVar.f8577E;
            this.f8568J = eVar.f8578F;
            this.f8569K = eVar.f8579G;
            this.f8570L = eVar.f8580H;
            this.f8571M = eVar.f8581I;
            this.f8572N = eVar.f8582J;
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i9)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(int i9, qo qoVar) {
            Map map = (Map) this.f8571M.get(i9);
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
            if (super.equals(dVar) && this.f8561C == dVar.f8561C && this.f8562D == dVar.f8562D && this.f8563E == dVar.f8563E && this.f8564F == dVar.f8564F && this.f8565G == dVar.f8565G && this.f8566H == dVar.f8566H && this.f8567I == dVar.f8567I && this.f8560B == dVar.f8560B && this.f8568J == dVar.f8568J && this.f8569K == dVar.f8569K && this.f8570L == dVar.f8570L && a(this.f8572N, dVar.f8572N) && a(this.f8571M, dVar.f8571M)) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.impl.vo
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f8561C ? 1 : 0)) * 31) + (this.f8562D ? 1 : 0)) * 31) + (this.f8563E ? 1 : 0)) * 31) + (this.f8564F ? 1 : 0)) * 31) + (this.f8565G ? 1 : 0)) * 31) + (this.f8566H ? 1 : 0)) * 31) + (this.f8567I ? 1 : 0)) * 31) + this.f8560B) * 31) + (this.f8568J ? 1 : 0)) * 31) + (this.f8569K ? 1 : 0)) * 31) + (this.f8570L ? 1 : 0);
        }

        public final boolean d(int i9) {
            return this.f8572N.get(i9);
        }

        private static boolean a(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i9));
                if (indexOfKey < 0 || !a((Map) sparseArray.valueAt(i9), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static String b(int i9) {
            return Integer.toString(i9, 36);
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

        public final f a(int i9, qo qoVar) {
            Map map = (Map) this.f8571M.get(i9);
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

        /* renamed from: A */
        private boolean f8573A;

        /* renamed from: B */
        private boolean f8574B;

        /* renamed from: C */
        private boolean f8575C;

        /* renamed from: D */
        private boolean f8576D;

        /* renamed from: E */
        private int f8577E;

        /* renamed from: F */
        private boolean f8578F;

        /* renamed from: G */
        private boolean f8579G;

        /* renamed from: H */
        private boolean f8580H;

        /* renamed from: I */
        private final SparseArray f8581I;

        /* renamed from: J */
        private final SparseBooleanArray f8582J;

        /* renamed from: x */
        private boolean f8583x;

        /* renamed from: y */
        private boolean f8584y;

        /* renamed from: z */
        private boolean f8585z;

        public e() {
            this.f8581I = new SparseArray();
            this.f8582J = new SparseBooleanArray();
            c();
        }

        private void c() {
            this.f8583x = true;
            this.f8584y = false;
            this.f8585z = true;
            this.f8573A = true;
            this.f8574B = false;
            this.f8575C = false;
            this.f8576D = false;
            this.f8577E = 0;
            this.f8578F = true;
            this.f8579G = false;
            this.f8580H = true;
        }

        public e b(boolean z8) {
            this.f8574B = z8;
            return this;
        }

        public e d(boolean z8) {
            this.f8580H = z8;
            return this;
        }

        public e e(boolean z8) {
            this.f8584y = z8;
            return this;
        }

        public e f(boolean z8) {
            this.f8585z = z8;
            return this;
        }

        public e g(boolean z8) {
            this.f8573A = z8;
            return this;
        }

        public e h(boolean z8) {
            this.f8578F = z8;
            return this;
        }

        public e i(boolean z8) {
            this.f8583x = z8;
            return this;
        }

        public e j(boolean z8) {
            this.f8579G = z8;
            return this;
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i9 : iArr) {
                sparseBooleanArray.append(i9, true);
            }
            return sparseBooleanArray;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b */
        public e a(int i9, int i10, boolean z8) {
            super.a(i9, i10, z8);
            return this;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b */
        public e a(Context context, boolean z8) {
            super.a(context, z8);
            return this;
        }

        public e(Context context) {
            super(context);
            this.f8581I = new SparseArray();
            this.f8582J = new SparseBooleanArray();
            c();
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b */
        public d a() {
            return new d(this);
        }

        public e a(boolean z8) {
            this.f8576D = z8;
            return this;
        }

        public e a(int i9) {
            this.f8577E = i9;
            return this;
        }

        private e(Bundle bundle) {
            super(bundle);
            d dVar = d.O;
            i(bundle.getBoolean(d.b(1000), dVar.f8561C));
            e(bundle.getBoolean(d.b(1001), dVar.f8562D));
            f(bundle.getBoolean(d.b(1002), dVar.f8563E));
            g(bundle.getBoolean(d.b(1003), dVar.f8564F));
            b(bundle.getBoolean(d.b(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), dVar.f8565G));
            c(bundle.getBoolean(d.b(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), dVar.f8566H));
            a(bundle.getBoolean(d.b(1006), dVar.f8567I));
            a(bundle.getInt(d.b(1007), dVar.f8560B));
            h(bundle.getBoolean(d.b(1008), dVar.f8568J));
            j(bundle.getBoolean(d.b(1009), dVar.f8569K));
            d(bundle.getBoolean(d.b(1010), dVar.f8570L));
            this.f8581I = new SparseArray();
            a(bundle);
            this.f8582J = a(bundle.getIntArray(d.b(1014)));
        }

        public final e a(int i9, qo qoVar, f fVar) {
            Map map = (Map) this.f8581I.get(i9);
            if (map == null) {
                map = new HashMap();
                this.f8581I.put(i9, map);
            }
            if (map.containsKey(qoVar) && yp.a(map.get(qoVar), fVar)) {
                return this;
            }
            map.put(qoVar, fVar);
            return this;
        }

        public e c(boolean z8) {
            this.f8575C = z8;
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
            List a6 = AbstractC0729n2.a(qo.f10420f, bundle.getParcelableArrayList(d.b(1012)), ab.h());
            SparseArray a9 = AbstractC0729n2.a(f.f8586f, bundle.getSparseParcelableArray(d.b(1013)), new SparseArray());
            if (intArray == null || intArray.length != a6.size()) {
                return;
            }
            for (int i9 = 0; i9 < intArray.length; i9++) {
                a(intArray[i9], (qo) a6.get(i9), (f) a9.get(i9));
            }
        }

        public /* synthetic */ e(Bundle bundle, a aVar) {
            this(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements InterfaceC0725m2 {

        /* renamed from: f */
        public static final InterfaceC0725m2.a f8586f = new I(23);

        /* renamed from: a */
        public final int f8587a;
        public final int[] b;

        /* renamed from: c */
        public final int f8588c;

        /* renamed from: d */
        public final int f8589d;

        public f(int i9, int[] iArr, int i10) {
            this.f8587a = i9;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.b = copyOf;
            this.f8588c = iArr.length;
            this.f8589d = i10;
            Arrays.sort(copyOf);
        }

        private static String a(int i9) {
            return Integer.toString(i9, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f8587a == fVar.f8587a && Arrays.equals(this.b, fVar.b) && this.f8589d == fVar.f8589d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.b) + (this.f8587a * 31)) * 31) + this.f8589d;
        }

        public static /* synthetic */ f a(Bundle bundle) {
            boolean z8 = false;
            int i9 = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i10 = bundle.getInt(a(2), -1);
            if (i9 >= 0 && i10 >= 0) {
                z8 = true;
            }
            AbstractC0669a1.a(z8);
            AbstractC0669a1.a(intArray);
            return new f(i9, intArray, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Comparable {

        /* renamed from: a */
        public final boolean f8590a;
        private final boolean b;

        /* renamed from: c */
        private final boolean f8591c;

        /* renamed from: d */
        private final boolean f8592d;

        /* renamed from: f */
        private final int f8593f;

        /* renamed from: g */
        private final int f8594g;

        /* renamed from: h */
        private final int f8595h;

        /* renamed from: i */
        private final int f8596i;

        /* renamed from: j */
        private final boolean f8597j;

        public g(d9 d9Var, d dVar, int i9, String str) {
            boolean z8;
            boolean z9;
            ab abVar;
            int i10;
            boolean z10;
            boolean z11;
            boolean z12 = false;
            this.b = k6.a(i9, false);
            int i11 = d9Var.f7204d & (~dVar.f8560B);
            if ((i11 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f8591c = z8;
            if ((i11 & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f8592d = z9;
            if (dVar.f11814s.isEmpty()) {
                abVar = ab.a("");
            } else {
                abVar = dVar.f11814s;
            }
            int i12 = 0;
            while (true) {
                if (i12 < abVar.size()) {
                    i10 = k6.a(d9Var, (String) abVar.get(i12), dVar.f11816u);
                    if (i10 > 0) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    i12 = Integer.MAX_VALUE;
                    i10 = 0;
                    break;
                }
            }
            this.f8593f = i12;
            this.f8594g = i10;
            int bitCount = Integer.bitCount(d9Var.f7205f & dVar.f11815t);
            this.f8595h = bitCount;
            if ((d9Var.f7205f & 1088) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f8597j = z10;
            if (k6.a(str) == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int a6 = k6.a(d9Var, str, z11);
            this.f8596i = a6;
            if (i10 > 0 || ((dVar.f11814s.isEmpty() && bitCount > 0) || this.f8591c || (this.f8592d && a6 > 0))) {
                z12 = true;
            }
            this.f8590a = z12;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(g gVar) {
            tg c9;
            w3 a6 = w3.e().a(this.b, gVar.b).a(Integer.valueOf(this.f8593f), Integer.valueOf(gVar.f8593f), tg.a().c()).a(this.f8594g, gVar.f8594g).a(this.f8595h, gVar.f8595h).a(this.f8591c, gVar.f8591c);
            Boolean valueOf = Boolean.valueOf(this.f8592d);
            Boolean valueOf2 = Boolean.valueOf(gVar.f8592d);
            if (this.f8594g == 0) {
                c9 = tg.a();
            } else {
                c9 = tg.a().c();
            }
            w3 a9 = a6.a(valueOf, valueOf2, c9).a(this.f8596i, gVar.f8596i);
            if (this.f8595h == 0) {
                a9 = a9.b(this.f8597j, gVar.f8597j);
            }
            return a9.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Comparable {

        /* renamed from: a */
        public final boolean f8598a;
        private final d b;

        /* renamed from: c */
        private final boolean f8599c;

        /* renamed from: d */
        private final boolean f8600d;

        /* renamed from: f */
        private final int f8601f;

        /* renamed from: g */
        private final int f8602g;

        /* renamed from: h */
        private final int f8603h;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        
            if (r10 < r8.f11805h) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        
            if (r10 < r8.f11806i) goto L99;
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
                r6.b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f7215r
                if (r4 == r3) goto L14
                int r5 = r8.f11800a
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f7216s
                if (r4 == r3) goto L1c
                int r5 = r8.b
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f7217t
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f11801c
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f7208i
                if (r4 == r3) goto L31
                int r5 = r8.f11802d
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f8598a = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f7215r
                if (r10 == r3) goto L40
                int r4 = r8.f11803f
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f7216s
                if (r10 == r3) goto L48
                int r4 = r8.f11804g
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f7217t
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f11805h
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f7208i
                if (r10 == r3) goto L5f
                int r0 = r8.f11806i
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f8599c = r1
                boolean r9 = com.applovin.impl.k6.a(r9, r2)
                r6.f8600d = r9
                int r9 = r7.f7208i
                r6.f8601f = r9
                int r9 = r7.b()
                r6.f8602g = r9
            L71:
                com.applovin.impl.ab r9 = r8.m
                int r9 = r9.size()
                if (r2 >= r9) goto L8d
                java.lang.String r9 = r7.m
                if (r9 == 0) goto L8a
                com.applovin.impl.ab r10 = r8.m
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
                r6.f8603h = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.h.<init>(com.applovin.impl.d9, com.applovin.impl.k6$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(h hVar) {
            tg c9;
            tg tgVar;
            if (this.f8598a && this.f8600d) {
                c9 = k6.f8542g;
            } else {
                c9 = k6.f8542g.c();
            }
            w3 a6 = w3.e().a(this.f8600d, hVar.f8600d).a(this.f8598a, hVar.f8598a).a(this.f8599c, hVar.f8599c).a(Integer.valueOf(this.f8603h), Integer.valueOf(hVar.f8603h), tg.a().c());
            Integer valueOf = Integer.valueOf(this.f8601f);
            Integer valueOf2 = Integer.valueOf(hVar.f8601f);
            if (!this.b.f11817v) {
                tgVar = k6.f8543h;
            } else {
                tgVar = k6.f8542g.c();
            }
            return a6.a(valueOf, valueOf2, tgVar).a(Integer.valueOf(this.f8602g), Integer.valueOf(hVar.f8602g), c9).a(Integer.valueOf(this.f8601f), Integer.valueOf(hVar.f8601f), c9).d();
        }
    }

    public k6(Context context) {
        this(context, new C0707i0.b());
    }

    private static void a(po poVar, int[] iArr, int i9, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list.get(size)).intValue();
            if (!a(poVar.a(intValue), str, iArr[intValue], i9, i10, i11, i12, i13, i14, i15, i16, i17)) {
                list.remove(size);
            }
        }
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public k6(Context context, f8.b bVar) {
        this(d.a(context), bVar);
    }

    @Override // com.applovin.impl.wo
    public boolean b() {
        return true;
    }

    public k6(d dVar, f8.b bVar) {
        this.f8544d = bVar;
        this.f8545e = new AtomicReference(dVar);
    }

    private static int b(po poVar, int[] iArr, int i9, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List list) {
        int i18 = 0;
        for (int i19 = 0; i19 < list.size(); i19++) {
            int intValue = ((Integer) list.get(i19)).intValue();
            if (a(poVar.a(intValue), str, iArr[intValue], i9, i10, i11, i12, i13, i14, i15, i16, i17)) {
                i18++;
            }
        }
        return i18;
    }

    private static int[] a(po poVar, int[] iArr, int i9, int i10, boolean z8, boolean z9, boolean z10) {
        d9 a6 = poVar.a(i9);
        int[] iArr2 = new int[poVar.f10058a];
        int i11 = 0;
        for (int i12 = 0; i12 < poVar.f10058a; i12++) {
            if (i12 == i9 || a(poVar.a(i12), iArr[i12], a6, i10, z8, z9, z10)) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return Arrays.copyOf(iArr2, i11);
    }

    public f8.a b(qo qoVar, int[][] iArr, int i9, d dVar, boolean z8) {
        f8.a a6 = (dVar.f11818w || dVar.f11817v || !z8) ? null : a(qoVar, iArr, i9, dVar);
        return a6 == null ? a(qoVar, iArr, dVar) : a6;
    }

    private static int[] a(po poVar, int[] iArr, boolean z8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z9) {
        String str;
        int i20;
        int i21;
        HashSet hashSet;
        if (poVar.f10058a < 2) {
            return f8541f;
        }
        List a6 = a(poVar, i18, i19, z9);
        if (a6.size() < 2) {
            return f8541f;
        }
        if (z8) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i22 = 0;
            int i23 = 0;
            while (i23 < a6.size()) {
                String str3 = poVar.a(((Integer) a6.get(i23)).intValue()).m;
                if (hashSet2.add(str3)) {
                    i20 = i22;
                    i21 = i23;
                    hashSet = hashSet2;
                    int b8 = b(poVar, iArr, i9, str3, i10, i11, i12, i13, i14, i15, i16, i17, a6);
                    if (b8 > i20) {
                        i22 = b8;
                        str2 = str3;
                        i23 = i21 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i20 = i22;
                    i21 = i23;
                    hashSet = hashSet2;
                }
                i22 = i20;
                i23 = i21 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        a(poVar, iArr, i9, str, i10, i11, i12, i13, i14, i15, i16, i17, a6);
        return a6.size() < 2 ? f8541f : pb.a(a6);
    }

    public static int a(d9 d9Var, String str, boolean z8) {
        if (!TextUtils.isEmpty(str) && str.equals(d9Var.f7203c)) {
            return 4;
        }
        String a6 = a(str);
        String a9 = a(d9Var.f7203c);
        if (a9 == null || a6 == null) {
            return (z8 && a9 == null) ? 1 : 0;
        }
        if (a9.startsWith(a6) || a6.startsWith(a9)) {
            return 3;
        }
        return yp.b(a9, "-")[0].equals(yp.b(a6, "-")[0]) ? 2 : 0;
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
            int r4 = com.applovin.impl.yp.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.impl.yp.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.a(boolean, int, int, int, int):android.graphics.Point");
    }

    public static boolean a(int i9, boolean z8) {
        int d2 = mi.d(i9);
        return d2 == 4 || (z8 && d2 == 3);
    }

    private static boolean a(d9 d9Var, int i9, d9 d9Var2, int i10, boolean z8, boolean z9, boolean z10) {
        int i11;
        int i12;
        String str;
        int i13;
        if (!a(i9, false) || (i11 = d9Var.f7208i) == -1 || i11 > i10) {
            return false;
        }
        if (!z10 && ((i13 = d9Var.f7223z) == -1 || i13 != d9Var2.f7223z)) {
            return false;
        }
        if (z8 || ((str = d9Var.m) != null && TextUtils.equals(str, d9Var2.m))) {
            return z9 || ((i12 = d9Var.f7195A) != -1 && i12 == d9Var2.f7195A);
        }
        return false;
    }

    private static boolean a(d9 d9Var, String str, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        if ((d9Var.f7205f & 16384) != 0 || !a(i9, false) || (i9 & i10) == 0) {
            return false;
        }
        if (str != null && !yp.a((Object) d9Var.m, (Object) str)) {
            return false;
        }
        int i20 = d9Var.f7215r;
        if (i20 != -1 && (i15 > i20 || i20 > i11)) {
            return false;
        }
        int i21 = d9Var.f7216s;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        float f9 = d9Var.f7217t;
        return (f9 == -1.0f || (((float) i17) <= f9 && f9 <= ((float) i13))) && (i19 = d9Var.f7208i) != -1 && i18 <= i19 && i19 <= i14;
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
        boolean z8;
        boolean z9 = false;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < aVar.a(); i11++) {
            int a6 = aVar.a(i11);
            f8 f8Var = f8VarArr[i11];
            if ((a6 == 1 || a6 == 2) && f8Var != null && a(iArr[i11], aVar.b(i11), f8Var)) {
                if (a6 == 1) {
                    if (i10 != -1) {
                        z8 = false;
                        break;
                    }
                    i10 = i11;
                } else {
                    if (i9 != -1) {
                        z8 = false;
                        break;
                    }
                    i9 = i11;
                }
            }
        }
        z8 = true;
        if (i10 != -1 && i9 != -1) {
            z9 = true;
        }
        if (z8 && z9) {
            ni niVar = new ni(true);
            niVarArr[i10] = niVar;
            niVarArr[i9] = niVar;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    private static boolean a(int[][] iArr, qo qoVar, f8 f8Var) {
        if (f8Var == null) {
            return false;
        }
        int a6 = qoVar.a(f8Var.a());
        for (int i9 = 0; i9 < f8Var.b(); i9++) {
            if (mi.c(iArr[a6][f8Var.b(i9)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static f8.a a(qo qoVar, int[][] iArr, int i9, d dVar) {
        qo qoVar2 = qoVar;
        d dVar2 = dVar;
        int i10 = dVar2.f8563E ? 24 : 16;
        boolean z8 = dVar2.f8562D && (i9 & i10) != 0;
        int i11 = 0;
        while (i11 < qoVar2.f10421a) {
            po a6 = qoVar2.a(i11);
            int i12 = i11;
            int[] a9 = a(a6, iArr[i11], z8, i10, dVar2.f11800a, dVar2.b, dVar2.f11801c, dVar2.f11802d, dVar2.f11803f, dVar2.f11804g, dVar2.f11805h, dVar2.f11806i, dVar2.f11807j, dVar2.f11808k, dVar2.l);
            if (a9.length > 0) {
                return new f8.a(a6, a9);
            }
            i11 = i12 + 1;
            qoVar2 = qoVar;
            dVar2 = dVar;
        }
        return null;
    }

    public f8.a[] a(oc.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        boolean z8;
        String str;
        int i9;
        String str2;
        b bVar;
        int i10;
        int a6 = aVar.a();
        f8.a[] aVarArr = new f8.a[a6];
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (i12 >= a6) {
                break;
            }
            if (2 == aVar.a(i12)) {
                if (!z9) {
                    f8.a b8 = b(aVar.b(i12), iArr[i12], iArr2[i12], dVar, true);
                    aVarArr[i12] = b8;
                    z9 = b8 != null;
                }
                z10 |= aVar.b(i12).f10421a > 0;
            }
            i12++;
        }
        int i13 = 0;
        int i14 = -1;
        String str3 = null;
        b bVar2 = null;
        while (i13 < a6) {
            if (z8 == aVar.a(i13)) {
                boolean z11 = (dVar.f8570L || !z10) ? z8 : false;
                i9 = i14;
                str2 = str3;
                bVar = bVar2;
                i10 = i13;
                Pair a9 = a(aVar.b(i13), iArr[i13], iArr2[i13], dVar, z11);
                if (a9 != null && (bVar == null || ((b) a9.second).compareTo(bVar) > 0)) {
                    if (i9 != -1) {
                        aVarArr[i9] = null;
                    }
                    f8.a aVar2 = (f8.a) a9.first;
                    aVarArr[i10] = aVar2;
                    str3 = aVar2.f7575a.a(aVar2.b[0]).f7203c;
                    bVar2 = (b) a9.second;
                    i14 = i10;
                    i13 = i10 + 1;
                    z8 = true;
                }
            } else {
                i9 = i14;
                str2 = str3;
                bVar = bVar2;
                i10 = i13;
            }
            i14 = i9;
            bVar2 = bVar;
            str3 = str2;
            i13 = i10 + 1;
            z8 = true;
        }
        String str4 = str3;
        int i15 = -1;
        g gVar = null;
        while (i11 < a6) {
            int a10 = aVar.a(i11);
            if (a10 != 1) {
                if (a10 != 2) {
                    if (a10 != 3) {
                        aVarArr[i11] = a(a10, aVar.b(i11), iArr[i11], dVar);
                    } else {
                        str = str4;
                        Pair a11 = a(aVar.b(i11), iArr[i11], dVar, str);
                        if (a11 != null && (gVar == null || ((g) a11.second).compareTo(gVar) > 0)) {
                            if (i15 != -1) {
                                aVarArr[i15] = null;
                            }
                            aVarArr[i11] = (f8.a) a11.first;
                            gVar = (g) a11.second;
                            i15 = i11;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i11++;
            str4 = str;
        }
        return aVarArr;
    }

    public Pair a(qo qoVar, int[][] iArr, int i9, d dVar, boolean z8) {
        f8.a aVar = null;
        int i10 = -1;
        int i11 = -1;
        b bVar = null;
        for (int i12 = 0; i12 < qoVar.f10421a; i12++) {
            po a6 = qoVar.a(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a6.f10058a; i13++) {
                if (a(iArr2[i13], dVar.f8568J)) {
                    b bVar2 = new b(a6.a(i13), dVar, iArr2[i13]);
                    if ((bVar2.f8546a || dVar.f8564F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i10 = i12;
                        i11 = i13;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        po a9 = qoVar.a(i10);
        if (!dVar.f11818w && !dVar.f11817v && z8) {
            int[] a10 = a(a9, iArr[i10], i11, dVar.f11812q, dVar.f8565G, dVar.f8566H, dVar.f8567I);
            if (a10.length > 1) {
                aVar = new f8.a(a9, a10);
            }
        }
        if (aVar == null) {
            aVar = new f8.a(a9, i11);
        }
        return Pair.create(aVar, (b) AbstractC0669a1.a(bVar));
    }

    private static f8.a a(qo qoVar, int[][] iArr, d dVar) {
        int i9 = -1;
        po poVar = null;
        h hVar = null;
        for (int i10 = 0; i10 < qoVar.f10421a; i10++) {
            po a6 = qoVar.a(i10);
            List a9 = a(a6, dVar.f11807j, dVar.f11808k, dVar.l);
            int[] iArr2 = iArr[i10];
            for (int i11 = 0; i11 < a6.f10058a; i11++) {
                d9 a10 = a6.a(i11);
                if ((a10.f7205f & 16384) == 0 && a(iArr2[i11], dVar.f8568J)) {
                    h hVar2 = new h(a10, dVar, iArr2[i11], a9.contains(Integer.valueOf(i11)));
                    if ((hVar2.f8598a || dVar.f8561C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        poVar = a6;
                        i9 = i11;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i9);
    }

    public f8.a a(int i9, qo qoVar, int[][] iArr, d dVar) {
        po poVar = null;
        c cVar = null;
        int i10 = 0;
        for (int i11 = 0; i11 < qoVar.f10421a; i11++) {
            po a6 = qoVar.a(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < a6.f10058a; i12++) {
                if (a(iArr2[i12], dVar.f8568J)) {
                    c cVar2 = new c(a6.a(i12), iArr2[i12]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        poVar = a6;
                        i10 = i12;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i10);
    }

    public Pair a(qo qoVar, int[][] iArr, d dVar, String str) {
        int i9 = -1;
        po poVar = null;
        g gVar = null;
        for (int i10 = 0; i10 < qoVar.f10421a; i10++) {
            po a6 = qoVar.a(i10);
            int[] iArr2 = iArr[i10];
            for (int i11 = 0; i11 < a6.f10058a; i11++) {
                if (a(iArr2[i11], dVar.f8568J)) {
                    g gVar2 = new g(a6.a(i11), dVar, iArr2[i11], str);
                    if (gVar2.f8590a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        poVar = a6;
                        i9 = i11;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return Pair.create(new f8.a(poVar, i9), (g) AbstractC0669a1.a(gVar));
    }

    @Override // com.applovin.impl.oc
    public final Pair a(oc.a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar) {
        d dVar = (d) this.f8545e.get();
        int a6 = aVar.a();
        f8.a[] a9 = a(aVar, iArr, iArr2, dVar);
        int i9 = 0;
        while (true) {
            if (i9 >= a6) {
                break;
            }
            int a10 = aVar.a(i9);
            if (!dVar.d(i9) && !dVar.f11819x.contains(Integer.valueOf(a10))) {
                qo b8 = aVar.b(i9);
                if (dVar.b(i9, b8)) {
                    f a11 = dVar.a(i9, b8);
                    a9[i9] = a11 != null ? new f8.a(b8.a(a11.f8587a), a11.b, a11.f8589d) : null;
                }
            } else {
                a9[i9] = null;
            }
            i9++;
        }
        f8[] a12 = this.f8544d.a(a9, a(), aVar2, goVar);
        ni[] niVarArr = new ni[a6];
        for (int i10 = 0; i10 < a6; i10++) {
            niVarArr[i10] = (dVar.d(i10) || dVar.f11819x.contains(Integer.valueOf(aVar.a(i10))) || (aVar.a(i10) != -2 && a12[i10] == null)) ? null : ni.b;
        }
        if (dVar.f8569K) {
            a(aVar, iArr, niVarArr, a12);
        }
        return Pair.create(niVarArr, a12);
    }

    private static List a(po poVar, int i9, int i10, boolean z8) {
        int i11;
        ArrayList arrayList = new ArrayList(poVar.f10058a);
        for (int i12 = 0; i12 < poVar.f10058a; i12++) {
            arrayList.add(Integer.valueOf(i12));
        }
        if (i9 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < poVar.f10058a; i14++) {
                d9 a6 = poVar.a(i14);
                int i15 = a6.f7215r;
                if (i15 > 0 && (i11 = a6.f7216s) > 0) {
                    Point a9 = a(z8, i9, i10, i15, i11);
                    int i16 = a6.f7215r;
                    int i17 = a6.f7216s;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (a9.x * 0.98f)) && i17 >= ((int) (a9.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
            if (i13 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int b8 = poVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (b8 == -1 || b8 > i13) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }
}
