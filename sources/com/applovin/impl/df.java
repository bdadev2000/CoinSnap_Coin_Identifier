package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class df {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList f7292a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7293a;
        public final int b;

        public a(int i9, int i10) {
            this.f7293a = i9;
            this.b = i10;
        }

        public int a() {
            int i9 = this.b;
            if (i9 != 2) {
                if (i9 != 5) {
                    if (i9 != 29) {
                        if (i9 != 42) {
                            if (i9 != 22) {
                                if (i9 != 23) {
                                    return 0;
                                }
                                return 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

    public static boolean a(String str, String str2) {
        a c9;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
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
                if (str2 == null || (c9 = c(str2)) == null) {
                    return false;
                }
                int a6 = c9.a();
                return (a6 == 0 || a6 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        a c9;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (c9 = c(str2)) == null) {
                    return 0;
                }
                return c9.a();
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
        int i9;
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) AbstractC0669a1.a((Object) matcher.group(1));
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i9 = Integer.parseInt(group);
            } else {
                i9 = 0;
            }
            return new a(parseInt, i9);
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
        ArrayList arrayList = f7292a;
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
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c9 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c9 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
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

    public static String a(int i9) {
        if (i9 == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i9 == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i9 == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i9 == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i9 == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i9 == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i9 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i9 != 166) {
            switch (i9) {
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
                    switch (i9) {
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
        return MimeTypes.AUDIO_E_AC3;
    }

    public static String b(String str) {
        a c9;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (!lowerCase.startsWith("avc1") && !lowerCase.startsWith("avc3")) {
            if (!lowerCase.startsWith("hev1") && !lowerCase.startsWith("hvc1")) {
                if (!lowerCase.startsWith("dvav") && !lowerCase.startsWith("dva1") && !lowerCase.startsWith("dvhe") && !lowerCase.startsWith("dvh1")) {
                    if (lowerCase.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!lowerCase.startsWith("vp9") && !lowerCase.startsWith("vp09")) {
                        if (!lowerCase.startsWith("vp8") && !lowerCase.startsWith("vp08")) {
                            if (lowerCase.startsWith("mp4a")) {
                                if (lowerCase.startsWith("mp4a.") && (c9 = c(lowerCase)) != null) {
                                    str2 = a(c9.f7293a);
                                }
                                return str2 == null ? MimeTypes.AUDIO_AAC : str2;
                            }
                            if (lowerCase.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (lowerCase.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!lowerCase.startsWith("ac-3") && !lowerCase.startsWith("dac3")) {
                                if (!lowerCase.startsWith("ec-3") && !lowerCase.startsWith("dec3")) {
                                    if (lowerCase.startsWith("ec+3")) {
                                        return MimeTypes.AUDIO_E_AC3_JOC;
                                    }
                                    if (!lowerCase.startsWith("ac-4") && !lowerCase.startsWith("dac4")) {
                                        if (lowerCase.startsWith("dtsc")) {
                                            return MimeTypes.AUDIO_DTS;
                                        }
                                        if (lowerCase.startsWith("dtse")) {
                                            return MimeTypes.AUDIO_DTS_EXPRESS;
                                        }
                                        if (!lowerCase.startsWith("dtsh") && !lowerCase.startsWith("dtsl")) {
                                            if (lowerCase.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (lowerCase.startsWith("opus")) {
                                                return MimeTypes.AUDIO_OPUS;
                                            }
                                            if (lowerCase.startsWith("vorbis")) {
                                                return MimeTypes.AUDIO_VORBIS;
                                            }
                                            if (lowerCase.startsWith("flac")) {
                                                return MimeTypes.AUDIO_FLAC;
                                            }
                                            if (lowerCase.startsWith("stpp")) {
                                                return MimeTypes.APPLICATION_TTML;
                                            }
                                            if (lowerCase.startsWith("wvtt")) {
                                                return MimeTypes.TEXT_VTT;
                                            }
                                            if (lowerCase.contains("cea708")) {
                                                return MimeTypes.APPLICATION_CEA708;
                                            }
                                            if (!lowerCase.contains("eia608") && !lowerCase.contains("cea608")) {
                                                return a(lowerCase);
                                            }
                                            return MimeTypes.APPLICATION_CEA608;
                                        }
                                        return MimeTypes.AUDIO_DTS_HD;
                                    }
                                    return "audio/ac4";
                                }
                                return MimeTypes.AUDIO_E_AC3;
                            }
                            return MimeTypes.AUDIO_AC3;
                        }
                        return MimeTypes.VIDEO_VP8;
                    }
                    return MimeTypes.VIDEO_VP9;
                }
                return "video/dolby-vision";
            }
            return MimeTypes.VIDEO_H265;
        }
        return MimeTypes.VIDEO_H264;
    }

    private static String a(String str) {
        ArrayList arrayList = f7292a;
        if (arrayList.size() <= 0) {
            return null;
        }
        b8.a(arrayList.get(0));
        throw null;
    }
}
