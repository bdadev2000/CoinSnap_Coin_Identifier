package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.common.primitives.Ints;
import e0.q;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.objectweb.asm.signature.SignatureVisitor;

@StabilityInferred
/* loaded from: classes.dex */
public final class SlotWriter {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f14001a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14002b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f14003c;
    public ArrayList d;
    public HashMap e;

    /* renamed from: f, reason: collision with root package name */
    public MutableIntObjectMap f14004f;

    /* renamed from: g, reason: collision with root package name */
    public int f14005g;

    /* renamed from: h, reason: collision with root package name */
    public int f14006h;

    /* renamed from: i, reason: collision with root package name */
    public int f14007i;

    /* renamed from: j, reason: collision with root package name */
    public int f14008j;

    /* renamed from: k, reason: collision with root package name */
    public int f14009k;

    /* renamed from: l, reason: collision with root package name */
    public int f14010l;

    /* renamed from: m, reason: collision with root package name */
    public int f14011m;

    /* renamed from: n, reason: collision with root package name */
    public int f14012n;

    /* renamed from: o, reason: collision with root package name */
    public int f14013o;

    /* renamed from: p, reason: collision with root package name */
    public final IntStack f14014p;

    /* renamed from: q, reason: collision with root package name */
    public final IntStack f14015q;

    /* renamed from: r, reason: collision with root package name */
    public final IntStack f14016r;

    /* renamed from: s, reason: collision with root package name */
    public MutableIntObjectMap f14017s;

    /* renamed from: t, reason: collision with root package name */
    public int f14018t;

    /* renamed from: u, reason: collision with root package name */
    public int f14019u;

    /* renamed from: v, reason: collision with root package name */
    public int f14020v;
    public boolean w;
    public PrioritySet x;

