package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzedg implements zzfkj {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzflp zzc;
    private final zzfma zzd;

    public zzedg(String str, zzfma zzfmaVar, zzflp zzflpVar) {
        this.zzb = str;
        this.zzd = zzfmaVar;
        this.zzc = zzflpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkj
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbwc zzbwcVar;
        zzdye zzdyeVar;
        zzbwc zzbwcVar2;
        zzbwc zzbwcVar3;
        zzbwc zzbwcVar4;
        zzbwc zzbwcVar5;
        zzbwc zzbwcVar6;
        zzbwc zzbwcVar7;
        zzbwc zzbwcVar8;
        JSONObject jSONObject2;
        String str;
        zzedf zzedfVar = (zzedf) obj;
        jSONObject = zzedfVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbwcVar = zzedfVar.zzb;
        String str2 = "";
        if (zzbwcVar.zza() != -2) {
            if (zzbwcVar.zza() == 1) {
                if (zzbwcVar.zzh() != null) {
                    str2 = TextUtils.join(", ", zzbwcVar.zzh());
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(str2);
                }
                zzdyeVar = new zzdye(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzdyeVar = new zzdye(1);
            }
            zzfma zzfmaVar = this.zzd;
            zzflp zzflpVar = this.zzc;
            zzflpVar.zzh(zzdyeVar);
            zzflpVar.zzg(false);
            zzfmaVar.zza(zzflpVar);
            throw zzdyeVar;
        }
        HashMap hashMap = new HashMap();
        zzbwcVar2 = zzedfVar.zzb;
        if (zzbwcVar2.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaT)).booleanValue()) {
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
                    hashMap.put(HttpHeaders.COOKIE, str);
                }
            } else {
                hashMap.put(HttpHeaders.COOKIE, this.zzb);
            }
        }
        zzbwcVar3 = zzedfVar.zzb;
        if (zzbwcVar3.zzk()) {
            jSONObject2 = zzedfVar.zza;
            zzedh.zza(hashMap, jSONObject2);
        }
        zzbwcVar4 = zzedfVar.zzb;
        if (zzbwcVar4 != null) {
            zzbwcVar7 = zzedfVar.zzb;
            if (!TextUtils.isEmpty(zzbwcVar7.zzf())) {
                zzbwcVar8 = zzedfVar.zzb;
                str2 = zzbwcVar8.zzf();
            }
        }
        zzfma zzfmaVar2 = this.zzd;
        zzflp zzflpVar2 = this.zzc;
        zzflpVar2.zzg(true);
        zzfmaVar2.zza(zzflpVar2);
        zzbwcVar5 = zzedfVar.zzb;
        String zzg = zzbwcVar5.zzg();
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        zzbwcVar6 = zzedfVar.zzb;
        return new zzedb(zzg, optInt, hashMap, bytes, "", zzbwcVar6.zzk());
    }
}
