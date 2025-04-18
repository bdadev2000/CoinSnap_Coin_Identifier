package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzebx implements zzfiv {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfka zzc;
    private final zzfkl zzd;

    public zzebx(String str, zzfkl zzfklVar, zzfka zzfkaVar) {
        this.zzb = str;
        this.zzd = zzfklVar;
        this.zzc = zzfkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbvz zzbvzVar;
        zzdwn zzdwnVar;
        zzbvz zzbvzVar2;
        zzbvz zzbvzVar3;
        zzbvz zzbvzVar4;
        zzbvz zzbvzVar5;
        zzbvz zzbvzVar6;
        zzbvz zzbvzVar7;
        zzbvz zzbvzVar8;
        JSONObject jSONObject2;
        String str;
        zzebw zzebwVar = (zzebw) obj;
        jSONObject = zzebwVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbvzVar = zzebwVar.zzb;
        String str2 = "";
        if (zzbvzVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbvzVar2 = zzebwVar.zzb;
            if (zzbvzVar2.zzj() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaW)).booleanValue()) {
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
            zzbvzVar3 = zzebwVar.zzb;
            if (zzbvzVar3.zzk()) {
                jSONObject2 = zzebwVar.zza;
                zzeby.zza(hashMap, jSONObject2);
            }
            zzbvzVar4 = zzebwVar.zzb;
            if (zzbvzVar4 != null) {
                zzbvzVar7 = zzebwVar.zzb;
                if (!TextUtils.isEmpty(zzbvzVar7.zzf())) {
                    zzbvzVar8 = zzebwVar.zzb;
                    str2 = zzbvzVar8.zzf();
                }
            }
            zzfkl zzfklVar = this.zzd;
            zzfka zzfkaVar = this.zzc;
            zzfkaVar.zzg(true);
            zzfklVar.zza(zzfkaVar);
            zzbvzVar5 = zzebwVar.zzb;
            String zzg = zzbvzVar5.zzg();
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            zzbvzVar6 = zzebwVar.zzb;
            return new zzebs(zzg, optInt, hashMap, bytes, "", zzbvzVar6.zzk());
        }
        if (zzbvzVar.zza() == 1) {
            if (zzbvzVar.zzh() != null) {
                str2 = TextUtils.join(", ", zzbvzVar.zzh());
                com.google.android.gms.ads.internal.util.client.zzm.zzg(str2);
            }
            zzdwnVar = new zzdwn(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdwnVar = new zzdwn(1);
        }
        zzfkl zzfklVar2 = this.zzd;
        zzfka zzfkaVar2 = this.zzc;
        zzfkaVar2.zzh(zzdwnVar);
        zzfkaVar2.zzg(false);
        zzfklVar2.zza(zzfkaVar2);
        throw zzdwnVar;
    }
}
