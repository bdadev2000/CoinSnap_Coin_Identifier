package y8;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ic.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m9.j0;
import m9.o0;
import m9.w0;
import n9.h0;
import s7.p2;
import s7.q0;
import s7.r0;
import t7.x;
import v8.a1;
import v8.b1;
import v8.i1;
import v8.j1;
import v8.t0;
import v8.u0;
import v8.v;
import v8.w;
import v8.y0;
import v8.z0;
import x7.u;

/* loaded from: classes3.dex */
public final class c implements w, a1, x8.i {

    /* renamed from: b, reason: collision with root package name */
    public final int f28024b;

    /* renamed from: c, reason: collision with root package name */
    public final j f28025c;

    /* renamed from: d, reason: collision with root package name */
    public final w0 f28026d;

    /* renamed from: f, reason: collision with root package name */
    public final u f28027f;

    /* renamed from: g, reason: collision with root package name */
    public final ac.e f28028g;

    /* renamed from: h, reason: collision with root package name */
    public final t f28029h;

    /* renamed from: i, reason: collision with root package name */
    public final long f28030i;

    /* renamed from: j, reason: collision with root package name */
    public final o0 f28031j;

    /* renamed from: k, reason: collision with root package name */
    public final m9.q f28032k;

    /* renamed from: l, reason: collision with root package name */
    public final j1 f28033l;

    /* renamed from: m, reason: collision with root package name */
    public final b[] f28034m;

    /* renamed from: n, reason: collision with root package name */
    public final com.facebook.internal.m f28035n;

    /* renamed from: o, reason: collision with root package name */
    public final q f28036o;

    /* renamed from: q, reason: collision with root package name */
    public final f0.c f28038q;

    /* renamed from: r, reason: collision with root package name */
    public final x7.q f28039r;

    /* renamed from: s, reason: collision with root package name */
    public v f28040s;

    /* renamed from: v, reason: collision with root package name */
    public fb.c f28042v;

    /* renamed from: w, reason: collision with root package name */
    public z8.c f28043w;

    /* renamed from: x, reason: collision with root package name */
    public int f28044x;

    /* renamed from: y, reason: collision with root package name */
    public List f28045y;

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f28023z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: t, reason: collision with root package name */
    public x8.j[] f28041t = new x8.j[0];
    public n[] u = new n[0];

    /* renamed from: p, reason: collision with root package name */
    public final IdentityHashMap f28037p = new IdentityHashMap();

