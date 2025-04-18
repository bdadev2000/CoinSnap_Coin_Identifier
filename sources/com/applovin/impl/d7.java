package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.d9;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class d7 {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f4214b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f4215c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    private static xg b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new xg(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b3 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b3;
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
        byte b3 = bArr[0];
        return b3 == -2 || b3 == -1;
    }

    public static int d(byte[] bArr) {
        int i10;
        byte b3;
        int i11;
        byte b10;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 != -1) {
                if (b11 != 31) {
                    i10 = (bArr[4] & 1) << 6;
                    b3 = bArr[5];
                } else {
                    i10 = (bArr[5] & 7) << 4;
                    b10 = bArr[6];
                }
            } else {
                i10 = (bArr[4] & 7) << 4;
                b10 = bArr[7];
            }
            i11 = b10 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b3 = bArr[4];
        i11 = b3 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
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
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d7.a(byte[]):int");
    }

    public static int a(ByteBuffer byteBuffer) {
        int i10;
        byte b3;
        int i11;
        byte b10;
        int position = byteBuffer.position();
        byte b11 = byteBuffer.get(position);
        if (b11 != -2) {
            if (b11 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                b10 = byteBuffer.get(position + 7);
            } else if (b11 != 31) {
                i10 = (byteBuffer.get(position + 4) & 1) << 6;
                b3 = byteBuffer.get(position + 5);
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                b10 = byteBuffer.get(position + 6);
            }
            i11 = b10 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(position + 5) & 1) << 6;
        b3 = byteBuffer.get(position + 4);
        i11 = b3 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static d9 a(byte[] bArr, String str, String str2, w6 w6Var) {
        xg b3 = b(bArr);
        b3.d(60);
        int i10 = a[b3.a(6)];
        int i11 = f4214b[b3.a(4)];
        int a10 = b3.a(5);
        int[] iArr = f4215c;
        int i12 = a10 >= iArr.length ? -1 : (iArr[a10] * 1000) / 2;
        b3.d(10);
        return new d9.b().c(str).f(MimeTypes.AUDIO_DTS).b(i12).c(i10 + (b3.a(2) > 0 ? 1 : 0)).n(i11).a(w6Var).e(str2).a();
    }
}
