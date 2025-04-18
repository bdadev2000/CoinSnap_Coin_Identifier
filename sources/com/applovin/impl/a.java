package com.applovin.impl;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f22659a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f22660b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f22661a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22662b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22663c;

        private b(int i2, int i3, String str) {
            this.f22661a = i2;
            this.f22662b = i3;
            this.f22663c = str;
        }
    }

    public static byte[] a(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    private static int b(ah ahVar) {
        int a2 = ahVar.a(4);
        if (a2 == 15) {
            return ahVar.a(24);
        }
        if (a2 < 13) {
            return f22659a[a2];
        }
        throw dh.a(null, null);
    }

    private static int a(ah ahVar) {
        int a2 = ahVar.a(5);
        return a2 == 31 ? ahVar.a(6) + 32 : a2;
    }

    public static b a(ah ahVar, boolean z2) {
        int a2 = a(ahVar);
        int b2 = b(ahVar);
        int a3 = ahVar.a(4);
        String i2 = android.support.v4.media.d.i("mp4a.40.", a2);
        if (a2 == 5 || a2 == 29) {
            b2 = b(ahVar);
            a2 = a(ahVar);
            if (a2 == 22) {
                a3 = ahVar.a(4);
            }
        }
        if (z2) {
            if (a2 != 6 && a2 != 7 && a2 != 17 && a2 != 1 && a2 != 2 && a2 != 3 && a2 != 4) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw dh.a("Unsupported audio object type: " + a2);
                }
            }
            a(ahVar, a2, a3);
            switch (a2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a4 = ahVar.a(2);
                    if (a4 == 2 || a4 == 3) {
                        throw dh.a("Unsupported epConfig: " + a4);
                    }
            }
        }
        int i3 = f22660b[a3];
        if (i3 != -1) {
            return new b(b2, i3, i2);
        }
        throw dh.a(null, null);
    }

    private static void a(ah ahVar, int i2, int i3) {
        if (ahVar.f()) {
            pc.d("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (ahVar.f()) {
            ahVar.d(14);
        }
        boolean f2 = ahVar.f();
        if (i3 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 6 || i2 == 20) {
            ahVar.d(3);
        }
        if (f2) {
            if (i2 == 22) {
                ahVar.d(16);
            }
            if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                ahVar.d(3);
            }
            ahVar.d(1);
        }
    }

    public static b a(byte[] bArr) {
        return a(new ah(bArr), false);
    }
}
