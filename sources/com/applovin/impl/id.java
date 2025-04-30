package com.applovin.impl;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.id;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ar.core.ImageMetadata;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class id {

    /* renamed from: a */
    private static final Pattern f8285a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap b = new HashMap();

    /* renamed from: c */
    private static int f8286c = -1;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f8287a;
        public final boolean b;

        /* renamed from: c */
        public final boolean f8288c;

        public b(String str, boolean z8, boolean z9) {
            this.f8287a = str;
            this.b = z8;
            this.f8288c = z9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            if (TextUtils.equals(this.f8287a, bVar.f8287a) && this.b == bVar.b && this.f8288c == bVar.f8288c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i9;
            int b = AbstractC2914a.b(31, 31, this.f8287a);
            int i10 = 1237;
            if (this.b) {
                i9 = 1231;
            } else {
                i9 = 1237;
            }
            int i11 = (b + i9) * 31;
            if (this.f8288c) {
                i10 = 1231;
            }
            return i11 + i10;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }

        public /* synthetic */ c(Throwable th, a aVar) {
            this(th);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        int a();

        MediaCodecInfo a(int i9);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* loaded from: classes.dex */
    public static final class e implements d {
        private e() {
        }

        @Override // com.applovin.impl.id.d
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.applovin.impl.id.d
        public boolean b() {
            return false;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // com.applovin.impl.id.d
        public MediaCodecInfo a(int i9) {
            return MediaCodecList.getCodecInfoAt(i9);
        }

        @Override // com.applovin.impl.id.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }

        @Override // com.applovin.impl.id.d
        public int a() {
            return MediaCodecList.getCodecCount();
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements d {

        /* renamed from: a */
        private final int f8289a;
        private MediaCodecInfo[] b;

        public f(boolean z8, boolean z9) {
            int i9;
            if (!z8 && !z9) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            this.f8289a = i9;
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.f8289a).getCodecInfos();
            }
        }

        @Override // com.applovin.impl.id.d
        public int a() {
            c();
            return this.b.length;
        }

        @Override // com.applovin.impl.id.d
        public boolean b() {
            return true;
        }

        @Override // com.applovin.impl.id.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.applovin.impl.id.d
        public MediaCodecInfo a(int i9) {
            c();
            return this.b[i9];
        }

        @Override // com.applovin.impl.id.d
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        int a(Object obj);
    }

    private static int a(int i9) {
        switch (i9) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return NotificationCompat.FLAG_LOCAL_ONLY;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return FragmentTransaction.TRANSIT_EXIT_MASK;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return ImageMetadata.LENS_APERTURE;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int b(int i9) {
        switch (i9) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i9) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i9) {
                            case AD_PLAY_RESET_ON_DEINIT_VALUE:
                                return NotificationCompat.FLAG_LOCAL_ONLY;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i9) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return FragmentTransaction.TRANSIT_EXIT_MASK;
                                    default:
                                        switch (i9) {
                                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int g(int i9) {
        if (i9 != 0) {
            if (i9 == 1) {
                return 2;
            }
            if (i9 != 2) {
                return i9 != 3 ? -1 : 8;
            }
            return 4;
        }
        return 1;
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    private static Integer a(String str) {
        if (str == null) {
            return null;
        }
        char c9 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c9 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c9 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c9 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c9 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c9 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c9 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c9 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c9 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c9 = '\f';
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    private static Integer b(String str) {
        if (str == null) {
            return null;
        }
        char c9 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c9 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c9 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c9 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c9 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c9 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c9 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c9 = '\t';
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    private static int c(int i9) {
        if (i9 == 1 || i9 == 2) {
            return 25344;
        }
        switch (i9) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case FragmentTransaction.TRANSIT_EXIT_MASK /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case ImageMetadata.LENS_APERTURE /* 524288 */:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int d(int i9) {
        if (i9 == 66) {
            return 1;
        }
        if (i9 == 77) {
            return 2;
        }
        if (i9 == 88) {
            return 4;
        }
        if (i9 == 100) {
            return 8;
        }
        if (i9 == 110) {
            return 16;
        }
        if (i9 != 122) {
            return i9 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int e(int i9) {
        int i10 = 17;
        if (i9 != 17) {
            i10 = 20;
            if (i9 != 20) {
                i10 = 23;
                if (i9 != 23) {
                    i10 = 29;
                    if (i9 != 29) {
                        i10 = 39;
                        if (i9 != 39) {
                            i10 = 42;
                            if (i9 != 42) {
                                switch (i9) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i10;
    }

    private static int f(int i9) {
        if (i9 == 10) {
            return 1;
        }
        if (i9 == 11) {
            return 2;
        }
        if (i9 == 20) {
            return 4;
        }
        if (i9 == 21) {
            return 8;
        }
        if (i9 == 30) {
            return 16;
        }
        if (i9 == 31) {
            return 32;
        }
        if (i9 == 40) {
            return 64;
        }
        if (i9 == 41) {
            return 128;
        }
        if (i9 == 50) {
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (i9 == 51) {
            return 512;
        }
        switch (i9) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return FragmentTransaction.TRANSIT_EXIT_MASK;
            default:
                return -1;
        }
    }

    private static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (yp.f12451a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static Pair c(String str, String[] strArr) {
        if (strArr.length < 3) {
            L.u("Ignoring malformed Dolby Vision codec string: ", str, "MediaCodecUtil");
            return null;
        }
        Matcher matcher = f8285a.matcher(strArr[1]);
        if (!matcher.matches()) {
            L.u("Ignoring malformed Dolby Vision codec string: ", str, "MediaCodecUtil");
            return null;
        }
        String group = matcher.group(1);
        Integer b8 = b(group);
        if (b8 == null) {
            L.u("Unknown Dolby Vision profile string: ", group, "MediaCodecUtil");
            return null;
        }
        String str2 = strArr[2];
        Integer a6 = a(str2);
        if (a6 == null) {
            L.u("Unknown Dolby Vision level string: ", str2, "MediaCodecUtil");
            return null;
        }
        return new Pair(b8, a6);
    }

    private static Pair d(String str, String[] strArr) {
        if (strArr.length < 4) {
            L.u("Ignoring malformed HEVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        int i9 = 1;
        Matcher matcher = f8285a.matcher(strArr[1]);
        if (!matcher.matches()) {
            L.u("Ignoring malformed HEVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(group)) {
                L.u("Unknown HEVC profile string: ", group, "MediaCodecUtil");
                return null;
            }
            i9 = 2;
        }
        String str2 = strArr[3];
        Integer c9 = c(str2);
        if (c9 == null) {
            L.u("Unknown HEVC level string: ", str2, "MediaCodecUtil");
            return null;
        }
        return new Pair(Integer.valueOf(i9), c9);
    }

    private static Pair e(String str, String[] strArr) {
        if (strArr.length < 3) {
            L.u("Ignoring malformed VP9 codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int g9 = g(parseInt);
            if (g9 == -1) {
                L.p(parseInt, "Unknown VP9 profile: ", "MediaCodecUtil");
                return null;
            }
            int f9 = f(parseInt2);
            if (f9 == -1) {
                L.p(parseInt2, "Unknown VP9 level: ", "MediaCodecUtil");
                return null;
            }
            return new Pair(Integer.valueOf(g9), Integer.valueOf(f9));
        } catch (NumberFormatException unused) {
            L.u("Ignoring malformed VP9 codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    private static boolean f(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private static Pair b(String str, String[] strArr) {
        int parseInt;
        int i9;
        if (strArr.length < 2) {
            L.u("Ignoring malformed AVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i9 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i9 = parseInt2;
            } else {
                kc.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int d2 = d(i9);
            if (d2 == -1) {
                L.p(i9, "Unknown AVC profile: ", "MediaCodecUtil");
                return null;
            }
            int b8 = b(parseInt);
            if (b8 == -1) {
                L.p(parseInt, "Unknown AVC level: ", "MediaCodecUtil");
                return null;
            }
            return new Pair(Integer.valueOf(d2), Integer.valueOf(b8));
        } catch (NumberFormatException unused) {
            L.u("Ignoring malformed AVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    private static Pair a(String str, String[] strArr) {
        int e4;
        if (strArr.length != 3) {
            L.u("Ignoring malformed MP4A codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(df.a(Integer.parseInt(strArr[1], 16))) && (e4 = e(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(e4), 0);
            }
        } catch (NumberFormatException unused) {
            L.u("Ignoring malformed MP4A codec string: ", str, "MediaCodecUtil");
        }
        return null;
    }

    private static Pair a(String str, String[] strArr, p3 p3Var) {
        int i9;
        if (strArr.length < 4) {
            L.u("Ignoring malformed AV1 codec string: ", str, "MediaCodecUtil");
            return null;
        }
        int i10 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                L.p(parseInt, "Unknown AV1 profile: ", "MediaCodecUtil");
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                L.p(parseInt3, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                return null;
            }
            if (parseInt3 != 8) {
                i10 = (p3Var == null || !(p3Var.f9971d != null || (i9 = p3Var.f9970c) == 7 || i9 == 6)) ? 2 : 4096;
            }
            int a6 = a(parseInt2);
            if (a6 == -1) {
                L.p(parseInt2, "Unknown AV1 level: ", "MediaCodecUtil");
                return null;
            }
            return new Pair(Integer.valueOf(i10), Integer.valueOf(a6));
        } catch (NumberFormatException unused) {
            L.u("Ignoring malformed AV1 codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    private static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (yp.f12451a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static Integer c(String str) {
        if (str == null) {
            return null;
        }
        char c9 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c9 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c9 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c9 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c9 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c9 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c9 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c9 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c9 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c9 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c9 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c9 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c9 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c9 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c9 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c9 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c9 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c9 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c9 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c9 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c9 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c9 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c9 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c9 = 25;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
            case '\n':
                return 2048;
            case 11:
                return Integer.valueOf(FragmentTransaction.TRANSIT_EXIT_MASK);
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return Integer.valueOf(ImageMetadata.LENS_APERTURE);
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    private static boolean d(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private static boolean b(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    public static /* synthetic */ int b(fd fdVar) {
        return fdVar.f7633a.startsWith("OMX.google") ? 1 : 0;
    }

    public static synchronized List b(String str, boolean z8, boolean z9) {
        d eVar;
        synchronized (id.class) {
            try {
                b bVar = new b(str, z8, z9);
                HashMap hashMap = b;
                List list = (List) hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i9 = yp.f12451a;
                if (i9 >= 21) {
                    eVar = new f(z8, z9);
                } else {
                    eVar = new e();
                }
                ArrayList a6 = a(bVar, eVar);
                if (z8 && a6.isEmpty() && 21 <= i9 && i9 <= 23) {
                    a6 = a(bVar, new e());
                    if (!a6.isEmpty()) {
                        kc.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((fd) a6.get(0)).f7633a);
                    }
                }
                a(str, a6);
                List unmodifiableList = Collections.unmodifiableList(a6);
                hashMap.put(bVar, unmodifiableList);
                return unmodifiableList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo) {
        if (yp.f12451a >= 29) {
            return d(mediaCodecInfo);
        }
        return !e(mediaCodecInfo);
    }

    public static int b() {
        if (f8286c == -1) {
            int i9 = 0;
            fd a6 = a(MimeTypes.VIDEO_H264, false, false);
            if (a6 != null) {
                MediaCodecInfo.CodecProfileLevel[] a9 = a6.a();
                int length = a9.length;
                int i10 = 0;
                while (i9 < length) {
                    i10 = Math.max(c(a9[i9].level), i10);
                    i9++;
                }
                i9 = Math.max(i10, yp.f12451a >= 21 ? 345600 : 172800);
            }
            f8286c = i9;
        }
        return f8286c;
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair a(com.applovin.impl.d9 r6) {
        /*
            r0 = 0
            java.lang.String r1 = r6.f7209j
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r6.m
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L1e
            java.lang.String r6 = r6.f7209j
            android.util.Pair r6 = c(r6, r1)
            return r6
        L1e:
            r3 = r1[r0]
            r3.getClass()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r0 = r4
            goto L78
        L2d:
            java.lang.String r0 = "vp09"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L36
            goto L2b
        L36:
            r0 = 6
            goto L78
        L38:
            java.lang.String r0 = "mp4a"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto L2b
        L41:
            r0 = 5
            goto L78
        L43:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
            goto L2b
        L4c:
            r0 = 4
            goto L78
        L4e:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L57
            goto L2b
        L57:
            r0 = 3
            goto L78
        L59:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L62
            goto L2b
        L62:
            r0 = 2
            goto L78
        L64:
            java.lang.String r0 = "avc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            goto L2b
        L6d:
            r0 = 1
            goto L78
        L6f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r0) {
                case 0: goto L98;
                case 1: goto L91;
                case 2: goto L91;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r2
        L7c:
            java.lang.String r6 = r6.f7209j
            android.util.Pair r6 = e(r6, r1)
            return r6
        L83:
            java.lang.String r6 = r6.f7209j
            android.util.Pair r6 = a(r6, r1)
            return r6
        L8a:
            java.lang.String r6 = r6.f7209j
            android.util.Pair r6 = d(r6, r1)
            return r6
        L91:
            java.lang.String r6 = r6.f7209j
            android.util.Pair r6 = b(r6, r1)
            return r6
        L98:
            java.lang.String r0 = r6.f7209j
            com.applovin.impl.p3 r6 = r6.f7222y
            android.util.Pair r6 = a(r0, r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.id.a(com.applovin.impl.d9):android.util.Pair");
    }

    public static fd a(String str, boolean z8, boolean z9) {
        List b8 = b(str, z8, z9);
        if (b8.isEmpty()) {
            return null;
        }
        return (fd) b8.get(0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008c, code lost:
    
        if (r1.b == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0124, B:10:0x002d, B:13:0x0038, B:39:0x00fd, B:42:0x0105, B:44:0x010b, B:47:0x0130, B:48:0x0153), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList a(com.applovin.impl.id.b r24, com.applovin.impl.id.d r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.id.a(com.applovin.impl.id$b, com.applovin.impl.id$d):java.util.ArrayList");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z8, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z8 && str.endsWith(".secure"))) {
            return false;
        }
        int i9 = yp.f12451a;
        if (i9 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i9 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = yp.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(yp.f12452c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i9 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = yp.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i9 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = yp.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i9 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(yp.f12452c))) {
            String str6 = yp.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i9 <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(yp.f12452c)) {
            String str7 = yp.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i9 <= 19 && yp.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static /* synthetic */ int a(fd fdVar) {
        String str = fdVar.f7633a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (yp.f12451a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int a(d9 d9Var, fd fdVar) {
        try {
            return fdVar.b(d9Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    public static /* synthetic */ int a(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    private static void a(List list, final g gVar) {
        Collections.sort(list, new Comparator() { // from class: com.applovin.impl.P0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a6;
                a6 = id.a(id.g.this, obj, obj2);
                return a6;
            }
        });
    }

    public static fd a() {
        return a(MimeTypes.AUDIO_RAW, false, false);
    }

    public static List a(List list, d9 d9Var) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new C(d9Var, 2));
        return arrayList;
    }

    private static void a(String str, List list) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (yp.f12451a < 26 && yp.b.equals("R9") && list.size() == 1 && ((fd) list.get(0)).f7633a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(fd.a("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            a(list, new I(1));
        }
        int i9 = yp.f12451a;
        if (i9 < 21 && list.size() > 1) {
            String str2 = ((fd) list.get(0)).f7633a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, new I(2));
            }
        }
        if (i9 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((fd) list.get(0)).f7633a)) {
            return;
        }
        list.add((fd) list.remove(0));
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo) {
        return yp.f12451a >= 29 && b(mediaCodecInfo);
    }
}
