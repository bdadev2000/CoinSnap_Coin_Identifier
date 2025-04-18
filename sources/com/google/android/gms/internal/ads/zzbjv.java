package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbjv {
    public static final zzbjw zza = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbit
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void zza(Object obj, Map map) {
            zzcgv zzcgvVar = (zzcgv) obj;
            zzbjw zzbjwVar = zzbjv.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcgvVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z2 = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzbmr) zzcgvVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbjw zzb = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbiv
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void zza(Object obj, Map map) {
            zzcgv zzcgvVar = (zzcgv) obj;
            zzbjw zzbjwVar = zzbjv.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhQ)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcgvVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbmr) zzcgvVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbjw zzc = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbiy
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void zza(Object obj, Map map) {
            zzbjv.zzb((zzcgv) obj, map);
        }
    };
    public static final zzbjw zzd = new zzbjn();
    public static final zzbjw zze = new zzbjo();
    public static final zzbjw zzf = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbiz
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void zza(Object obj, Map map) {
            zzcgv zzcgvVar = (zzcgv) obj;
            zzbjw zzbjwVar = zzbjv.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzbw(zzcgvVar.getContext(), ((zzchc) zzcgvVar).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final zzbjw zzg = new zzbjp();
    public static final zzbjw zzh = new zzbjq();
    public static final zzbjw zzi = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbix
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void zza(Object obj, Map map) {
            zzchb zzchbVar = (zzchb) obj;
            zzbjw zzbjwVar = zzbjv.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzavn zzI = zzchbVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbjw zzj = new zzbjr();
    public static final zzbjw zzk = new zzbjs();
    public static final zzbjw zzl = new zzcdj();
    public static final zzbjw zzm = new zzcdk();
    public static final zzbjw zzn = new zzbip();
    public static final zzbkm zzo = new zzbkm();
    public static final zzbjw zzp = new zzbjt();
    public static final zzbjw zzq = new zzbju();
    public static final zzbjw zzr = new zzbja();
    public static final zzbjw zzs = new zzbjb();
    public static final zzbjw zzt = new zzbjc();
    public static final zzbjw zzu = new zzbjd();
    public static final zzbjw zzv = new zzbje();
    public static final zzbjw zzw = new zzbjf();
    public static final zzbjw zzx = new zzbjg();
    public static final zzbjw zzy = new zzbjh();
    public static final zzbjw zzz = new zzbji();
    public static final zzbjw zzA = new zzbjj();
    public static final zzbjw zzB = new zzbjl();
    public static final zzbjw zzC = new zzbjm();

    public static ListenableFuture zza(zzcfo zzcfoVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzavn zzI = zzcfoVar.zzI();
            zzfhg zzS = zzcfoVar.zzS();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlC)).booleanValue() || zzS == null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzI.zza(parse, zzcfoVar.getContext(), zzcfoVar.zzF(), zzcfoVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzS.zza(parse, zzcfoVar.getContext(), zzcfoVar.zzF(), zzcfoVar.zzi());
            }
        } catch (zzavo unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map hashMap = new HashMap();
        if (zzcfoVar.zzD() != null) {
            hashMap = zzcfoVar.zzD().zzaw;
        }
        final String zzb2 = zzbzb.zzb(parse, zzcfoVar.getContext(), hashMap);
        long longValue = ((Long) zzbeq.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 243220703) {
            return zzgfo.zzh(zzb2);
        }
        zzgff zzu2 = zzgff.zzu(zzcfoVar.zzT());
        zzfxq zzfxqVar = new zzfxq() { // from class: com.google.android.gms.internal.ads.zzbiq
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjw zzbjwVar = zzbjv.zza;
                if (!((Boolean) zzbeq.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzgfz zzgfzVar = zzcan.zzf;
        return (zzgff) zzgfo.zze((zzgff) zzgfo.zzm((zzgff) zzgfo.zze(zzu2, Throwable.class, zzfxqVar, zzgfzVar), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzbir
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                zzbjw zzbjwVar = zzbjv.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbeq.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String str4 = (String) zzbeq.zza.zze();
                    String str5 = (String) zzbeq.zzb.zze();
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
        }, zzgfzVar), Throwable.class, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzbis
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjw zzbjwVar = zzbjv.zza;
                if (((Boolean) zzbeq.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzgfzVar);
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
    
        com.google.android.gms.ads.internal.zzu.zzo().zzw(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcgv r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjv.zzb(com.google.android.gms.internal.ads.zzcgv, java.util.Map):void");
    }

    public static void zzc(Map map, zzdga zzdgaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkq)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(AppEventsConstants.EVENT_PARAM_VALUE_YES) && zzdgaVar != null) {
            zzdgaVar.zzdG();
        }
    }
}