    /* loaded from: classes.dex */
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static List a(SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z2, boolean z3, boolean z4) {
            w wVar;
            boolean E;
            int i3;
            int i4;
            Anchor N;
            int i5;
            int i6;
            int q2 = slotWriter.q(i2);
            int i7 = i2 + q2;
            int f2 = slotWriter.f(slotWriter.p(i2), slotWriter.f14002b);
            int f3 = slotWriter.f(slotWriter.p(i7), slotWriter.f14002b);
            int i8 = f3 - f2;
            boolean z5 = i2 >= 0 && (slotWriter.f14002b[(slotWriter.p(i2) * 5) + 1] & 201326592) != 0;
            slotWriter2.s(q2);
            slotWriter2.t(i8, slotWriter2.f14018t);
            if (slotWriter.f14005g < i7) {
                slotWriter.w(i7);
            }
            if (slotWriter.f14009k < f3) {
                slotWriter.x(f3, i7);
            }
            int[] iArr = slotWriter2.f14002b;
            int i9 = slotWriter2.f14018t;
            int i10 = i9 * 5;
            q.O(i10, i2 * 5, i7 * 5, slotWriter.f14002b, iArr);
            Object[] objArr = slotWriter2.f14003c;
            int i11 = slotWriter2.f14007i;
            q.P(i11, f2, slotWriter.f14003c, f3, objArr);
            int i12 = slotWriter2.f14020v;
            iArr[i10 + 2] = i12;
            int i13 = i9 - i2;
            int i14 = i9 + q2;
            int f4 = i11 - slotWriter2.f(i9, iArr);
            int i15 = slotWriter2.f14011m;
            int i16 = slotWriter2.f14010l;
            int length = objArr.length;
            boolean z6 = z5;
            int i17 = i15;
            int i18 = i9;
            while (i18 < i14) {
                if (i18 != i9) {
                    int i19 = (i18 * 5) + 2;
                    iArr[i19] = iArr[i19] + i13;
                }
                int i20 = i14;
                int f5 = slotWriter2.f(i18, iArr) + f4;
                if (i17 < i18) {
                    i5 = i9;
                    i6 = 0;
                } else {
                    i5 = i9;
                    i6 = slotWriter2.f14009k;
                }
                iArr[(i18 * 5) + 4] = SlotWriter.h(f5, i6, i16, length);
                if (i18 == i17) {
                    i17++;
                }
                i18++;
                i9 = i5;
                i14 = i20;
            }
            int i21 = i9;
            int i22 = i14;
            slotWriter2.f14011m = i17;
            int g2 = SlotTableKt.g(slotWriter.d, i2, slotWriter.n());
            int g3 = SlotTableKt.g(slotWriter.d, i7, slotWriter.n());
            if (g2 < g3) {
                ArrayList arrayList = slotWriter.d;
                ArrayList arrayList2 = new ArrayList(g3 - g2);
                for (int i23 = g2; i23 < g3; i23++) {
                    Anchor anchor = (Anchor) arrayList.get(i23);
                    anchor.f13675a += i13;
                    arrayList2.add(anchor);
                }
                slotWriter2.d.addAll(SlotTableKt.g(slotWriter2.d, slotWriter2.f14018t, slotWriter2.n()), arrayList2);
                arrayList.subList(g2, g3).clear();
                wVar = arrayList2;
            } else {
                wVar = w.f30218a;
            }
            if (!wVar.isEmpty()) {
                HashMap hashMap = slotWriter.e;
                HashMap hashMap2 = slotWriter2.e;
                if (hashMap != null && hashMap2 != null) {
                    int size = wVar.size();
                    for (int i24 = 0; i24 < size; i24++) {
                        Anchor anchor2 = (Anchor) wVar.get(i24);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) hashMap.get(anchor2);
                        if (groupSourceInformation != null) {
                            hashMap.remove(anchor2);
                            hashMap2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int i25 = slotWriter2.f14020v;
            GroupSourceInformation K = slotWriter2.K(i12);
            if (K != null) {
                int i26 = i25 + 1;
                int i27 = slotWriter2.f14018t;
                int i28 = -1;
                while (i26 < i27) {
                    i28 = i26;
                    i26 = SlotTableKt.c(i26, slotWriter2.f14002b) + i26;
                }
                ArrayList arrayList3 = K.f13806a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    K.f13806a = arrayList3;
                }
                if (i28 < 0 || (N = slotWriter2.N(i28)) == null) {
                    i4 = 0;
                } else {
                    int size2 = arrayList3.size();
                    for (int i29 = 0; i29 < size2; i29++) {
                        Object obj = arrayList3.get(i29);
                        if (p0.a.g(obj, N) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).a(N))) {
                            i4 = i29;
                            break;
                        }
                    }
                    i4 = -1;
                }
                arrayList3.add(i4, slotWriter2.b(i27));
            }
            int A = slotWriter.A(i2, slotWriter.f14002b);
            if (!z4) {
                i3 = 1;
                E = false;
            } else if (z2) {
                boolean z7 = A >= 0;
                if (z7) {
                    slotWriter.L();
                    slotWriter.a(A - slotWriter.f14018t);
                    slotWriter.L();
                }
                slotWriter.a(i2 - slotWriter.f14018t);
                boolean D = slotWriter.D();
                if (z7) {
                    slotWriter.H();
                    slotWriter.i();
                    slotWriter.H();
                    slotWriter.i();
                }
                E = D;
                i3 = 1;
            } else {
                E = slotWriter.E(i2, q2);
                i3 = 1;
                slotWriter.F(f2, i8, i2 - 1);
            }
            if (!(!E)) {
                ComposerKt.c("Unexpectedly removed anchors");
                throw null;
            }
            slotWriter2.f14013o += SlotTableKt.f(i21, iArr) ? i3 : SlotTableKt.h(i21, iArr);
            if (z3) {
                slotWriter2.f14018t = i22;
                slotWriter2.f14007i = i11 + i8;
            }
            if (z6) {
                slotWriter2.Q(i12);
            }
            return wVar;
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.f14001a = slotTable;
        int[] iArr = slotTable.f13989a;
        this.f14002b = iArr;
        Object[] objArr = slotTable.f13991c;
        this.f14003c = objArr;
        this.d = slotTable.f13995i;
        this.e = slotTable.f13996j;
        this.f14004f = slotTable.f13997k;
        int i2 = slotTable.f13990b;
        this.f14005g = i2;
        this.f14006h = (iArr.length / 5) - i2;
        int i3 = slotTable.d;
        this.f14009k = i3;
        this.f14010l = objArr.length - i3;
        this.f14011m = i2;
        this.f14014p = new IntStack();
        this.f14015q = new IntStack();
        this.f14016r = new IntStack();
        this.f14019u = i2;
        this.f14020v = -1;
    }

    public static int h(int i2, int i3, int i4, int i5) {
        return i2 > i3 ? -(((i5 - i4) - i2) + 1) : i2;
    }

    public static void u(SlotWriter slotWriter) {
        int i2 = slotWriter.f14020v;
        int p2 = slotWriter.p(i2);
        int[] iArr = slotWriter.f14002b;
        int i3 = (p2 * 5) + 1;
        int i4 = iArr[i3];
        if ((i4 & 134217728) != 0) {
            return;
        }
        iArr[i3] = i4 | 134217728;
        if (SlotTableKt.a(p2, iArr)) {
            return;
        }
        slotWriter.Q(slotWriter.A(i2, slotWriter.f14002b));
    }

    public final int A(int i2, int[] iArr) {
        int i3 = iArr[(p(i2) * 5) + 2];
        return i3 > -2 ? i3 : n() + i3 + 2;
    }

    public final Object B(Object obj) {
        if (this.f14012n > 0) {
            t(1, this.f14020v);
        }
        Object[] objArr = this.f14003c;
        int i2 = this.f14007i;
        this.f14007i = i2 + 1;
        Object obj2 = objArr[g(i2)];
        int i3 = this.f14007i;
        if (i3 <= this.f14008j) {
            this.f14003c[g(i3 - 1)] = obj;
            return obj2;
        }
        ComposerKt.c("Writing to an invalid slot");
        throw null;
    }

