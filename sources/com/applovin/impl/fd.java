package com.applovin.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public final class fd {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4685c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f4686d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4687e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4688f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4689g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4690h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4691i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4692j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f4693k;

    public fd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.a = (String) a1.a((Object) str);
        this.f4684b = str2;
        this.f4685c = str3;
        this.f4686d = codecCapabilities;
        this.f4690h = z10;
        this.f4691i = z11;
        this.f4692j = z12;
        this.f4687e = z13;
        this.f4688f = z14;
        this.f4689g = z15;
        this.f4693k = df.i(str2);
    }

    private void a(String str) {
        StringBuilder o10 = a4.j.o("AssumedSupport [", str, "] [");
        o10.append(this.a);
        o10.append(", ");
        o10.append(this.f4684b);
        o10.append("] [");
        o10.append(yp.f9256e);
        o10.append("]");
        kc.a(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, o10.toString());
    }

    private void b(String str) {
        StringBuilder o10 = a4.j.o("NoSupport [", str, "] [");
        o10.append(this.a);
        o10.append(", ");
        o10.append(this.f4684b);
        o10.append("] [");
        o10.append(yp.f9256e);
        o10.append("]");
        kc.a(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, o10.toString());
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.a >= 21 && e(codecCapabilities);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.a >= 21 && g(codecCapabilities);
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public String toString() {
        return this.a;
    }

    private static boolean d(String str) {
        return yp.f9255d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(String str) {
        if (yp.a <= 22) {
            String str2 = yp.f9255d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(yp.f9253b)) ? false : true;
    }

    public boolean c(d9 d9Var) {
        if (this.f4693k) {
            return this.f4687e;
        }
        Pair a = id.a(d9Var);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    private static boolean c(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((yp.a >= 26 && i10 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i10;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i11 = 6;
        } else {
            i11 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        kc.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    public boolean b(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4686d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        b(eb.j.i("sampleRate.support, ", i10));
        return false;
    }

    public boolean b(d9 d9Var) {
        int i10;
        if (!a(d9Var)) {
            return false;
        }
        if (this.f4693k) {
            int i11 = d9Var.f4233r;
            if (i11 <= 0 || (i10 = d9Var.f4234s) <= 0) {
                return true;
            }
            if (yp.a >= 21) {
                return a(i11, i10, d9Var.f4235t);
            }
            boolean z10 = i11 * i10 <= id.b();
            if (!z10) {
                b("legacyFrameSize, " + d9Var.f4233r + "x" + d9Var.f4234s);
            }
            return z10;
        }
        if (yp.a >= 21) {
            int i12 = d9Var.A;
            if (i12 != -1 && !b(i12)) {
                return false;
            }
            int i13 = d9Var.f4240z;
            if (i13 != -1 && !a(i13)) {
                return false;
            }
        }
        return true;
    }

    public Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4686d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i10, i11);
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(yp.a(i10, widthAlignment) * widthAlignment, yp.a(i11, heightAlignment) * heightAlignment);
    }

    public boolean b() {
        if (yp.a >= 29 && MimeTypes.VIDEO_VP9.equals(this.f4684b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point a = a(videoCapabilities, i10, i11);
        int i12 = a.x;
        int i13 = a.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.a >= 19 && c(codecCapabilities);
    }

    public o5 a(d9 d9Var, d9 d9Var2) {
        int i10 = !yp.a((Object) d9Var.f4228m, (Object) d9Var2.f4228m) ? 8 : 0;
        if (this.f4693k) {
            if (d9Var.u != d9Var2.u) {
                i10 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (!this.f4687e && (d9Var.f4233r != d9Var2.f4233r || d9Var.f4234s != d9Var2.f4234s)) {
                i10 |= 512;
            }
            if (!yp.a(d9Var.f4239y, d9Var2.f4239y)) {
                i10 |= 2048;
            }
            if (d(this.a) && !d9Var.a(d9Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new o5(this.a, d9Var, d9Var2, d9Var.a(d9Var2) ? 3 : 2, 0);
            }
        } else {
            if (d9Var.f4240z != d9Var2.f4240z) {
                i10 |= 4096;
            }
            if (d9Var.A != d9Var2.A) {
                i10 |= 8192;
            }
            if (d9Var.B != d9Var2.B) {
                i10 |= JsonLexerKt.BATCH_SIZE;
            }
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(this.f4684b)) {
                Pair a = id.a(d9Var);
                Pair a10 = id.a(d9Var2);
                if (a != null && a10 != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a10.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new o5(this.a, d9Var, d9Var2, 3, 0);
                    }
                }
            }
            if (!d9Var.a(d9Var2)) {
                i10 |= 32;
            }
            if (c(this.f4684b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new o5(this.a, d9Var, d9Var2, 1, 0);
            }
        }
        return new o5(this.a, d9Var, d9Var2, 0, i10);
    }

    private static MediaCodecInfo.CodecProfileLevel[] a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : intValue >= 120000000 ? 512 : intValue >= 60000000 ? NotificationCompat.FLAG_LOCAL_ONLY : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4686d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean a(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4686d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        if (a(this.a, this.f4684b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        b(eb.j.i("channelCount.support, ", i10));
        return false;
    }

    public boolean a(d9 d9Var) {
        String b3;
        String str = d9Var.f4225j;
        if (str == null || this.f4684b == null || (b3 = df.b(str)) == null) {
            return true;
        }
        if (!this.f4684b.equals(b3)) {
            b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder("codec.mime "), d9Var.f4225j, ", ", b3));
            return false;
        }
        Pair a = id.a(d9Var);
        if (a == null) {
            return true;
        }
        int intValue = ((Integer) a.first).intValue();
        int intValue2 = ((Integer) a.second).intValue();
        if (!this.f4693k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] a10 = a();
        if (yp.a <= 23 && MimeTypes.VIDEO_VP9.equals(this.f4684b) && a10.length == 0) {
            a10 = a(this.f4686d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a10) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder("codec.profileLevel, "), d9Var.f4225j, ", ", b3));
        return false;
    }

    public boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4686d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 < i11 && f(this.a) && a(videoCapabilities, i11, i10, d10)) {
            StringBuilder n10 = a4.j.n("sizeAndRate.rotated, ", i10, "x", i11, "x");
            n10.append(d10);
            a(n10.toString());
            return true;
        }
        StringBuilder n11 = a4.j.n("sizeAndRate.support, ", i10, "x", i11, "x");
        n11.append(d10);
        b(n11.toString());
        return false;
    }

    public static fd a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new fd(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !b(codecCapabilities) || e(str)) ? false : true, codecCapabilities != null && f(codecCapabilities), z14 || (codecCapabilities != null && d(codecCapabilities)));
    }
}
