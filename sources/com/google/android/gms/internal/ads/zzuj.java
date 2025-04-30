package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zzuj {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0471, code lost:
    
        if (r1.equals("L90") != false) goto L315;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x0228. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c9  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzan r21) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zza(com.google.android.gms.internal.ads.zzan):android.util.Pair");
    }

    @Nullable
    public static zztp zzb() throws zzud {
        List zze = zze(MimeTypes.AUDIO_RAW, false, false);
        if (zze.isEmpty()) {
            return null;
        }
        return (zztp) zze.get(0);
    }

    @Nullable
    public static String zzc(zzan zzanVar) {
        Pair zza2;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(zzanVar.zzn)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(zzanVar.zzn) && (zza2 = zza(zzanVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
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

    public static List zzd(zztx zztxVar, zzan zzanVar, boolean z8, boolean z9) throws zzud {
        String zzc2 = zzc(zzanVar);
        if (zzc2 == null) {
            return zzgbc.zzm();
        }
        return zze(zzc2, z8, z9);
    }

    public static synchronized List zze(String str, boolean z8, boolean z9) throws zzud {
        synchronized (zzuj.class) {
            try {
                zzub zzubVar = new zzub(str, z8, z9);
                HashMap hashMap = zzc;
                List list = (List) hashMap.get(zzubVar);
                if (list != null) {
                    return list;
                }
                int i9 = zzgd.zza;
                ArrayList zzh = zzh(zzubVar, new zzuh(z8, z9));
                if (z8 && zzh.isEmpty() && zzgd.zza <= 23) {
                    zzh = zzh(zzubVar, new zzug(null));
                    if (!zzh.isEmpty()) {
                        zzfk.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zztp) zzh.get(0)).zza);
                    }
                }
                if (MimeTypes.AUDIO_RAW.equals(str)) {
                    if (zzgd.zza < 26 && zzgd.zzb.equals("R9") && zzh.size() == 1 && ((zztp) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        zzh.add(zztp.zzc("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
                    }
                    zzi(zzh, new zzui() { // from class: com.google.android.gms.internal.ads.zztz
                        @Override // com.google.android.gms.internal.ads.zzui
                        public final int zza(Object obj) {
                            int i10 = zzuj.zza;
                            String str2 = ((zztp) obj).zza;
                            if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                                return 1;
                            }
                            if (zzgd.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                                return 0;
                            }
                            return -1;
                        }
                    });
                }
                if (zzgd.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zztp) zzh.get(0)).zza)) {
                    zzh.add((zztp) zzh.remove(0));
                }
                zzgbc zzk = zzgbc.zzk(zzh);
                hashMap.put(zzubVar, zzk);
                return zzk;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List zzf(zztx zztxVar, zzan zzanVar, boolean z8, boolean z9) throws zzud {
        List zze = zze(zzanVar.zzn, z8, z9);
        List zzd = zzd(zztxVar, zzanVar, z8, z9);
        zzgaz zzgazVar = new zzgaz();
        zzgazVar.zzh(zze);
        zzgazVar.zzh(zzd);
        return zzgazVar.zzi();
    }

    @CheckResult
    public static List zzg(List list, final zzan zzanVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzui() { // from class: com.google.android.gms.internal.ads.zzua
            @Override // com.google.android.gms.internal.ads.zzui
            public final int zza(Object obj) {
                int i9 = zzuj.zza;
                if (((zztp) obj).zzd(zzan.this)) {
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:128|(1:130)(1:131))|68|(1:70)(2:120|(1:127)(1:126))|(4:(2:114|115)|94|(8:97|98|99|100|101|102|103|105)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01be, code lost:
    
        if (r1.zzb == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if ("SCV31".equals(r10) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022b, code lost:
    
        com.google.android.gms.internal.ads.zzfk.zzc("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018f A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177 A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:57:0x0137, B:61:0x014e, B:65:0x0163, B:67:0x0169, B:68:0x0182, B:70:0x018a, B:72:0x01b6, B:120:0x018f, B:122:0x019f, B:124:0x01a7, B:128:0x0177), top: B:56:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0225 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:80:0x021d, B:83:0x0225, B:85:0x022b, B:88:0x0245, B:89:0x0266, B:52:0x00d1, B:140:0x00d4, B:142:0x00dc, B:145:0x00e7, B:147:0x00ef, B:152:0x00fd, B:154:0x0105, B:157:0x0110, B:159:0x0118, B:162:0x0123, B:164:0x012b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0245 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzub r23, com.google.android.gms.internal.ads.zzue r24) throws com.google.android.gms.internal.ads.zzud {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zzh(com.google.android.gms.internal.ads.zzub, com.google.android.gms.internal.ads.zzue):java.util.ArrayList");
    }

    private static void zzi(List list, final zzui zzuiVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzty
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i9 = zzuj.zza;
                zzui zzuiVar2 = zzui.this;
                return zzuiVar2.zza(obj2) - zzuiVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzgd.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzcg.zzg(str)) {
            return true;
        }
        String zza2 = zzfxm.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        if (!zza2.startsWith("omx.") && !zza2.startsWith("c2.")) {
            return true;
        }
        return false;
    }
}
