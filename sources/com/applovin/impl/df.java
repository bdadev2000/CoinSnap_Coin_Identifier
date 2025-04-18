package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class df {
    private static final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f4297b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4298b;

        public a(int i10, int i11) {
            this.a = i10;
            this.f4298b = i11;
        }

        public int a() {
            int i10 = this.f4298b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static String a(int i10) {
        if (i10 == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i10 == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i10 == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i10 == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i10 == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i10 == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i10 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i10 == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int b(String str, String str2) {
        a c10;
        str.getClass();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c11 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c11 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c11 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c11 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c11 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    c11 = '\b';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (c10 = c(str2)) == null) {
                    return 0;
                }
                return c10.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static a c(String str) {
        int i10;
        Matcher matcher = f4297b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) a1.a((Object) matcher.group(1));
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i10 = Integer.parseInt(group);
            } else {
                i10 = 0;
            }
            return new a(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String d(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (i(str)) {
            return 2;
        }
        if (h(str)) {
            return 3;
        }
        if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str)) {
            if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
                return 6;
            }
            return f(str);
        }
        return 5;
    }

    private static int f(String str) {
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        b8.a(arrayList.get(0));
        throw null;
    }

    public static boolean g(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(d(str));
    }

    public static boolean h(String str) {
        if (!MimeTypes.BASE_TYPE_TEXT.equals(d(str)) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !MimeTypes.APPLICATION_MP4VTT.equals(str) && !MimeTypes.APPLICATION_RAWCC.equals(str) && !MimeTypes.APPLICATION_VOBSUB.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str) && !MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(d(str));
    }

    public static String j(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return MimeTypes.AUDIO_FLAC;
            case 1:
                return "audio/wav";
            case 2:
                return MimeTypes.AUDIO_MPEG;
            default:
                return str;
        }
    }

    public static boolean a(String str, String str2) {
        a c10;
        int a10;
        if (str == null) {
            return false;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c11 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c11 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c11 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c11 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c11 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c11 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c11 = '\n';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (c10 = c(str2)) == null || (a10 = c10.a()) == 0 || a10 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        a c10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? "audio/mha1" : lowerCase.startsWith("mhm1") ? "audio/mhm1" : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? MimeTypes.AUDIO_AC3 : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? MimeTypes.AUDIO_E_AC3 : lowerCase.startsWith("ec+3") ? MimeTypes.AUDIO_E_AC3_JOC : (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) ? "audio/ac4" : lowerCase.startsWith("dtsc") ? MimeTypes.AUDIO_DTS : lowerCase.startsWith("dtse") ? MimeTypes.AUDIO_DTS_EXPRESS : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? MimeTypes.AUDIO_DTS_HD : lowerCase.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : lowerCase.startsWith("opus") ? MimeTypes.AUDIO_OPUS : lowerCase.startsWith("vorbis") ? MimeTypes.AUDIO_VORBIS : lowerCase.startsWith("flac") ? MimeTypes.AUDIO_FLAC : lowerCase.startsWith("stpp") ? MimeTypes.APPLICATION_TTML : lowerCase.startsWith("wvtt") ? MimeTypes.TEXT_VTT : lowerCase.contains("cea708") ? MimeTypes.APPLICATION_CEA708 : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? MimeTypes.APPLICATION_CEA608 : a(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (c10 = c(lowerCase)) != null) {
            str2 = a(c10.a);
        }
        return str2 == null ? MimeTypes.AUDIO_AAC : str2;
    }

    private static String a(String str) {
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return null;
        }
        b8.a(arrayList.get(0));
        throw null;
    }
}
