package com.applovin.impl;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class tf {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f27153a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f27154b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f27155c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f27156f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f27157g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f27158a;

        /* renamed from: b, reason: collision with root package name */
        public String f27159b;

        /* renamed from: c, reason: collision with root package name */
        public int f27160c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f27161f;

        /* renamed from: g, reason: collision with root package name */
        public int f27162g;

        public boolean a(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!tf.c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.f27158a = i3;
            this.f27159b = tf.f27153a[3 - i4];
            int i7 = tf.f27154b[i6];
            this.d = i7;
            if (i3 == 2) {
                this.d = i7 / 2;
            } else if (i3 == 0) {
                this.d = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            this.f27162g = tf.b(i3, i4);
            if (i4 == 3) {
                int i9 = i3 == 3 ? tf.f27155c[i5 - 1] : tf.d[i5 - 1];
                this.f27161f = i9;
                this.f27160c = (((i9 * 12) / this.d) + i8) * 4;
            } else {
                int i10 = Opcodes.D2F;
                if (i3 == 3) {
                    int i11 = i4 == 2 ? tf.e[i5 - 1] : tf.f27156f[i5 - 1];
                    this.f27161f = i11;
                    this.f27160c = ((i11 * Opcodes.D2F) / this.d) + i8;
                } else {
                    int i12 = tf.f27157g[i5 - 1];
                    this.f27161f = i12;
                    if (i4 == 1) {
                        i10 = 72;
                    }
                    this.f27160c = ((i10 * i12) / this.d) + i8;
                }
            }
            this.e = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    public static int b(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f27154b[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f27155c[i5 - 1] : d[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? e[i5 - 1] : f27156f[i5 - 1];
        } else {
            i7 = f27157g[i5 - 1];
        }
        int i10 = Opcodes.D2F;
        if (i3 == 3) {
            return androidx.compose.foundation.text.input.a.z(i7, Opcodes.D2F, i8, i9);
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return androidx.compose.foundation.text.input.a.z(i10, i7, i8, i9);
    }

    public static int d(int i2) {
        int i3;
        int i4;
        if (!c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return b(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i2, int i3) {
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
