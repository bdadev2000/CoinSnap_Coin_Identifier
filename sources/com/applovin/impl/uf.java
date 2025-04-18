package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class uf {
    public static final byte[] a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f8375b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8376c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f8377d = new int[10];

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8378b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8379c;

        public a(int i10, int i11, boolean z10) {
            this.a = i10;
            this.f8378b = i11;
            this.f8379c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8380b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8381c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8382d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8383e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8384f;

        /* renamed from: g, reason: collision with root package name */
        public final float f8385g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f8386h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f8387i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8388j;

        /* renamed from: k, reason: collision with root package name */
        public final int f8389k;

        /* renamed from: l, reason: collision with root package name */
        public final int f8390l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f8391m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.a = i10;
            this.f8380b = i11;
            this.f8381c = i12;
            this.f8382d = i13;
            this.f8383e = i14;
            this.f8384f = i15;
            this.f8385g = f10;
            this.f8386h = z10;
            this.f8387i = z11;
            this.f8388j = i16;
            this.f8389k = i17;
            this.f8390l = i18;
            this.f8391m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static int c(byte[] bArr, int i10) {
        int i11;
        synchronized (f8376c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = a(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f8377d;
                        if (iArr.length <= i13) {
                            f8377d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f8377d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f8377d[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i11 - i15);
        }
        return i11;
    }

    public static a b(byte[] bArr, int i10, int i11) {
        zg zgVar = new zg(bArr, i10, i11);
        zgVar.d(8);
        int f10 = zgVar.f();
        int f11 = zgVar.f();
        zgVar.g();
        return new a(f10, f11, zgVar.c());
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                int i13 = byteBuffer.get(i10) & UByte.MAX_VALUE;
                if (i11 == 3) {
                    if (i13 == 1 && (byteBuffer.get(i12) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        a1.b(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b3 = bArr[i14];
            if ((b3 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b3 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.uf.b c(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.uf.c(byte[], int, int):com.applovin.impl.uf$b");
    }

    private static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    private static void a(zg zgVar, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((zgVar.e() + i12) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    public static boolean a(String str, byte b3) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b3 & Ascii.US) == 6) {
            return true;
        }
        return MimeTypes.VIDEO_H265.equals(str) && ((b3 & 126) >> 1) == 39;
    }
}
