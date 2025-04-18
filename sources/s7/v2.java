package s7;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class v2 implements i {

    /* renamed from: j, reason: collision with root package name */
    public static final String f24780j = n9.h0.E(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24781k = n9.h0.E(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24782l = n9.h0.E(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24783m = n9.h0.E(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24784n = n9.h0.E(4);

    /* renamed from: b, reason: collision with root package name */
    public Object f24785b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24786c;

    /* renamed from: d, reason: collision with root package name */
    public int f24787d;

    /* renamed from: f, reason: collision with root package name */
    public long f24788f;

    /* renamed from: g, reason: collision with root package name */
    public long f24789g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24790h;

    /* renamed from: i, reason: collision with root package name */
    public w8.b f24791i = w8.b.f26918i;

    static {
        new nb.a(12);
    }

    public final long a(int i10, int i11) {
        w8.a a = this.f24791i.a(i10);
        if (a.f26911c != -1) {
            return a.f26915h[i11];
        }
        return C.TIME_UNSET;
    }

    public final int b(long j3) {
        int i10;
        boolean z10;
        w8.b bVar = this.f24791i;
        long j10 = this.f24788f;
        bVar.getClass();
        if (j3 == Long.MIN_VALUE) {
            return -1;
        }
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            return -1;
        }
        int i11 = bVar.f26929g;
        while (true) {
            i10 = bVar.f26926c;
            if (i11 >= i10) {
                break;
            }
            if (bVar.a(i11).f26910b == Long.MIN_VALUE || bVar.a(i11).f26910b > j3) {
                w8.a a = bVar.a(i11);
                int i12 = a.f26911c;
                if (i12 != -1 && a.a(-1) >= i12) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    break;
                }
            }
            i11++;
        }
        if (i11 >= i10) {
            return -1;
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[LOOP:0: B:2:0x000d->B:18:0x0041, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[EDGE_INSN: B:19:0x0044->B:20:0x0044 BREAK  A[LOOP:0: B:2:0x000d->B:18:0x0041], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(long r13) {
        /*
            r12 = this;
            w8.b r0 = r12.f24791i
            long r1 = r12.f24788f
            int r3 = r0.f26926c
            r4 = 1
            int r3 = r3 - r4
            boolean r5 = r0.b(r3)
            int r3 = r3 - r5
        Ld:
            r5 = 0
            r6 = -1
            if (r3 < 0) goto L44
            r7 = -9223372036854775808
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 != 0) goto L18
            goto L3e
        L18:
            w8.a r9 = r0.a(r3)
            long r10 = r9.f26910b
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 != 0) goto L38
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 == 0) goto L3c
            boolean r7 = r9.f26917j
            if (r7 == 0) goto L33
            int r7 = r9.f26911c
            if (r7 == r6) goto L3c
        L33:
            int r7 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r7 >= 0) goto L3e
            goto L3c
        L38:
            int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r7 >= 0) goto L3e
        L3c:
            r7 = r4
            goto L3f
        L3e:
            r7 = r5
        L3f:
            if (r7 == 0) goto L44
            int r3 = r3 + (-1)
            goto Ld
        L44:
            if (r3 < 0) goto L62
            w8.a r13 = r0.a(r3)
            int r14 = r13.f26911c
            if (r14 != r6) goto L4f
            goto L5f
        L4f:
            r0 = r5
        L50:
            if (r0 >= r14) goto L5e
            int[] r1 = r13.f26914g
            r1 = r1[r0]
            if (r1 == 0) goto L5f
            if (r1 != r4) goto L5b
            goto L5f
        L5b:
            int r0 = r0 + 1
            goto L50
        L5e:
            r4 = r5
        L5f:
            if (r4 == 0) goto L62
            goto L63
        L62:
            r3 = r6
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.v2.c(long):int");
    }

    public final long d(int i10) {
        return this.f24791i.a(i10).f26910b;
    }

    public final int e(int i10, int i11) {
        w8.a a = this.f24791i.a(i10);
        if (a.f26911c != -1) {
            return a.f26914g[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !v2.class.equals(obj.getClass())) {
            return false;
        }
        v2 v2Var = (v2) obj;
        if (n9.h0.a(this.f24785b, v2Var.f24785b) && n9.h0.a(this.f24786c, v2Var.f24786c) && this.f24787d == v2Var.f24787d && this.f24788f == v2Var.f24788f && this.f24789g == v2Var.f24789g && this.f24790h == v2Var.f24790h && n9.h0.a(this.f24791i, v2Var.f24791i)) {
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return this.f24791i.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        w8.b bVar = this.f24791i;
        if (i10 == bVar.f26926c - 1 && bVar.b(i10)) {
            return true;
        }
        return false;
    }

    public final boolean h(int i10) {
        return this.f24791i.a(i10).f26917j;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f24785b;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f24786c;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        int i12 = (((i11 + i10) * 31) + this.f24787d) * 31;
        long j3 = this.f24788f;
        int i13 = (i12 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f24789g;
        return this.f24791i.hashCode() + ((((i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f24790h ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i10, long j3, long j10, w8.b bVar, boolean z10) {
        this.f24785b = obj;
        this.f24786c = obj2;
        this.f24787d = i10;
        this.f24788f = j3;
        this.f24789g = j10;
        this.f24791i = bVar;
        this.f24790h = z10;
    }
}
