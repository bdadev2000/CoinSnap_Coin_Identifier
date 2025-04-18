package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class zf {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f28330a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f28331b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f28332c = new Object();
    private static int[] d = new int[10];

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f28333a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28334b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f28335c;

        public a(int i2, int i3, boolean z2) {
            this.f28333a = i2;
            this.f28334b = i3;
            this.f28335c = z2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f28336a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28337b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28338c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f28339f;

        /* renamed from: g, reason: collision with root package name */
        public final float f28340g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f28341h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f28342i;

        /* renamed from: j, reason: collision with root package name */
        public final int f28343j;

        /* renamed from: k, reason: collision with root package name */
        public final int f28344k;

        /* renamed from: l, reason: collision with root package name */
        public final int f28345l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f28346m;

        public b(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z2, boolean z3, int i8, int i9, int i10, boolean z4) {
            this.f28336a = i2;
            this.f28337b = i3;
            this.f28338c = i4;
            this.d = i5;
            this.e = i6;
            this.f28339f = i7;
            this.f28340g = f2;
            this.f28341h = z2;
            this.f28342i = z3;
            this.f28343j = i8;
            this.f28344k = i9;
            this.f28345l = i10;
            this.f28346m = z4;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static int c(byte[] bArr, int i2) {
        int i3;
        synchronized (f28332c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                try {
                    i4 = a(bArr, i4, i2);
                    if (i4 < i2) {
                        int[] iArr = d;
                        if (iArr.length <= i5) {
                            d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i5] = i4;
                        i4 += 3;
                        i5++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i3 - i7);
        }
        return i3;
    }

    public static a b(byte[] bArr, int i2, int i3) {
        ch chVar = new ch(bArr, i2, i3);
        chVar.d(8);
        int f2 = chVar.f();
        int f3 = chVar.f();
        chVar.g();
        return new a(f2, f3, chVar.c());
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 < position) {
                int i5 = byteBuffer.get(i2) & UnsignedBytes.MAX_VALUE;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i2 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int a(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        b1.b(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.zf.b c(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zf.c(byte[], int, int):com.applovin.impl.zf$b");
    }

    private static int a(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    private static void a(ch chVar, int i2) {
        int i3 = 8;
        int i4 = 8;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i3 != 0) {
                i3 = ((chVar.e() + i4) + 256) % 256;
            }
            if (i3 != 0) {
                i4 = i3;
            }
        }
    }

    public static boolean a(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }
}
