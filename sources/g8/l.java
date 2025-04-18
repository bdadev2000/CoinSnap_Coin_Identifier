package g8;

import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import mb.y1;
import n9.h0;
import n9.u;
import n9.x;
import s7.q0;
import s7.r0;
import s7.x1;
import y7.a0;

/* loaded from: classes3.dex */
public final class l implements y7.l {
    public static final byte[] G = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final r0 H;
    public int A;
    public boolean B;
    public y7.n C;
    public a0[] D;
    public a0[] E;
    public boolean F;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18279b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f18280c;

    /* renamed from: d, reason: collision with root package name */
    public final x f18281d;

    /* renamed from: e, reason: collision with root package name */
    public final x f18282e;

    /* renamed from: f, reason: collision with root package name */
    public final x f18283f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f18284g;

    /* renamed from: h, reason: collision with root package name */
    public final x f18285h;

    /* renamed from: i, reason: collision with root package name */
    public final r4.c f18286i;

    /* renamed from: j, reason: collision with root package name */
    public final x f18287j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f18288k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f18289l;

    /* renamed from: m, reason: collision with root package name */
    public final a0 f18290m;

    /* renamed from: n, reason: collision with root package name */
    public int f18291n;

    /* renamed from: o, reason: collision with root package name */
    public int f18292o;

    /* renamed from: p, reason: collision with root package name */
    public long f18293p;

    /* renamed from: q, reason: collision with root package name */
    public int f18294q;

    /* renamed from: r, reason: collision with root package name */
    public x f18295r;

    /* renamed from: s, reason: collision with root package name */
    public long f18296s;

    /* renamed from: t, reason: collision with root package name */
    public int f18297t;
    public long u;

    /* renamed from: v, reason: collision with root package name */
    public long f18298v;

    /* renamed from: w, reason: collision with root package name */
    public long f18299w;

    /* renamed from: x, reason: collision with root package name */
    public k f18300x;

    /* renamed from: y, reason: collision with root package name */
    public int f18301y;

    /* renamed from: z, reason: collision with root package name */
    public int f18302z;

    static {
        q0 q0Var = new q0();
        q0Var.f24667k = MimeTypes.APPLICATION_EMSG;
        H = q0Var.a();
    }

    public l() {
        this(0, Collections.emptyList(), null);
    }

    public static x7.l c(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f26867c == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f18246d.a;
                f0.c N = com.bumptech.glide.c.N(bArr);
                if (N == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) N.f17516c;
                }
                if (uuid == null) {
                    n9.o.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new x7.k(uuid, null, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new x7.l(null, false, (x7.k[]) arrayList2.toArray(new x7.k[0]));
    }

    public static void e(x xVar, int i10, s sVar) {
        boolean z10;
        xVar.G(i10 + 8);
        int f10 = xVar.f() & ViewCompat.MEASURED_SIZE_MASK;
        if ((f10 & 1) == 0) {
            if ((f10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int y4 = xVar.y();
            if (y4 == 0) {
                Arrays.fill(sVar.f18357l, 0, sVar.f18350e, false);
                return;
            }
            if (y4 == sVar.f18350e) {
                Arrays.fill(sVar.f18357l, 0, y4, z10);
                int i11 = xVar.f22600c - xVar.f22599b;
                x xVar2 = sVar.f18359n;
                xVar2.D(i11);
                sVar.f18356k = true;
                sVar.f18360o = true;
                xVar.d(xVar2.a, 0, xVar2.f22600c);
                xVar2.G(0);
                sVar.f18360o = false;
                return;
            }
            StringBuilder m10 = a4.j.m("Senc sample count ", y4, " is different from fragment sample count");
            m10.append(sVar.f18350e);
            throw x1.a(m10.toString(), null);
        }
        throw x1.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // y7.l
    public final void a(y7.n nVar) {
        int i10;
        this.C = nVar;
        int i11 = 0;
        this.f18291n = 0;
        this.f18294q = 0;
        a0[] a0VarArr = new a0[2];
        this.D = a0VarArr;
        a0 a0Var = this.f18290m;
        if (a0Var != null) {
            a0VarArr[0] = a0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.a & 4) != 0) {
            a0VarArr[i10] = nVar.track(100, 5);
            i12 = 101;
            i10++;
        }
        a0[] a0VarArr2 = (a0[]) h0.J(this.D, i10);
        this.D = a0VarArr2;
        for (a0 a0Var2 : a0VarArr2) {
            a0Var2.f(H);
        }
        List list = this.f18279b;
        this.E = new a0[list.size()];
        while (i11 < this.E.length) {
            a0 track = this.C.track(i12, 3);
            track.f((r0) list.get(i11));
            this.E[i11] = track;
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d3, code lost:
    
        if ((r5 & 31) != 6) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0764 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ed A[SYNTHETIC] */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r32, y7.p r33) {
        /*
            Method dump skipped, instructions count: 1911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.l.b(y7.m, y7.p):int");
    }

    @Override // y7.l
    public final boolean d(y7.m mVar) {
        return y1.i(mVar, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0370, code lost:
    
        if (r4 >= r13.f18336e) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x07a2, code lost:
    
        r1.f18291n = 0;
        r1.f18294q = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x07a9, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r47) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.l.f(long):void");
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        SparseArray sparseArray = this.f18280c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) sparseArray.valueAt(i10)).d();
        }
        this.f18289l.clear();
        this.f18297t = 0;
        this.u = j10;
        this.f18288k.clear();
        this.f18291n = 0;
        this.f18294q = 0;
    }

    public l(int i10, List list, a0 a0Var) {
        this.a = i10;
        this.f18279b = Collections.unmodifiableList(list);
        this.f18290m = a0Var;
        this.f18286i = new r4.c(25);
        this.f18287j = new x(16);
        this.f18281d = new x(u.a);
        this.f18282e = new x(5);
        this.f18283f = new x();
        byte[] bArr = new byte[16];
        this.f18284g = bArr;
        this.f18285h = new x(bArr);
        this.f18288k = new ArrayDeque();
        this.f18289l = new ArrayDeque();
        this.f18280c = new SparseArray();
        this.f18298v = C.TIME_UNSET;
        this.u = C.TIME_UNSET;
        this.f18299w = C.TIME_UNSET;
        this.C = y7.n.f27990n8;
        this.D = new a0[0];
        this.E = new a0[0];
    }
}
