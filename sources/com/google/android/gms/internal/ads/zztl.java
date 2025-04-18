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

@SuppressLint({"InlinedApi"})
/* loaded from: classes3.dex */
public final class zztl {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    @Nullable
    public static zzsq zza() throws zztf {
        List zzd = zzd(MimeTypes.AUDIO_RAW, false, false);
        if (zzd.isEmpty()) {
            return null;
        }
        return (zzsq) zzd.get(0);
    }

    @Nullable
    public static String zzb(zzad zzadVar) {
        Pair zza2;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(zzadVar.zzo)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(zzadVar.zzo) && (zza2 = zzdd.zza(zzadVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return MimeTypes.VIDEO_H264;
                }
                if (intValue == 1024) {
                    return "video/av01";
                }
            } else {
                return MimeTypes.VIDEO_H265;
            }
        }
        if (!"video/mv-hevc".equals(zzadVar.zzo)) {
            return null;
        }
        return MimeTypes.VIDEO_H265;
    }

    public static List zzc(zzta zztaVar, zzad zzadVar, boolean z10, boolean z11) throws zztf {
        String zzb2 = zzb(zzadVar);
        if (zzb2 == null) {
            return zzfzo.zzn();
        }
        return zztaVar.zza(zzb2, z10, z11);
    }

    public static synchronized List zzd(String str, boolean z10, boolean z11) throws zztf {
        synchronized (zztl.class) {
            zzte zzteVar = new zzte(str, z10, z11);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zzteVar);
            if (list != null) {
                return list;
            }
            ArrayList zzg = zzg(zzteVar, new zzti(z10, z11));
            if (z10 && zzg.isEmpty() && zzen.zza <= 23) {
                zzg = zzg(zzteVar, new zzth(null));
                if (!zzg.isEmpty()) {
                    zzdt.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsq) zzg.get(0)).zza);
                }
            }
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                if (zzen.zza < 26 && zzen.zzb.equals("R9") && zzg.size() == 1 && ((zzsq) zzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzsq.zzc("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
                }
                zzh(zzg, new zztj() { // from class: com.google.android.gms.internal.ads.zztc
                    @Override // com.google.android.gms.internal.ads.zztj
                    public final int zza(Object obj) {
                        int i10 = zztl.zza;
                        String str2 = ((zzsq) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        if (zzen.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                            return 0;
                        }
                        return -1;
                    }
                });
            }
            if (zzen.zza < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsq) zzg.get(0)).zza)) {
                zzg.add((zzsq) zzg.remove(0));
            }
            zzfzo zzl = zzfzo.zzl(zzg);
            hashMap.put(zzteVar, zzl);
            return zzl;
        }
    }

    public static List zze(zzta zztaVar, zzad zzadVar, boolean z10, boolean z11) throws zztf {
        List zza2 = zztaVar.zza(zzadVar.zzo, z10, z11);
        List zzc = zzc(zztaVar, zzadVar, z10, z11);
        zzfzl zzfzlVar = new zzfzl();
        zzfzlVar.zzh(zza2);
        zzfzlVar.zzh(zzc);
        return zzfzlVar.zzi();
    }

    @CheckResult
    public static List zzf(List list, final zzad zzadVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zztj() { // from class: com.google.android.gms.internal.ads.zztd
            @Override // com.google.android.gms.internal.ads.zztj
            public final int zza(Object obj) {
                int i10 = zztl.zza;
                if (((zzsq) obj).zzd(zzad.this)) {
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:128|(1:130)(1:131))|68|(1:70)(2:120|(1:127)(1:126))|(4:(2:114|115)|95|(8:98|99|100|101|102|103|104|106)|11)|74|75|76|78|11) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c5, code lost:
    
        if (r1.zzb == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if ("SCV31".equals(r10) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e4, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0196 A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:57:0x0147, B:61:0x015e, B:65:0x0173, B:67:0x0179, B:68:0x0189, B:70:0x0191, B:72:0x01bd, B:120:0x0196, B:122:0x01a6, B:124:0x01ae, B:128:0x017e), top: B:56:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:57:0x0147, B:61:0x015e, B:65:0x0173, B:67:0x0179, B:68:0x0189, B:70:0x0191, B:72:0x01bd, B:120:0x0196, B:122:0x01a6, B:124:0x01ae, B:128:0x017e), top: B:56:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179 A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:57:0x0147, B:61:0x015e, B:65:0x0173, B:67:0x0179, B:68:0x0189, B:70:0x0191, B:72:0x01bd, B:120:0x0196, B:122:0x01a6, B:124:0x01ae, B:128:0x017e), top: B:56:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191 A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:57:0x0147, B:61:0x015e, B:65:0x0173, B:67:0x0179, B:68:0x0189, B:70:0x0191, B:72:0x01bd, B:120:0x0196, B:122:0x01a6, B:124:0x01ae, B:128:0x017e), top: B:56:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0232 A[Catch: Exception -> 0x0280, TRY_ENTER, TryCatch #1 {Exception -> 0x0280, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0034, B:16:0x0042, B:20:0x004c, B:22:0x0054, B:24:0x005c, B:26:0x0066, B:28:0x0070, B:30:0x0078, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a0, B:44:0x00ac, B:46:0x00b4, B:48:0x00bc, B:50:0x00c5, B:81:0x022a, B:84:0x0232, B:86:0x0238, B:89:0x0252, B:90:0x0273, B:52:0x00cf, B:140:0x00d2, B:142:0x00da, B:145:0x00e5, B:147:0x00ed, B:151:0x00f8, B:153:0x0100, B:156:0x010d, B:158:0x0115, B:161:0x0120, B:163:0x0128, B:166:0x0133, B:168:0x013b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0252 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zzte r23, com.google.android.gms.internal.ads.zztg r24) throws com.google.android.gms.internal.ads.zztf {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.zzg(com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zztg):java.util.ArrayList");
    }

    private static void zzh(List list, final zztj zztjVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i10 = zztl.zza;
                zztj zztjVar2 = zztj.this;
                return zztjVar2.zza(obj2) - zztjVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzen.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzbg.zzg(str)) {
            return true;
        }
        String zza2 = zzfwa.zza(mediaCodecInfo.getName());
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