    public final void C() {
        boolean z2;
        PrioritySet prioritySet = this.x;
        if (prioritySet != null) {
            while (!prioritySet.f13855a.isEmpty()) {
                int b2 = prioritySet.b();
                int p2 = p(b2);
                int i2 = b2 + 1;
                int q2 = q(b2) + b2;
                while (true) {
                    if (i2 >= q2) {
                        z2 = false;
                        break;
                    } else {
                        if ((this.f14002b[(p(i2) * 5) + 1] & 201326592) != 0) {
                            z2 = true;
                            break;
                        }
                        i2 += q(i2);
                    }
                }
                if (SlotTableKt.a(p2, this.f14002b) != z2) {
                    int[] iArr = this.f14002b;
                    int i3 = (p2 * 5) + 1;
                    if (z2) {
                        iArr[i3] = iArr[i3] | 67108864;
                    } else {
                        iArr[i3] = iArr[i3] & (-67108865);
                    }
                    int A = A(b2, iArr);
                    if (A >= 0) {
                        prioritySet.a(A);
                    }
                }
            }
        }
    }

    public final boolean D() {
        Anchor N;
        if (this.f14012n != 0) {
            ComposerKt.c("Cannot remove group while inserting");
            throw null;
        }
        int i2 = this.f14018t;
        int i3 = this.f14007i;
        int f2 = f(p(i2), this.f14002b);
        int G = G();
        GroupSourceInformation K = K(this.f14020v);
        if (K != null && (N = N(i2)) != null) {
            K.c(N);
        }
        PrioritySet prioritySet = this.x;
        if (prioritySet != null) {
            while (true) {
                List list = prioritySet.f13855a;
                if (!(!list.isEmpty()) || ((Number) u.E0(list)).intValue() < i2) {
                    break;
                }
                prioritySet.b();
            }
        }
        boolean E = E(i2, this.f14018t - i2);
        F(f2, this.f14007i - f2, i2 - 1);
        this.f14018t = i2;
        this.f14007i = i3;
        this.f14013o -= G;
        return E;
    }

