package com.applovin.impl;

/* renamed from: com.applovin.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0667a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6541a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.applovin.impl.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6542a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final String f6543c;

        private b(int i9, int i10, String str) {
            this.f6542a = i9;
            this.b = i10;
            this.f6543c = str;
        }
    }

    public static byte[] a(int i9, int i10, int i11) {
        return new byte[]{(byte) (((i9 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    private static int b(xg xgVar) {
        int a6 = xgVar.a(4);
        if (a6 == 15) {
            return xgVar.a(24);
        }
        if (a6 < 13) {
            return f6541a[a6];
        }
        throw ah.a(null, null);
    }

    private static int a(xg xgVar) {
        int a6 = xgVar.a(5);
        return a6 == 31 ? xgVar.a(6) + 32 : a6;
    }

    public static b a(xg xgVar, boolean z8) {
        int a6 = a(xgVar);
        int b8 = b(xgVar);
        int a9 = xgVar.a(4);
        String h6 = com.mbridge.msdk.foundation.entity.o.h(a6, "mp4a.40.");
        if (a6 == 5 || a6 == 29) {
            b8 = b(xgVar);
            a6 = a(xgVar);
            if (a6 == 22) {
                a9 = xgVar.a(4);
            }
        }
        if (z8) {
            if (a6 != 6 && a6 != 7 && a6 != 17 && a6 != 1 && a6 != 2 && a6 != 3 && a6 != 4) {
                switch (a6) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ah.a("Unsupported audio object type: " + a6);
                }
            }
            a(xgVar, a6, a9);
            switch (a6) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a10 = xgVar.a(2);
                    if (a10 == 2 || a10 == 3) {
                        throw ah.a("Unsupported epConfig: " + a10);
                    }
            }
        }
        int i9 = b[a9];
        if (i9 != -1) {
            return new b(b8, i9, h6);
        }
        throw ah.a(null, null);
    }

    private static void a(xg xgVar, int i9, int i10) {
        if (xgVar.f()) {
            kc.d("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xgVar.f()) {
            xgVar.d(14);
        }
        boolean f9 = xgVar.f();
        if (i10 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i9 == 6 || i9 == 20) {
            xgVar.d(3);
        }
        if (f9) {
            if (i9 == 22) {
                xgVar.d(16);
            }
            if (i9 == 17 || i9 == 19 || i9 == 20 || i9 == 23) {
                xgVar.d(3);
            }
            xgVar.d(1);
        }
    }

    public static b a(byte[] bArr) {
        return a(new xg(bArr), false);
    }
}
