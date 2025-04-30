package com.applovin.impl;

import com.applovin.impl.d9;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0726n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f9253a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: com.applovin.impl.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9254a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9255c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9256d;

        /* renamed from: e, reason: collision with root package name */
        public final int f9257e;

        private b(int i9, int i10, int i11, int i12, int i13) {
            this.f9254a = i9;
            this.f9255c = i10;
            this.b = i11;
            this.f9256d = i12;
            this.f9257e = i13;
        }
    }

    public static void a(int i9, yg ygVar) {
        ygVar.d(7);
        byte[] c9 = ygVar.c();
        c9[0] = -84;
        c9[1] = 64;
        c9[2] = -1;
        c9[3] = -1;
        c9[4] = (byte) ((i9 >> 16) & 255);
        c9[5] = (byte) ((i9 >> 8) & 255);
        c9[6] = (byte) (i9 & 255);
    }

    public static d9 a(yg ygVar, String str, String str2, w6 w6Var) {
        ygVar.g(1);
        return new d9.b().c(str).f("audio/ac4").c(2).n(((ygVar.w() & 32) >> 5) == 1 ? 48000 : 44100).a(w6Var).e(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return a(new xg(bArr)).f9257e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r11 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        if (r11 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r11 != 8) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.AbstractC0726n.b a(com.applovin.impl.xg r11) {
        /*
            r0 = 16
            int r1 = r11.a(r0)
            int r0 = r11.a(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.a(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.a(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = a(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.a(r1)
            boolean r4 = r11.f()
            if (r4 == 0) goto L45
            int r4 = r11.a(r2)
            if (r4 <= 0) goto L45
            r11.d(r0)
        L45:
            boolean r4 = r11.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r9 = r7
            goto L54
        L53:
            r9 = r6
        L54:
            int r11 = r11.a(r3)
            if (r9 != r6) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = com.applovin.impl.AbstractC0726n.f9253a
            r11 = r0[r11]
            goto L93
        L63:
            if (r9 != r7) goto L92
            int[] r4 = com.applovin.impl.AbstractC0726n.f9253a
            int r6 = r4.length
            if (r11 >= r6) goto L92
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 1
            r7 = 8
            if (r1 == r6) goto L88
            r6 = 11
            if (r1 == r0) goto L83
            if (r1 == r2) goto L88
            if (r1 == r3) goto L7c
            goto L8d
        L7c:
            if (r11 == r2) goto L8f
            if (r11 == r7) goto L8f
            if (r11 != r6) goto L8d
            goto L8f
        L83:
            if (r11 == r7) goto L8f
            if (r11 != r6) goto L8d
            goto L8f
        L88:
            if (r11 == r2) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L8d:
            r11 = r4
            goto L93
        L8f:
            int r4 = r4 + 1
            goto L8d
        L92:
            r11 = 0
        L93:
            com.applovin.impl.n$b r0 = new com.applovin.impl.n$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC0726n.a(com.applovin.impl.xg):com.applovin.impl.n$b");
    }

    public static int a(byte[] bArr, int i9) {
        int i10 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i11 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i11 == 65535) {
            i11 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i10 = 4;
        }
        if (i9 == 44097) {
            i10 += 2;
        }
        return i11 + i10;
    }

    private static int a(xg xgVar, int i9) {
        int i10 = 0;
        while (true) {
            int a6 = xgVar.a(i9) + i10;
            if (!xgVar.f()) {
                return a6;
            }
            i10 = (a6 + 1) << i9;
        }
    }
}