    public c(int i10, z8.c cVar, t tVar, int i11, j jVar, w0 w0Var, u uVar, x7.q qVar, ac.e eVar, f0.c cVar2, long j3, o0 o0Var, m9.q qVar2, com.facebook.internal.m mVar, y7.u uVar2, x xVar) {
        String i12;
        int i13;
        int i14;
        boolean[] zArr;
        boolean z10;
        r0[] r0VarArr;
        z8.f fVar;
        z8.f fVar2;
        u uVar3 = uVar;
        this.f28024b = i10;
        this.f28043w = cVar;
        this.f28029h = tVar;
        this.f28044x = i11;
        this.f28025c = jVar;
        this.f28026d = w0Var;
        this.f28027f = uVar3;
        this.f28039r = qVar;
        this.f28028g = eVar;
        this.f28038q = cVar2;
        this.f28030i = j3;
        this.f28031j = o0Var;
        this.f28032k = qVar2;
        this.f28035n = mVar;
        this.f28036o = new q(cVar, uVar2, qVar2);
        int i15 = 0;
        x8.j[] jVarArr = this.f28041t;
        mVar.getClass();
        this.f28042v = new fb.c(jVarArr, 25);
        z8.h a = cVar.a(i11);
        List list = a.f28623d;
        this.f28045y = list;
        List list2 = a.f28622c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            sparseIntArray.put(((z8.a) list2.get(i16)).a, i16);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        int i17 = 0;
        while (i15 < size) {
            z8.a aVar = (z8.a) list2.get(i15);
            List list3 = aVar.f28586e;
            while (true) {
                if (i17 >= list3.size()) {
                    fVar = null;
                    break;
                }
                fVar = (z8.f) list3.get(i17);
                if ("http://dashif.org/guidelines/trickmode".equals(fVar.a)) {
                    break;
                } else {
                    i17++;
                }
            }
            List list4 = aVar.f28587f;
            if (fVar == null) {
                int i18 = 0;
                while (true) {
                    if (i18 >= list4.size()) {
                        fVar = null;
                        break;
                    }
                    fVar = (z8.f) list4.get(i18);
                    if ("http://dashif.org/guidelines/trickmode".equals(fVar.a)) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int i19 = (fVar == null || (i19 = sparseIntArray.get(Integer.parseInt(fVar.f28616b), -1)) == -1) ? i15 : i19;
            if (i19 == i15) {
                int i20 = 0;
                while (true) {
                    if (i20 >= list4.size()) {
                        fVar2 = null;
                        break;
                    }
                    fVar2 = (z8.f) list4.get(i20);
                    if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(fVar2.a)) {
                        break;
                    } else {
                        i20++;
                    }
                }
                if (fVar2 != null) {
                    int i21 = h0.a;
                    String[] split = fVar2.f28616b.split(",", -1);
                    for (String str : split) {
                        int i22 = sparseIntArray.get(Integer.parseInt(str), -1);
                        if (i22 != -1) {
                            i19 = Math.min(i19, i22);
                        }
                    }
                }
            }
            if (i19 != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(i19);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
            i15++;
            i17 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i23 = 0; i23 < size2; i23++) {
            int[] B = c6.c.B((Collection) arrayList.get(i23));
            iArr[i23] = B;
            Arrays.sort(B);
        }
        boolean[] zArr2 = new boolean[size2];
        r0[][] r0VarArr2 = new r0[size2];
        int i24 = 0;
        for (int i25 = 0; i25 < size2; i25++) {
            int[] iArr2 = iArr[i25];
            int length = iArr2.length;
            int i26 = 0;
            while (true) {
                if (i26 >= length) {
                    z10 = false;
                    break;
                }
                List list7 = ((z8.a) list2.get(iArr2[i26])).f28584c;
                for (int i27 = 0; i27 < list7.size(); i27++) {
                    if (!((z8.m) list7.get(i27)).f28638f.isEmpty()) {
                        z10 = true;
                        break;
                    }
                }
                i26++;
            }
            if (z10) {
                zArr2[i25] = true;
                i24++;
            }
            int[] iArr3 = iArr[i25];
            int length2 = iArr3.length;
            int i28 = 0;
            while (true) {
                if (i28 >= length2) {
                    r0VarArr = new r0[0];
                    break;
                }
                int i29 = iArr3[i28];
                z8.a aVar2 = (z8.a) list2.get(i29);
                List list8 = ((z8.a) list2.get(i29)).f28585d;
                int i30 = 0;
                int[] iArr4 = iArr3;
                while (i30 < list8.size()) {
                    z8.f fVar3 = (z8.f) list8.get(i30);
                    int i31 = length2;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar3.a)) {
                        q0 q0Var = new q0();
                        q0Var.f24667k = MimeTypes.APPLICATION_CEA608;
                        q0Var.a = vd.e.g(new StringBuilder(), aVar2.a, ":cea608");
                        r0VarArr = d(fVar3, f28023z, new r0(q0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar3.a)) {
                        q0 q0Var2 = new q0();
                        q0Var2.f24667k = MimeTypes.APPLICATION_CEA708;
                        q0Var2.a = vd.e.g(new StringBuilder(), aVar2.a, ":cea708");
                        r0VarArr = d(fVar3, A, new r0(q0Var2));
                        break;
                    }
                    i30++;
                    length2 = i31;
                    list8 = list9;
                }
                i28++;
                iArr3 = iArr4;
            }
            r0VarArr2[i25] = r0VarArr;
            if (r0VarArr.length != 0) {
                i24++;
            }
        }
        int size3 = list.size() + i24 + size2;
        i1[] i1VarArr = new i1[size3];
        b[] bVarArr = new b[size3];
        int i32 = 0;
        int i33 = 0;
        while (i32 < size2) {
            int[] iArr5 = iArr[i32];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i34 = size2;
            int i35 = 0;
            while (i35 < length3) {
                arrayList3.addAll(((z8.a) list2.get(iArr5[i35])).f28584c);
                i35++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            r0[] r0VarArr3 = new r0[size4];
            int i36 = 0;
            while (i36 < size4) {
                int i37 = size4;
                r0 r0Var = ((z8.m) arrayList3.get(i36)).f28635b;
                ArrayList arrayList4 = arrayList3;
                int d10 = uVar3.d(r0Var);
                q0 a10 = r0Var.a();
                a10.F = d10;
                r0VarArr3[i36] = a10.a();
                i36++;
                size4 = i37;
                arrayList3 = arrayList4;
            }
            z8.a aVar3 = (z8.a) list2.get(iArr5[0]);
            int i38 = aVar3.a;
            if (i38 != -1) {
                i12 = Integer.toString(i38);
            } else {
                i12 = eb.j.i("unset:", i32);
            }
            int i39 = i33 + 1;
            if (zArr2[i32]) {
                i13 = i39;
                i39++;
            } else {
                i13 = -1;
            }
            List list10 = list2;
            if (r0VarArr2[i32].length != 0) {
                int i40 = i39;
                i39++;
                i14 = i40;
            } else {
                i14 = -1;
            }
            i1VarArr[i33] = new i1(i12, r0VarArr3);
            bVarArr[i33] = new b(aVar3.f28583b, 0, i33, i13, iArr5, i14, -1);
            int i41 = -1;
            int i42 = i13;
            if (i42 != -1) {
                String k10 = eb.j.k(i12, ":emsg");
                q0 q0Var3 = new q0();
                q0Var3.a = k10;
                q0Var3.f24667k = MimeTypes.APPLICATION_EMSG;
                zArr = zArr2;
                i1VarArr[i42] = new i1(k10, new r0(q0Var3));
                bVarArr[i42] = new b(5, 1, i33, -1, iArr5, -1, -1);
                i41 = -1;
            } else {
                zArr = zArr2;
            }
            if (i14 != i41) {
                i1VarArr[i14] = new i1(eb.j.k(i12, ":cc"), r0VarArr2[i32]);
                bVarArr[i14] = new b(3, 1, i33, -1, iArr5, -1, -1);
            }
            i32++;
            size2 = i34;
            uVar3 = uVar;
            i33 = i39;
            iArr = iArr6;
            list2 = list10;
            zArr2 = zArr;
        }
        int i43 = 0;
        while (i43 < list.size()) {
            z8.g gVar = (z8.g) list.get(i43);
            q0 q0Var4 = new q0();
            q0Var4.a = gVar.a();
            q0Var4.f24667k = MimeTypes.APPLICATION_EMSG;
            i1VarArr[i33] = new i1(gVar.a() + ":" + i43, new r0(q0Var4));
            bVarArr[i33] = new b(5, 2, -1, -1, new int[0], -1, i43);
            i43++;
            i33++;
        }
        Pair create = Pair.create(new j1(i1VarArr), bVarArr);
        this.f28033l = (j1) create.first;
        this.f28034m = (b[]) create.second;
    }

    public static r0[] d(z8.f fVar, Pattern pattern, r0 r0Var) {
        String str = fVar.f28616b;
        if (str == null) {
            return new r0[]{r0Var};
        }
        int i10 = h0.a;
        String[] split = str.split(";", -1);
        r0[] r0VarArr = new r0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new r0[]{r0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            q0 q0Var = new q0(r0Var);
            q0Var.a = r0Var.f24712b + ":" + parseInt;
            q0Var.C = parseInt;
            q0Var.f24659c = matcher.group(2);
            r0VarArr[i11] = new r0(q0Var);
        }
        return r0VarArr;
    }

    @Override // v8.a1
    public final void b(b1 b1Var) {
        this.f28040s.b(this);
    }

    public final int c(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        b[] bVarArr = this.f28034m;
        int i12 = bVarArr[i11].f28020e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && bVarArr[i14].f28018c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        return this.f28042v.continueLoading(j3);
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        return this.f28042v.getBufferedPositionUs();
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        return this.f28042v.getNextLoadPositionUs();
    }

    @Override // v8.w
    public final j1 getTrackGroups() {
        return this.f28033l;
    }

    @Override // v8.b1
    public final boolean isLoading() {
        return this.f28042v.isLoading();
    }

    @Override // v8.w
    public final void maybeThrowPrepareError() {
        this.f28031j.maybeThrowError();
    }

    @Override // v8.w
    public final void n(v vVar, long j3) {
        this.f28040s = vVar;
        vVar.a(this);
    }

    @Override // v8.w
    public final void o(long j3) {
        long j10;
        for (x8.j jVar : this.f28041t) {
            if (!jVar.h()) {
                y0 y0Var = jVar.f27547o;
                int i10 = y0Var.f26337q;
                y0Var.h(j3, true);
                y0 y0Var2 = jVar.f27547o;
                int i11 = y0Var2.f26337q;
                if (i11 > i10) {
                    synchronized (y0Var2) {
                        if (y0Var2.f26336p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = y0Var2.f26334n[y0Var2.f26338r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        y0[] y0VarArr = jVar.f27548p;
                        if (i12 >= y0VarArr.length) {
                            break;
                        }
                        y0VarArr[i12].h(j10, jVar.f27538f[i12]);
                        i12++;
                    }
                }
                int min = Math.min(jVar.j(i11, 0), jVar.f27554w);
                if (min > 0) {
                    ArrayList arrayList = jVar.f27545m;
                    int i13 = h0.a;
                    if (min <= arrayList.size() && min >= 0) {
                        if (min != 0) {
                            arrayList.subList(0, min).clear();
                        }
                        jVar.f27554w -= min;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v8.w
    public final long r(k9.q[] qVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j3) {
        int i10;
        i1 i1Var;
        boolean z10;
        int[] iArr;
        int i11;
        i1 i1Var2;
        int[] iArr2;
        boolean z11;
        i1 i1Var3;
        int i12;
        byte b3;
        i1 i1Var4;
        int i13;
        p pVar;
        k9.q[] qVarArr2 = qVarArr;
        int[] iArr3 = new int[qVarArr2.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= qVarArr2.length) {
                break;
            }
            k9.q qVar = qVarArr2[i14];
            if (qVar != null) {
                int indexOf = this.f28033l.f26182c.indexOf(qVar.getTrackGroup());
                if (indexOf >= 0) {
                    i10 = indexOf;
                }
                iArr3[i14] = i10;
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            i1Var = null;
            if (i15 >= qVarArr2.length) {
                break;
            }
            if (qVarArr2[i15] == null || !zArr[i15]) {
                z0 z0Var = z0VarArr[i15];
                if (z0Var instanceof x8.j) {
                    x8.j jVar = (x8.j) z0Var;
                    jVar.f27552t = this;
                    y0 y0Var = jVar.f27547o;
                    y0Var.i();
                    x7.n nVar = y0Var.f26328h;
                    if (nVar != null) {
                        nVar.e(y0Var.f26325e);
                        y0Var.f26328h = null;
                        y0Var.f26327g = null;
                    }
                    for (y0 y0Var2 : jVar.f27548p) {
                        y0Var2.i();
                        x7.n nVar2 = y0Var2.f26328h;
                        if (nVar2 != null) {
                            nVar2.e(y0Var2.f26325e);
                            y0Var2.f26328h = null;
                            y0Var2.f26327g = null;
                        }
                    }
                    jVar.f27543k.b(jVar);
                } else if (z0Var instanceof x8.h) {
                    x8.h hVar = (x8.h) z0Var;
                    x8.j jVar2 = hVar.f27534g;
                    boolean[] zArr3 = jVar2.f27538f;
                    int i16 = hVar.f27532d;
                    u0.m(zArr3[i16]);
                    jVar2.f27538f[i16] = false;
                }
                z0VarArr[i15] = null;
            }
            i15++;
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            boolean z12 = true;
            if (i17 >= qVarArr2.length) {
                break;
            }
            z0 z0Var2 = z0VarArr[i17];
            if ((z0Var2 instanceof v8.m) || (z0Var2 instanceof x8.h)) {
                int c10 = c(i17, iArr3);
                if (c10 == -1) {
                    z12 = z0VarArr[i17] instanceof v8.m;
                } else {
                    z0 z0Var3 = z0VarArr[i17];
                    if (!(z0Var3 instanceof x8.h) || ((x8.h) z0Var3).f27530b != z0VarArr[c10]) {
                        z12 = false;
                    }
                }
                if (!z12) {
                    z0 z0Var4 = z0VarArr[i17];
                    if (z0Var4 instanceof x8.h) {
                        x8.h hVar2 = (x8.h) z0Var4;
                        x8.j jVar3 = hVar2.f27534g;
                        boolean[] zArr4 = jVar3.f27538f;
                        int i18 = hVar2.f27532d;
                        u0.m(zArr4[i18]);
                        jVar3.f27538f[i18] = false;
                    }
                    z0VarArr[i17] = null;
                }
            }
            i17++;
        }
        z0[] z0VarArr2 = z0VarArr;
        int i19 = 0;
        while (i19 < qVarArr2.length) {
            k9.q qVar2 = qVarArr2[i19];
            if (qVar2 == null) {
                i11 = i19;
                i1Var2 = i1Var;
                iArr2 = iArr3;
            } else {
                z0 z0Var5 = z0VarArr2[i19];
                if (z0Var5 == null) {
                    zArr2[i19] = z10;
                    b bVar = this.f28034m[iArr3[i19]];
                    int i20 = bVar.f28018c;
                    if (i20 == 0) {
                        int i21 = bVar.f28021f;
                        if (i21 != i10) {
                            z11 = z10 ? 1 : 0;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i1Var3 = this.f28033l.a(i21);
                            i12 = z10 ? 1 : 0;
                        } else {
                            i1Var3 = i1Var;
                            i12 = 0;
                        }
                        int i22 = bVar.f28022g;
                        if (i22 != i10) {
                            b3 = z10 ? 1 : 0;
                        } else {
                            b3 = false;
                        }
                        if (b3 != false) {
                            i1Var4 = this.f28033l.a(i22);
                            i12 += i1Var4.f26163b;
                        } else {
                            i1Var4 = i1Var;
                        }
                        r0[] r0VarArr = new r0[i12];
                        int[] iArr4 = new int[i12];
                        if (z11) {
                            r0VarArr[0] = i1Var3.f26166f[0];
                            iArr4[0] = 5;
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (b3 != false) {
                            for (int i23 = 0; i23 < i1Var4.f26163b; i23++) {
                                r0 r0Var = i1Var4.f26166f[i23];
                                r0VarArr[i13] = r0Var;
                                iArr4[i13] = 3;
                                arrayList.add(r0Var);
                                i13 += z10 ? 1 : 0;
                            }
                        }
                        if (this.f28043w.f28593d && z11) {
                            q qVar3 = this.f28036o;
                            pVar = new p(qVar3, qVar3.f28113b);
                        } else {
                            pVar = null;
                        }
                        j jVar4 = this.f28025c;
                        o0 o0Var = this.f28031j;
                        z8.c cVar = this.f28043w;
                        t tVar = this.f28029h;
                        int i24 = i19;
                        int i25 = this.f28044x;
                        int[] iArr5 = bVar.a;
                        int i26 = bVar.f28017b;
                        long j10 = this.f28030i;
                        iArr2 = iArr3;
                        w0 w0Var = this.f28026d;
                        m9.l createDataSource = jVar4.a.createDataSource();
                        if (w0Var != null) {
                            createDataSource.c(w0Var);
                        }
                        i11 = i24;
                        i1Var2 = null;
                        p pVar2 = pVar;
                        x8.j jVar5 = new x8.j(bVar.f28017b, iArr4, r0VarArr, new m(o0Var, cVar, tVar, i25, iArr5, qVar2, i26, createDataSource, j10, z11, arrayList, pVar), this, this.f28032k, j3, this.f28027f, this.f28039r, this.f28028g, this.f28038q);
                        synchronized (this) {
                            this.f28037p.put(jVar5, pVar2);
                        }
                        z0VarArr[i11] = jVar5;
                        z0VarArr2 = z0VarArr;
                    } else {
                        i11 = i19;
                        i1Var2 = i1Var;
                        iArr2 = iArr3;
                        if (i20 == 2) {
                            z0VarArr2[i11] = new n((z8.g) this.f28045y.get(bVar.f28019d), qVar2.getTrackGroup().f26166f[0], this.f28043w.f28593d);
                        }
                    }
                } else {
                    i11 = i19;
                    i1Var2 = i1Var;
                    iArr2 = iArr3;
                    if (z0Var5 instanceof x8.j) {
                        ((m) ((x8.j) z0Var5).f27539g).f28095i = qVar2;
                    }
                }
            }
            i19 = i11 + 1;
            qVarArr2 = qVarArr;
            i1Var = i1Var2;
            iArr3 = iArr2;
            z10 = true;
            i10 = -1;
        }
        int[] iArr6 = iArr3;
        int i27 = 0;
        while (i27 < qVarArr.length) {
            if (z0VarArr2[i27] == null && qVarArr[i27] != null) {
                b bVar2 = this.f28034m[iArr6[i27]];
                if (bVar2.f28018c == 1) {
                    iArr = iArr6;
                    int c11 = c(i27, iArr);
                    if (c11 == -1) {
                        z0VarArr2[i27] = new v8.m();
                    } else {
                        x8.j jVar6 = (x8.j) z0VarArr2[c11];
                        int i28 = bVar2.f28017b;
                        int i29 = 0;
                        while (true) {
                            y0[] y0VarArr = jVar6.f27548p;
                            if (i29 < y0VarArr.length) {
                                if (jVar6.f27536c[i29] == i28) {
                                    boolean[] zArr5 = jVar6.f27538f;
                                    u0.m(!zArr5[i29]);
                                    zArr5[i29] = true;
                                    y0VarArr[i29].u(j3, true);
                                    z0VarArr2[i27] = new x8.h(jVar6, jVar6, y0VarArr[i29], i29);
                                    break;
                                }
                                i29++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    i27++;
                    iArr6 = iArr;
                } else {
                    iArr = iArr6;
                }
            } else {
                iArr = iArr6;
            }
            i27++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (z0 z0Var6 : z0VarArr2) {
            if (z0Var6 instanceof x8.j) {
                arrayList2.add((x8.j) z0Var6);
            } else if (z0Var6 instanceof n) {
                arrayList3.add((n) z0Var6);
            }
        }
        x8.j[] jVarArr = new x8.j[arrayList2.size()];
        this.f28041t = jVarArr;
        arrayList2.toArray(jVarArr);
        n[] nVarArr = new n[arrayList3.size()];
        this.u = nVarArr;
        arrayList3.toArray(nVarArr);
        com.facebook.internal.m mVar = this.f28035n;
        x8.j[] jVarArr2 = this.f28041t;
        mVar.getClass();
        this.f28042v = new fb.c(jVarArr2, 25);
        return j3;
    }

    @Override // v8.w
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
        this.f28042v.reevaluateBuffer(j3);
    }

    @Override // v8.w
    public final long s(long j3, p2 p2Var) {
        long j10;
        for (x8.j jVar : this.f28041t) {
            if (jVar.f27535b == 2) {
                for (k kVar : ((m) jVar.f27539g).f28094h) {
                    i iVar = kVar.f28081d;
                    if (iVar != null) {
                        long j11 = kVar.f28082e;
                        long m10 = iVar.m(j11);
                        if (m10 != 0) {
                            i iVar2 = kVar.f28081d;
                            long j12 = iVar2.j(j3, j11);
                            long j13 = kVar.f28083f;
                            long j14 = j12 + j13;
                            long d10 = kVar.d(j14);
                            if (d10 < j3 && (m10 == -1 || j14 < ((iVar2.u() + j13) + m10) - 1)) {
                                j10 = kVar.d(j14 + 1);
                            } else {
                                j10 = d10;
                            }
                            return p2Var.a(j3, d10, j10);
                        }
                    }
                }
                return j3;
            }
        }
        return j3;
    }

    @Override // v8.w
    public final long seekToUs(long j3) {
        x8.a aVar;
        boolean z10;
        boolean u;
        for (x8.j jVar : this.f28041t) {
            jVar.f27553v = j3;
            if (jVar.h()) {
                jVar.u = j3;
            } else {
                for (int i10 = 0; i10 < jVar.f27545m.size(); i10++) {
                    aVar = (x8.a) jVar.f27545m.get(i10);
                    long j10 = aVar.f27527i;
                    if (j10 == j3 && aVar.f27501m == C.TIME_UNSET) {
                        break;
                    }
                    if (j10 > j3) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    y0 y0Var = jVar.f27547o;
                    int a = aVar.a(0);
                    synchronized (y0Var) {
                        synchronized (y0Var) {
                            y0Var.f26339s = 0;
                            t0 t0Var = y0Var.a;
                            t0Var.f26287e = t0Var.f26286d;
                        }
                    }
                    int i11 = y0Var.f26337q;
                    if (a >= i11 && a <= y0Var.f26336p + i11) {
                        y0Var.f26340t = Long.MIN_VALUE;
                        y0Var.f26339s = a - i11;
                        u = true;
                    }
                    u = false;
                } else {
                    y0 y0Var2 = jVar.f27547o;
                    if (j3 < jVar.getNextLoadPositionUs()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u = y0Var2.u(j3, z10);
                }
                if (u) {
                    y0 y0Var3 = jVar.f27547o;
                    jVar.f27554w = jVar.j(y0Var3.f26337q + y0Var3.f26339s, 0);
                    for (y0 y0Var4 : jVar.f27548p) {
                        y0Var4.u(j3, true);
                    }
                } else {
                    jVar.u = j3;
                    jVar.f27556y = false;
                    jVar.f27545m.clear();
                    jVar.f27554w = 0;
                    if (jVar.f27543k.a()) {
                        jVar.f27547o.i();
                        for (y0 y0Var5 : jVar.f27548p) {
                            y0Var5.i();
                        }
                        j0 j0Var = jVar.f27543k.f21694c;
                        u0.p(j0Var);
                        j0Var.a(false);
                    } else {
                        jVar.f27543k.f21695d = null;
                        jVar.f27547o.t(false);
                        for (y0 y0Var6 : jVar.f27548p) {
                            y0Var6.t(false);
                        }
                    }
                }
            }
        }
        for (n nVar : this.u) {
            nVar.a(j3);
        }
        return j3;
    }
}
