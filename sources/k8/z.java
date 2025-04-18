package k8;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.s0;
import com.adjust.sdk.Constants;
import com.google.common.collect.m0;
import com.google.common.collect.n0;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;
import n9.h0;
import s7.r0;

/* loaded from: classes3.dex */
public abstract class z {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f20382b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f20383c = -1;

    public static void a(String str, ArrayList arrayList) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (h0.a < 26 && h0.f22544b.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.h("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false));
            }
            Collections.sort(arrayList, new u(new nb.a(25)));
        }
        int i10 = h0.a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((o) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new u(new nb.a(26)));
            }
        }
        if (i10 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).a)) {
            arrayList.add((o) arrayList.remove(0));
        }
    }

    public static String b(r0 r0Var) {
        Pair d10;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(r0Var.f24723n)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(r0Var.f24723n) && (d10 = d(r0Var)) != null) {
            int intValue = ((Integer) d10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return MimeTypes.VIDEO_H264;
                }
                return null;
            }
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0362 A[Catch: NumberFormatException -> 0x0371, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0371, blocks: (B:198:0x031a, B:200:0x032c, B:212:0x034a, B:215:0x0362), top: B:197:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(s7.r0 r15) {
        /*
            Method dump skipped, instructions count: 2378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.z.d(s7.r0):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z10, boolean z11) {
        x mVar;
        synchronized (z.class) {
            v vVar = new v(str, z10, z11);
            HashMap hashMap = f20382b;
            List list = (List) hashMap.get(vVar);
            if (list != null) {
                return list;
            }
            int i10 = h0.a;
            if (i10 >= 21) {
                mVar = new s0(z10, z11);
            } else {
                mVar = new com.facebook.internal.m((Object) null);
            }
            ArrayList f10 = f(vVar, mVar);
            if (z10 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                f10 = f(vVar, new com.facebook.internal.m((Object) null));
                if (!f10.isEmpty()) {
                    n9.o.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f10.get(0)).a);
                }
            }
            a(str, f10);
            com.google.common.collect.r0 i11 = com.google.common.collect.r0.i(f10);
            hashMap.put(vVar, i11);
            return i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[Catch: Exception -> 0x0169, TryCatch #3 {Exception -> 0x0169, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:14:0x013a, B:15:0x0034, B:18:0x003f, B:48:0x0113, B:51:0x011b, B:53:0x0121, B:56:0x0144, B:57:0x0167), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(k8.v r21, k8.x r22) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.z.f(k8.v, k8.x):java.util.ArrayList");
    }

    public static z1 g(t tVar, r0 r0Var, boolean z10, boolean z11) {
        List e2;
        String str = r0Var.f24723n;
        hf.d dVar = (hf.d) tVar;
        dVar.getClass();
        List e10 = e(str, z10, z11);
        String b3 = b(r0Var);
        if (b3 == null) {
            n0 n0Var = com.google.common.collect.r0.f12026c;
            e2 = z1.f12062g;
        } else {
            dVar.getClass();
            e2 = e(b3, z10, z11);
        }
        n0 n0Var2 = com.google.common.collect.r0.f12026c;
        m0 m0Var = new m0();
        m0Var.w(e10);
        m0Var.w(e2);
        return m0Var.y();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = h0.a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = h0.f22544b;
            if ("a70".equals(str3) || ("Xiaomi".equals(h0.f22545c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = h0.f22544b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = h0.f22544b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(h0.f22545c))) {
            String str6 = h0.f22544b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(h0.f22545c)) {
            String str7 = h0.f22544b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && h0.f22544b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i10 <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (h0.a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (n9.q.j(str)) {
            return true;
        }
        String C = c6.k.C(mediaCodecInfo.getName());
        if (C.startsWith("arc.")) {
            return false;
        }
        if (C.startsWith("omx.google.") || C.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((C.startsWith("omx.sec.") && C.contains(".sw.")) || C.equals("omx.qcom.video.decoder.hevcswvdec") || C.startsWith("c2.android.") || C.startsWith("c2.google.")) {
            return true;
        }
        if (!C.startsWith("omx.") && !C.startsWith("c2.")) {
            return true;
        }
        return false;
    }

    public static int j() {
        o oVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        int i11;
        if (f20383c == -1) {
            int i12 = 0;
            List e2 = e(MimeTypes.VIDEO_H264, false, false);
            if (e2.isEmpty()) {
                oVar = null;
            } else {
                oVar = (o) e2.get(0);
            }
            if (oVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f20331d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = codecProfileLevelArr[i12].level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                break;
                            case 64:
                                i11 = 202752;
                                break;
                            case 128:
                            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                                i11 = 414720;
                                break;
                            case 512:
                                i11 = 921600;
                                break;
                            case LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY /* 1024 */:
                                i11 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i11 = 2097152;
                                break;
                            case 8192:
                                i11 = 2228224;
                                break;
                            case JsonLexerKt.BATCH_SIZE /* 16384 */:
                                i11 = 5652480;
                                break;
                            case 32768:
                            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                                i11 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i11 = 35651584;
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                    } else {
                        i11 = 25344;
                    }
                    i13 = Math.max(i11, i13);
                    i12++;
                }
                if (h0.a >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i12 = Math.max(i13, i10);
            }
            f20383c = i12;
        }
        return f20383c;
    }
}
