package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class uf {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f11591a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f11592c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f11593d = new int[10];

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11594a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f11595c;

        public a(int i9, int i10, boolean z8) {
            this.f11594a = i9;
            this.b = i10;
            this.f11595c = z8;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f11596a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11597c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11598d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11599e;

        /* renamed from: f, reason: collision with root package name */
        public final int f11600f;

        /* renamed from: g, reason: collision with root package name */
        public final float f11601g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f11602h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f11603i;

        /* renamed from: j, reason: collision with root package name */
        public final int f11604j;

        /* renamed from: k, reason: collision with root package name */
        public final int f11605k;
        public final int l;
        public final boolean m;

        public b(int i9, int i10, int i11, int i12, int i13, int i14, float f9, boolean z8, boolean z9, int i15, int i16, int i17, boolean z10) {
            this.f11596a = i9;
            this.b = i10;
            this.f11597c = i11;
            this.f11598d = i12;
            this.f11599e = i13;
            this.f11600f = i14;
            this.f11601g = f9;
            this.f11602h = z8;
            this.f11603i = z9;
            this.f11604j = i15;
            this.f11605k = i16;
            this.l = i17;
            this.m = z10;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i9) {
        return bArr[i9 + 3] & Ascii.US;
    }

    public static int c(byte[] bArr, int i9) {
        int i10;
        synchronized (f11592c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                try {
                    i11 = a(bArr, i11, i9);
                    if (i11 < i9) {
                        int[] iArr = f11593d;
                        if (iArr.length <= i12) {
                            f11593d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f11593d[i12] = i11;
                        i11 += 3;
                        i12++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i10 = i9 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f11593d[i15] - i13;
                System.arraycopy(bArr, i13, bArr, i14, i16);
                int i17 = i14 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i14 = i17 + 2;
                bArr[i18] = 0;
                i13 += i16 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i14, i10 - i14);
        }
        return i10;
    }

    public static a b(byte[] bArr, int i9, int i10) {
        zg zgVar = new zg(bArr, i9, i10);
        zgVar.d(8);
        int f9 = zgVar.f();
        int f10 = zgVar.f();
        zgVar.g();
        return new a(f9, f10, zgVar.c());
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i9 + 1;
            if (i11 < position) {
                int i12 = byteBuffer.get(i9) & 255;
                if (i10 == 3) {
                    if (i12 == 1 && (byteBuffer.get(i11) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i9 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i12 == 0) {
                    i10++;
                }
                if (i12 != 0) {
                    i10 = 0;
                }
                i9 = i11;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int a(byte[] bArr, int i9, int i10, boolean[] zArr) {
        int i11 = i10 - i9;
        AbstractC0669a1.b(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i9 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i9] == 1) {
            a(zArr);
            return i9 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i9] == 0 && bArr[i9 + 1] == 1) {
            a(zArr);
            return i9 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i9 + 2;
        while (i13 < i12) {
            byte b8 = bArr[i13];
            if ((b8 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b8 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.uf.b c(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.uf.c(byte[], int, int):com.applovin.impl.uf$b");
    }

    private static int a(byte[] bArr, int i9, int i10) {
        while (i9 < i10 - 2) {
            if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static int a(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 126) >> 1;
    }

    private static void a(zg zgVar, int i9) {
        int i10 = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i9; i12++) {
            if (i10 != 0) {
                i10 = ((zgVar.e() + i11) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (i10 != 0) {
                i11 = i10;
            }
        }
    }

    public static boolean a(String str, byte b8) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b8 & Ascii.US) == 6) {
            return true;
        }
        return MimeTypes.VIDEO_H265.equals(str) && ((b8 & 126) >> 1) == 39;
    }
}
