package g8;

import a5.C0398b;
import t7.C2728q;
import t7.C2730s;

/* loaded from: classes3.dex */
public final class g extends com.bumptech.glide.c {

    /* renamed from: d, reason: collision with root package name */
    public final U7.k f20503d;

    /* renamed from: e, reason: collision with root package name */
    public final C0398b f20504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(U7.k kVar, f8.b bVar) {
        super(8);
        G7.j.e(kVar, "lexer");
        G7.j.e(bVar, "json");
        this.f20503d = kVar;
        this.f20504e = bVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // com.bumptech.glide.c, d8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final short B() {
        /*
            r6 = this;
            U7.k r0 = r6.f20503d
            java.lang.String r1 = r0.m()
            r2 = 0
            java.lang.String r3 = "<this>"
            G7.j.e(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L31
            t7.q r3 = com.facebook.appevents.n.u(r1)     // Catch: java.lang.IllegalArgumentException -> L31
            if (r3 == 0) goto L20
            int r3 = r3.b     // Catch: java.lang.IllegalArgumentException -> L31
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 ^ r3
            r5 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            int r4 = java.lang.Integer.compare(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L31
            if (r4 <= 0) goto L22
        L20:
            r4 = r2
            goto L28
        L22:
            short r3 = (short) r3     // Catch: java.lang.IllegalArgumentException -> L31
            t7.v r4 = new t7.v     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L31
        L28:
            if (r4 == 0) goto L2d
            short r0 = r4.b     // Catch: java.lang.IllegalArgumentException -> L31
            return r0
        L2d:
            O7.n.u(r1)     // Catch: java.lang.IllegalArgumentException -> L31
            throw r2     // Catch: java.lang.IllegalArgumentException -> L31
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse type 'UShort' for input '"
            r3.<init>(r4)
            r3.append(r1)
            r1 = 39
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 6
            r4 = 0
            U7.k.r(r0, r1, r4, r2, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.g.B():short");
    }

    @Override // d8.c, d8.a
    public final C0398b a() {
        return this.f20504e;
    }

    @Override // d8.a
    public final int h(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // com.bumptech.glide.c, d8.c
    public final int m() {
        U7.k kVar = this.f20503d;
        String m = kVar.m();
        try {
            G7.j.e(m, "<this>");
            C2728q u8 = com.facebook.appevents.n.u(m);
            if (u8 != null) {
                return u8.b;
            }
            O7.n.u(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            U7.k.r(kVar, "Failed to parse type 'UInt' for input '" + m + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.c, d8.c
    public final long s() {
        U7.k kVar = this.f20503d;
        String m = kVar.m();
        try {
            G7.j.e(m, "<this>");
            C2730s v6 = com.facebook.appevents.n.v(m);
            if (v6 != null) {
                return v6.b;
            }
            O7.n.u(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            U7.k.r(kVar, "Failed to parse type 'ULong' for input '" + m + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // com.bumptech.glide.c, d8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte y() {
        /*
            r6 = this;
            U7.k r0 = r6.f20503d
            java.lang.String r1 = r0.m()
            r2 = 0
            java.lang.String r3 = "<this>"
            G7.j.e(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L31
            t7.q r3 = com.facebook.appevents.n.u(r1)     // Catch: java.lang.IllegalArgumentException -> L31
            if (r3 == 0) goto L20
            int r3 = r3.b     // Catch: java.lang.IllegalArgumentException -> L31
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 ^ r3
            r5 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            int r4 = java.lang.Integer.compare(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L31
            if (r4 <= 0) goto L22
        L20:
            r4 = r2
            goto L28
        L22:
            byte r3 = (byte) r3     // Catch: java.lang.IllegalArgumentException -> L31
            t7.o r4 = new t7.o     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L31
        L28:
            if (r4 == 0) goto L2d
            byte r0 = r4.b     // Catch: java.lang.IllegalArgumentException -> L31
            return r0
        L2d:
            O7.n.u(r1)     // Catch: java.lang.IllegalArgumentException -> L31
            throw r2     // Catch: java.lang.IllegalArgumentException -> L31
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse type 'UByte' for input '"
            r3.<init>(r4)
            r3.append(r1)
            r1 = 39
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 6
            r4 = 0
            U7.k.r(r0, r1, r4, r2, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.g.y():byte");
    }
}