    public final boolean E(int i2, int i3) {
        if (i3 > 0) {
            ArrayList arrayList = this.d;
            w(i2);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i4 = i2 + i3;
                int g2 = SlotTableKt.g(this.d, i4, m() - this.f14006h);
                if (g2 >= this.d.size()) {
                    g2--;
                }
                int i5 = g2 + 1;
                int i6 = 0;
                while (g2 >= 0) {
                    Anchor anchor = (Anchor) this.d.get(g2);
                    int c2 = c(anchor);
                    if (c2 < i2) {
                        break;
                    }
                    if (c2 < i4) {
                        anchor.f13675a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i6 == 0) {
                            i6 = g2 + 1;
                        }
                        i5 = g2;
                    }
                    g2--;
                }
                r0 = i5 < i6;
                if (r0) {
                    this.d.subList(i5, i6).clear();
                }
            }
            this.f14005g = i2;
            this.f14006h += i3;
            int i7 = this.f14011m;
            if (i7 > i2) {
                this.f14011m = Math.max(i2, i7 - i3);
            }
            int i8 = this.f14019u;
            if (i8 >= this.f14005g) {
                this.f14019u = i8 - i3;
            }
            int i9 = this.f14020v;
            if (i9 >= 0) {
                if (SlotTableKt.a(p(i9), this.f14002b)) {
                    Q(i9);
                }
            }
        }
        return r0;
    }

    public final void F(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.f14010l;
            int i6 = i2 + i3;
            x(i6, i4);
            this.f14009k = i2;
            this.f14010l = i5 + i3;
            q.W(i2, i6, this.f14003c);
            int i7 = this.f14008j;
            if (i7 >= i2) {
                this.f14008j = i7 - i3;
            }
        }
    }

    public final int G() {
        int p2 = p(this.f14018t);
        int c2 = SlotTableKt.c(p2, this.f14002b) + this.f14018t;
        this.f14018t = c2;
        this.f14007i = f(p(c2), this.f14002b);
        if (SlotTableKt.f(p2, this.f14002b)) {
            return 1;
        }
        return SlotTableKt.h(p2, this.f14002b);
    }

    public final void H() {
        int i2 = this.f14019u;
        this.f14018t = i2;
        this.f14007i = f(p(i2), this.f14002b);
    }

    public final int I(int i2, int[] iArr) {
        if (i2 >= m()) {
            return this.f14003c.length - this.f14010l;
        }
        int j2 = SlotTableKt.j(i2, iArr);
        return j2 < 0 ? (this.f14003c.length - this.f14010l) + j2 + 1 : j2;
    }

    public final int J(int i2, int i3) {
        int I = I(p(i2), this.f14002b);
        int i4 = I + i3;
        if (i4 >= I && i4 < f(p(i2 + 1), this.f14002b)) {
            return i4;
        }
        ComposerKt.c("Write to an invalid slot index " + i3 + " for group " + i2);
        throw null;
    }

    public final GroupSourceInformation K(int i2) {
        Anchor N;
        HashMap hashMap = this.e;
        if (hashMap == null || (N = N(i2)) == null) {
            return null;
        }
        return (GroupSourceInformation) hashMap.get(N);
    }

    public final void L() {
        if (this.f14012n != 0) {
            ComposerKt.c("Key must be supplied when inserting");
            throw null;
        }
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        M(composer$Companion$Empty$1, 0, composer$Companion$Empty$1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(Object obj, int i2, Object obj2, boolean z2) {
        int c2;
        GroupSourceInformation K;
        int i3 = this.f14020v;
        byte b2 = this.f14012n > 0;
        this.f14016r.b(this.f14013o);
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (b2 == true) {
            int i4 = this.f14018t;
            int f2 = f(p(i4), this.f14002b);
            s(1);
            this.f14007i = f2;
            this.f14008j = f2;
            int p2 = p(i4);
            int i5 = obj != composer$Companion$Empty$1 ? 1 : 0;
            int i6 = (z2 || obj2 == composer$Companion$Empty$1) ? 0 : 1;
            int h2 = h(f2, this.f14009k, this.f14010l, this.f14003c.length);
            if (h2 >= 0 && this.f14011m < i4) {
                h2 = -(((this.f14003c.length - this.f14010l) - h2) + 1);
            }
            int[] iArr = this.f14002b;
            int i7 = this.f14020v;
            int i8 = z2 ? Ints.MAX_POWER_OF_TWO : 0;
            int i9 = i5 != 0 ? 536870912 : 0;
            int i10 = i6 != 0 ? 268435456 : 0;
            int i11 = p2 * 5;
            iArr[i11] = i2;
            iArr[i11 + 1] = i8 | i9 | i10;
            iArr[i11 + 2] = i7;
            iArr[i11 + 3] = 0;
            iArr[i11 + 4] = h2;
            int i12 = (z2 ? 1 : 0) + i5 + i6;
            if (i12 > 0) {
                t(i12, i4);
                Object[] objArr = this.f14003c;
                int i13 = this.f14007i;
                if (z2) {
                    objArr[i13] = obj2;
                    i13++;
                }
                if (i5 != 0) {
                    objArr[i13] = obj;
                    i13++;
                }
                if (i6 != 0) {
                    objArr[i13] = obj2;
                    i13++;
                }
                this.f14007i = i13;
            }
            this.f14013o = 0;
            c2 = i4 + 1;
            this.f14020v = i4;
            this.f14018t = c2;
            if (i3 >= 0 && (K = K(i3)) != null) {
                GroupSourceInformation b3 = K.b();
                Anchor b4 = b(i4);
                ArrayList arrayList = b3.f13806a;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                b3.f13806a = arrayList;
                arrayList.add(b4);
            }
        } else {
            this.f14014p.b(i3);
            this.f14015q.b((m() - this.f14006h) - this.f14019u);
            int i14 = this.f14018t;
            int p3 = p(i14);
            if (!p0.a.g(obj2, composer$Companion$Empty$1)) {
                if (z2) {
                    R(this.f14018t, obj2);
                } else {
                    P(obj2);
                }
            }
            this.f14007i = I(p3, this.f14002b);
            this.f14008j = f(p(this.f14018t + 1), this.f14002b);
            this.f14013o = SlotTableKt.h(p3, this.f14002b);
            this.f14020v = i14;
            this.f14018t = i14 + 1;
            c2 = i14 + SlotTableKt.c(p3, this.f14002b);
        }
        this.f14019u = c2;
    }

    public final Anchor N(int i2) {
        ArrayList arrayList;
        int n2;
        if (i2 < 0 || i2 >= n() || (n2 = SlotTableKt.n((arrayList = this.d), i2, n())) < 0) {
            return null;
        }
        return (Anchor) arrayList.get(n2);
    }

    public final void O(Object obj) {
        if (this.f14012n <= 0 || this.f14007i == this.f14009k) {
            B(obj);
            return;
        }
        MutableIntObjectMap mutableIntObjectMap = this.f14017s;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap();
        }
        this.f14017s = mutableIntObjectMap;
        int i2 = this.f14020v;
        Object c2 = mutableIntObjectMap.c(i2);
        if (c2 == null) {
            c2 = new MutableObjectList();
            mutableIntObjectMap.i(i2, c2);
        }
        ((MutableObjectList) c2).b(obj);
    }

    public final void P(Object obj) {
        int p2 = p(this.f14018t);
        if (!SlotTableKt.d(p2, this.f14002b)) {
            ComposerKt.c("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f14003c;
        int[] iArr = this.f14002b;
        objArr[g(SlotTableKt.m(iArr[(p2 * 5) + 1] >> 29) + f(p2, iArr))] = obj;
    }

    public final void Q(int i2) {
        if (i2 >= 0) {
            PrioritySet prioritySet = this.x;
            if (prioritySet == null) {
                prioritySet = new PrioritySet();
                this.x = prioritySet;
            }
            prioritySet.a(i2);
        }
    }

    public final void R(int i2, Object obj) {
        int p2 = p(i2);
        int[] iArr = this.f14002b;
        if (p2 < iArr.length && SlotTableKt.f(p2, iArr)) {
            this.f14003c[g(f(p2, this.f14002b))] = obj;
            return;
        }
        ComposerKt.c("Updating the node of a group at " + i2 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i2) {
        boolean z2 = false;
        if (!(i2 >= 0)) {
            ComposerKt.c("Cannot seek backwards");
            throw null;
        }
        if (!(this.f14012n <= 0)) {
            PreconditionsKt.b("Cannot call seek() while inserting");
            throw null;
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.f14018t + i2;
        if (i3 >= this.f14020v && i3 <= this.f14019u) {
            z2 = true;
        }
        if (z2) {
            this.f14018t = i3;
            int f2 = f(p(i3), this.f14002b);
            this.f14007i = f2;
            this.f14008j = f2;
            return;
        }
        ComposerKt.c("Cannot seek outside the current group (" + this.f14020v + SignatureVisitor.SUPER + this.f14019u + ')');
        throw null;
    }

    public final Anchor b(int i2) {
        ArrayList arrayList = this.d;
        int n2 = SlotTableKt.n(arrayList, i2, n());
        if (n2 >= 0) {
            return (Anchor) arrayList.get(n2);
        }
        if (i2 > this.f14005g) {
            i2 = -(n() - i2);
        }
        Anchor anchor = new Anchor(i2);
        arrayList.add(-(n2 + 1), anchor);
        return anchor;
    }

    public final int c(Anchor anchor) {
        int i2 = anchor.f13675a;
        return i2 < 0 ? i2 + n() : i2;
    }

    public final void d() {
        int i2 = this.f14012n;
        this.f14012n = i2 + 1;
        if (i2 == 0) {
            this.f14015q.b((m() - this.f14006h) - this.f14019u);
        }
    }

    public final void e(boolean z2) {
        this.w = true;
        if (z2 && this.f14014p.f13808b == 0) {
            w(n());
            x(this.f14003c.length - this.f14010l, this.f14005g);
            int i2 = this.f14009k;
            q.W(i2, this.f14010l + i2, this.f14003c);
            C();
        }
        int[] iArr = this.f14002b;
        int i3 = this.f14005g;
        Object[] objArr = this.f14003c;
        int i4 = this.f14009k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        MutableIntObjectMap mutableIntObjectMap = this.f14004f;
        SlotTable slotTable = this.f14001a;
        slotTable.getClass();
        if (!slotTable.f13993g) {
            PreconditionsKt.a("Unexpected writer close()");
            throw null;
        }
        slotTable.f13993g = false;
        slotTable.f13989a = iArr;
        slotTable.f13990b = i3;
        slotTable.f13991c = objArr;
        slotTable.d = i4;
        slotTable.f13995i = arrayList;
        slotTable.f13996j = hashMap;
        slotTable.f13997k = mutableIntObjectMap;
    }

    public final int f(int i2, int[] iArr) {
        if (i2 >= m()) {
            return this.f14003c.length - this.f14010l;
        }
        int i3 = iArr[(i2 * 5) + 4];
        return i3 < 0 ? (this.f14003c.length - this.f14010l) + i3 + 1 : i3;
    }

    public final int g(int i2) {
        return i2 < this.f14009k ? i2 : i2 + this.f14010l;
    }

    public final void i() {
        MutableObjectList mutableObjectList;
        boolean z2 = this.f14012n > 0;
        int i2 = this.f14018t;
        int i3 = this.f14019u;
        int i4 = this.f14020v;
        int p2 = p(i4);
        int i5 = this.f14013o;
        int i6 = i2 - i4;
        boolean f2 = SlotTableKt.f(p2, this.f14002b);
        IntStack intStack = this.f14016r;
        if (z2) {
            MutableIntObjectMap mutableIntObjectMap = this.f14017s;
            if (mutableIntObjectMap != null && (mutableObjectList = (MutableObjectList) mutableIntObjectMap.c(i4)) != null) {
                Object[] objArr = mutableObjectList.f1549a;
                int i7 = mutableObjectList.f1550b;
                for (int i8 = 0; i8 < i7; i8++) {
                    B(objArr[i8]);
                }
            }
            SlotTableKt.k(p2, i6, this.f14002b);
            SlotTableKt.l(p2, i5, this.f14002b);
            int a2 = intStack.a();
            if (f2) {
                i5 = 1;
            }
            this.f14013o = a2 + i5;
            int A = A(i4, this.f14002b);
            this.f14020v = A;
            int n2 = A < 0 ? n() : p(A + 1);
            int f3 = n2 >= 0 ? f(n2, this.f14002b) : 0;
            this.f14007i = f3;
            this.f14008j = f3;
            return;
        }
        if (i2 != i3) {
            ComposerKt.c("Expected to be at the end of a group");
            throw null;
        }
        int c2 = SlotTableKt.c(p2, this.f14002b);
        int h2 = SlotTableKt.h(p2, this.f14002b);
        SlotTableKt.k(p2, i6, this.f14002b);
        SlotTableKt.l(p2, i5, this.f14002b);
        int a3 = this.f14014p.a();
        this.f14019u = (m() - this.f14006h) - this.f14015q.a();
        this.f14020v = a3;
        int A2 = A(i4, this.f14002b);
        int a4 = intStack.a();
        this.f14013o = a4;
        if (A2 == a3) {
            this.f14013o = a4 + (f2 ? 0 : i5 - h2);
            return;
        }
        int i9 = i6 - c2;
        int i10 = f2 ? 0 : i5 - h2;
        if (i9 != 0 || i10 != 0) {
            while (A2 != 0 && A2 != a3 && (i10 != 0 || i9 != 0)) {
                int p3 = p(A2);
                if (i9 != 0) {
                    SlotTableKt.k(p3, SlotTableKt.c(p3, this.f14002b) + i9, this.f14002b);
                }
                if (i10 != 0) {
                    int[] iArr = this.f14002b;
                    SlotTableKt.l(p3, SlotTableKt.h(p3, iArr) + i10, iArr);
                }
                if (SlotTableKt.f(p3, this.f14002b)) {
                    i10 = 0;
                }
                A2 = A(A2, this.f14002b);
            }
        }
        this.f14013o += i10;
    }

    public final void j() {
        int i2 = this.f14012n;
        if (!(i2 > 0)) {
            PreconditionsKt.b("Unbalanced begin/end insert");
            throw null;
        }
        int i3 = i2 - 1;
        this.f14012n = i3;
        if (i3 == 0) {
            if (this.f14016r.f13808b == this.f14014p.f13808b) {
                this.f14019u = (m() - this.f14006h) - this.f14015q.a();
            } else {
                ComposerKt.c("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i2) {
        boolean z2 = false;
        if (!(this.f14012n <= 0)) {
            ComposerKt.c("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i3 = this.f14020v;
        if (i3 != i2) {
            if (i2 >= i3 && i2 < this.f14019u) {
                z2 = true;
            }
            if (!z2) {
                ComposerKt.c("Started group at " + i2 + " must be a subgroup of the group at " + i3);
                throw null;
            }
            int i4 = this.f14018t;
            int i5 = this.f14007i;
            int i6 = this.f14008j;
            this.f14018t = i2;
            L();
            this.f14018t = i4;
            this.f14007i = i5;
            this.f14008j = i6;
        }
    }

    public final void l(int i2, int i3, int i4) {
        if (i2 >= this.f14005g) {
            i2 = -((n() - i2) + 2);
        }
        while (i4 < i3) {
            this.f14002b[(p(i4) * 5) + 2] = i2;
            int c2 = SlotTableKt.c(p(i4), this.f14002b) + i4;
            l(i4, c2, i4 + 1);
            i4 = c2;
        }
    }

    public final int m() {
        return this.f14002b.length / 5;
    }

    public final int n() {
        return m() - this.f14006h;
    }

    public final int o() {
        return this.f14003c.length - this.f14010l;
    }

    public final int p(int i2) {
        return i2 < this.f14005g ? i2 : i2 + this.f14006h;
    }

    public final int q(int i2) {
        return SlotTableKt.c(p(i2), this.f14002b);
    }

    public final boolean r(int i2, int i3) {
        int m2;
        int q2;
        if (i3 == this.f14020v) {
            m2 = this.f14019u;
        } else {
            IntStack intStack = this.f14014p;
            int i4 = intStack.f13808b;
            if (i3 > (i4 > 0 ? intStack.f13807a[i4 - 1] : 0)) {
                q2 = q(i3);
            } else {
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        i5 = -1;
                        break;
                    }
                    if (intStack.f13807a[i5] == i3) {
                        break;
                    }
                    i5++;
                }
                if (i5 < 0) {
                    q2 = q(i3);
                } else {
                    m2 = (m() - this.f14006h) - this.f14015q.f13807a[i5];
                }
            }
            m2 = q2 + i3;
        }
        return i2 > i3 && i2 < m2;
    }

    public final void s(int i2) {
        if (i2 > 0) {
            int i3 = this.f14018t;
            w(i3);
            int i4 = this.f14005g;
            int i5 = this.f14006h;
            int[] iArr = this.f14002b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            if (i5 < i2) {
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                int[] iArr2 = new int[max * 5];
                int i7 = max - i6;
                q.O(0, 0, i4 * 5, iArr, iArr2);
                q.O((i4 + i7) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.f14002b = iArr2;
                i5 = i7;
            }
            int i8 = this.f14019u;
            if (i8 >= i4) {
                this.f14019u = i8 + i2;
            }
            int i9 = i4 + i2;
            this.f14005g = i9;
            this.f14006h = i5 - i2;
            int h2 = h(i6 > 0 ? f(p(i3 + i2), this.f14002b) : 0, this.f14011m >= i4 ? this.f14009k : 0, this.f14010l, this.f14003c.length);
            for (int i10 = i4; i10 < i9; i10++) {
                this.f14002b[(i10 * 5) + 4] = h2;
            }
            int i11 = this.f14011m;
            if (i11 >= i4) {
                this.f14011m = i11 + i2;
            }
        }
    }

    public final void t(int i2, int i3) {
        if (i2 > 0) {
            x(this.f14007i, i3);
            int i4 = this.f14009k;
            int i5 = this.f14010l;
            if (i5 < i2) {
                Object[] objArr = this.f14003c;
                int length = objArr.length;
                int i6 = length - i5;
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                Object[] objArr2 = new Object[max];
                for (int i7 = 0; i7 < max; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = max - i6;
                q.P(0, 0, objArr, i4, objArr2);
                q.P(i4 + i8, i5 + i4, objArr, length, objArr2);
                this.f14003c = objArr2;
                i5 = i8;
            }
            int i9 = this.f14008j;
            if (i9 >= i4) {
                this.f14008j = i9 + i2;
            }
            this.f14009k = i4 + i2;
            this.f14010l = i5 - i2;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f14018t + " end=" + this.f14019u + " size = " + n() + " gap=" + this.f14005g + SignatureVisitor.SUPER + (this.f14005g + this.f14006h) + ')';
    }

    public final void v(SlotTable slotTable, int i2) {
        ComposerKt.h(this.f14012n > 0);
        if (i2 == 0 && this.f14018t == 0 && this.f14001a.f13990b == 0) {
            int c2 = SlotTableKt.c(i2, slotTable.f13989a);
            int i3 = slotTable.f13990b;
            if (c2 == i3) {
                int[] iArr = this.f14002b;
                Object[] objArr = this.f14003c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                MutableIntObjectMap mutableIntObjectMap = this.f14004f;
                int[] iArr2 = slotTable.f13989a;
                Object[] objArr2 = slotTable.f13991c;
                int i4 = slotTable.d;
                HashMap hashMap2 = slotTable.f13996j;
                MutableIntObjectMap mutableIntObjectMap2 = slotTable.f13997k;
                this.f14002b = iArr2;
                this.f14003c = objArr2;
                this.d = slotTable.f13995i;
                this.f14005g = i3;
                this.f14006h = (iArr2.length / 5) - i3;
                this.f14009k = i4;
                this.f14010l = objArr2.length - i4;
                this.f14011m = i3;
                this.e = hashMap2;
                this.f14004f = mutableIntObjectMap2;
                slotTable.f13989a = iArr;
                slotTable.f13990b = 0;
                slotTable.f13991c = objArr;
                slotTable.d = 0;
                slotTable.f13995i = arrayList;
                slotTable.f13996j = hashMap;
                slotTable.f13997k = mutableIntObjectMap;
                return;
            }
        }
        SlotWriter e = slotTable.e();
        try {
            Companion.a(e, i2, this, true, true, false);
            e.e(true);
        } catch (Throwable th) {
            e.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r2 = r8.f14002b;
        r4 = r9 * 5;
        r5 = r0 * 5;
        r6 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        e0.q.O(r5 + r4, r4, r6, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        e0.q.O(r6, r6 + r5, r4 + r5, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(int r9) {
        /*
            r8 = this;
            int r0 = r8.f14006h
            int r1 = r8.f14005g
            if (r1 == r9) goto Lb0
            java.util.ArrayList r2 = r8.d
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L5d
            int r2 = r8.f14006h
            int r4 = r8.m()
            int r4 = r4 - r2
            if (r1 >= r9) goto L3b
            java.util.ArrayList r2 = r8.d
            int r2 = androidx.compose.runtime.SlotTableKt.g(r2, r1, r4)
        L1f:
            java.util.ArrayList r5 = r8.d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.d
            java.lang.Object r5 = r5.get(r2)
            androidx.compose.runtime.Anchor r5 = (androidx.compose.runtime.Anchor) r5
            int r6 = r5.f13675a
            if (r6 >= 0) goto L5d
            int r6 = r6 + r4
            if (r6 >= r9) goto L5d
            r5.f13675a = r6
            int r2 = r2 + 1
            goto L1f
        L3b:
            java.util.ArrayList r2 = r8.d
            int r2 = androidx.compose.runtime.SlotTableKt.g(r2, r9, r4)
        L41:
            java.util.ArrayList r5 = r8.d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.d
            java.lang.Object r5 = r5.get(r2)
            androidx.compose.runtime.Anchor r5 = (androidx.compose.runtime.Anchor) r5
            int r6 = r5.f13675a
            if (r6 < 0) goto L5d
            int r6 = r4 - r6
            int r6 = -r6
            r5.f13675a = r6
            int r2 = r2 + 1
            goto L41
        L5d:
            if (r0 <= 0) goto L74
            int[] r2 = r8.f14002b
            int r4 = r9 * 5
            int r5 = r0 * 5
            int r6 = r1 * 5
            if (r9 >= r1) goto L6e
            int r5 = r5 + r4
            e0.q.O(r5, r4, r6, r2, r2)
            goto L74
        L6e:
            int r7 = r6 + r5
            int r4 = r4 + r5
            e0.q.O(r6, r7, r4, r2, r2)
        L74:
            if (r9 >= r1) goto L78
            int r1 = r9 + r0
        L78:
            int r2 = r8.m()
            if (r1 >= r2) goto L7f
            goto L80
        L7f:
            r3 = 0
        L80:
            androidx.compose.runtime.ComposerKt.h(r3)
        L83:
            if (r1 >= r2) goto Lb0
            int[] r3 = r8.f14002b
            int r3 = androidx.compose.runtime.SlotTableKt.i(r1, r3)
            r4 = -2
            if (r3 <= r4) goto L90
            r5 = r3
            goto L96
        L90:
            int r5 = r8.n()
            int r5 = r5 + r3
            int r5 = r5 - r4
        L96:
            if (r5 >= r9) goto L99
            goto La0
        L99:
            int r6 = r8.n()
            int r6 = r6 - r5
            int r6 = r6 - r4
            int r5 = -r6
        La0:
            if (r5 == r3) goto Laa
            int[] r3 = r8.f14002b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3[r4] = r5
        Laa:
            int r1 = r1 + 1
            if (r1 != r9) goto L83
            int r1 = r1 + r0
            goto L83
        Lb0:
            r8.f14005g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.w(int):void");
    }

    public final void x(int i2, int i3) {
        int i4 = this.f14010l;
        int i5 = this.f14009k;
        int i6 = this.f14011m;
        if (i5 != i2) {
            Object[] objArr = this.f14003c;
            if (i2 < i5) {
                q.P(i2 + i4, i2, objArr, i5, objArr);
            } else {
                q.P(i5, i5 + i4, objArr, i2 + i4, objArr);
            }
        }
        int min = Math.min(i3 + 1, n());
        if (i6 != min) {
            int length = this.f14003c.length - i4;
            if (min < i6) {
                int p2 = p(min);
                int p3 = p(i6);
                int i7 = this.f14005g;
                while (p2 < p3) {
                    int b2 = SlotTableKt.b(p2, this.f14002b);
                    if (b2 < 0) {
                        ComposerKt.c("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    this.f14002b[(p2 * 5) + 4] = -((length - b2) + 1);
                    p2++;
                    if (p2 == i7) {
                        p2 += this.f14006h;
                    }
                }
            } else {
                int p4 = p(i6);
                int p5 = p(min);
                while (p4 < p5) {
                    int b3 = SlotTableKt.b(p4, this.f14002b);
                    if (b3 >= 0) {
                        ComposerKt.c("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    this.f14002b[(p4 * 5) + 4] = b3 + length + 1;
                    p4++;
                    if (p4 == this.f14005g) {
                        p4 += this.f14006h;
                    }
                }
            }
            this.f14011m = min;
        }
        this.f14009k = i2;
    }

    public final List y(Anchor anchor, SlotWriter slotWriter) {
        ComposerKt.h(slotWriter.f14012n > 0);
        ComposerKt.h(this.f14012n == 0);
        ComposerKt.h(anchor.a());
        int c2 = c(anchor) + 1;
        int i2 = this.f14018t;
        ComposerKt.h(i2 <= c2 && c2 < this.f14019u);
        int A = A(c2, this.f14002b);
        int q2 = q(c2);
        int h2 = SlotTableKt.f(p(c2), this.f14002b) ? 1 : SlotTableKt.h(p(c2), this.f14002b);
        List a2 = Companion.a(this, c2, slotWriter, false, false, true);
        Q(A);
        boolean z2 = h2 > 0;
        while (A >= i2) {
            int p2 = p(A);
            int[] iArr = this.f14002b;
            SlotTableKt.k(p2, SlotTableKt.c(p2, iArr) - q2, iArr);
            if (z2) {
                if (SlotTableKt.f(p2, this.f14002b)) {
                    z2 = false;
                } else {
                    int[] iArr2 = this.f14002b;
                    SlotTableKt.l(p2, SlotTableKt.h(p2, iArr2) - h2, iArr2);
                }
            }
            A = A(A, this.f14002b);
        }
        if (z2) {
            ComposerKt.h(this.f14013o >= h2);
            this.f14013o -= h2;
        }
        return a2;
    }

    public final Object z(int i2) {
        int p2 = p(i2);
        if (SlotTableKt.f(p2, this.f14002b)) {
            return this.f14003c[g(f(p2, this.f14002b))];
        }
        return null;
    }
}
