package n9;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class q {
    public static final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f22561b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        ef.b f10;
        int a10;
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
                if (str2 == null || (f10 = f(str2)) == null || (a10 = f10.a()) == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : h0.P(str)) {
            String d10 = d(str2);
            if (d10 != null && j(d10)) {
                return d10;
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        ef.b f10;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals(MimeTypes.AUDIO_DTS_EXPRESS)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
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
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
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
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (f10 = f(str2)) == null) {
                    return 0;
                }
                return f10.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        ef.b f10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String C = c6.k.C(str.trim());
        if (!C.startsWith("avc1") && !C.startsWith("avc3")) {
            if (!C.startsWith("hev1") && !C.startsWith("hvc1")) {
                if (!C.startsWith("dvav") && !C.startsWith("dva1") && !C.startsWith("dvhe") && !C.startsWith("dvh1")) {
                    if (C.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!C.startsWith("vp9") && !C.startsWith("vp09")) {
                        if (!C.startsWith("vp8") && !C.startsWith("vp08")) {
                            if (C.startsWith("mp4a")) {
                                if (C.startsWith("mp4a.") && (f10 = f(C)) != null) {
                                    str2 = e(f10.a);
                                }
                                if (str2 == null) {
                                    return MimeTypes.AUDIO_AAC;
                                }
                                return str2;
                            }
                            if (C.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (C.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!C.startsWith("ac-3") && !C.startsWith("dac3")) {
                                if (!C.startsWith("ec-3") && !C.startsWith("dec3")) {
                                    if (C.startsWith("ec+3")) {
                                        return MimeTypes.AUDIO_E_AC3_JOC;
                                    }
                                    if (!C.startsWith("ac-4") && !C.startsWith("dac4")) {
                                        if (C.startsWith("dtsc")) {
                                            return MimeTypes.AUDIO_DTS;
                                        }
                                        if (C.startsWith("dtse")) {
                                            return MimeTypes.AUDIO_DTS_EXPRESS;
                                        }
                                        if (!C.startsWith("dtsh") && !C.startsWith("dtsl")) {
                                            if (C.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (C.startsWith("opus")) {
                                                return MimeTypes.AUDIO_OPUS;
                                            }
                                            if (C.startsWith("vorbis")) {
                                                return MimeTypes.AUDIO_VORBIS;
                                            }
                                            if (C.startsWith("flac")) {
                                                return MimeTypes.AUDIO_FLAC;
                                            }
                                            if (C.startsWith("stpp")) {
                                                return MimeTypes.APPLICATION_TTML;
                                            }
                                            if (C.startsWith("wvtt")) {
                                                return MimeTypes.TEXT_VTT;
                                            }
                                            if (C.contains("cea708")) {
                                                return MimeTypes.APPLICATION_CEA708;
                                            }
                                            if (!C.contains("eia608") && !C.contains("cea608")) {
                                                ArrayList arrayList = a;
                                                if (arrayList.size() <= 0) {
                                                    return null;
                                                }
                                                a4.j.t(arrayList.get(0));
                                                throw null;
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

    public static String e(int i10) {
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

    public static ef.b f(String str) {
        int i10;
        Matcher matcher = f22561b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i10 = Integer.parseInt(group2);
            } else {
                i10 = 0;
            }
            return new ef.b(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if ("image".equals(g(str))) {
            return 4;
        }
        if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str)) {
            if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
                return 6;
            }
            ArrayList arrayList = a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            a4.j.t(arrayList.get(0));
            throw null;
        }
        return 5;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : h0.P(str)) {
            String d10 = d(str2);
            if (d10 != null && l(d10)) {
                return d10;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(g(str));
    }

    public static boolean k(String str) {
        if (!MimeTypes.BASE_TYPE_TEXT.equals(g(str)) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !MimeTypes.APPLICATION_MP4VTT.equals(str) && !MimeTypes.APPLICATION_RAWCC.equals(str) && !MimeTypes.APPLICATION_VOBSUB.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str) && !MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean l(String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(g(str));
    }
}
