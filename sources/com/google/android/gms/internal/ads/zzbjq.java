package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbjq {
    public static final zzbjr zza = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbio
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            String str;
            zzcgr zzcgrVar = (zzcgr) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            String str2 = (String) map.get("urls");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str2.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcgrVar.getContext().getPackageManager();
            for (String str3 : split) {
                String[] split2 = str3.split(";", 2);
                String trim = split2[0].trim();
                boolean z10 = true;
                if (split2.length > 1) {
                    str = split2[1].trim();
                } else {
                    str = "android.intent.action.VIEW";
                }
                if (packageManager.resolveActivity(new Intent(str, Uri.parse(trim)), C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                hashMap.put(str3, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str3 + ";" + valueOf);
            }
            ((zzbmm) zzcgrVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbjr zzb = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbiq
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            boolean z10;
            zzcgr zzcgrVar = (zzcgr) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhS)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get(CampaignEx.JSON_KEY_PACKAGE_NAME);
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (zzcgrVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbmm) zzcgrVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbjr zzc = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbit
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzbjq.zzb((zzcgr) obj, map);
        }
    };
    public static final zzbjr zzd = new zzbji();
    public static final zzbjr zze = new zzbjj();
    public static final zzbjr zzf = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbiu
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzcgr zzcgrVar = (zzcgr) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzbv(zzcgrVar.getContext(), ((zzcgy) zzcgrVar).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final zzbjr zzg = new zzbjk();
    public static final zzbjr zzh = new zzbjl();
    public static final zzbjr zzi = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbis
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzcgx zzcgxVar = (zzcgx) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzavc zzI = zzcgxVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbjr zzj = new zzbjm();
    public static final zzbjr zzk = new zzbjn();
    public static final zzbjr zzl = new zzcdf();
    public static final zzbjr zzm = new zzcdg();
    public static final zzbjr zzn = new zzbik();
    public static final zzbkh zzo = new zzbkh();
    public static final zzbjr zzp = new zzbjo();
    public static final zzbjr zzq = new zzbjp();
    public static final zzbjr zzr = new zzbiv();
    public static final zzbjr zzs = new zzbiw();
    public static final zzbjr zzt = new zzbix();
    public static final zzbjr zzu = new zzbiy();
    public static final zzbjr zzv = new zzbiz();
    public static final zzbjr zzw = new zzbja();
    public static final zzbjr zzx = new zzbjb();
    public static final zzbjr zzy = new zzbjc();
    public static final zzbjr zzz = new zzbjd();
    public static final zzbjr zzA = new zzbje();
    public static final zzbjr zzB = new zzbjg();
    public static final zzbjr zzC = new zzbjh();

    public static ua.b zza(zzcfk zzcfkVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzavc zzI = zzcfkVar.zzI();
            zzffs zzS = zzcfkVar.zzS();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlI)).booleanValue() && zzS != null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzS.zza(parse, zzcfkVar.getContext(), zzcfkVar.zzF(), zzcfkVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzcfkVar.getContext(), zzcfkVar.zzF(), zzcfkVar.zzi());
            }
        } catch (zzavd unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map hashMap = new HashMap();
        if (zzcfkVar.zzD() != null) {
            hashMap = zzcfkVar.zzD().zzaw;
        }
        final String zzb2 = zzbyx.zzb(parse, zzcfkVar.getContext(), hashMap);
        long longValue = ((Long) zzbem.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 243799202) {
            zzgdz zzu2 = zzgdz.zzu(zzcfkVar.zzT());
            zzfwh zzfwhVar = new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbil
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    zzbjr zzbjrVar = zzbjq.zza;
                    if (((Boolean) zzbem.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzges zzgesVar = zzcaj.zzf;
            return (zzgdz) zzgei.zze((zzgdz) zzgei.zzm((zzgdz) zzgei.zze(zzu2, Throwable.class, zzfwhVar, zzgesVar), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbim
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    zzbjr zzbjrVar = zzbjq.zza;
                    String str3 = zzb2;
                    if (str2 != null) {
                        if (((Boolean) zzbem.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str3).getHost();
                            for (int i10 = 0; i10 < 3; i10++) {
                                if (!host.endsWith(strArr[i10])) {
                                }
                            }
                        }
                        String str4 = (String) zzbem.zza.zze();
                        String str5 = (String) zzbem.zzb.zze();
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str3.replace(str4, str2);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str3);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                            }
                        }
                    }
                    return str3;
                }
            }, zzgesVar), Throwable.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbin
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    zzbjr zzbjrVar = zzbjq.zza;
                    if (((Boolean) zzbem.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "prepareClickUrl.attestation2");
                    }
                    return zzb2;
                }
            }, zzgesVar);
        }
        return zzgei.zzh(zzb2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcgr r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjq.zzb(com.google.android.gms.internal.ads.zzcgr, java.util.Map):void");
    }

    public static void zzc(Map map, zzdel zzdelVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzks)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdelVar != null) {
            zzdelVar.zzdG();
        }
    }
}
