package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeeh implements zzfkw {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfmc zzc;
    private final zzfmn zzd;

    public zzeeh(String str, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        this.zzb = str;
        this.zzd = zzfmnVar;
        this.zzc = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbxx zzbxxVar;
        zzdzd zzdzdVar;
        zzbxx zzbxxVar2;
        zzbxx zzbxxVar3;
        zzbxx zzbxxVar4;
        zzbxx zzbxxVar5;
        zzbxx zzbxxVar6;
        zzbxx zzbxxVar7;
        zzbxx zzbxxVar8;
        JSONObject jSONObject2;
        String str;
        zzeeg zzeegVar = (zzeeg) obj;
        jSONObject = zzeegVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbxxVar = zzeegVar.zzb;
        String str2 = "";
        if (zzbxxVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbxxVar2 = zzeegVar.zzb;
            if (zzbxxVar2.zzj() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaP)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            zzbxxVar3 = zzeegVar.zzb;
            if (zzbxxVar3.zzk()) {
                jSONObject2 = zzeegVar.zza;
                zzeei.zza(hashMap, jSONObject2);
            }
            zzbxxVar4 = zzeegVar.zzb;
            if (zzbxxVar4 != null) {
                zzbxxVar7 = zzeegVar.zzb;
                if (!TextUtils.isEmpty(zzbxxVar7.zzf())) {
                    zzbxxVar8 = zzeegVar.zzb;
                    str2 = zzbxxVar8.zzf();
                }
            }
            zzfmn zzfmnVar = this.zzd;
            zzfmc zzfmcVar = this.zzc;
            zzfmcVar.zzh(true);
            zzfmnVar.zza(zzfmcVar);
            zzbxxVar5 = zzeegVar.zzb;
            String zzg = zzbxxVar5.zzg();
            byte[] bytes = str2.getBytes(zzfxs.zzc);
            zzbxxVar6 = zzeegVar.zzb;
            return new zzeec(zzg, optInt, hashMap, bytes, "", zzbxxVar6.zzk());
        }
        if (zzbxxVar.zza() == 1) {
            if (zzbxxVar.zzh() != null) {
                str2 = TextUtils.join(", ", zzbxxVar.zzh());
                com.google.android.gms.ads.internal.util.client.zzm.zzg(str2);
            }
            zzdzdVar = new zzdzd(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdzdVar = new zzdzd(1);
        }
        zzfmn zzfmnVar2 = this.zzd;
        zzfmc zzfmcVar2 = this.zzc;
        zzfmcVar2.zzi(zzdzdVar);
        zzfmcVar2.zzh(false);
        zzfmnVar2.zza(zzfmcVar2);
        throw zzdzdVar;
    }
}
