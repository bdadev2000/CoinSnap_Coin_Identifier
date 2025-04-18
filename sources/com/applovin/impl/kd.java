package com.applovin.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class kd {

    /* renamed from: a, reason: collision with root package name */
    public final String f24873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24874b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24875c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24876f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24877g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24878h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24879i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24880j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f24881k;

    public kd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f24873a = (String) b1.a((Object) str);
        this.f24874b = str2;
        this.f24875c = str3;
        this.d = codecCapabilities;
        this.f24878h = z2;
        this.f24879i = z3;
        this.f24880j = z4;
        this.e = z5;
        this.f24876f = z6;
        this.f24877g = z7;
        this.f24881k = Cif.i(str2);
    }

    private void a(String str) {
        StringBuilder v2 = android.support.v4.media.d.v("AssumedSupport [", str, "] [");
        v2.append(this.f24873a);
        v2.append(", ");
        v2.append(this.f24874b);
        v2.append("] [");
        v2.append(xp.e);
        v2.append("]");
        pc.a("MediaCodecInfo", v2.toString());
    }

    private void b(String str) {
        StringBuilder v2 = android.support.v4.media.d.v("NoSupport [", str, "] [");
        v2.append(this.f24873a);
        v2.append(", ");
        v2.append(this.f24874b);
        v2.append("] [");
        v2.append(xp.e);
        v2.append("]");
        pc.a("MediaCodecInfo", v2.toString());
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return xp.f27962a >= 21 && e(codecCapabilities);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return xp.f27962a >= 21 && g(codecCapabilities);
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public String toString() {
        return this.f24873a;
    }

    private static boolean d(String str) {
        return xp.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(String str) {
        if (xp.f27962a <= 22) {
            String str2 = xp.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(xp.f27963b)) ? false : true;
    }

    public boolean c(f9 f9Var) {
        if (this.f24881k) {
            return this.e;
        }
        Pair a2 = nd.a(f9Var);
        return a2 != null && ((Integer) a2.first).intValue() == 42;
    }

    private static boolean c(String str) {
        return "audio/opus".equals(str);
    }

    private static int a(String str, String str2, int i2) {
        int i3;
        if (i2 > 1 || ((xp.f27962a >= 26 && i2 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i2;
        }
        if ("audio/ac3".equals(str2)) {
            i3 = 6;
        } else {
            i3 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        pc.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i2 + " to " + i3 + "]");
        return i3;
    }

    public boolean b(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        b(android.support.v4.media.d.i("sampleRate.support, ", i2));
        return false;
    }

    public boolean b(f9 f9Var) {
        int i2;
        if (!a(f9Var)) {
            return false;
        }
        if (this.f24881k) {
            int i3 = f9Var.f23845r;
            if (i3 <= 0 || (i2 = f9Var.f23846s) <= 0) {
                return true;
            }
            if (xp.f27962a >= 21) {
                return a(i3, i2, f9Var.f23847t);
            }
            boolean z2 = i3 * i2 <= nd.b();
            if (!z2) {
                b("legacyFrameSize, " + f9Var.f23845r + "x" + f9Var.f23846s);
            }
            return z2;
        }
        if (xp.f27962a >= 21) {
            int i4 = f9Var.A;
            if (i4 != -1 && !b(i4)) {
                return false;
            }
            int i5 = f9Var.f23851z;
            if (i5 != -1 && !a(i5)) {
                return false;
            }
        }
        return true;
    }

    public Point a(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i2, i3);
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(xp.a(i2, widthAlignment) * widthAlignment, xp.a(i3, heightAlignment) * heightAlignment);
    }

    public boolean b() {
        if (xp.f27962a >= 29 && "video/x-vnd.on2.vp9".equals(this.f24874b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        Point a2 = a(videoCapabilities, i2, i3);
        int i4 = a2.x;
        int i5 = a2.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i4, i5);
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return xp.f27962a >= 19 && c(codecCapabilities);
    }

    public q5 a(f9 f9Var, f9 f9Var2) {
        int i2 = !xp.a((Object) f9Var.f23840m, (Object) f9Var2.f23840m) ? 8 : 0;
        if (this.f24881k) {
            if (f9Var.f23848u != f9Var2.f23848u) {
                i2 |= 1024;
            }
            if (!this.e && (f9Var.f23845r != f9Var2.f23845r || f9Var.f23846s != f9Var2.f23846s)) {
                i2 |= 512;
            }
            if (!xp.a(f9Var.f23850y, f9Var2.f23850y)) {
                i2 |= Opcodes.ACC_STRICT;
            }
            if (d(this.f24873a) && !f9Var.a(f9Var2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new q5(this.f24873a, f9Var, f9Var2, f9Var.a(f9Var2) ? 3 : 2, 0);
            }
        } else {
            if (f9Var.f23851z != f9Var2.f23851z) {
                i2 |= 4096;
            }
            if (f9Var.A != f9Var2.A) {
                i2 |= 8192;
            }
            if (f9Var.B != f9Var2.B) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.f24874b)) {
                Pair a2 = nd.a(f9Var);
                Pair a3 = nd.a(f9Var2);
                if (a2 != null && a3 != null) {
                    int intValue = ((Integer) a2.first).intValue();
                    int intValue2 = ((Integer) a3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new q5(this.f24873a, f9Var, f9Var2, 3, 0);
                    }
                }
            }
            if (!f9Var.a(f9Var2)) {
                i2 |= 32;
            }
            if (c(this.f24874b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new q5(this.f24873a, f9Var, f9Var2, 1, 0);
            }
        }
        return new q5(this.f24873a, f9Var, f9Var2, 0, i2);
    }

    private static MediaCodecInfo.CodecProfileLevel[] a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i2 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean a(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        if (a(this.f24873a, this.f24874b, audioCapabilities.getMaxInputChannelCount()) >= i2) {
            return true;
        }
        b(android.support.v4.media.d.i("channelCount.support, ", i2));
        return false;
    }

    public boolean a(f9 f9Var) {
        String b2;
        String str = f9Var.f23837j;
        if (str == null || this.f24874b == null || (b2 = Cif.b(str)) == null) {
            return true;
        }
        if (!this.f24874b.equals(b2)) {
            b("codec.mime " + f9Var.f23837j + ", " + b2);
            return false;
        }
        Pair a2 = nd.a(f9Var);
        if (a2 == null) {
            return true;
        }
        int intValue = ((Integer) a2.first).intValue();
        int intValue2 = ((Integer) a2.second).intValue();
        if (!this.f24881k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] a3 = a();
        if (xp.f27962a <= 23 && "video/x-vnd.on2.vp9".equals(this.f24874b) && a3.length == 0) {
            a3 = a(this.d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a3) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        b("codec.profileLevel, " + f9Var.f23837j + ", " + b2);
        return false;
    }

    public boolean a(int i2, int i3, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i2, i3, d)) {
            return true;
        }
        if (i2 < i3 && f(this.f24873a) && a(videoCapabilities, i3, i2, d)) {
            StringBuilder u2 = android.support.v4.media.d.u("sizeAndRate.rotated, ", i2, "x", i3, "x");
            u2.append(d);
            a(u2.toString());
            return true;
        }
        StringBuilder u3 = android.support.v4.media.d.u("sizeAndRate.support, ", i2, "x", i3, "x");
        u3.append(d);
        b(u3.toString());
        return false;
    }

    public static kd a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new kd(str, str2, str3, codecCapabilities, z2, z3, z4, (z5 || codecCapabilities == null || !b(codecCapabilities) || e(str)) ? false : true, codecCapabilities != null && f(codecCapabilities), z6 || (codecCapabilities != null && d(codecCapabilities)));
    }
}
