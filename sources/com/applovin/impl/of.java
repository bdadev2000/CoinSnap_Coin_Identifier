package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public abstract class of {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f9516a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9517c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f9518d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f9519e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f9520f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f9521g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f9522a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public int f9523c;

        /* renamed from: d, reason: collision with root package name */
        public int f9524d;

        /* renamed from: e, reason: collision with root package name */
        public int f9525e;

        /* renamed from: f, reason: collision with root package name */
        public int f9526f;

        /* renamed from: g, reason: collision with root package name */
        public int f9527g;

        public boolean a(int i9) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (!of.c(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
                return false;
            }
            this.f9522a = i10;
            this.b = of.f9516a[3 - i11];
            int i16 = of.b[i13];
            this.f9524d = i16;
            int i17 = 2;
            if (i10 == 2) {
                this.f9524d = i16 / 2;
            } else if (i10 == 0) {
                this.f9524d = i16 / 4;
            }
            int i18 = (i9 >>> 9) & 1;
            this.f9527g = of.b(i10, i11);
            if (i11 == 3) {
                if (i10 == 3) {
                    i15 = of.f9517c[i12 - 1];
                } else {
                    i15 = of.f9518d[i12 - 1];
                }
                this.f9526f = i15;
                this.f9523c = (((i15 * 12) / this.f9524d) + i18) * 4;
            } else {
                int i19 = 144;
                if (i10 == 3) {
                    if (i11 == 2) {
                        i14 = of.f9519e[i12 - 1];
                    } else {
                        i14 = of.f9520f[i12 - 1];
                    }
                    this.f9526f = i14;
                    this.f9523c = ((i14 * 144) / this.f9524d) + i18;
                } else {
                    int i20 = of.f9521g[i12 - 1];
                    this.f9526f = i20;
                    if (i11 == 1) {
                        i19 = 72;
                    }
                    this.f9523c = ((i19 * i20) / this.f9524d) + i18;
                }
            }
            if (((i9 >> 6) & 3) == 3) {
                i17 = 1;
            }
            this.f9525e = i17;
            return true;
        }
    }

    public static int b(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!c(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = b[i13];
        if (i10 == 2) {
            i15 /= 2;
        } else if (i10 == 0) {
            i15 /= 4;
        }
        int i16 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f9517c[i12 - 1] : f9518d[i12 - 1]) * 12) / i15) + i16) * 4;
        }
        if (i10 == 3) {
            i14 = i11 == 2 ? f9519e[i12 - 1] : f9520f[i12 - 1];
        } else {
            i14 = f9521g[i12 - 1];
        }
        if (i10 == 3) {
            return Q7.n0.v(i14, 144, i15, i16);
        }
        return Q7.n0.v(i11 == 1 ? 72 : 144, i14, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(int i9) {
        return (i9 & (-2097152)) == -2097152;
    }

    public static int d(int i9) {
        int i10;
        int i11;
        if (!c(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i9 >>> 12) & 15;
        int i13 = (i9 >>> 10) & 3;
        if (i12 == 0 || i12 == 15 || i13 == 3) {
            return -1;
        }
        return b(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i9, int i10) {
        if (i10 == 1) {
            return i9 == 3 ? 1152 : 576;
        }
        if (i10 == 2) {
            return 1152;
        }
        if (i10 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
