package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class a {
    private static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f3563b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3564b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3565c;

        private b(int i10, int i11, String str) {
            this.a = i10;
            this.f3564b = i11;
            this.f3565c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(xg xgVar) {
        int a10 = xgVar.a(4);
        if (a10 == 15) {
            return xgVar.a(24);
        }
        if (a10 < 13) {
            return a[a10];
        }
        throw ah.a(null, null);
    }

    private static int a(xg xgVar) {
        int a10 = xgVar.a(5);
        return a10 == 31 ? xgVar.a(6) + 32 : a10;
    }

    public static b a(xg xgVar, boolean z10) {
        int a10 = a(xgVar);
        int b3 = b(xgVar);
        int a11 = xgVar.a(4);
        String i10 = eb.j.i("mp4a.40.", a10);
        if (a10 == 5 || a10 == 29) {
            b3 = b(xgVar);
            a10 = a(xgVar);
            if (a10 == 22) {
                a11 = xgVar.a(4);
            }
        }
        if (z10) {
            if (a10 != 6 && a10 != 7 && a10 != 17 && a10 != 1 && a10 != 2 && a10 != 3 && a10 != 4) {
                switch (a10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ah.a("Unsupported audio object type: " + a10);
                }
            }
            a(xgVar, a10, a11);
            switch (a10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a12 = xgVar.a(2);
                    if (a12 == 2 || a12 == 3) {
                        throw ah.a("Unsupported epConfig: " + a12);
                    }
            }
        }
        int i11 = f3563b[a11];
        if (i11 != -1) {
            return new b(b3, i11, i10);
        }
        throw ah.a(null, null);
    }

    private static void a(xg xgVar, int i10, int i11) {
        if (xgVar.f()) {
            kc.d("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xgVar.f()) {
            xgVar.d(14);
        }
        boolean f10 = xgVar.f();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            xgVar.d(3);
        }
        if (f10) {
            if (i10 == 22) {
                xgVar.d(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                xgVar.d(3);
            }
            xgVar.d(1);
        }
    }

    public static b a(byte[] bArr) {
        return a(new xg(bArr), false);
    }
}
