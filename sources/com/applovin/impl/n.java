package com.applovin.impl;

import com.applovin.impl.d9;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class n {
    private static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6331b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6332c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6333d;

        /* renamed from: e, reason: collision with root package name */
        public final int f6334e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.a = i10;
            this.f6332c = i11;
            this.f6331b = i12;
            this.f6333d = i13;
            this.f6334e = i14;
        }
    }

    public static void a(int i10, yg ygVar) {
        ygVar.d(7);
        byte[] c10 = ygVar.c();
        c10[0] = -84;
        c10[1] = 64;
        c10[2] = -1;
        c10[3] = -1;
        c10[4] = (byte) ((i10 >> 16) & 255);
        c10[5] = (byte) ((i10 >> 8) & 255);
        c10[6] = (byte) (i10 & 255);
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
        return a(new xg(bArr)).f6334e;
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
    public static com.applovin.impl.n.b a(com.applovin.impl.xg r11) {
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
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r7
        L54:
            int r11 = r11.a(r3)
            if (r9 != r7) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = com.applovin.impl.n.a
            r11 = r0[r11]
            goto L93
        L63:
            if (r9 != r6) goto L92
            int[] r4 = com.applovin.impl.n.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.n.a(com.applovin.impl.xg):com.applovin.impl.n$b");
    }

    public static int a(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        if (i12 == 65535) {
            i12 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static int a(xg xgVar, int i10) {
        int i11 = 0;
        while (true) {
            int a10 = xgVar.a(i10) + i11;
            if (!xgVar.f()) {
                return a10;
            }
            i11 = (a10 + 1) << i10;
        }
    }
}
