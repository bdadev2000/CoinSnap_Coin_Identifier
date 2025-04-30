package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblo {
    public static final zzblp zza = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbkm
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            String str;
            boolean z8;
            zzcik zzcikVar = (zzcik) obj;
            zzblp zzblpVar = zzblo.zza;
            String str2 = (String) map.get("urls");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str2.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcikVar.getContext().getPackageManager();
            for (String str3 : split) {
                String[] split2 = str3.split(";", 2);
                String trim = split2[0].trim();
                if (split2.length > 1) {
                    str = split2[1].trim();
                } else {
                    str = "android.intent.action.VIEW";
                }
                if (packageManager.resolveActivity(new Intent(str, Uri.parse(trim)), 65536) != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                hashMap.put(str3, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str3 + ";" + valueOf);
            }
            ((zzbok) zzcikVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzblp zzb = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbko
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            boolean z8;
            zzcik zzcikVar = (zzcik) obj;
            zzblp zzblpVar = zzblo.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzio)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get(CampaignEx.JSON_KEY_PACKAGE_NAME);
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (zzcikVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Boolean valueOf = Boolean.valueOf(z8);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbok) zzcikVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzblp zzc = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbkr
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            zzblo.zzb((zzcik) obj, map);
        }
    };
    public static final zzblp zzd = new zzblg();
    public static final zzblp zze = new zzblh();
    public static final zzblp zzf = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbks
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            zzcik zzcikVar = (zzcik) obj;
            zzblp zzblpVar = zzblo.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzca(zzcikVar.getContext(), ((zzcir) zzcikVar).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final zzblp zzg = new zzbli();
    public static final zzblp zzh = new zzblj();
    public static final zzblp zzi = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbkq
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            zzciq zzciqVar = (zzciq) obj;
            zzblp zzblpVar = zzblo.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzaxd zzI = zzciqVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzblp zzj = new zzblk();
    public static final zzblp zzk = new zzbll();
    public static final zzblp zzl = new zzcfd();
    public static final zzblp zzm = new zzcfe();
    public static final zzblp zzn = new zzbki();
    public static final zzbmf zzo = new zzbmf();
    public static final zzblp zzp = new zzblm();
    public static final zzblp zzq = new zzbln();
    public static final zzblp zzr = new zzbkt();
    public static final zzblp zzs = new zzbku();
    public static final zzblp zzt = new zzbkv();
    public static final zzblp zzu = new zzbkw();
    public static final zzblp zzv = new zzbkx();
    public static final zzblp zzw = new zzbky();
    public static final zzblp zzx = new zzbkz();
    public static final zzblp zzy = new zzbla();
    public static final zzblp zzz = new zzblb();
    public static final zzblp zzA = new zzblc();
    public static final zzblp zzB = new zzble();
    public static final zzblp zzC = new zzblf();

    public static f4.c zza(zzchd zzchdVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaxd zzI = zzchdVar.zzI();
            zzfhs zzS = zzchdVar.zzS();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() && zzS != null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzS.zza(parse, zzchdVar.getContext(), zzchdVar.zzF(), zzchdVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzchdVar.getContext(), zzchdVar.zzF(), zzchdVar.zzi());
            }
        } catch (zzaxe unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map hashMap = new HashMap();
        if (zzchdVar.zzD() != null) {
            hashMap = zzchdVar.zzD().zzax;
        }
        final String zzb2 = zzcaw.zzb(parse, zzchdVar.getContext(), hashMap);
        long longValue = ((Long) zzbgj.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 241806202) {
            zzgfk zzu2 = zzgfk.zzu(zzchdVar.zzT());
            zzfxu zzfxuVar = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbkj
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzblp zzblpVar = zzblo.zza;
                    if (((Boolean) zzbgj.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzgge zzggeVar = zzcci.zzf;
            return zzgft.zze(zzgft.zzm(zzgft.zze(zzu2, Throwable.class, zzfxuVar, zzggeVar), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbkk
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    zzblp zzblpVar = zzblo.zza;
                    String str3 = zzb2;
                    if (str2 != null) {
                        if (((Boolean) zzbgj.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str3).getHost();
                            for (int i9 = 0; i9 < 3; i9++) {
                                if (!host.endsWith(strArr[i9])) {
                                }
                            }
                        }
                        String str4 = (String) zzbgj.zza.zze();
                        String str5 = (String) zzbgj.zzb.zze();
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
            }, zzggeVar), Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbkl
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzblp zzblpVar = zzblo.zza;
                    if (((Boolean) zzbgj.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation2");
                    }
                    return zzb2;
                }
            }, zzggeVar);
        }
        return zzgft.zzh(zzb2);
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
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcik r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblo.zzb(com.google.android.gms.internal.ads.zzcik, java.util.Map):void");
    }

    public static void zzc(Map map, zzdhi zzdhiVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkL)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdhiVar != null) {
            zzdhiVar.zzdG();
        }
    }
}
