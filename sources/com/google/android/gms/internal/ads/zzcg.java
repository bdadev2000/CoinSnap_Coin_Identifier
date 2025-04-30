package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzcg {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str, @Nullable String str2) {
        char c9;
        zzcf zzc2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -1365340241:
                if (str.equals(MimeTypes.AUDIO_DTS_EXPRESS)) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (zzc2 = zzc(str2)) == null) {
                    return 0;
                }
                return zzc2.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (!zzh(str)) {
            if (!MimeTypes.BASE_TYPE_TEXT.equals(zzi(str)) && !"application/x-media3-cues".equals(str) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !MimeTypes.APPLICATION_MP4VTT.equals(str) && !MimeTypes.APPLICATION_RAWCC.equals(str) && !MimeTypes.APPLICATION_VOBSUB.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str) && !MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
                if (!"image".equals(zzi(str)) && !"application/x-image-uri".equals(str)) {
                    if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str)) {
                        if (!MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
                            int size = zzb.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                String str2 = ((zzce) zzb.get(i9)).zza;
                                if (str.equals(null)) {
                                    return 0;
                                }
                            }
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    @Nullable
    public static zzcf zzc(String str) {
        int i9;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i9 = Integer.parseInt(group2);
                } else {
                    i9 = 0;
                }
                return new zzcf(parseInt, i9);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static String zzd(int i9) {
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
        if (i9 == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i9 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i9 == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zze(String str) {
        char c9;
        if (str == null) {
            return null;
        }
        String zza2 = zzfxm.zza(str);
        switch (zza2.hashCode()) {
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    if (c9 != 3) {
                        if (c9 != 4) {
                            if (c9 != 5) {
                                return zza2;
                            }
                            return MimeTypes.AUDIO_MPEG_L2;
                        }
                        return MimeTypes.AUDIO_MPEG_L1;
                    }
                    return MimeTypes.APPLICATION_M3U8;
                }
                return "audio/wav";
            }
            return MimeTypes.AUDIO_MPEG;
        }
        return MimeTypes.AUDIO_FLAC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzf(@Nullable String str, @Nullable String str2) {
        char c9;
        zzcf zzc2;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (zzc2 = zzc(str2)) == null || (zza2 = zzc2.zza()) == 0 || zza2 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean zzg(@Nullable String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(zzi(str));
    }

    public static boolean zzh(@Nullable String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(zzi(str));
    }

    @Nullable
    private static String zzi(@Nullable String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(47)) != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }
}
