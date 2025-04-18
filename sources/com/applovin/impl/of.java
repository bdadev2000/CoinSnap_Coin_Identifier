package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public abstract class of {
    private static final String[] a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6579b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6580c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f6581d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6582e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f6583f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f6584g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes.dex */
    public static final class a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public String f6585b;

        /* renamed from: c, reason: collision with root package name */
        public int f6586c;

        /* renamed from: d, reason: collision with root package name */
        public int f6587d;

        /* renamed from: e, reason: collision with root package name */
        public int f6588e;

        /* renamed from: f, reason: collision with root package name */
        public int f6589f;

        /* renamed from: g, reason: collision with root package name */
        public int f6590g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            if (!of.c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.a = i11;
            this.f6585b = of.a[3 - i12];
            int i17 = of.f6579b[i14];
            this.f6587d = i17;
            int i18 = 2;
            if (i11 == 2) {
                this.f6587d = i17 / 2;
            } else if (i11 == 0) {
                this.f6587d = i17 / 4;
            }
            int i19 = (i10 >>> 9) & 1;
            this.f6590g = of.b(i11, i12);
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = of.f6580c[i13 - 1];
                } else {
                    i16 = of.f6581d[i13 - 1];
                }
                this.f6589f = i16;
                this.f6586c = (((i16 * 12) / this.f6587d) + i19) * 4;
            } else {
                int i20 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = of.f6582e[i13 - 1];
                    } else {
                        i15 = of.f6583f[i13 - 1];
                    }
                    this.f6589f = i15;
                    this.f6586c = ((i15 * 144) / this.f6587d) + i19;
                } else {
                    int i21 = of.f6584g[i13 - 1];
                    this.f6589f = i21;
                    if (i12 == 1) {
                        i20 = 72;
                    }
                    this.f6586c = ((i20 * i21) / this.f6587d) + i19;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i18 = 1;
            }
            this.f6588e = i18;
            return true;
        }
    }

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f6579b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f6580c[i13 - 1] : f6581d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f6582e[i13 - 1] : f6583f[i13 - 1];
        } else {
            i15 = f6584g[i13 - 1];
        }
        if (i11 == 3) {
            return a4.j.z(i15, 144, i16, i17);
        }
        return a4.j.z(i12 == 1 ? 72 : 144, i15, i16, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int d(int i10) {
        int i11;
        int i12;
        if (!c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return b(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
