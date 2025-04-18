package z7;

import java.util.Arrays;
import n9.h0;
import y7.a0;
import y7.g;
import y7.l;
import y7.m;
import y7.n;
import y7.x;

/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f28565q;

    /* renamed from: t, reason: collision with root package name */
    public static final int f28568t;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28570c;

    /* renamed from: d, reason: collision with root package name */
    public long f28571d;

    /* renamed from: e, reason: collision with root package name */
    public int f28572e;

    /* renamed from: f, reason: collision with root package name */
    public int f28573f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28574g;

    /* renamed from: h, reason: collision with root package name */
    public long f28575h;

    /* renamed from: j, reason: collision with root package name */
    public int f28577j;

    /* renamed from: k, reason: collision with root package name */
    public long f28578k;

    /* renamed from: l, reason: collision with root package name */
    public n f28579l;

    /* renamed from: m, reason: collision with root package name */
    public a0 f28580m;

    /* renamed from: n, reason: collision with root package name */
    public x f28581n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28582o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f28564p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f28566r = h0.z("#!AMR\n");

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f28567s = h0.z("#!AMR-WB\n");

    /* renamed from: b, reason: collision with root package name */
    public final int f28569b = 0;
    public final byte[] a = new byte[1];

    /* renamed from: i, reason: collision with root package name */
    public int f28576i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f28565q = iArr;
        f28568t = iArr[8];
    }

    @Override // y7.l
    public final void a(n nVar) {
        this.f28579l = nVar;
        this.f28580m = nVar.track(0, 1);
        nVar.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r14, y7.p r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.a.b(y7.m, y7.p):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r0 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(y7.m r6) {
        /*
            r5 = this;
            r6.resetPeekPosition()
            byte[] r0 = r5.a
            r1 = 0
            r2 = 1
            r6.peekFully(r0, r1, r2)
            r6 = r0[r1]
            r0 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r0 > 0) goto L6f
            int r6 = r6 >> 3
            r0 = 15
            r6 = r6 & r0
            if (r6 < 0) goto L3b
            if (r6 > r0) goto L3b
            boolean r0 = r5.f28570c
            if (r0 == 0) goto L28
            r4 = 10
            if (r6 < r4) goto L26
            r4 = 13
            if (r6 <= r4) goto L28
        L26:
            r4 = r2
            goto L29
        L28:
            r4 = r1
        L29:
            if (r4 != 0) goto L3a
            if (r0 != 0) goto L37
            r0 = 12
            if (r6 < r0) goto L35
            r0 = 14
            if (r6 <= r0) goto L37
        L35:
            r0 = r2
            goto L38
        L37:
            r0 = r1
        L38:
            if (r0 == 0) goto L3b
        L3a:
            r1 = r2
        L3b:
            if (r1 != 0) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal AMR "
            r0.<init>(r1)
            boolean r1 = r5.f28570c
            if (r1 == 0) goto L4b
            java.lang.String r1 = "WB"
            goto L4d
        L4b:
            java.lang.String r1 = "NB"
        L4d:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            s7.x1 r6 = s7.x1.a(r6, r3)
            throw r6
        L61:
            boolean r0 = r5.f28570c
            if (r0 == 0) goto L6a
            int[] r0 = z7.a.f28565q
            r6 = r0[r6]
            goto L6e
        L6a:
            int[] r0 = z7.a.f28564p
            r6 = r0[r6]
        L6e:
            return r6
        L6f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            s7.x1 r6 = s7.x1.a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.a.c(y7.m):int");
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        return e(mVar);
    }

    public final boolean e(m mVar) {
        mVar.resetPeekPosition();
        byte[] bArr = f28566r;
        byte[] bArr2 = new byte[bArr.length];
        mVar.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f28570c = false;
            mVar.skipFully(bArr.length);
            return true;
        }
        mVar.resetPeekPosition();
        byte[] bArr3 = f28567s;
        byte[] bArr4 = new byte[bArr3.length];
        mVar.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f28570c = true;
        mVar.skipFully(bArr3.length);
        return true;
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        this.f28571d = 0L;
        this.f28572e = 0;
        this.f28573f = 0;
        if (j3 != 0) {
            x xVar = this.f28581n;
            if (xVar instanceof g) {
                this.f28578k = ((Math.max(0L, j3 - ((g) xVar).f27974b) * 8) * 1000000) / r0.f27977e;
                return;
            }
        }
        this.f28578k = 0L;
    }
}
