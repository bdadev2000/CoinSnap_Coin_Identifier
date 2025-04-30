package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.d9;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class d7 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f7189a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f7190c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i9) {
        return i9 == 2147385345 || i9 == -25230976 || i9 == 536864768 || i9 == -14745368;
    }

    private static xg b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new xg(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i9 = 0; i9 < copyOf.length - 1; i9 += 2) {
                byte b8 = copyOf[i9];
                int i10 = i9 + 1;
                copyOf[i9] = copyOf[i10];
                copyOf[i10] = b8;
            }
        }
        xg xgVar = new xg(copyOf);
        if (copyOf[0] == 31) {
            xg xgVar2 = new xg(copyOf);
            while (xgVar2.b() >= 16) {
                xgVar2.d(2);
                xgVar.a(xgVar2.a(14), 14);
            }
        }
        xgVar.a(copyOf);
        return xgVar;
    }

    private static boolean c(byte[] bArr) {
        byte b8 = bArr[0];
        if (b8 != -2 && b8 != -1) {
            return false;
        }
        return true;
    }

    public static int d(byte[] bArr) {
        int i9;
        byte b8;
        int i10;
        byte b9;
        byte b10 = bArr[0];
        if (b10 != -2) {
            if (b10 != -1) {
                if (b10 != 31) {
                    i9 = (bArr[4] & 1) << 6;
                    b8 = bArr[5];
                } else {
                    i9 = (bArr[5] & 7) << 4;
                    b9 = bArr[6];
                }
            } else {
                i9 = (bArr[4] & 7) << 4;
                b9 = bArr[7];
            }
            i10 = b9 & 60;
            return (((i10 >> 2) | i9) + 1) * 32;
        }
        i9 = (bArr[5] & 1) << 6;
        b8 = bArr[4];
        i10 = b8 & 252;
        return (((i10 >> 2) | i9) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d7.a(byte[]):int");
    }

    public static int a(ByteBuffer byteBuffer) {
        int i9;
        byte b8;
        int i10;
        byte b9;
        int position = byteBuffer.position();
        byte b10 = byteBuffer.get(position);
        if (b10 != -2) {
            if (b10 == -1) {
                i9 = (byteBuffer.get(position + 4) & 7) << 4;
                b9 = byteBuffer.get(position + 7);
            } else if (b10 != 31) {
                i9 = (byteBuffer.get(position + 4) & 1) << 6;
                b8 = byteBuffer.get(position + 5);
            } else {
                i9 = (byteBuffer.get(position + 5) & 7) << 4;
                b9 = byteBuffer.get(position + 6);
            }
            i10 = b9 & 60;
            return (((i10 >> 2) | i9) + 1) * 32;
        }
        i9 = (byteBuffer.get(position + 5) & 1) << 6;
        b8 = byteBuffer.get(position + 4);
        i10 = b8 & 252;
        return (((i10 >> 2) | i9) + 1) * 32;
    }

    public static d9 a(byte[] bArr, String str, String str2, w6 w6Var) {
        xg b8 = b(bArr);
        b8.d(60);
        int i9 = f7189a[b8.a(6)];
        int i10 = b[b8.a(4)];
        int a6 = b8.a(5);
        int[] iArr = f7190c;
        int i11 = a6 >= iArr.length ? -1 : (iArr[a6] * 1000) / 2;
        b8.d(10);
        return new d9.b().c(str).f(MimeTypes.AUDIO_DTS).b(i11).c(i9 + (b8.a(2) > 0 ? 1 : 0)).n(i10).a(w6Var).e(str2).a();
    }
}
