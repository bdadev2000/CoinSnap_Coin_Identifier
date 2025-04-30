package g8;

import a5.C0398b;
import java.util.ArrayList;
import java.util.Arrays;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public final class v extends com.bumptech.glide.c implements f8.i {

    /* renamed from: d, reason: collision with root package name */
    public final f8.b f20537d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20538e;

    /* renamed from: f, reason: collision with root package name */
    public final U7.k f20539f;

    /* renamed from: g, reason: collision with root package name */
    public final C0398b f20540g;

    /* renamed from: h, reason: collision with root package name */
    public int f20541h;

    /* renamed from: i, reason: collision with root package name */
    public final f8.h f20542i;

    /* renamed from: j, reason: collision with root package name */
    public final j f20543j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f8.b bVar, int i9, U7.k kVar, c8.g gVar, B1.f fVar) {
        super(8);
        j jVar;
        G7.j.e(bVar, "json");
        AbstractC2914a.i(i9, "mode");
        G7.j.e(kVar, "lexer");
        G7.j.e(gVar, "descriptor");
        this.f20537d = bVar;
        this.f20538e = i9;
        this.f20539f = kVar;
        this.f20540g = bVar.b;
        this.f20541h = -1;
        f8.h hVar = bVar.f20370a;
        this.f20542i = hVar;
        if (hVar.f20389f) {
            jVar = null;
        } else {
            jVar = new j(gVar);
        }
        this.f20543j = jVar;
    }

    @Override // com.bumptech.glide.c, d8.a
    public final Object A(c8.g gVar, int i9, a8.b bVar, Object obj) {
        boolean z8;
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "deserializer");
        if (this.f20538e == 3 && (i9 & 1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        U7.k kVar = this.f20539f;
        if (z8) {
            D0.l lVar = (D0.l) kVar.f3373d;
            int[] iArr = (int[]) lVar.f627d;
            int i10 = lVar.b;
            if (iArr[i10] == -2) {
                ((Object[]) lVar.f626c)[i10] = l.f20507a;
            }
        }
        Object A8 = super.A(gVar, i9, bVar, obj);
        if (z8) {
            D0.l lVar2 = (D0.l) kVar.f3373d;
            int[] iArr2 = (int[]) lVar2.f627d;
            int i11 = lVar2.b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                lVar2.b = i12;
                Object[] objArr = (Object[]) lVar2.f626c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i13);
                    G7.j.d(copyOf, "copyOf(this, newSize)");
                    lVar2.f626c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) lVar2.f627d, i13);
                    G7.j.d(copyOf2, "copyOf(this, newSize)");
                    lVar2.f627d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) lVar2.f626c;
            int i14 = lVar2.b;
            objArr2[i14] = A8;
            ((int[]) lVar2.f627d)[i14] = -2;
        }
        return A8;
    }

    @Override // com.bumptech.glide.c, d8.c
    public final short B() {
        U7.k kVar = this.f20539f;
        long j7 = kVar.j();
        short s5 = (short) j7;
        if (j7 == s5) {
            return s5;
        }
        U7.k.r(kVar, "Failed to parse short for input '" + j7 + '\'', 0, null, 6);
        throw null;
    }

    @Override // com.bumptech.glide.c, d8.c
    public final float C() {
        U7.k kVar = this.f20539f;
        String m = kVar.m();
        try {
            float parseFloat = Float.parseFloat(m);
            if (!this.f20537d.f20370a.f20394k && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                k.n(kVar, Float.valueOf(parseFloat));
                throw null;
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            U7.k.r(kVar, "Failed to parse type 'float' for input '" + m + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.c, d8.c
    public final double D() {
        U7.k kVar = this.f20539f;
        String m = kVar.m();
        try {
            double parseDouble = Double.parseDouble(m);
            if (!this.f20537d.f20370a.f20394k && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                k.n(kVar, Double.valueOf(parseDouble));
                throw null;
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            U7.k.r(kVar, "Failed to parse type 'double' for input '" + m + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // d8.c, d8.a
    public final C0398b a() {
        return this.f20540g;
    }

    @Override // com.bumptech.glide.c, d8.c
    public final d8.a b(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        f8.b bVar = this.f20537d;
        int m = k.m(gVar, bVar);
        U7.k kVar = this.f20539f;
        D0.l lVar = (D0.l) kVar.f3373d;
        lVar.getClass();
        int i9 = lVar.b + 1;
        lVar.b = i9;
        Object[] objArr = (Object[]) lVar.f626c;
        if (i9 == objArr.length) {
            int i10 = i9 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            lVar.f626c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) lVar.f627d, i10);
            G7.j.d(copyOf2, "copyOf(this, newSize)");
            lVar.f627d = copyOf2;
        }
        ((Object[]) lVar.f626c)[i9] = gVar;
        kVar.i(com.mbridge.msdk.foundation.entity.o.a(m));
        if (kVar.w() != 4) {
            int d2 = AbstractC2965e.d(m);
            if (d2 != 1 && d2 != 2 && d2 != 3) {
                if (this.f20538e == m && bVar.f20370a.f20389f) {
                    return this;
                }
                return new v(this.f20537d, m, this.f20539f, gVar, null);
            }
            return new v(this.f20537d, m, this.f20539f, gVar, null);
        }
        U7.k.r(kVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r6.f() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (h(r6) != (-1)) goto L16;
     */
    @Override // com.bumptech.glide.c, d8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(c8.g r6) {
        /*
            r5 = this;
            java.lang.String r0 = "descriptor"
            G7.j.e(r6, r0)
            f8.b r0 = r5.f20537d
            f8.h r0 = r0.f20370a
            boolean r0 = r0.b
            r1 = -1
            if (r0 == 0) goto L1a
            int r0 = r6.f()
            if (r0 != 0) goto L1a
        L14:
            int r0 = r5.h(r6)
            if (r0 != r1) goto L14
        L1a:
            int r6 = r5.f20538e
            char r6 = com.mbridge.msdk.foundation.entity.o.b(r6)
            U7.k r0 = r5.f20539f
            r0.i(r6)
            java.lang.Object r6 = r0.f3373d
            D0.l r6 = (D0.l) r6
            int r0 = r6.b
            java.lang.Object r2 = r6.f627d
            int[] r2 = (int[]) r2
            r3 = r2[r0]
            r4 = -2
            if (r3 != r4) goto L39
            r2[r0] = r1
            int r0 = r0 + r1
            r6.b = r0
        L39:
            int r0 = r6.b
            if (r0 == r1) goto L40
            int r0 = r0 + r1
            r6.b = r0
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.v.c(c8.g):void");
    }

    @Override // f8.i
    public final f8.b d() {
        return this.f20537d;
    }

    @Override // com.bumptech.glide.c, d8.c
    public final boolean e() {
        boolean z8;
        boolean z9 = this.f20542i.f20386c;
        U7.k kVar = this.f20539f;
        if (z9) {
            int y4 = kVar.y();
            String str = (String) kVar.f3376h;
            if (y4 != str.length()) {
                if (str.charAt(y4) == '\"') {
                    y4++;
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean c9 = kVar.c(y4);
                if (z8) {
                    if (kVar.f3372c != str.length()) {
                        if (str.charAt(kVar.f3372c) == '\"') {
                            kVar.f3372c++;
                            return c9;
                        }
                        U7.k.r(kVar, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    U7.k.r(kVar, "EOF", 0, null, 6);
                    throw null;
                }
                return c9;
            }
            U7.k.r(kVar, "EOF", 0, null, 6);
            throw null;
        }
        return kVar.c(kVar.y());
    }

    @Override // com.bumptech.glide.c, d8.c
    public final char f() {
        U7.k kVar = this.f20539f;
        String m = kVar.m();
        if (m.length() == 1) {
            return m.charAt(0);
        }
        U7.k.r(kVar, "Expected single char, but got '" + m + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0105, code lost:
    
        if (r11 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0107, code lost:
    
        r1 = r11.f20505a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x010b, code lost:
    
        if (r7 >= 64) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x010d, code lost:
    
        r1.f20200c |= 1 << r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0116, code lost:
    
        r3 = (r7 >>> 6) - 1;
        r1 = r1.f20201d;
        r1[r3] = (1 << (r7 & 63)) | r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0126, code lost:
    
        r11 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    @Override // d8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(c8.g r21) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.v.h(c8.g):int");
    }

    @Override // com.bumptech.glide.c, d8.c
    public final d8.c i(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        if (x.a(gVar)) {
            return new g(this.f20539f, this.f20537d);
        }
        return this;
    }

    @Override // f8.i
    public final f8.j l() {
        return new u(this.f20537d.f20370a, this.f20539f).e();
    }

    @Override // com.bumptech.glide.c, d8.c
    public final int m() {
        U7.k kVar = this.f20539f;
        long j7 = kVar.j();
        int i9 = (int) j7;
        if (j7 == i9) {
            return i9;
        }
        U7.k.r(kVar, "Failed to parse int for input '" + j7 + '\'', 0, null, 6);
        throw null;
    }

    @Override // com.bumptech.glide.c, d8.c
    public final String p() {
        boolean z8 = this.f20542i.f20386c;
        U7.k kVar = this.f20539f;
        if (z8) {
            return kVar.n();
        }
        return kVar.l();
    }

    @Override // com.bumptech.glide.c, d8.c
    public final long s() {
        return this.f20539f.j();
    }

    @Override // com.bumptech.glide.c, d8.c
    public final int t(c8.g gVar) {
        G7.j.e(gVar, "enumDescriptor");
        return k.k(gVar, this.f20537d, p(), " at path ".concat(((D0.l) this.f20539f.f3373d).e()));
    }

    @Override // com.bumptech.glide.c, d8.c
    public final Object u(a8.b bVar) {
        U7.k kVar = this.f20539f;
        f8.b bVar2 = this.f20537d;
        G7.j.e(bVar, "deserializer");
        try {
            if ((bVar instanceof a8.f) && !bVar2.f20370a.f20392i) {
                if (kVar.f(k.h(bVar.getDescriptor(), bVar2), this.f20542i.f20386c) != null) {
                    ((a8.f) bVar).a(this);
                }
                return k.i(this, bVar);
            }
            return bVar.deserialize(this);
        } catch (a8.c e4) {
            throw new a8.c((ArrayList) e4.b, e4.getMessage() + " at path: " + ((D0.l) kVar.f3373d).e(), e4);
        }
    }

    @Override // com.bumptech.glide.c, d8.c
    public final boolean v() {
        boolean z8;
        j jVar = this.f20543j;
        if (jVar != null) {
            z8 = jVar.b;
        } else {
            z8 = false;
        }
        if (z8 || !this.f20539f.B()) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.c, d8.c
    public final byte y() {
        U7.k kVar = this.f20539f;
        long j7 = kVar.j();
        byte b = (byte) j7;
        if (j7 == b) {
            return b;
        }
        U7.k.r(kVar, "Failed to parse byte for input '" + j7 + '\'', 0, null, 6);
        throw null;
    }
}
