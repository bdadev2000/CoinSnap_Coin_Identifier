package f8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import n9.h0;
import n9.x;
import y7.a0;
import y7.k;
import y7.l;
import y7.m;
import y7.n;
import y7.t;
import y7.u;

/* loaded from: classes3.dex */
public final class d implements l {

    /* renamed from: t, reason: collision with root package name */
    public static final nb.a f17696t = new nb.a(24);

    /* renamed from: f, reason: collision with root package name */
    public final k f17701f;

    /* renamed from: g, reason: collision with root package name */
    public n f17702g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f17703h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f17704i;

    /* renamed from: j, reason: collision with root package name */
    public int f17705j;

    /* renamed from: k, reason: collision with root package name */
    public l8.b f17706k;

    /* renamed from: m, reason: collision with root package name */
    public long f17708m;

    /* renamed from: n, reason: collision with root package name */
    public long f17709n;

    /* renamed from: o, reason: collision with root package name */
    public int f17710o;

    /* renamed from: p, reason: collision with root package name */
    public f f17711p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17712q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17713r;

    /* renamed from: s, reason: collision with root package name */
    public long f17714s;
    public final int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final x f17697b = new x(10);

    /* renamed from: c, reason: collision with root package name */
    public final u7.b f17698c = new u7.b();

    /* renamed from: d, reason: collision with root package name */
    public final t f17699d = new t();

    /* renamed from: l, reason: collision with root package name */
    public long f17707l = C.TIME_UNSET;

    /* renamed from: e, reason: collision with root package name */
    public final u f17700e = new u(0);

    public d() {
        k kVar = new k();
        this.f17701f = kVar;
        this.f17704i = kVar;
    }

    public static long e(l8.b bVar) {
        if (bVar != null) {
            for (l8.a aVar : bVar.f21159b) {
                if (aVar instanceof q8.n) {
                    q8.n nVar = (q8.n) aVar;
                    if (nVar.f23718b.equals("TLEN")) {
                        return h0.H(Long.parseLong((String) nVar.f23730d.get(0)));
                    }
                }
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    @Override // y7.l
    public final void a(n nVar) {
        this.f17702g = nVar;
        a0 track = nVar.track(0, 1);
        this.f17703h = track;
        this.f17704i = track;
        this.f17702g.endTracks();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r7 != 1231971951) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0316, code lost:
    
        if ((r4 & 1) != 0) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x030e  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r36, y7.p r37) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.d.b(y7.m, y7.p):int");
    }

    public final a c(m mVar, boolean z10) {
        x xVar = this.f17697b;
        mVar.peekFully(xVar.a, 0, 4);
        xVar.G(0);
        this.f17698c.a(xVar.f());
        return new a(mVar.getLength(), mVar.getPosition(), this.f17698c, z10);
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        return g(mVar, true);
    }

    public final boolean f(m mVar) {
        f fVar = this.f17711p;
        if (fVar != null) {
            long c10 = fVar.c();
            if (c10 != -1 && mVar.getPeekPosition() > c10 - 4) {
                return true;
            }
        }
        try {
            return !mVar.peekFully(this.f17697b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        if (r19 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        r18.skipFully(r3 + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        r17.f17705j = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        r18.resetPeekPosition();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(y7.m r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r18.resetPeekPosition()
            long r3 = r18.getPosition()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L45
            int r3 = r0.a
            r3 = r3 & 8
            if (r3 != 0) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = r4
        L25:
            if (r3 == 0) goto L29
            r3 = r6
            goto L2b
        L29:
            nb.a r3 = f8.d.f17696t
        L2b:
            y7.u r7 = r0.f17700e
            l8.b r3 = r7.f(r1, r3)
            r0.f17706k = r3
            if (r3 == 0) goto L3a
            y7.t r7 = r0.f17699d
            r7.b(r3)
        L3a:
            long r7 = r18.getPeekPosition()
            int r3 = (int) r7
            if (r19 != 0) goto L46
            r1.skipFully(r3)
            goto L46
        L45:
            r3 = r4
        L46:
            r7 = r4
            r8 = r7
            r9 = r8
        L49:
            boolean r10 = r17.f(r18)
            if (r10 == 0) goto L58
            if (r8 <= 0) goto L52
            goto Lab
        L52:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L58:
            n9.x r10 = r0.f17697b
            r10.G(r4)
            int r10 = r10.f()
            if (r7 == 0) goto L76
            long r11 = (long) r7
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r10
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L73
            r11 = r5
            goto L74
        L73:
            r11 = r4
        L74:
            if (r11 == 0) goto L7d
        L76:
            int r11 = com.bumptech.glide.c.u(r10)
            r12 = -1
            if (r11 != r12) goto L9d
        L7d:
            int r7 = r9 + 1
            if (r9 != r2) goto L8b
            if (r19 == 0) goto L84
            return r4
        L84:
            java.lang.String r1 = "Searched too many bytes."
            s7.x1 r1 = s7.x1.a(r1, r6)
            throw r1
        L8b:
            if (r19 == 0) goto L96
            r18.resetPeekPosition()
            int r8 = r3 + r7
            r1.advancePeekPosition(r8)
            goto L99
        L96:
            r1.skipFully(r5)
        L99:
            r8 = r4
            r9 = r7
            r7 = r8
            goto L49
        L9d:
            int r8 = r8 + 1
            if (r8 != r5) goto La8
            u7.b r7 = r0.f17698c
            r7.a(r10)
            r7 = r10
            goto Lb8
        La8:
            r10 = 4
            if (r8 != r10) goto Lb8
        Lab:
            if (r19 == 0) goto Lb2
            int r3 = r3 + r9
            r1.skipFully(r3)
            goto Lb5
        Lb2:
            r18.resetPeekPosition()
        Lb5:
            r0.f17705j = r7
            return r5
        Lb8:
            int r11 = r11 + (-4)
            r1.advancePeekPosition(r11)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.d.g(y7.m, boolean):boolean");
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        this.f17705j = 0;
        this.f17707l = C.TIME_UNSET;
        this.f17708m = 0L;
        this.f17710o = 0;
        this.f17714s = j10;
        f fVar = this.f17711p;
        if ((fVar instanceof b) && !((b) fVar).a(j10)) {
            this.f17713r = true;
            this.f17704i = this.f17701f;
        }
    }
}
