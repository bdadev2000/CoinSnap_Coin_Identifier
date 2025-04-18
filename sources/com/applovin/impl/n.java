package com.applovin.impl;

import com.applovin.impl.f9;
import com.facebook.ads.AdError;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f25621a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, Opcodes.ACC_STRICT};

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f25622a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25623b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25624c;
        public final int d;
        public final int e;

        private b(int i2, int i3, int i4, int i5, int i6) {
            this.f25622a = i2;
            this.f25624c = i3;
            this.f25623b = i4;
            this.d = i5;
            this.e = i6;
        }
    }

    public static void a(int i2, bh bhVar) {
        bhVar.d(7);
        byte[] c2 = bhVar.c();
        c2[0] = -84;
        c2[1] = 64;
        c2[2] = -1;
        c2[3] = -1;
        c2[4] = (byte) ((i2 >> 16) & 255);
        c2[5] = (byte) ((i2 >> 8) & 255);
        c2[6] = (byte) (i2 & 255);
    }

    public static f9 a(bh bhVar, String str, String str2, y6 y6Var) {
        bhVar.g(1);
        return new f9.b().c(str).f("audio/ac4").c(2).n(((bhVar.w() & 32) >> 5) == 1 ? 48000 : 44100).a(y6Var).e(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return a(new ah(bArr)).e;
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
    public static com.applovin.impl.n.b a(com.applovin.impl.ah r11) {
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
            int[] r0 = com.applovin.impl.n.f25621a
            r11 = r0[r11]
            goto L93
        L63:
            if (r9 != r7) goto L92
            int[] r4 = com.applovin.impl.n.f25621a
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.n.a(com.applovin.impl.ah):com.applovin.impl.n$b");
    }

    public static int a(byte[] bArr, int i2) {
        int i3 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i4 = ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
        if (i4 == 65535) {
            i4 = ((bArr[4] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[5] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[6] & UnsignedBytes.MAX_VALUE);
        } else {
            i3 = 4;
        }
        if (i2 == 44097) {
            i3 += 2;
        }
        return i4 + i3;
    }

    private static int a(ah ahVar, int i2) {
        int i3 = 0;
        while (true) {
            int a2 = ahVar.a(i2) + i3;
            if (!ahVar.f()) {
                return a2;
            }
            i3 = (a2 + 1) << i2;
        }
    }
}
