package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zzts {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");

    @GuardedBy
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c9  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzaf r19) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzts.zza(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    @Nullable
    public static Pair zzb(zzaf zzafVar) {
        String zzg = zzfs.zzg(zzafVar.zzq);
        if (zzg == null) {
            return null;
        }
        String trim = zzg.trim();
        int i2 = zzeu.zza;
        return zzi(zzg, trim.split("\\.", -1), zzafVar.zzA);
    }

    @Nullable
    public static zzsw zzc() throws zztm {
        List zzf = zzf("audio/raw", false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzsw) zzf.get(0);
    }

    @Nullable
    public static String zzd(zzaf zzafVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzafVar.zzn)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzafVar.zzn) && (zza2 = zza(zzafVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(zzafVar.zzn)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zze(zztg zztgVar, zzaf zzafVar, boolean z2, boolean z3) throws zztm {
        String zzd = zzd(zzafVar);
        return zzd == null ? zzgax.zzn() : zztgVar.zza(zzd, z2, z3);
    }

    public static synchronized List zzf(String str, boolean z2, boolean z3) throws zztm {
        synchronized (zzts.class) {
            try {
                zztk zztkVar = new zztk(str, z2, z3);
                HashMap hashMap = zzc;
                List list = (List) hashMap.get(zztkVar);
                if (list != null) {
                    return list;
                }
                ArrayList zzj = zzj(zztkVar, new zztq(z2, z3));
                if (z2 && zzj.isEmpty() && zzeu.zza <= 23) {
                    zzj = zzj(zztkVar, new zztp(null));
                    if (!zzj.isEmpty()) {
                        zzea.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsw) zzj.get(0)).zza);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (zzeu.zza < 26 && zzeu.zzb.equals("R9") && zzj.size() == 1 && ((zzsw) zzj.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        zzj.add(zzsw.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    zzk(zzj, new zztr() { // from class: com.google.android.gms.internal.ads.zzti
                        @Override // com.google.android.gms.internal.ads.zztr
                        public final int zza(Object obj) {
                            int i2 = zzts.zza;
                            String str2 = ((zzsw) obj).zza;
                            if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                                return 1;
                            }
                            return (zzeu.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                        }
                    });
                }
                if (zzeu.zza < 32 && zzj.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsw) zzj.get(0)).zza)) {
                    zzj.add((zzsw) zzj.remove(0));
                }
                zzgax zzl = zzgax.zzl(zzj);
                hashMap.put(zztkVar, zzl);
                return zzl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzg(zztg zztgVar, zzaf zzafVar, boolean z2, boolean z3) throws zztm {
        List zza2 = zztgVar.zza(zzafVar.zzn, z2, z3);
        List zze = zze(zztgVar, zzafVar, z2, z3);
        zzgau zzgauVar = new zzgau();
        zzgauVar.zzh(zza2);
        zzgauVar.zzh(zze);
        return zzgauVar.zzi();
    }

    @CheckResult
    public static List zzh(List list, final zzaf zzafVar) {
        ArrayList arrayList = new ArrayList(list);
        zzk(arrayList, new zztr() { // from class: com.google.android.gms.internal.ads.zztj
            @Override // com.google.android.gms.internal.ads.zztr
            public final int zza(Object obj) {
                int i2 = zzts.zza;
                return ((zzsw) obj).zzd(zzaf.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ae, code lost:
    
        if (r11.equals("L123") != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0248  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair zzi(java.lang.String r10, java.lang.String[] r11, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzo r12) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzts.zzi(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzo):android.util.Pair");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:128|(1:130)(1:131))|68|(1:70)(2:120|(1:127)(1:126))|(4:(2:114|115)|94|(8:97|98|99|100|101|102|103|105)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d2, code lost:
    
        if (r1.zzb == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if ("SCV31".equals(r10) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023f, code lost:
    
        com.google.android.gms.internal.ads.zzea.zzc("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a3 A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:57:0x014b, B:61:0x0162, B:65:0x0177, B:67:0x017d, B:68:0x0196, B:70:0x019e, B:72:0x01ca, B:120:0x01a3, B:122:0x01b3, B:124:0x01bb, B:128:0x018b), top: B:56:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:57:0x014b, B:61:0x0162, B:65:0x0177, B:67:0x017d, B:68:0x0196, B:70:0x019e, B:72:0x01ca, B:120:0x01a3, B:122:0x01b3, B:124:0x01bb, B:128:0x018b), top: B:56:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:57:0x014b, B:61:0x0162, B:65:0x0177, B:67:0x017d, B:68:0x0196, B:70:0x019e, B:72:0x01ca, B:120:0x01a3, B:122:0x01b3, B:124:0x01bb, B:128:0x018b), top: B:56:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:57:0x014b, B:61:0x0162, B:65:0x0177, B:67:0x017d, B:68:0x0196, B:70:0x019e, B:72:0x01ca, B:120:0x01a3, B:122:0x01b3, B:124:0x01bb, B:128:0x018b), top: B:56:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0239 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:80:0x0231, B:83:0x0239, B:85:0x023f, B:88:0x0259, B:89:0x027a, B:52:0x00d2, B:140:0x00d5, B:142:0x00dd, B:145:0x00e8, B:147:0x00f0, B:152:0x00fe, B:154:0x0106, B:157:0x0111, B:159:0x0119, B:162:0x0124, B:164:0x012c, B:167:0x0137, B:169:0x013f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0259 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzj(com.google.android.gms.internal.ads.zztk r23, com.google.android.gms.internal.ads.zztn r24) throws com.google.android.gms.internal.ads.zztm {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzts.zzj(com.google.android.gms.internal.ads.zztk, com.google.android.gms.internal.ads.zztn):java.util.ArrayList");
    }

    private static void zzk(List list, final zztr zztrVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzth
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i2 = zzts.zza;
                zztr zztrVar2 = zztr.this;
                return zztrVar2.zza(obj2) - zztrVar2.zza(obj);
            }
        });
    }

    private static boolean zzl(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzeu.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzbn.zzg(str)) {
            return true;
        }
        String zza2 = zzfxi.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
