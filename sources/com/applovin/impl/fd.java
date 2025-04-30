package com.applovin.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class fd {

    /* renamed from: a, reason: collision with root package name */
    public final String f7633a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7634c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7635d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7636e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7637f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7638g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7639h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7640i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7641j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f7642k;

    public fd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f7633a = (String) AbstractC0669a1.a((Object) str);
        this.b = str2;
        this.f7634c = str3;
        this.f7635d = codecCapabilities;
        this.f7639h = z8;
        this.f7640i = z9;
        this.f7641j = z10;
        this.f7636e = z11;
        this.f7637f = z12;
        this.f7638g = z13;
        this.f7642k = df.i(str2);
    }

    private static int a(String str, String str2, int i9) {
        int i10;
        if (i9 > 1 || ((yp.f12451a >= 26 && i9 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i9;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i10 = 6;
        } else {
            i10 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        kc.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i9 + " to " + i10 + "]");
        return i10;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f12451a >= 21 && e(codecCapabilities);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f12451a >= 21 && g(codecCapabilities);
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public boolean b(int i9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7635d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i9)) {
            return true;
        }
        b(com.mbridge.msdk.foundation.entity.o.h(i9, "sampleRate.support, "));
        return false;
    }

    public String toString() {
        return this.f7633a;
    }

    private static boolean d(String str) {
        return yp.f12453d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(String str) {
        if (yp.f12451a <= 22) {
            String str2 = yp.f12453d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(yp.b)) ? false : true;
    }

    public boolean c(d9 d9Var) {
        if (this.f7642k) {
            return this.f7636e;
        }
        Pair a6 = id.a(d9Var);
        return a6 != null && ((Integer) a6.first).intValue() == 42;
    }

    private static boolean c(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    public boolean b(d9 d9Var) {
        int i9;
        if (!a(d9Var)) {
            return false;
        }
        if (this.f7642k) {
            int i10 = d9Var.f7215r;
            if (i10 <= 0 || (i9 = d9Var.f7216s) <= 0) {
                return true;
            }
            if (yp.f12451a >= 21) {
                return a(i10, i9, d9Var.f7217t);
            }
            boolean z8 = i10 * i9 <= id.b();
            if (!z8) {
                b("legacyFrameSize, " + d9Var.f7215r + "x" + d9Var.f7216s);
            }
            return z8;
        }
        if (yp.f12451a >= 21) {
            int i11 = d9Var.f7195A;
            if (i11 != -1 && !b(i11)) {
                return false;
            }
            int i12 = d9Var.f7223z;
            if (i12 != -1 && !a(i12)) {
                return false;
            }
        }
        return true;
    }

    public Point a(int i9, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7635d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i9, i10);
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(yp.a(i9, widthAlignment) * widthAlignment, yp.a(i10, heightAlignment) * heightAlignment);
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d2) {
        Point a6 = a(videoCapabilities, i9, i10);
        int i11 = a6.x;
        int i12 = a6.y;
        if (d2 != -1.0d && d2 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d2));
        }
        return videoCapabilities.isSizeSupported(i11, i12);
    }

    public boolean b() {
        if (yp.f12451a >= 29 && MimeTypes.VIDEO_VP9.equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b(String str) {
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("NoSupport [", str, "] [");
        n2.append(this.f7633a);
        n2.append(", ");
        n2.append(this.b);
        n2.append("] [");
        n2.append(yp.f12454e);
        n2.append("]");
        kc.a(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, n2.toString());
    }

    public o5 a(d9 d9Var, d9 d9Var2) {
        int i9 = !yp.a((Object) d9Var.m, (Object) d9Var2.m) ? 8 : 0;
        if (this.f7642k) {
            if (d9Var.f7218u != d9Var2.f7218u) {
                i9 |= 1024;
            }
            if (!this.f7636e && (d9Var.f7215r != d9Var2.f7215r || d9Var.f7216s != d9Var2.f7216s)) {
                i9 |= 512;
            }
            if (!yp.a(d9Var.f7222y, d9Var2.f7222y)) {
                i9 |= 2048;
            }
            if (d(this.f7633a) && !d9Var.a(d9Var2)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new o5(this.f7633a, d9Var, d9Var2, d9Var.a(d9Var2) ? 3 : 2, 0);
            }
        } else {
            if (d9Var.f7223z != d9Var2.f7223z) {
                i9 |= 4096;
            }
            if (d9Var.f7195A != d9Var2.f7195A) {
                i9 |= FragmentTransaction.TRANSIT_EXIT_MASK;
            }
            if (d9Var.f7196B != d9Var2.f7196B) {
                i9 |= 16384;
            }
            if (i9 == 0 && MimeTypes.AUDIO_AAC.equals(this.b)) {
                Pair a6 = id.a(d9Var);
                Pair a9 = id.a(d9Var2);
                if (a6 != null && a9 != null) {
                    int intValue = ((Integer) a6.first).intValue();
                    int intValue2 = ((Integer) a9.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new o5(this.f7633a, d9Var, d9Var2, 3, 0);
                    }
                }
            }
            if (!d9Var.a(d9Var2)) {
                i9 |= 32;
            }
            if (c(this.b)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new o5(this.f7633a, d9Var, d9Var2, 1, 0);
            }
        }
        return new o5(this.f7633a, d9Var, d9Var2, 0, i9);
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f12451a >= 19 && c(codecCapabilities);
    }

    private static MediaCodecInfo.CodecProfileLevel[] a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i9 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? NotificationCompat.FLAG_LOCAL_ONLY : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i9;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7635d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean a(int i9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7635d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        if (a(this.f7633a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i9) {
            return true;
        }
        b(com.mbridge.msdk.foundation.entity.o.h(i9, "channelCount.support, "));
        return false;
    }

    public boolean a(d9 d9Var) {
        String b;
        String str = d9Var.f7209j;
        if (str == null || this.b == null || (b = df.b(str)) == null) {
            return true;
        }
        if (!this.b.equals(b)) {
            b(Q7.n0.l(new StringBuilder("codec.mime "), d9Var.f7209j, ", ", b));
            return false;
        }
        Pair a6 = id.a(d9Var);
        if (a6 == null) {
            return true;
        }
        int intValue = ((Integer) a6.first).intValue();
        int intValue2 = ((Integer) a6.second).intValue();
        if (!this.f7642k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] a9 = a();
        if (yp.f12451a <= 23 && MimeTypes.VIDEO_VP9.equals(this.b) && a9.length == 0) {
            a9 = a(this.f7635d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a9) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        b(Q7.n0.l(new StringBuilder("codec.profileLevel, "), d9Var.f7209j, ", ", b));
        return false;
    }

    public boolean a(int i9, int i10, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7635d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i9, i10, d2)) {
            return true;
        }
        if (i9 < i10 && f(this.f7633a) && a(videoCapabilities, i10, i9, d2)) {
            StringBuilder o3 = Q7.n0.o(i9, i10, "sizeAndRate.rotated, ", "x", "x");
            o3.append(d2);
            a(o3.toString());
            return true;
        }
        StringBuilder o9 = Q7.n0.o(i9, i10, "sizeAndRate.support, ", "x", "x");
        o9.append(d2);
        b(o9.toString());
        return false;
    }

    public static fd a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        return new fd(str, str2, str3, codecCapabilities, z8, z9, z10, (z11 || codecCapabilities == null || !b(codecCapabilities) || e(str)) ? false : true, codecCapabilities != null && f(codecCapabilities), z12 || (codecCapabilities != null && d(codecCapabilities)));
    }

    private void a(String str) {
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("AssumedSupport [", str, "] [");
        n2.append(this.f7633a);
        n2.append(", ");
        n2.append(this.b);
        n2.append("] [");
        n2.append(yp.f12454e);
        n2.append("]");
        kc.a(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, n2.toString());
    }
}
